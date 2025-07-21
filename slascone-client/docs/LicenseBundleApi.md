# LicenseBundleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLicenseBundle**](LicenseBundleApi.md#addLicenseBundle) | **POST** /api/v2/isv/{isv_id}/licensebundles |  |
| [**deleteLicenseBundle**](LicenseBundleApi.md#deleteLicenseBundle) | **DELETE** /api/v2/isv/{isv_id}/licensebundles/{license_bundle_id} |  |
| [**getLicenseBundle**](LicenseBundleApi.md#getLicenseBundle) | **GET** /api/v2/isv/{isv_id}/licensebundles/{license_bundle_id} |  |
| [**getLicenseBundleHistory**](LicenseBundleApi.md#getLicenseBundleHistory) | **GET** /api/v2/isv/{isv_id}/licensebundles/{license_bundle_id}/history | Returns the entire audit history of a license bundle |
| [**getLicenseBundleHistoryDetail**](LicenseBundleApi.md#getLicenseBundleHistoryDetail) | **GET** /api/v2/isv/{isv_id}/licensebundles/{license_bundle_id}/history/{history_id} | Returns a specific license bundle audit history snapshot |
| [**getLicenseBundles**](LicenseBundleApi.md#getLicenseBundles) | **GET** /api/v2/isv/{isv_id}/licensebundles |  |
| [**updateLicenseBundle**](LicenseBundleApi.md#updateLicenseBundle) | **PUT** /api/v2/isv/{isv_id}/licensebundles |  |


<a id="addLicenseBundle"></a>
# **addLicenseBundle**
> LicenseBundleDto addLicenseBundle(isvId, licenseBundleDto)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    LicenseBundleDto licenseBundleDto = new LicenseBundleDto(); // LicenseBundleDto | 
    try {
      LicenseBundleDto result = apiInstance.addLicenseBundle(isvId, licenseBundleDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#addLicenseBundle");
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
| **licenseBundleDto** | [**LicenseBundleDto**](LicenseBundleDto.md)|  | |

### Return type

[**LicenseBundleDto**](LicenseBundleDto.md)

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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

<a id="deleteLicenseBundle"></a>
# **deleteLicenseBundle**
> LicenseBundleDto deleteLicenseBundle(isvId, licenseBundleId)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID licenseBundleId = UUID.randomUUID(); // UUID | 
    try {
      LicenseBundleDto result = apiInstance.deleteLicenseBundle(isvId, licenseBundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#deleteLicenseBundle");
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
| **licenseBundleId** | **UUID**|  | |

### Return type

[**LicenseBundleDto**](LicenseBundleDto.md)

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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

<a id="getLicenseBundle"></a>
# **getLicenseBundle**
> LicenseBundleDto getLicenseBundle(isvId, licenseBundleId)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID licenseBundleId = UUID.randomUUID(); // UUID | 
    try {
      LicenseBundleDto result = apiInstance.getLicenseBundle(isvId, licenseBundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#getLicenseBundle");
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
| **licenseBundleId** | **UUID**|  | |

### Return type

[**LicenseBundleDto**](LicenseBundleDto.md)

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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

<a id="getLicenseBundleHistory"></a>
# **getLicenseBundleHistory**
> List&lt;HistoryDto&gt; getLicenseBundleHistory(isvId, licenseBundleId)

Returns the entire audit history of a license bundle

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID licenseBundleId = UUID.randomUUID(); // UUID | 
    try {
      List<HistoryDto> result = apiInstance.getLicenseBundleHistory(isvId, licenseBundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#getLicenseBundleHistory");
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
| **licenseBundleId** | **UUID**|  | |

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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

<a id="getLicenseBundleHistoryDetail"></a>
# **getLicenseBundleHistoryDetail**
> HistoryDto getLicenseBundleHistoryDetail(isvId, licenseBundleId, historyId)

Returns a specific license bundle audit history snapshot

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID licenseBundleId = UUID.randomUUID(); // UUID | 
    UUID historyId = UUID.randomUUID(); // UUID | 
    try {
      HistoryDto result = apiInstance.getLicenseBundleHistoryDetail(isvId, licenseBundleId, historyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#getLicenseBundleHistoryDetail");
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
| **licenseBundleId** | **UUID**|  | |
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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

<a id="getLicenseBundles"></a>
# **getLicenseBundles**
> List&lt;LicenseBundleDto&gt; getLicenseBundles(isvId, customerId)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID customerId = UUID.randomUUID(); // UUID | 
    try {
      List<LicenseBundleDto> result = apiInstance.getLicenseBundles(isvId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#getLicenseBundles");
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
| **customerId** | **UUID**|  | [optional] |

### Return type

[**List&lt;LicenseBundleDto&gt;**](LicenseBundleDto.md)

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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

<a id="updateLicenseBundle"></a>
# **updateLicenseBundle**
> LicenseBundleDto updateLicenseBundle(isvId, licenseBundleDto)



### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseBundleApi;

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

    LicenseBundleApi apiInstance = new LicenseBundleApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    LicenseBundleDto licenseBundleDto = new LicenseBundleDto(); // LicenseBundleDto | 
    try {
      LicenseBundleDto result = apiInstance.updateLicenseBundle(isvId, licenseBundleDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicenseBundleApi#updateLicenseBundle");
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
| **licenseBundleDto** | [**LicenseBundleDto**](LicenseBundleDto.md)|  | |

### Return type

[**LicenseBundleDto**](LicenseBundleDto.md)

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
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

