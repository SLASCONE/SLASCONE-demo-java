package Program;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.time.Duration;
import java.util.Base64;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/**
 * Combined interceptor that both validates signatures and stores responses.
 * 
 * Extends {@link HttpClient} as a delegating wrapper so that all HTTP calls
 * made by the generated API classes pass through the interception logic.
 * 
 * This interceptor handles:
 * 1. Validating response signatures from SLASCONE API
 * 2. Storing license and session information locally
 * 3. Managing the application data folder
 */
public class CombinedInterceptor extends HttpClient {

    private static final int NONCE_SIZE_BYTES = 16;
    private static final SecureRandom secureRandom = new SecureRandom();
    
    private int signatureValidationMode = 2; // Default to asymmetric key validation
    private final FileService fileService;
    private final HttpClient delegate;

    /**
     * Constructor with default signature validation mode.
     * 
     * @param delegate The underlying HttpClient to delegate requests to
     * @param fileService The file service to use for storing responses
     */
    public CombinedInterceptor(HttpClient delegate, FileService fileService) {
        this.delegate = delegate;
        this.fileService = fileService;
    }

    /**
     * Constructor with custom signature validation mode.
     * 
     * @param delegate The underlying HttpClient to delegate requests to
     * @param signatureValidationMode The signature validation mode:
     *                                0 = disabled, 1 = symmetric key, 2 = asymmetric key
     * @param fileService The file service to use for storing responses
     */
    public CombinedInterceptor(HttpClient delegate, int signatureValidationMode, FileService fileService) {
        this.delegate = delegate;
        this.signatureValidationMode = signatureValidationMode;
        this.fileService = fileService;
    }

    // ── Delegating HttpClient abstract methods ──────────────────────────

    @Override public Optional<CookieHandler> cookieHandler() { return delegate.cookieHandler(); }
    @Override public Optional<Duration> connectTimeout() { return delegate.connectTimeout(); }
    @Override public Redirect followRedirects() { return delegate.followRedirects(); }
    @Override public Optional<ProxySelector> proxy() { return delegate.proxy(); }
    @Override public SSLContext sslContext() { return delegate.sslContext(); }
    @Override public SSLParameters sslParameters() { return delegate.sslParameters(); }
    @Override public Optional<Authenticator> authenticator() { return delegate.authenticator(); }
    @Override public Version version() { return delegate.version(); }
    @Override public Optional<Executor> executor() { return delegate.executor(); }

