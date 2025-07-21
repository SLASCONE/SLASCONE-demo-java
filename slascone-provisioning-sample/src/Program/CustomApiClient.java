package Program;

import com.slascone.ApiClient;
import okhttp3.OkHttpClient;

public class CustomApiClient extends ApiClient {

    private CombinedInterceptor combinedInterceptor;

    public CustomApiClient(FileService fileService) {
        super();

        initHttpClientWithCustomInterceptor(fileService);
    }
    
    private void initHttpClientWithCustomInterceptor(FileService fileService) {

        // Create the combined interceptor that handles both signature validation and response storage
        combinedInterceptor = new CombinedInterceptor(fileService);

        // Rebuild the OkHttpClient with the combined interceptor and relaxed SSL settings
        OkHttpClient.Builder builder = httpClient.newBuilder();
        builder.addInterceptor(combinedInterceptor);
        
        httpClient = builder.build();
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