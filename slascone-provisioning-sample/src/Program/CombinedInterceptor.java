package Program;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSource;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

/**
 * Combined interceptor that both validates signatures and stores responses.
 * 
 * This interceptor handles:
 * 1. Validating response signatures from SLASCONE API
 * 2. Storing license and session information locally
 * 3. Managing the application data folder
 */
public class CombinedInterceptor implements okhttp3.Interceptor {

    private int signatureValidationMode = 2; // Default to asymmetric key validation
    private FileService fileService;

    /**
     * Constructor with default signature validation mode.
     */
    public CombinedInterceptor(FileService fileService) {
        this.fileService = fileService;
    }

    /**
     * Constructor with custom signature validation mode and file service.
     * 
     * @param signatureValidationMode The signature validation mode:
     *                                0 = disabled, 1 = symmetric key, 2 = asymmetric key
     * @param fileService The file service to use for storing responses
     */
    public CombinedInterceptor(int signatureValidationMode, FileService fileService) {

        this.signatureValidationMode = signatureValidationMode;
        this.fileService = fileService;
    }

    /**
     * Intercepts HTTP requests and responses to validate signatures and store responses.
     * Implements the okhttp3.Interceptor interface.
     * 
     * @param chain The interceptor chain
     * @return The HTTP response
     * @throws IOException If an I/O error occurs
     */
    @Override
    public Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        Request request = chain.request();

        // Set Accept-Encoding header to utf-8 to prevent compression issues
        request = request.newBuilder()
                .header("Accept-Encoding", "utf-8")
                .build();
        
        // Proceed with the request
        Response originalResponse = chain.proceed(request);
        
        try {
            // Get response body bytes without consuming the original response
            ResponseBody originalBody = originalResponse.body();
            if (originalBody == null) {
                return originalResponse;
            }

            // Read the entire response body as bytes
            BufferedSource source = originalBody.source();
            source.request(Long.MAX_VALUE); // Buffer the entire body
            Buffer buffer = source.getBuffer().clone();
            byte[] bodyBytes = buffer.readByteArray();

            // Get the signature from the header
            String signatureHeaderString = originalResponse.header("x-slascone-signature");
            
            // Only perform validation if we have a signature
            boolean isValidSignature = false;
            if (signatureHeaderString != null) {

                // Validate the signature
                isValidSignature = validateSignature(bodyBytes, signatureHeaderString);
                
                if (isValidSignature) {

                    // Only process successful responses
                    if (originalResponse.isSuccessful()) {

                        // Check if it's likely a LicenseInfoDto response
                        boolean isLicenseInfo = isLicenseInfoResponse(request, originalResponse);
                        boolean isOpenSessionResponse = isOpenSessionResponse(request, originalResponse);

                        if (isLicenseInfo) {
                            // Store the response and signature in the app data folder
                            storeToLocalFiles(bodyBytes, signatureHeaderString, "license");
                        } else if (isOpenSessionResponse) {
                            // Store the response and signature in the app data folder
                            storeToLocalFiles(bodyBytes, signatureHeaderString, "session");
                        }
                    }
                } else {

                    // Signature validation failed
                    System.err.println("Signature validation failed for: " + request.url().toString());
                }
            } else {

                // If signature validation is activated but no signature header is found
                // this is a severe error and could indicate a man-in-the-middle attack
                System.err.println("No signature header found for: " + request.url().toString());
            }

            // Create a new response with the same body since we've consumed the original
            ResponseBody newBody = ResponseBody.create(bodyBytes, originalBody.contentType());
            return originalResponse.newBuilder().body(newBody).build();

        } catch (Exception e) {
            System.err.println("Error processing response: " + e.getMessage());
            e.printStackTrace();
        }

        return originalResponse;
    }
    
    /**
     * Determines if a response is a License Info response based on request and response properties.
     * 
     * @param request The HTTP request
     * @param response The HTTP response
     * @return true if the response contains license information, false otherwise
     */
    private boolean isLicenseInfoResponse(Request request, Response response) {
        String path = request.url().encodedPath();
        MediaType contentType = response.body().contentType();
        String method = request.method();

        // Check if the path matches "/api/v2/isv/{isv_id}/provisioning/heartbeats"
        // or "/api/v2/isv/{isv_id}/provisioning/activations" (isv_id is a UUID)
        String hexRegex = "[0-9a-fA-F]";
        String uuidRegEx = String.format("%s{8}-%s{4}-%s{4}-%s{4}-%s{12}", hexRegex, hexRegex, hexRegex, hexRegex, hexRegex);
        return method.equals("POST") 
               && (path.matches(String.format("/api/v2/isv/%s/provisioning/heartbeats", uuidRegEx))
                   || path.matches(String.format("/api/v2/isv/%s/provisioning/activations", uuidRegEx)))
               && (contentType != null && contentType.toString().contains("application/json"));
    }

    /**
     * Determines if a response is an Open Session response based on request and response properties.
     * 
     * @param request The HTTP request
     * @param response The HTTP response
     * @return true if the response is an open session response, false otherwise
     */
    private boolean isOpenSessionResponse(Request request, Response response) {
        String path = request.url().encodedPath();
        MediaType contentType = response.body().contentType();
        String method = request.method();

        // Check if the path matches "/api/v2/isv/{isv_id}/provisioning/session/open"
        String hexRegex = "[0-9a-fA-F]";
        String uuidRegEx = String.format("%s{8}-%s{4}-%s{4}-%s{4}-%s{12}", hexRegex, hexRegex, hexRegex, hexRegex, hexRegex);
        return method.equals("POST") 
               && path.matches(String.format("/api/v2/isv/%s/provisioning/session/open", uuidRegEx))
               && (contentType != null && contentType.toString().contains("application/json"));
    }
    
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
}