    @Override
    public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request,
            HttpResponse.BodyHandler<T> responseBodyHandler) {
        return delegate.sendAsync(request, responseBodyHandler);
    }

    @Override
    public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request,
            HttpResponse.BodyHandler<T> responseBodyHandler,
            HttpResponse.PushPromiseHandler<T> pushPromiseHandler) {
        return delegate.sendAsync(request, responseBodyHandler, pushPromiseHandler);
    }

    // ── Core interception logic ────────────────────────────────────────

    /**
     * Sends an HTTP request, intercepting it to add nonce headers and
     * validate response signatures before returning the result.
     *
     * @param request The HTTP request
     * @param responseBodyHandler The response body handler
     * @return The HTTP response with body available as an InputStream
     * @throws IOException If an I/O error occurs
     * @throws InterruptedException If the operation is interrupted
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T> HttpResponse<T> send(HttpRequest request,
            HttpResponse.BodyHandler<T> responseBodyHandler)
            throws IOException, InterruptedException {

        // Generate a nonce for replay attack protection (16 random bytes, Base64 encoded)
        byte[] nonceBytes = new byte[NONCE_SIZE_BYTES];
        secureRandom.nextBytes(nonceBytes);
        String nonceBase64 = Base64.getEncoder().encodeToString(nonceBytes);

        // Copy the request and add Accept-Encoding and X-Nonce headers
        HttpRequest modifiedRequest = HttpRequest.newBuilder(request, (name, value) -> true)
                .header("Accept-Encoding", "utf-8")
                .header("X-Nonce", nonceBase64)
                .build();

        // Send the request and capture the full body as a byte array
        HttpResponse<byte[]> rawResponse = delegate.send(modifiedRequest,
                HttpResponse.BodyHandlers.ofByteArray());

        byte[] bodyBytes = rawResponse.body();

        try {
            // Get the signature from the header
            String signatureHeaderString = rawResponse.headers()
                    .firstValue("x-slascone-signature").orElse(null);
            
            // Get the nonce signature from the header for replay attack protection
            String nonceSignatureHeader = rawResponse.headers()
                    .firstValue("X-Nonce-Signature").orElse(null);
            
            // Only perform validation if we have a signature
            boolean isValidSignature = false;
            boolean isValidNonceSignature = false;
            
            if (signatureHeaderString != null) {

                // Validate the response body signature
                isValidSignature = validateSignature(bodyBytes, signatureHeaderString);
                
                // Validate the nonce signature for replay attack protection
                if (nonceSignatureHeader != null) {
                    isValidNonceSignature = validateSignature(nonceBytes, nonceSignatureHeader);
                    
                    if (!isValidNonceSignature) {
                        // Nonce signature validation failed - potential replay attack
                        System.err.println("Nonce signature validation failed for: " + request.uri().toString());
                        System.err.println("This could indicate a replay attack!");
                    }
                } else {
                    // No nonce signature in response - server may not support nonce validation
                    // or this could indicate a man-in-the-middle attack
                    System.err.println("No X-Nonce-Signature header found for: " + request.uri().toString());
                }
                
                if (isValidSignature && isValidNonceSignature) {

                    int statusCode = rawResponse.statusCode();
                    // Only process successful responses
                    if (statusCode >= 200 && statusCode < 300) {

                        // Check if it's likely a LicenseInfoDto response
                        boolean isLicenseInfo = isLicenseInfoResponse(modifiedRequest, rawResponse);
                        boolean isOpenSessionResponse = isOpenSessionResponse(modifiedRequest, rawResponse);

                        if (isLicenseInfo) {
                            // Store the response and signature in the app data folder
                            storeToLocalFiles(bodyBytes, signatureHeaderString, "license");
                        } else if (isOpenSessionResponse) {
                            // Store the response and signature in the app data folder
                            storeToLocalFiles(bodyBytes, signatureHeaderString, "session");
                        }
                    }
                } else if (!isValidSignature) {

                    // Signature validation failed
                    System.err.println("Signature validation failed for: " + request.uri().toString());
                }
            } else {

                // If signature validation is activated but no signature header is found
                // this is a severe error and could indicate a man-in-the-middle attack
                System.err.println("No signature header found for: " + request.uri().toString());
            }

        } catch (Exception e) {
            System.err.println("Error processing response: " + e.getMessage());
            e.printStackTrace();
        }

        // Return a response whose body is a ByteArrayInputStream wrapping the captured bytes,
        // which is what the generated API classes expect (BodyHandlers.ofInputStream())
        return (HttpResponse<T>) new WrappedHttpResponse<>(rawResponse,
                new ByteArrayInputStream(bodyBytes));
    }
    
    // ── Response type detection helpers ──────────────────────────────────

    /**
     * Determines if a response is a License Info response based on request and response properties.
     * 
     * @param request The HTTP request
     * @param response The HTTP response
     * @return true if the response contains license information, false otherwise
     */
    private boolean isLicenseInfoResponse(HttpRequest request, HttpResponse<?> response) {
        String path = request.uri().getPath();
        String contentType = response.headers().firstValue("Content-Type").orElse("");
        String method = request.method();

        // Check if the path matches "/api/v2/isv/{isv_id}/provisioning/heartbeats"
        // or "/api/v2/isv/{isv_id}/provisioning/activations" (isv_id is a UUID)
        String hexRegex = "[0-9a-fA-F]";
        String uuidRegEx = "%s{8}-%s{4}-%s{4}-%s{4}-%s{12}".formatted(hexRegex, hexRegex, hexRegex, hexRegex, hexRegex);
        return method.equals("POST") 
               && (path.matches("/api/v2/isv/%s/provisioning/heartbeats".formatted(uuidRegEx))
                   || path.matches("/api/v2/isv/%s/provisioning/activations".formatted(uuidRegEx)))
               && contentType.contains("application/json");
    }

    /**
     * Determines if a response is an Open Session response based on request and response properties.
     * 
     * @param request The HTTP request
     * @param response The HTTP response
     * @return true if the response is an open session response, false otherwise
     */
    private boolean isOpenSessionResponse(HttpRequest request, HttpResponse<?> response) {
        String path = request.uri().getPath();
        String contentType = response.headers().firstValue("Content-Type").orElse("");
        String method = request.method();

        // Check if the path matches "/api/v2/isv/{isv_id}/provisioning/session/open"
        String hexRegex = "[0-9a-fA-F]";
        String uuidRegEx = "%s{8}-%s{4}-%s{4}-%s{4}-%s{12}".formatted(hexRegex, hexRegex, hexRegex, hexRegex, hexRegex);
        return method.equals("POST") 
               && path.matches("/api/v2/isv/%s/provisioning/session/open".formatted(uuidRegEx))
               && contentType.contains("application/json");
    }
    
    // ── Signature validation and storage ─────────────────────────────────

    /**
     * Validates the signature of the response data.
     * 
     * @param responseBytes The response body bytes to validate
     * @param signatureHeaderString The signature string from the header
     * @return true if the signature is valid, false otherwise
     */
    private boolean validateSignature(byte[] responseBytes, String signatureHeaderString) {
        try {
            if (signatureValidationMode == 0) {
                return true; // Skip validation
            } else if (signatureValidationMode == 1) {
                return CryptographyService.IsSignatureValidSymmetricKey(responseBytes, signatureHeaderString);
            } else if (signatureValidationMode == 2) {
                return CryptographyService.IsSignatureValidAsymmetricKey(responseBytes, signatureHeaderString);
            }
            return false;
        } catch (NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | SignatureException | IOException e) {
            System.err.println("Signature validation exception: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Store files in the app data folder
     * 
     * @param responseBytes The response body to store
     * @param signatureHeaderString The signature header to store
     * @param entityFileName Base file name for the entity being stored
     */
    private void storeToLocalFiles(byte[] responseBytes, String signatureHeaderString, String entityFileName) {
        try {
            // Store body of response and signature header to local files
            fileService.StoreToFile(entityFileName + ".txt", responseBytes);
            fileService.StoreToFile(entityFileName + "_signature.txt", signatureHeaderString.getBytes());
        } catch (Exception e) {
            System.err.println("Error storing response files in app data folder: " + e.getMessage());
        }
    }
    
    /**
     * Sets the signature validation mode.
     * 
     * @param mode 0 = disabled, 1 = symmetric key, 2 = asymmetric key
     */
    public void setSignatureValidationMode(int mode) {
        this.signatureValidationMode = mode;
    }

    // ── Inner class: wraps an HttpResponse with a replacement body ───────

    /**
     * A delegating HttpResponse that replaces the body with a provided InputStream.
     * All other methods delegate to the original response.
     */
    private static class WrappedHttpResponse<T> implements HttpResponse<T> {

        private final HttpResponse<?> original;
        private final T body;

        WrappedHttpResponse(HttpResponse<?> original, T body) {
            this.original = original;
            this.body = body;
        }

        @Override public int statusCode() { return original.statusCode(); }
        @Override public HttpRequest request() { return original.request(); }
        @Override public Optional<HttpResponse<T>> previousResponse() { return Optional.empty(); }
        @Override public HttpHeaders headers() { return original.headers(); }
        @Override public T body() { return body; }
        @Override public Optional<SSLSession> sslSession() { return original.sslSession(); }
        @Override public java.net.URI uri() { return original.uri(); }
        @Override public Version version() { return original.version(); }
    }
}
