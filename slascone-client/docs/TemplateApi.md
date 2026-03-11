# TemplateApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTemplate**](TemplateApi.md#addTemplate) | **POST** /api/v2/isv/{isv_id}/templates | Creates a template (edition) |
| [**addTemplateWithHttpInfo**](TemplateApi.md#addTemplateWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/templates | Creates a template (edition) |
| [**cloneTemplate**](TemplateApi.md#cloneTemplate) | **POST** /api/v2/isv/{isv_id}/templates/{template_id}/clone | Duplicates a template (edition) |
| [**cloneTemplateWithHttpInfo**](TemplateApi.md#cloneTemplateWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/templates/{template_id}/clone | Duplicates a template (edition) |
| [**deleteTemplate**](TemplateApi.md#deleteTemplate) | **DELETE** /api/v2/isv/{isv_id}/templates/{template_id} | Deletes a template (edition) |
| [**deleteTemplateWithHttpInfo**](TemplateApi.md#deleteTemplateWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/templates/{template_id} | Deletes a template (edition) |
| [**getAllTemplates**](TemplateApi.md#getAllTemplates) | **GET** /api/v2/isv/{isv_id}/templates | Returns all templates (editions) |
| [**getAllTemplatesWithHttpInfo**](TemplateApi.md#getAllTemplatesWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/templates | Returns all templates (editions) |
| [**getTemplate**](TemplateApi.md#getTemplate) | **GET** /api/v2/isv/{isv_id}/templates/{template_id} | Returns a template (edition) |
| [**getTemplateWithHttpInfo**](TemplateApi.md#getTemplateWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/templates/{template_id} | Returns a template (edition) |
| [**getTemplateHistory**](TemplateApi.md#getTemplateHistory) | **GET** /api/v2/isv/{isv_id}/templates/{template_id}/history | Returns the entire audit history of a template (edition) |
| [**getTemplateHistoryWithHttpInfo**](TemplateApi.md#getTemplateHistoryWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/templates/{template_id}/history | Returns the entire audit history of a template (edition) |
| [**getTemplateHistoryDetail**](TemplateApi.md#getTemplateHistoryDetail) | **GET** /api/v2/isv/{isv_id}/templates/{template_id}/history/{history_id} | Returns a specific template (edition) audit history snapshot |
| [**getTemplateHistoryDetailWithHttpInfo**](TemplateApi.md#getTemplateHistoryDetailWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/templates/{template_id}/history/{history_id} | Returns a specific template (edition) audit history snapshot |
| [**updateTemplate**](TemplateApi.md#updateTemplate) | **PATCH** /api/v2/isv/{isv_id}/templates | Updates a template (edition) |
| [**updateTemplateWithHttpInfo**](TemplateApi.md#updateTemplateWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/templates | Updates a template (edition) |



## addTemplate

> TemplateDto addTemplate(isvId, templateDto)

Creates a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        TemplateDto templateDto = new TemplateDto(); // TemplateDto | 
        try {
            TemplateDto result = apiInstance.addTemplate(isvId, templateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#addTemplate");
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
| **templateDto** | [**TemplateDto**](TemplateDto.md)|  | |

### Return type

[**TemplateDto**](TemplateDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## addTemplateWithHttpInfo

> ApiResponse<TemplateDto> addTemplate addTemplateWithHttpInfo(isvId, templateDto)

Creates a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        TemplateDto templateDto = new TemplateDto(); // TemplateDto | 
        try {
            ApiResponse<TemplateDto> response = apiInstance.addTemplateWithHttpInfo(isvId, templateDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#addTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateDto** | [**TemplateDto**](TemplateDto.md)|  | |

### Return type

ApiResponse<[**TemplateDto**](TemplateDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## cloneTemplate

> TemplateDto cloneTemplate(isvId, templateId)

Duplicates a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        try {
            TemplateDto result = apiInstance.cloneTemplate(isvId, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#cloneTemplate");
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
| **templateId** | **UUID**|  | |

### Return type

[**TemplateDto**](TemplateDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## cloneTemplateWithHttpInfo

> ApiResponse<TemplateDto> cloneTemplate cloneTemplateWithHttpInfo(isvId, templateId)

Duplicates a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<TemplateDto> response = apiInstance.cloneTemplateWithHttpInfo(isvId, templateId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#cloneTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateId** | **UUID**|  | |

### Return type

ApiResponse<[**TemplateDto**](TemplateDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## deleteTemplate

> TemplateDto deleteTemplate(isvId, templateId, newTemplateId)

Deletes a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        UUID newTemplateId = UUID.randomUUID(); // UUID | 
        try {
            TemplateDto result = apiInstance.deleteTemplate(isvId, templateId, newTemplateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#deleteTemplate");
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
| **templateId** | **UUID**|  | |
| **newTemplateId** | **UUID**|  | [optional] |

### Return type

[**TemplateDto**](TemplateDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## deleteTemplateWithHttpInfo

> ApiResponse<TemplateDto> deleteTemplate deleteTemplateWithHttpInfo(isvId, templateId, newTemplateId)

Deletes a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        UUID newTemplateId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<TemplateDto> response = apiInstance.deleteTemplateWithHttpInfo(isvId, templateId, newTemplateId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#deleteTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateId** | **UUID**|  | |
| **newTemplateId** | **UUID**|  | [optional] |

### Return type

ApiResponse<[**TemplateDto**](TemplateDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## getAllTemplates

> List<TemplateDto> getAllTemplates(isvId, productId, name)

Returns all templates (editions)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID productId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            List<TemplateDto> result = apiInstance.getAllTemplates(isvId, productId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getAllTemplates");
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
| **productId** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |

### Return type

[**List&lt;TemplateDto&gt;**](TemplateDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getAllTemplatesWithHttpInfo

> ApiResponse<List<TemplateDto>> getAllTemplates getAllTemplatesWithHttpInfo(isvId, productId, name)

Returns all templates (editions)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID productId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            ApiResponse<List<TemplateDto>> response = apiInstance.getAllTemplatesWithHttpInfo(isvId, productId, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getAllTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **productId** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;TemplateDto&gt;**](TemplateDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## getTemplate

> TemplateDto getTemplate(isvId, templateId)

Returns a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        try {
            TemplateDto result = apiInstance.getTemplate(isvId, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplate");
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
| **templateId** | **UUID**|  | |

### Return type

[**TemplateDto**](TemplateDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getTemplateWithHttpInfo

> ApiResponse<TemplateDto> getTemplate getTemplateWithHttpInfo(isvId, templateId)

Returns a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<TemplateDto> response = apiInstance.getTemplateWithHttpInfo(isvId, templateId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateId** | **UUID**|  | |

### Return type

ApiResponse<[**TemplateDto**](TemplateDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## getTemplateHistory

> List<HistoryDto> getTemplateHistory(isvId, templateId)

Returns the entire audit history of a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        try {
            List<HistoryDto> result = apiInstance.getTemplateHistory(isvId, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplateHistory");
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
| **templateId** | **UUID**|  | |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getTemplateHistoryWithHttpInfo

> ApiResponse<List<HistoryDto>> getTemplateHistory getTemplateHistoryWithHttpInfo(isvId, templateId)

Returns the entire audit history of a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<HistoryDto>> response = apiInstance.getTemplateHistoryWithHttpInfo(isvId, templateId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplateHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;HistoryDto&gt;**](HistoryDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## getTemplateHistoryDetail

> HistoryDto getTemplateHistoryDetail(isvId, templateId, historyId)

Returns a specific template (edition) audit history snapshot

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        UUID historyId = UUID.randomUUID(); // UUID | 
        try {
            HistoryDto result = apiInstance.getTemplateHistoryDetail(isvId, templateId, historyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplateHistoryDetail");
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
| **templateId** | **UUID**|  | |
| **historyId** | **UUID**|  | |

### Return type

[**HistoryDto**](HistoryDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getTemplateHistoryDetailWithHttpInfo

> ApiResponse<HistoryDto> getTemplateHistoryDetail getTemplateHistoryDetailWithHttpInfo(isvId, templateId, historyId)

Returns a specific template (edition) audit history snapshot

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID templateId = UUID.randomUUID(); // UUID | 
        UUID historyId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<HistoryDto> response = apiInstance.getTemplateHistoryDetailWithHttpInfo(isvId, templateId, historyId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplateHistoryDetail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateId** | **UUID**|  | |
| **historyId** | **UUID**|  | |

### Return type

ApiResponse<[**HistoryDto**](HistoryDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |


## updateTemplate

> TemplateDto updateTemplate(isvId, templateDto)

Updates a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        TemplateDto templateDto = new TemplateDto(); // TemplateDto | 
        try {
            TemplateDto result = apiInstance.updateTemplate(isvId, templateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#updateTemplate");
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
| **templateDto** | [**TemplateDto**](TemplateDto.md)|  | |

### Return type

[**TemplateDto**](TemplateDto.md)


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## updateTemplateWithHttpInfo

> ApiResponse<TemplateDto> updateTemplate updateTemplateWithHttpInfo(isvId, templateDto)

Updates a template (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.TemplateApi;

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

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        TemplateDto templateDto = new TemplateDto(); // TemplateDto | 
        try {
            ApiResponse<TemplateDto> response = apiInstance.updateTemplateWithHttpInfo(isvId, templateDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#updateTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isvId** | **UUID**|  | |
| **templateDto** | [**TemplateDto**](TemplateDto.md)|  | |

### Return type

ApiResponse<[**TemplateDto**](TemplateDto.md)>


### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

