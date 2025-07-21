# RolesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserRolesAndLastActiveContext**](RolesApi.md#getUserRolesAndLastActiveContext) | **GET** /api/v2/roles | Get user roles and last active context for the authenticated user. |
| [**switchUserContext**](RolesApi.md#switchUserContext) | **POST** /api/v2/roles/context | Get user role for the authenticated user in the specified ISV context. |


<a id="getUserRolesAndLastActiveContext"></a>
# **getUserRolesAndLastActiveContext**
> UserRolesDto getUserRolesAndLastActiveContext()

Get user roles and last active context for the authenticated user.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    try {
      UserRolesDto result = apiInstance.getUserRolesAndLastActiveContext();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getUserRolesAndLastActiveContext");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserRolesDto**](UserRolesDto.md)

### Authorization

[Bearer](../README.md#Bearer)

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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

<a id="switchUserContext"></a>
# **switchUserContext**
> switchUserContext(userRoleContextDto)

Get user role for the authenticated user in the specified ISV context.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RolesApi apiInstance = new RolesApi(defaultClient);
    UserRoleContextDto userRoleContextDto = new UserRoleContextDto(); // UserRoleContextDto | 
    try {
      apiInstance.switchUserContext(userRoleContextDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#switchUserContext");
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
| **userRoleContextDto** | [**UserRoleContextDto**](UserRoleContextDto.md)|  | |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

