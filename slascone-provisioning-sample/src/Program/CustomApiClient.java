package Program;

import com.slascone.ApiClient;
import java.net.http.HttpClient;

public class CustomApiClient extends ApiClient {

    private CombinedInterceptor combinedInterceptor;

    public CustomApiClient(FileService fileService) {
        super();

        initHttpClientWithCustomInterceptor(fileService);
    }
    
    private void initHttpClientWithCustomInterceptor(FileService fileService) {

        // Build the real HttpClient from the parent ApiClient's builder
        HttpClient realClient = super.getHttpClient();

        // Wrap it in a CombinedInterceptor that handles signature validation and response storage
        combinedInterceptor = new CombinedInterceptor(realClient, fileService);
    }

    /**
     * Returns the intercepting HttpClient so all generated API classes
     * route their HTTP calls through signature validation and response storage.
     */
    @Override
    public HttpClient getHttpClient() {
        return combinedInterceptor;
    }
    
    /**
     * Configure the signature validation mode
     * 
     * @param mode 0 = disabled, 1 = symmetric key, 2 = asymmetric key
     */
    public void setSignatureValidationMode(int mode) {
        if (combinedInterceptor != null) {
            combinedInterceptor.setSignatureValidationMode(mode);
        }
    }
}