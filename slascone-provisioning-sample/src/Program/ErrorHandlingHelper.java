package Program;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.Duration;
import java.util.UUID;

import com.slascone.ApiResponse;
import com.slascone.model.ErrorResultObjects;

import com.slascone.ApiException;

/**
 * Helper class to handle errors and standard retries while calling the SLASCONE API.
 */
public class ErrorHandlingHelper {
    
    /**
     * Wait time between retries
     */
    private static final Duration RETRY_WAIT_TIME = Duration.ofSeconds(30);
    
    /**
     * Do max 1 retry
     */
    private static final int MAX_RETRY_COUNT = 1;
    
    /**
     * Call a SLASCONE API endpoint with standard retry logic - synchronous version
     *
     * @param <TIn>            Type of input argument
     * @param <TOut>           Type of result
     * @param func             SLASCONE API endpoint call that returns ApiResponse
     *                         directly and may throw ApiException
     * @param argument         Input argument
     * @param callerMethodName Caller method name for error message if necessary
     * @return ResultWithError with result and optional error message
     * @throws InterruptedException
     * @throws IOException
     */
    public static <TIn, TOut> ResultWithError<TOut> execute(
            ApiCallFunction<UUID, TIn, ApiResponse<TOut>> func,
            TIn argument,
            String callerMethodName) throws InterruptedException, IOException {

        int retryCountdown = MAX_RETRY_COUNT;

        while (0 <= retryCountdown) {

            try {
                // Call the SLASCONE API endpoint
                ApiResponse<TOut> result = func.apply(Settings.ISV_ID, argument);

                // Success
                return new ResultWithError<>(result.getData(), null);

            } catch (ApiException ex) {

                // Specific handling for ApiException

                if (409 == ex.getCode()) {

                    var errorResult = ErrorResultObjects.fromJson(ex.getResponseBody());

                    return new ResultWithError<>(null,
                            callerMethodName + " resulted in an API error: " + System.lineSeparator() +
                                    "Code: " + errorResult.getId() + ", Message: " + errorResult.getMessage());

                } else if (isTransientHttpError(ex.getCode())) {
                    // Transient error: Wait and try again
                    retryCountdown--;
                    Thread.sleep(RETRY_WAIT_TIME.toMillis());
                } else {
                    // Check if cause is a transient network exception
                    if (isTransientNetworkException(ex.getCause())) {
                        // Transient error: Wait and try again
                        retryCountdown--;
                        Thread.sleep(RETRY_WAIT_TIME.toMillis());
                        continue;
                    }

                    // Standard error handling: Return error message
                    return new ResultWithError<>(null,
                            callerMethodName + " threw an ApiException: " + System.lineSeparator() +
                                    "Code: " + ex.getCode() + ", Message: " + ex.getMessage());
                }

            } catch (Exception ex) {
                return new ResultWithError<>(null,
                        callerMethodName + " threw an exception: " + System.lineSeparator() + ex.getMessage());
            }
        }

        // If we reach here, all retries failed
        return new ResultWithError<>(null, callerMethodName + " failed after " + MAX_RETRY_COUNT + " retries.");
    }
    
    /**
     * Class to represent a result with a potential error message
     * 
     * @param <T> Type of the result
     */
    public static class ResultWithError<T> {
        private final T result;
        private final String errorMessage;
        
        public ResultWithError(T result, String errorMessage) {
            this.result = result;
            this.errorMessage = errorMessage;
        }
        
        public T getResult() {
            return result;
        }
        
        public String getErrorMessage() {
            return errorMessage;
        }
        
        public boolean hasError() {
            return errorMessage != null;
        }
    }

    /**
     * Determines if an HTTP status code represents a transient error
     * that might resolve on retry.
     *
     * @param httpStatusCode The HTTP status code to check
     * @return true if the error is transient, false otherwise
     */
    private static boolean isTransientHttpError(int httpStatusCode) {
        return httpStatusCode == 408 || // Request Timeout
               httpStatusCode == 429 || // Too Many Requests
               httpStatusCode == 500 || // Internal Server Error
               httpStatusCode == 502 || // Bad Gateway
               httpStatusCode == 503 || // Service Unavailable
               httpStatusCode == 504 || // Gateway Timeout
               httpStatusCode == 507;   // Insufficient Storage
    }

    /**
     * Determines if an exception represents a transient network error
     * that might resolve on retry.
     *
     * @param ex The exception to check
     * @return true if the error is transient, false otherwise
     */
    private static boolean isTransientNetworkException(Throwable ex) {
        return ex instanceof SocketTimeoutException ||
               ex instanceof java.net.ConnectException ||
               ex instanceof java.net.UnknownHostException ||
               ex instanceof java.net.NoRouteToHostException ||
               (ex instanceof javax.net.ssl.SSLException && 
                (ex.getMessage() != null && 
                 (ex.getMessage().contains("Connection reset") || 
                  ex.getMessage().contains("Socket closed")))) ||
               (ex instanceof java.io.IOException && 
                (ex.getMessage() != null && 
                 (ex.getMessage().contains("Connection reset") || 
                  ex.getMessage().contains("Connection refused") || 
                  ex.getMessage().contains("Broken pipe"))));
    }
}
