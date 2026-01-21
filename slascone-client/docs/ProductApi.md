# ProductApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAnalyticalField**](ProductApi.md#addAnalyticalField) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/analytical_fields | Add a new analytical field to a product |
| [**addConstrainedVariable**](ProductApi.md#addConstrainedVariable) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/constrained_variables | Add a new constrained variable to a product |
| [**addEmailTemplate**](ProductApi.md#addEmailTemplate) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/email_templates | Add a new email template to a product |
| [**addFeature**](ProductApi.md#addFeature) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/features | Add a new feature to a product |
| [**addLimitation**](ProductApi.md#addLimitation) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/limitations | Add a new limitation to a product |
| [**addProduct**](ProductApi.md#addProduct) | **POST** /api/v2/isv/{isv_id}/products | Add a new product |
| [**addSoftwareReleaseLimitation**](ProductApi.md#addSoftwareReleaseLimitation) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations | Add a new software release limitation to a product |
| [**addSoftwareShipment**](ProductApi.md#addSoftwareShipment) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id}/software_shipments | Add a new software shipment to a product and software release limitation |
| [**addSoftwareShipmentProperty**](ProductApi.md#addSoftwareShipmentProperty) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/software_shipment_properties | Add a new software shipment property to a product |
| [**addUsageFeature**](ProductApi.md#addUsageFeature) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/usage_features | Add a new usage feature to a product |
| [**addUsageModule**](ProductApi.md#addUsageModule) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/usage_modules | Add a new usage module to a product |
| [**addVariable**](ProductApi.md#addVariable) | **POST** /api/v2/isv/{isv_id}/products/{product_id}/variables | Add a new variable to a product |
| [**deleteAnalyticalField**](ProductApi.md#deleteAnalyticalField) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/analytical_fields/{analytical_field_id} | Delete an analytical field from a product |
| [**deleteConstrainedVariable**](ProductApi.md#deleteConstrainedVariable) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/constrained_variables/{variable_id} | Delete a constrained variable from a product |
| [**deleteEmailTemplate**](ProductApi.md#deleteEmailTemplate) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/email_templates/{email_template_id} | Delete an email template from a product |
| [**deleteFeature**](ProductApi.md#deleteFeature) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/features/{feature_id} | Delete a feature from a product |
| [**deleteLimitation**](ProductApi.md#deleteLimitation) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/limitations/{limitation_id} | Delete a limitation from a product |
| [**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id} | Delete a product |
| [**deleteSoftwareReleaseLimitation**](ProductApi.md#deleteSoftwareReleaseLimitation) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id} | Delete a software release limitation from a product |
| [**deleteSoftwareShipment**](ProductApi.md#deleteSoftwareShipment) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id}/software_shipments/{software_shipment_id} | Delete a software shipment from a product and software release limitation |
| [**deleteSoftwareShipmentProperty**](ProductApi.md#deleteSoftwareShipmentProperty) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/software_shipment_properties/{property_id} | Delete a software shipment property from a product |
| [**deleteUsageFeature**](ProductApi.md#deleteUsageFeature) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/usage_features/{usage_feature_id} | Delete a usage feature from a product |
| [**deleteUsageModule**](ProductApi.md#deleteUsageModule) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/usage_modules/{usage_module_id} | Delete a usage module from a product |
| [**deleteVariable**](ProductApi.md#deleteVariable) | **DELETE** /api/v2/isv/{isv_id}/products/{product_id}/variables/{variable_id} | Delete a variable from a product |
| [**exportFullProduct**](ProductApi.md#exportFullProduct) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/export |  |
| [**getAllAnalyticalFields**](ProductApi.md#getAllAnalyticalFields) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/analytical_fields | Get all analytical fields for a product |
| [**getAllConstrainedVariables**](ProductApi.md#getAllConstrainedVariables) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/constrained_variables | Get all constrained variables for a product |
| [**getAllEmailTemplates**](ProductApi.md#getAllEmailTemplates) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/email_templates | Get all email templates for a product |
| [**getAllFeatures**](ProductApi.md#getAllFeatures) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/features | Get all features for a product |
| [**getAllLimitations**](ProductApi.md#getAllLimitations) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/limitations | Get all limitations for a product |
| [**getAllProducts**](ProductApi.md#getAllProducts) | **GET** /api/v2/isv/{isv_id}/products | Get all products |
| [**getAllSoftwareReleaseLimitations**](ProductApi.md#getAllSoftwareReleaseLimitations) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations | Get all software release limitations for a product |
| [**getAllSoftwareShipmentProperties**](ProductApi.md#getAllSoftwareShipmentProperties) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/software_shipment_properties | Get all software shipment properties for a product |
| [**getAllSoftwareShipments**](ProductApi.md#getAllSoftwareShipments) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id}/software_shipments | Get all software shipments for a product and software release limitation |
| [**getAllUsageFeatures**](ProductApi.md#getAllUsageFeatures) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/usage_features | Get all usage features for a product |
| [**getAllUsageModules**](ProductApi.md#getAllUsageModules) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/usage_modules | Get all usage modules for a product |
| [**getAllVariables**](ProductApi.md#getAllVariables) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/variables | Get all variables for a product |
| [**getAnalyticalFieldById**](ProductApi.md#getAnalyticalFieldById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/analytical_fields/{analytical_field_id} | Get a specific analytical field by ID |
| [**getConstrainedVariableById**](ProductApi.md#getConstrainedVariableById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/constrained_variables/{variable_id} | Get a specific constrained variable by ID |
| [**getEmailTemplateById**](ProductApi.md#getEmailTemplateById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/email_templates/{email_template_id} | Get a specific email template by ID |
| [**getFeatureById**](ProductApi.md#getFeatureById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/features/{feature_id} | Get a specific feature by ID |
| [**getLimitationById**](ProductApi.md#getLimitationById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/limitations/{limitation_id} | Get a specific limitation by ID |
| [**getProduct**](ProductApi.md#getProduct) | **GET** /api/v2/isv/{isv_id}/products/{product_id} | Get product by id |
| [**getProductDetails**](ProductApi.md#getProductDetails) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/detail | Get product details by id |
| [**getProductHistoryAsync**](ProductApi.md#getProductHistoryAsync) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/history | Get the history of a product |
| [**getSoftwareReleaseLimitationById**](ProductApi.md#getSoftwareReleaseLimitationById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id} | Get a specific software release limitation by ID |
| [**getSoftwareShipmentById**](ProductApi.md#getSoftwareShipmentById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id}/software_shipments/{software_shipment_id} | Get a specific software shipment by ID |
| [**getSoftwareShipmentPropertyById**](ProductApi.md#getSoftwareShipmentPropertyById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/software_shipment_properties/{property_id} | Get a specific software shipment property by ID |
| [**getUsageFeatureById**](ProductApi.md#getUsageFeatureById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/usage_features/{usage_feature_id} | Get a specific usage feature by ID |
| [**getUsageModuleById**](ProductApi.md#getUsageModuleById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/usage_modules/{usage_module_id} | Get a specific usage module by ID |
| [**getVariableById**](ProductApi.md#getVariableById) | **GET** /api/v2/isv/{isv_id}/products/{product_id}/variables/{variable_id} | Get a specific variable by ID |
| [**importProductFromFile**](ProductApi.md#importProductFromFile) | **POST** /api/v2/isv/{isv_id}/products/import |  |
| [**updateAnalyticalField**](ProductApi.md#updateAnalyticalField) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/analytical_fields | Update an existing analytical field |
| [**updateConstrainedVariable**](ProductApi.md#updateConstrainedVariable) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/constrained_variables | Update an existing constrained variable |
| [**updateEmailTemplate**](ProductApi.md#updateEmailTemplate) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/email_templates | Update an existing email template |
| [**updateFeature**](ProductApi.md#updateFeature) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/features | Update an existing feature |
| [**updateLimitation**](ProductApi.md#updateLimitation) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/limitations | Update an existing limitation |
| [**updateProduct**](ProductApi.md#updateProduct) | **PUT** /api/v2/isv/{isv_id}/products | Update an existing product |
| [**updateSoftwareReleaseLimitation**](ProductApi.md#updateSoftwareReleaseLimitation) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations | Update an existing software release limitation |
| [**updateSoftwareShipment**](ProductApi.md#updateSoftwareShipment) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/software_release_limitations/{software_release_limitation_id}/software_shipments | Update an existing software shipment |
| [**updateSoftwareShipmentProperty**](ProductApi.md#updateSoftwareShipmentProperty) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/software_shipment_properties | Update an existing software shipment property |
| [**updateUsageFeature**](ProductApi.md#updateUsageFeature) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/usage_features | Update an existing usage feature |
| [**updateUsageModule**](ProductApi.md#updateUsageModule) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/usage_modules | Update an existing usage module |
| [**updateVariable**](ProductApi.md#updateVariable) | **PUT** /api/v2/isv/{isv_id}/products/{product_id}/variables | Update an existing variable |


<a id="addAnalyticalField"></a>
# **addAnalyticalField**
> AnalyticalFieldDto addAnalyticalField(isvId, productId, analyticalFieldDto)

Add a new analytical field to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    AnalyticalFieldDto analyticalFieldDto = new AnalyticalFieldDto(); // AnalyticalFieldDto | 
    try {
      AnalyticalFieldDto result = apiInstance.addAnalyticalField(isvId, productId, analyticalFieldDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addAnalyticalField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **analyticalFieldDto** | [**AnalyticalFieldDto**](AnalyticalFieldDto.md)|  | |

### Return type

[**AnalyticalFieldDto**](AnalyticalFieldDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addConstrainedVariable"></a>
# **addConstrainedVariable**
> ConstrainedVariableDto addConstrainedVariable(isvId, productId, constrainedVariableDto)

Add a new constrained variable to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    ConstrainedVariableDto constrainedVariableDto = new ConstrainedVariableDto(); // ConstrainedVariableDto | 
    try {
      ConstrainedVariableDto result = apiInstance.addConstrainedVariable(isvId, productId, constrainedVariableDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addConstrainedVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **constrainedVariableDto** | [**ConstrainedVariableDto**](ConstrainedVariableDto.md)|  | |

### Return type

[**ConstrainedVariableDto**](ConstrainedVariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addEmailTemplate"></a>
# **addEmailTemplate**
> EmailTemplateDto addEmailTemplate(isvId, productId, emailTemplateDto)

Add a new email template to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    EmailTemplateDto emailTemplateDto = new EmailTemplateDto(); // EmailTemplateDto | 
    try {
      EmailTemplateDto result = apiInstance.addEmailTemplate(isvId, productId, emailTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addEmailTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **emailTemplateDto** | [**EmailTemplateDto**](EmailTemplateDto.md)|  | |

### Return type

[**EmailTemplateDto**](EmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addFeature"></a>
# **addFeature**
> FeatureDto addFeature(isvId, productId, featureDto)

Add a new feature to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    FeatureDto featureDto = new FeatureDto(); // FeatureDto | 
    try {
      FeatureDto result = apiInstance.addFeature(isvId, productId, featureDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addFeature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **featureDto** | [**FeatureDto**](FeatureDto.md)|  | |

### Return type

[**FeatureDto**](FeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addLimitation"></a>
# **addLimitation**
> LimitationDto addLimitation(isvId, productId, limitationDto)

Add a new limitation to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    LimitationDto limitationDto = new LimitationDto(); // LimitationDto | 
    try {
      LimitationDto result = apiInstance.addLimitation(isvId, productId, limitationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addLimitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **limitationDto** | [**LimitationDto**](LimitationDto.md)|  | |

### Return type

[**LimitationDto**](LimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addProduct"></a>
# **addProduct**
> ProductDto addProduct(isvId, productDto)

Add a new product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ProductDto productDto = new ProductDto(); // ProductDto | 
    try {
      ProductDto result = apiInstance.addProduct(isvId, productDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productDto** | [**ProductDto**](ProductDto.md)|  | |

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addSoftwareReleaseLimitation"></a>
# **addSoftwareReleaseLimitation**
> SoftwareReleaseLimitationDto addSoftwareReleaseLimitation(isvId, productId, softwareReleaseLimitationDto)

Add a new software release limitation to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    SoftwareReleaseLimitationDto softwareReleaseLimitationDto = new SoftwareReleaseLimitationDto(); // SoftwareReleaseLimitationDto | 
    try {
      SoftwareReleaseLimitationDto result = apiInstance.addSoftwareReleaseLimitation(isvId, productId, softwareReleaseLimitationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addSoftwareReleaseLimitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationDto** | [**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md)|  | |

### Return type

[**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addSoftwareShipment"></a>
# **addSoftwareShipment**
> SoftwareShipmentDto addSoftwareShipment(isvId, productId, softwareReleaseLimitationId, softwareShipmentDto)

Add a new software shipment to a product and software release limitation

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    SoftwareShipmentDto softwareShipmentDto = new SoftwareShipmentDto(); // SoftwareShipmentDto | 
    try {
      SoftwareShipmentDto result = apiInstance.addSoftwareShipment(isvId, productId, softwareReleaseLimitationId, softwareShipmentDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addSoftwareShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |
| **softwareShipmentDto** | [**SoftwareShipmentDto**](SoftwareShipmentDto.md)|  | |

### Return type

[**SoftwareShipmentDto**](SoftwareShipmentDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addSoftwareShipmentProperty"></a>
# **addSoftwareShipmentProperty**
> ProductSoftwareShipmentPropertyDto addSoftwareShipmentProperty(isvId, productId, productSoftwareShipmentPropertyDto, defaultValue)

Add a new software shipment property to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    ProductSoftwareShipmentPropertyDto productSoftwareShipmentPropertyDto = new ProductSoftwareShipmentPropertyDto(); // ProductSoftwareShipmentPropertyDto | 
    String defaultValue = "defaultValue_example"; // String | 
    try {
      ProductSoftwareShipmentPropertyDto result = apiInstance.addSoftwareShipmentProperty(isvId, productId, productSoftwareShipmentPropertyDto, defaultValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addSoftwareShipmentProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **productSoftwareShipmentPropertyDto** | [**ProductSoftwareShipmentPropertyDto**](ProductSoftwareShipmentPropertyDto.md)|  | |
| **defaultValue** | **String**|  | [optional] |

### Return type

[**ProductSoftwareShipmentPropertyDto**](ProductSoftwareShipmentPropertyDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addUsageFeature"></a>
# **addUsageFeature**
> UsageFeatureDto addUsageFeature(isvId, productId, usageFeatureDto)

Add a new usage feature to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UsageFeatureDto usageFeatureDto = new UsageFeatureDto(); // UsageFeatureDto | 
    try {
      UsageFeatureDto result = apiInstance.addUsageFeature(isvId, productId, usageFeatureDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addUsageFeature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageFeatureDto** | [**UsageFeatureDto**](UsageFeatureDto.md)|  | |

### Return type

[**UsageFeatureDto**](UsageFeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addUsageModule"></a>
# **addUsageModule**
> UsageModuleDto addUsageModule(isvId, productId, usageModuleDto)

Add a new usage module to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UsageModuleDto usageModuleDto = new UsageModuleDto(); // UsageModuleDto | 
    try {
      UsageModuleDto result = apiInstance.addUsageModule(isvId, productId, usageModuleDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addUsageModule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageModuleDto** | [**UsageModuleDto**](UsageModuleDto.md)|  | |

### Return type

[**UsageModuleDto**](UsageModuleDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="addVariable"></a>
# **addVariable**
> VariableDto addVariable(isvId, productId, variableDto)

Add a new variable to a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    VariableDto variableDto = new VariableDto(); // VariableDto | 
    try {
      VariableDto result = apiInstance.addVariable(isvId, productId, variableDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **variableDto** | [**VariableDto**](VariableDto.md)|  | |

### Return type

[**VariableDto**](VariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteAnalyticalField"></a>
# **deleteAnalyticalField**
> deleteAnalyticalField(isvId, productId, analyticalFieldId)

Delete an analytical field from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID analyticalFieldId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAnalyticalField(isvId, productId, analyticalFieldId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteAnalyticalField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **analyticalFieldId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteConstrainedVariable"></a>
# **deleteConstrainedVariable**
> deleteConstrainedVariable(isvId, productId, variableId)

Delete a constrained variable from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID variableId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteConstrainedVariable(isvId, productId, variableId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteConstrainedVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **variableId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteEmailTemplate"></a>
# **deleteEmailTemplate**
> deleteEmailTemplate(isvId, productId, emailTemplateId)

Delete an email template from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID emailTemplateId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteEmailTemplate(isvId, productId, emailTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteEmailTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **emailTemplateId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteFeature"></a>
# **deleteFeature**
> deleteFeature(isvId, productId, featureId)

Delete a feature from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID featureId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteFeature(isvId, productId, featureId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteFeature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **featureId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteLimitation"></a>
# **deleteLimitation**
> deleteLimitation(isvId, productId, limitationId)

Delete a limitation from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID limitationId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteLimitation(isvId, productId, limitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteLimitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **limitationId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(isvId, productId)

Delete a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteProduct(isvId, productId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteSoftwareReleaseLimitation"></a>
# **deleteSoftwareReleaseLimitation**
> deleteSoftwareReleaseLimitation(isvId, productId, softwareReleaseLimitationId, newSoftwareReleaseLimitationId)

Delete a software release limitation from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    UUID newSoftwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSoftwareReleaseLimitation(isvId, productId, softwareReleaseLimitationId, newSoftwareReleaseLimitationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteSoftwareReleaseLimitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |
| **newSoftwareReleaseLimitationId** | **UUID**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteSoftwareShipment"></a>
# **deleteSoftwareShipment**
> deleteSoftwareShipment(isvId, productId, softwareReleaseLimitationId, softwareShipmentId)

Delete a software shipment from a product and software release limitation

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    UUID softwareShipmentId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSoftwareShipment(isvId, productId, softwareReleaseLimitationId, softwareShipmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteSoftwareShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |
| **softwareShipmentId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteSoftwareShipmentProperty"></a>
# **deleteSoftwareShipmentProperty**
> deleteSoftwareShipmentProperty(isvId, productId, propertyId)

Delete a software shipment property from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID propertyId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSoftwareShipmentProperty(isvId, productId, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteSoftwareShipmentProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **propertyId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteUsageFeature"></a>
# **deleteUsageFeature**
> deleteUsageFeature(isvId, productId, usageFeatureId)

Delete a usage feature from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID usageFeatureId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteUsageFeature(isvId, productId, usageFeatureId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteUsageFeature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageFeatureId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteUsageModule"></a>
# **deleteUsageModule**
> deleteUsageModule(isvId, productId, usageModuleId)

Delete a usage module from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID usageModuleId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteUsageModule(isvId, productId, usageModuleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteUsageModule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageModuleId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="deleteVariable"></a>
# **deleteVariable**
> deleteVariable(isvId, productId, variableId)

Delete a variable from a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID variableId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteVariable(isvId, productId, variableId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#deleteVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **variableId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="exportFullProduct"></a>
# **exportFullProduct**
> File exportFullProduct(isvId, productId)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.exportFullProduct(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#exportFullProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**File**](File.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllAnalyticalFields"></a>
# **getAllAnalyticalFields**
> List&lt;AnalyticalFieldDto&gt; getAllAnalyticalFields(isvId, productId)

Get all analytical fields for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<AnalyticalFieldDto> result = apiInstance.getAllAnalyticalFields(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllAnalyticalFields");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;AnalyticalFieldDto&gt;**](AnalyticalFieldDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllConstrainedVariables"></a>
# **getAllConstrainedVariables**
> List&lt;ConstrainedVariableDto&gt; getAllConstrainedVariables(isvId, productId)

Get all constrained variables for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<ConstrainedVariableDto> result = apiInstance.getAllConstrainedVariables(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllConstrainedVariables");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;ConstrainedVariableDto&gt;**](ConstrainedVariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllEmailTemplates"></a>
# **getAllEmailTemplates**
> List&lt;EmailTemplateDto&gt; getAllEmailTemplates(isvId, productId)

Get all email templates for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<EmailTemplateDto> result = apiInstance.getAllEmailTemplates(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllEmailTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;EmailTemplateDto&gt;**](EmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllFeatures"></a>
# **getAllFeatures**
> List&lt;FeatureDto&gt; getAllFeatures(isvId, productId)

Get all features for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<FeatureDto> result = apiInstance.getAllFeatures(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllFeatures");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;FeatureDto&gt;**](FeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllLimitations"></a>
# **getAllLimitations**
> List&lt;LimitationDto&gt; getAllLimitations(isvId, productId)

Get all limitations for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<LimitationDto> result = apiInstance.getAllLimitations(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllLimitations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;LimitationDto&gt;**](LimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllProducts"></a>
# **getAllProducts**
> List&lt;ProductDto&gt; getAllProducts(isvId, name)

Get all products

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    try {
      List<ProductDto> result = apiInstance.getAllProducts(isvId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **name** | **String**|  | [optional] |

### Return type

[**List&lt;ProductDto&gt;**](ProductDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllSoftwareReleaseLimitations"></a>
# **getAllSoftwareReleaseLimitations**
> List&lt;SoftwareReleaseLimitationDto&gt; getAllSoftwareReleaseLimitations(isvId, productId)

Get all software release limitations for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<SoftwareReleaseLimitationDto> result = apiInstance.getAllSoftwareReleaseLimitations(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllSoftwareReleaseLimitations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;SoftwareReleaseLimitationDto&gt;**](SoftwareReleaseLimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllSoftwareShipmentProperties"></a>
# **getAllSoftwareShipmentProperties**
> List&lt;ProductSoftwareShipmentPropertyDto&gt; getAllSoftwareShipmentProperties(isvId, productId)

Get all software shipment properties for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<ProductSoftwareShipmentPropertyDto> result = apiInstance.getAllSoftwareShipmentProperties(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllSoftwareShipmentProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;ProductSoftwareShipmentPropertyDto&gt;**](ProductSoftwareShipmentPropertyDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllSoftwareShipments"></a>
# **getAllSoftwareShipments**
> List&lt;SoftwareShipmentDto&gt; getAllSoftwareShipments(isvId, productId, softwareReleaseLimitationId)

Get all software shipments for a product and software release limitation

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    try {
      List<SoftwareShipmentDto> result = apiInstance.getAllSoftwareShipments(isvId, productId, softwareReleaseLimitationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllSoftwareShipments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |

### Return type

[**List&lt;SoftwareShipmentDto&gt;**](SoftwareShipmentDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllUsageFeatures"></a>
# **getAllUsageFeatures**
> List&lt;UsageFeatureDto&gt; getAllUsageFeatures(isvId, productId)

Get all usage features for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<UsageFeatureDto> result = apiInstance.getAllUsageFeatures(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllUsageFeatures");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;UsageFeatureDto&gt;**](UsageFeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllUsageModules"></a>
# **getAllUsageModules**
> List&lt;UsageModuleDto&gt; getAllUsageModules(isvId, productId)

Get all usage modules for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<UsageModuleDto> result = apiInstance.getAllUsageModules(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllUsageModules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;UsageModuleDto&gt;**](UsageModuleDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAllVariables"></a>
# **getAllVariables**
> List&lt;VariableDto&gt; getAllVariables(isvId, productId)

Get all variables for a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<VariableDto> result = apiInstance.getAllVariables(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAllVariables");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;VariableDto&gt;**](VariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAnalyticalFieldById"></a>
# **getAnalyticalFieldById**
> AnalyticalFieldDto getAnalyticalFieldById(isvId, productId, analyticalFieldId)

Get a specific analytical field by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID analyticalFieldId = UUID.randomUUID(); // UUID | 
    try {
      AnalyticalFieldDto result = apiInstance.getAnalyticalFieldById(isvId, productId, analyticalFieldId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getAnalyticalFieldById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **analyticalFieldId** | **UUID**|  | |

### Return type

[**AnalyticalFieldDto**](AnalyticalFieldDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getConstrainedVariableById"></a>
# **getConstrainedVariableById**
> ConstrainedVariableDto getConstrainedVariableById(isvId, productId, variableId)

Get a specific constrained variable by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID variableId = UUID.randomUUID(); // UUID | 
    try {
      ConstrainedVariableDto result = apiInstance.getConstrainedVariableById(isvId, productId, variableId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getConstrainedVariableById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **variableId** | **UUID**|  | |

### Return type

[**ConstrainedVariableDto**](ConstrainedVariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getEmailTemplateById"></a>
# **getEmailTemplateById**
> EmailTemplateDto getEmailTemplateById(isvId, productId, emailTemplateId)

Get a specific email template by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID emailTemplateId = UUID.randomUUID(); // UUID | 
    try {
      EmailTemplateDto result = apiInstance.getEmailTemplateById(isvId, productId, emailTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getEmailTemplateById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **emailTemplateId** | **UUID**|  | |

### Return type

[**EmailTemplateDto**](EmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getFeatureById"></a>
# **getFeatureById**
> FeatureDto getFeatureById(isvId, productId, featureId)

Get a specific feature by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID featureId = UUID.randomUUID(); // UUID | 
    try {
      FeatureDto result = apiInstance.getFeatureById(isvId, productId, featureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getFeatureById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **featureId** | **UUID**|  | |

### Return type

[**FeatureDto**](FeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getLimitationById"></a>
# **getLimitationById**
> LimitationDto getLimitationById(isvId, productId, limitationId)

Get a specific limitation by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID limitationId = UUID.randomUUID(); // UUID | 
    try {
      LimitationDto result = apiInstance.getLimitationById(isvId, productId, limitationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getLimitationById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **limitationId** | **UUID**|  | |

### Return type

[**LimitationDto**](LimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getProduct"></a>
# **getProduct**
> ProductDto getProduct(isvId, productId)

Get product by id

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      ProductDto result = apiInstance.getProduct(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getProductDetails"></a>
# **getProductDetails**
> ProductDetailsDto getProductDetails(isvId, productId)

Get product details by id

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      ProductDetailsDto result = apiInstance.getProductDetails(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**ProductDetailsDto**](ProductDetailsDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getProductHistoryAsync"></a>
# **getProductHistoryAsync**
> List&lt;HistoryDto&gt; getProductHistoryAsync(isvId, productId)

Get the history of a product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    try {
      List<HistoryDto> result = apiInstance.getProductHistoryAsync(isvId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductHistoryAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |

### Return type

[**List&lt;HistoryDto&gt;**](HistoryDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getSoftwareReleaseLimitationById"></a>
# **getSoftwareReleaseLimitationById**
> SoftwareReleaseLimitationDto getSoftwareReleaseLimitationById(isvId, productId, softwareReleaseLimitationId)

Get a specific software release limitation by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    try {
      SoftwareReleaseLimitationDto result = apiInstance.getSoftwareReleaseLimitationById(isvId, productId, softwareReleaseLimitationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getSoftwareReleaseLimitationById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |

### Return type

[**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getSoftwareShipmentById"></a>
# **getSoftwareShipmentById**
> SoftwareShipmentDto getSoftwareShipmentById(isvId, productId, softwareReleaseLimitationId, softwareShipmentId)

Get a specific software shipment by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    UUID softwareShipmentId = UUID.randomUUID(); // UUID | 
    try {
      SoftwareShipmentDto result = apiInstance.getSoftwareShipmentById(isvId, productId, softwareReleaseLimitationId, softwareShipmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getSoftwareShipmentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |
| **softwareShipmentId** | **UUID**|  | |

### Return type

[**SoftwareShipmentDto**](SoftwareShipmentDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getSoftwareShipmentPropertyById"></a>
# **getSoftwareShipmentPropertyById**
> ProductSoftwareShipmentPropertyDto getSoftwareShipmentPropertyById(isvId, productId, propertyId)

Get a specific software shipment property by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID propertyId = UUID.randomUUID(); // UUID | 
    try {
      ProductSoftwareShipmentPropertyDto result = apiInstance.getSoftwareShipmentPropertyById(isvId, productId, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getSoftwareShipmentPropertyById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **propertyId** | **UUID**|  | |

### Return type

[**ProductSoftwareShipmentPropertyDto**](ProductSoftwareShipmentPropertyDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getUsageFeatureById"></a>
# **getUsageFeatureById**
> UsageFeatureDto getUsageFeatureById(isvId, productId, usageFeatureId)

Get a specific usage feature by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID usageFeatureId = UUID.randomUUID(); // UUID | 
    try {
      UsageFeatureDto result = apiInstance.getUsageFeatureById(isvId, productId, usageFeatureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getUsageFeatureById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageFeatureId** | **UUID**|  | |

### Return type

[**UsageFeatureDto**](UsageFeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getUsageModuleById"></a>
# **getUsageModuleById**
> UsageModuleDto getUsageModuleById(isvId, productId, usageModuleId)

Get a specific usage module by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID usageModuleId = UUID.randomUUID(); // UUID | 
    try {
      UsageModuleDto result = apiInstance.getUsageModuleById(isvId, productId, usageModuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getUsageModuleById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageModuleId** | **UUID**|  | |

### Return type

[**UsageModuleDto**](UsageModuleDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getVariableById"></a>
# **getVariableById**
> VariableDto getVariableById(isvId, productId, variableId)

Get a specific variable by ID

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID variableId = UUID.randomUUID(); // UUID | 
    try {
      VariableDto result = apiInstance.getVariableById(isvId, productId, variableId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getVariableById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **variableId** | **UUID**|  | |

### Return type

[**VariableDto**](VariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="importProductFromFile"></a>
# **importProductFromFile**
> FullProductDto importProductFromFile(isvId, product)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    File product = new File("/path/to/file"); // File | 
    try {
      FullProductDto result = apiInstance.importProductFromFile(isvId, product);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#importProductFromFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **product** | **File**|  | [optional] |

### Return type

[**FullProductDto**](FullProductDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateAnalyticalField"></a>
# **updateAnalyticalField**
> AnalyticalFieldDto updateAnalyticalField(isvId, productId, analyticalFieldDto)

Update an existing analytical field

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    AnalyticalFieldDto analyticalFieldDto = new AnalyticalFieldDto(); // AnalyticalFieldDto | 
    try {
      AnalyticalFieldDto result = apiInstance.updateAnalyticalField(isvId, productId, analyticalFieldDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateAnalyticalField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **analyticalFieldDto** | [**AnalyticalFieldDto**](AnalyticalFieldDto.md)|  | |

### Return type

[**AnalyticalFieldDto**](AnalyticalFieldDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateConstrainedVariable"></a>
# **updateConstrainedVariable**
> ConstrainedVariableDto updateConstrainedVariable(isvId, productId, constrainedVariableDto)

Update an existing constrained variable

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    ConstrainedVariableDto constrainedVariableDto = new ConstrainedVariableDto(); // ConstrainedVariableDto | 
    try {
      ConstrainedVariableDto result = apiInstance.updateConstrainedVariable(isvId, productId, constrainedVariableDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateConstrainedVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **constrainedVariableDto** | [**ConstrainedVariableDto**](ConstrainedVariableDto.md)|  | |

### Return type

[**ConstrainedVariableDto**](ConstrainedVariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateEmailTemplate"></a>
# **updateEmailTemplate**
> EmailTemplateDto updateEmailTemplate(isvId, productId, emailTemplateDto)

Update an existing email template

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    EmailTemplateDto emailTemplateDto = new EmailTemplateDto(); // EmailTemplateDto | 
    try {
      EmailTemplateDto result = apiInstance.updateEmailTemplate(isvId, productId, emailTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateEmailTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **emailTemplateDto** | [**EmailTemplateDto**](EmailTemplateDto.md)|  | |

### Return type

[**EmailTemplateDto**](EmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateFeature"></a>
# **updateFeature**
> FeatureDto updateFeature(isvId, productId, featureDto)

Update an existing feature

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    FeatureDto featureDto = new FeatureDto(); // FeatureDto | 
    try {
      FeatureDto result = apiInstance.updateFeature(isvId, productId, featureDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateFeature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **featureDto** | [**FeatureDto**](FeatureDto.md)|  | |

### Return type

[**FeatureDto**](FeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateLimitation"></a>
# **updateLimitation**
> LimitationDto updateLimitation(isvId, productId, limitationDto)

Update an existing limitation

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    LimitationDto limitationDto = new LimitationDto(); // LimitationDto | 
    try {
      LimitationDto result = apiInstance.updateLimitation(isvId, productId, limitationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateLimitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **limitationDto** | [**LimitationDto**](LimitationDto.md)|  | |

### Return type

[**LimitationDto**](LimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateProduct"></a>
# **updateProduct**
> ProductDto updateProduct(isvId, productDto)

Update an existing product

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ProductDto productDto = new ProductDto(); // ProductDto | 
    try {
      ProductDto result = apiInstance.updateProduct(isvId, productDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productDto** | [**ProductDto**](ProductDto.md)|  | |

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateSoftwareReleaseLimitation"></a>
# **updateSoftwareReleaseLimitation**
> SoftwareReleaseLimitationDto updateSoftwareReleaseLimitation(isvId, productId, softwareReleaseLimitationDto)

Update an existing software release limitation

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    SoftwareReleaseLimitationDto softwareReleaseLimitationDto = new SoftwareReleaseLimitationDto(); // SoftwareReleaseLimitationDto | 
    try {
      SoftwareReleaseLimitationDto result = apiInstance.updateSoftwareReleaseLimitation(isvId, productId, softwareReleaseLimitationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateSoftwareReleaseLimitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationDto** | [**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md)|  | |

### Return type

[**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateSoftwareShipment"></a>
# **updateSoftwareShipment**
> SoftwareShipmentDto updateSoftwareShipment(isvId, productId, softwareReleaseLimitationId, softwareShipmentDto)

Update an existing software shipment

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID softwareReleaseLimitationId = UUID.randomUUID(); // UUID | 
    SoftwareShipmentDto softwareShipmentDto = new SoftwareShipmentDto(); // SoftwareShipmentDto | 
    try {
      SoftwareShipmentDto result = apiInstance.updateSoftwareShipment(isvId, productId, softwareReleaseLimitationId, softwareShipmentDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateSoftwareShipment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **softwareReleaseLimitationId** | **UUID**|  | |
| **softwareShipmentDto** | [**SoftwareShipmentDto**](SoftwareShipmentDto.md)|  | |

### Return type

[**SoftwareShipmentDto**](SoftwareShipmentDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateSoftwareShipmentProperty"></a>
# **updateSoftwareShipmentProperty**
> ProductSoftwareShipmentPropertyDto updateSoftwareShipmentProperty(isvId, productId, productSoftwareShipmentPropertyDto)

Update an existing software shipment property

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    ProductSoftwareShipmentPropertyDto productSoftwareShipmentPropertyDto = new ProductSoftwareShipmentPropertyDto(); // ProductSoftwareShipmentPropertyDto | 
    try {
      ProductSoftwareShipmentPropertyDto result = apiInstance.updateSoftwareShipmentProperty(isvId, productId, productSoftwareShipmentPropertyDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateSoftwareShipmentProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **productSoftwareShipmentPropertyDto** | [**ProductSoftwareShipmentPropertyDto**](ProductSoftwareShipmentPropertyDto.md)|  | |

### Return type

[**ProductSoftwareShipmentPropertyDto**](ProductSoftwareShipmentPropertyDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateUsageFeature"></a>
# **updateUsageFeature**
> UsageFeatureDto updateUsageFeature(isvId, productId, usageFeatureDto)

Update an existing usage feature

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UsageFeatureDto usageFeatureDto = new UsageFeatureDto(); // UsageFeatureDto | 
    try {
      UsageFeatureDto result = apiInstance.updateUsageFeature(isvId, productId, usageFeatureDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateUsageFeature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageFeatureDto** | [**UsageFeatureDto**](UsageFeatureDto.md)|  | |

### Return type

[**UsageFeatureDto**](UsageFeatureDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateUsageModule"></a>
# **updateUsageModule**
> UsageModuleDto updateUsageModule(isvId, productId, usageModuleDto)

Update an existing usage module

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    UsageModuleDto usageModuleDto = new UsageModuleDto(); // UsageModuleDto | 
    try {
      UsageModuleDto result = apiInstance.updateUsageModule(isvId, productId, usageModuleDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateUsageModule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **usageModuleDto** | [**UsageModuleDto**](UsageModuleDto.md)|  | |

### Return type

[**UsageModuleDto**](UsageModuleDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="updateVariable"></a>
# **updateVariable**
> VariableDto updateVariable(isvId, productId, variableDto)

Update an existing variable

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    VariableDto variableDto = new VariableDto(); // VariableDto | 
    try {
      VariableDto result = apiInstance.updateVariable(isvId, productId, variableDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | |
| **variableDto** | [**VariableDto**](VariableDto.md)|  | |

### Return type

[**VariableDto**](VariableDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **504** | Gateway timeout |  -  |

