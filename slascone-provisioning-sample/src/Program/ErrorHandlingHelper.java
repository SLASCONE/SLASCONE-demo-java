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
        Exception lastException = null;
        ErrorType lastErrorType = ErrorType.TECHNICAL;

        while (0 <= retryCountdown) {

            try {
                // Call the SLASCONE API endpoint
                ApiResponse<TOut> result = func.apply(Settings.ISV_ID, argument);

                // Success
                return new ResultWithError<>(result.getData());

            } catch (ApiException ex) {

                // Specific handling for ApiException

                if (409 == ex.getCode()) {

                    var errorResult = ErrorResultObjects.fromJson(ex.getResponseBody());

                    return new ResultWithError<>(errorResult);

                } else if (isTransientHttpError(ex.getCode())) {

                    // Transient error: Wait and try again
                    lastException = ex;
                    lastErrorType = ErrorType.TECHNICAL;
                    retryCountdown--;
                    Thread.sleep(RETRY_WAIT_TIME.toMillis());
                    continue;

                } else if (isTransientNetworkException(ex.getCause())) {

                    // Transient network error: Wait and try again
                    lastException = ex;
                    lastErrorType = ErrorType.NETWORK;
                    retryCountdown--;
                    Thread.sleep(RETRY_WAIT_TIME.toMillis());
                    continue;
                }

                // Standard error handling: Return error
                //  - has an HTTP status code != 0 => TECHNICAL error
                //  - has an HTTP status code == 0 => NETWORK error
                return new ResultWithError<>(ex, ex.getCode() != 0 ? ErrorType.TECHNICAL : ErrorType.NETWORK);

            } catch (Exception ex) {

                // For non-transient exceptions, return immediately
                if (!isTransientNetworkException(ex)) {

                    return new ResultWithError<>(callerMethodName + " threw an exception: " + 
                        ex.getClass().getSimpleName() + " - " + ex.getMessage(), ErrorType.NETWORK);
                }
                
                // For transient exceptions, store and retry
                lastException = ex;
                lastErrorType = ErrorType.NETWORK;
                retryCountdown--;
                Thread.sleep(RETRY_WAIT_TIME.toMillis());
            }
        }

        // If we reach here, all retries failed
        String errorMessage;
        if (lastException != null) {
            if (lastException instanceof ApiException apiEx) {
                return new ResultWithError<>(apiEx, lastErrorType);
            } else {
                errorMessage = callerMethodName + " failed after " + MAX_RETRY_COUNT + " retries. Last error: " +
                    lastException.getClass().getSimpleName() + " - " + lastException.getMessage();
            }
        }  else {
            errorMessage = callerMethodName + " failed after " + MAX_RETRY_COUNT + " retries.";
        }
        
        return new ResultWithError<>(errorMessage, lastErrorType);
    }
    
    /**
     * Error type enum to differentiate between error categories
     */
    public enum ErrorType {
        /**
         * No error occurred
         */
        NONE,
        
        /**
         * Business logic or validation error (e.g., invalid input, conflict)
         */
        FUNCTIONAL,
        
        /**
         * Technical error in the system (e.g., internal server error)
         */
        TECHNICAL,
        
        /**
         * Network or connectivity issue
         */
        NETWORK
    }
    
    /**
     * Class to represent a result with a potential error message
     * 
     * @param <T> Type of the result
     */
    public static class ResultWithError<T> {
        private final T result;
        private final ErrorResultObjects errorResult;
        private final ApiException apiException;
        private final String errorMessage;
        private final ErrorType errorType;
        
        public ResultWithError(T result) {
            this.result = result;
            this.errorResult = null;
            this.apiException = null;
            this.errorMessage = null;
            this.errorType = ErrorType.NONE;
        }
        
        public ResultWithError(ErrorResultObjects errorResult) {
            this.result = null;
            this.errorResult = errorResult;
            this.apiException = null;
            this.errorMessage = errorResult != null ? "Code: " + errorResult.getId() + ", Message: " + errorResult.getMessage() : null;
            this.errorType = ErrorType.FUNCTIONAL;
        }

        public ResultWithError(String errorMessage, ErrorType errorType) {
            this.result = null;
            this.errorResult = null;
            this.apiException = null;
            this.errorMessage = errorMessage;
            this.errorType = errorType != null ? errorType : ErrorType.TECHNICAL;
        }

        public ResultWithError(ApiException apiException, ErrorType errorType) {
            this.result = null;
            this.errorResult = null;
            this.apiException = apiException;
            this.errorMessage = apiException.getCode() != 0
                ? "Status: " + apiException.getCode() + ", Message: " + apiException.getMessage()
                : apiException.getCause().getClass().getSimpleName() + " - " + apiException.getMessage();
            this.errorType = errorType != null ? errorType : ErrorType.TECHNICAL;
        }
        
        public T getResult() {
            return result;
        }
        
        public ErrorResultObjects getErrorResult() {
            return errorResult;
        }

        public ApiException getApiException() {
            return apiException;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
        
        public ErrorType getErrorType() {
            return errorType;
        }
        
        public boolean hasError() {
            return result == null;
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
