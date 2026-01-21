# CustomerPortalApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomerContactByUserIdCP**](CustomerPortalApi.md#getCustomerContactByUserIdCP) | **GET** /api/v2/isv/{isv_id}/customer_portal/customer/contact | Returns a customer portal user |


<a id="getCustomerContactByUserIdCP"></a>
# **getCustomerContactByUserIdCP**
> List&lt;CustomerContactDto&gt; getCustomerContactByUserIdCP(isvId)

Returns a customer portal user

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerPortalApi;

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

    CustomerPortalApi apiInstance = new CustomerPortalApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      List<CustomerContactDto> result = apiInstance.getCustomerContactByUserIdCP(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerPortalApi#getCustomerContactByUserIdCP");
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

### Return type

[**List&lt;CustomerContactDto&gt;**](CustomerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

