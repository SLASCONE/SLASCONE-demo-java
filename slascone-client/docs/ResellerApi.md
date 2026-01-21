# ResellerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReseller**](ResellerApi.md#addReseller) | **POST** /api/v2/isv/{isv_id}/resellers | Creates a reseller |
| [**addResellerContact**](ResellerApi.md#addResellerContact) | **POST** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Creates a reseller contact |
| [**addResellerTemplate**](ResellerApi.md#addResellerTemplate) | **POST** /api/v2/isv/{isv_id}/resellers/templates | Grants access to a product templates (edition) |
| [**addResellerType**](ResellerApi.md#addResellerType) | **POST** /api/v2/isv/{isv_id}/resellers/types | Creates a reseller type |
| [**deleteReseller**](ResellerApi.md#deleteReseller) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id} | Deletes a reseller |
| [**deleteResellerContact**](ResellerApi.md#deleteResellerContact) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/{contact_id} | Deletes a reseller contact |
| [**deleteResellerTemplate**](ResellerApi.md#deleteResellerTemplate) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id}/templates/{template_id} | Revokes access to a product templates (edition) |
| [**getAllResellers**](ResellerApi.md#getAllResellers) | **GET** /api/v2/isv/{isv_id}/resellers | Returns all resellers |
| [**getAllResellersLight**](ResellerApi.md#getAllResellersLight) | **GET** /api/v2/isv/{isv_id}/resellers/light | Returns all resellers with reduced information |
| [**getFilteredResellers**](ResellerApi.md#getFilteredResellers) | **POST** /api/v2/isv/{isv_id}/resellers/filtered | Returns all resellers matching a filter |
| [**getReseller**](ResellerApi.md#getReseller) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id} | Returns a reseller |
| [**getResellerByNumber**](ResellerApi.md#getResellerByNumber) | **GET** /api/v2/isv/{isv_id}/resellers/by_number | Returns a reseller |
| [**getResellerByUser**](ResellerApi.md#getResellerByUser) | **GET** /api/v2/isv/{isv_id}/resellers/by_user | Returns all resellers of the logged in user |
| [**getResellerContactByUserId**](ResellerApi.md#getResellerContactByUserId) | **GET** /api/v2/isv/{isv_id}/resellers/contacts | Returns a reseller contact |
| [**getResellerContacts**](ResellerApi.md#getResellerContacts) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Returns a reseller&#39;s contacts |
| [**getResellerCount**](ResellerApi.md#getResellerCount) | **GET** /api/v2/isv/{isv_id}/resellers/count | Returns the number of all resellers |
| [**getResellerTemplates**](ResellerApi.md#getResellerTemplates) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/templates | Returns all available product templates (editions) for a reseller |
| [**getResellerTypes**](ResellerApi.md#getResellerTypes) | **GET** /api/v2/isv/{isv_id}/resellers/types | Returns all reseller types |
| [**removeResellerType**](ResellerApi.md#removeResellerType) | **DELETE** /api/v2/isv/{isv_id}/resellers/types/{type_id}/new_type/{new_type_id} | Deletes a reseller type |
| [**resellerGetResellerByResellerNumberDeprecated**](ResellerApi.md#resellerGetResellerByResellerNumberDeprecated) | **GET** /api/v2/isv/{isv_id}/resellers/number/{reseller_number} | Returns a reseller (deprecated; use api/v{version:apiVersion}/isv/{isv_id}/resellers/by_number instead) |
| [**resendResellerContactInvitation**](ResellerApi.md#resendResellerContactInvitation) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/email/{contact_id} | Sends a new invitation email to a reseller contact |
| [**toggleResellerContactState**](ResellerApi.md#toggleResellerContactState) | **PUT** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/{contact_id} | Toggles a reseller contact state |
| [**updateReseller**](ResellerApi.md#updateReseller) | **PATCH** /api/v2/isv/{isv_id}/resellers | Updates a reseller |
| [**updateResellerContact**](ResellerApi.md#updateResellerContact) | **PATCH** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Updates a reseller contact |
| [**updateResellerTemplate**](ResellerApi.md#updateResellerTemplate) | **PUT** /api/v2/isv/{isv_id}/resellers/templates | Updates access to a product templates (edition) |
| [**updateResellerType**](ResellerApi.md#updateResellerType) | **PATCH** /api/v2/isv/{isv_id}/resellers/types | Updates a reseller type |


<a id="addReseller"></a>
# **addReseller**
> ResellerDto addReseller(isvId, resellerDto)

Creates a reseller

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerDto resellerDto = new ResellerDto(); // ResellerDto | 
    try {
      ResellerDto result = apiInstance.addReseller(isvId, resellerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#addReseller");
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
| **resellerDto** | [**ResellerDto**](ResellerDto.md)|  | |

### Return type

[**ResellerDto**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addResellerContact"></a>
# **addResellerContact**
> ResellerContactDto addResellerContact(isvId, resellerId, resellerContactDto)

Creates a reseller contact

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    ResellerContactDto resellerContactDto = new ResellerContactDto(); // ResellerContactDto | 
    try {
      ResellerContactDto result = apiInstance.addResellerContact(isvId, resellerId, resellerContactDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#addResellerContact");
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
| **resellerId** | **UUID**|  | |
| **resellerContactDto** | [**ResellerContactDto**](ResellerContactDto.md)|  | |

### Return type

[**ResellerContactDto**](ResellerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addResellerTemplate"></a>
# **addResellerTemplate**
> ResellerTemplateDto addResellerTemplate(isvId, resellerTemplateDto)

Grants access to a product templates (edition)

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerTemplateDto resellerTemplateDto = new ResellerTemplateDto(); // ResellerTemplateDto | 
    try {
      ResellerTemplateDto result = apiInstance.addResellerTemplate(isvId, resellerTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#addResellerTemplate");
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
| **resellerTemplateDto** | [**ResellerTemplateDto**](ResellerTemplateDto.md)|  | |

### Return type

[**ResellerTemplateDto**](ResellerTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addResellerType"></a>
# **addResellerType**
> ResellerTypeDto addResellerType(isvId, resellerTypeDto)

Creates a reseller type

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerTypeDto resellerTypeDto = new ResellerTypeDto(); // ResellerTypeDto | 
    try {
      ResellerTypeDto result = apiInstance.addResellerType(isvId, resellerTypeDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#addResellerType");
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
| **resellerTypeDto** | [**ResellerTypeDto**](ResellerTypeDto.md)|  | |

### Return type

[**ResellerTypeDto**](ResellerTypeDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="deleteReseller"></a>
# **deleteReseller**
> List&lt;ResellerDto&gt; deleteReseller(isvId, resellerId)

Deletes a reseller

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    try {
      List<ResellerDto> result = apiInstance.deleteReseller(isvId, resellerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#deleteReseller");
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
| **resellerId** | **UUID**|  | |

### Return type

[**List&lt;ResellerDto&gt;**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="deleteResellerContact"></a>
# **deleteResellerContact**
> ResellerContactDto deleteResellerContact(isvId, resellerId, contactId, removeIdentity)

Deletes a reseller contact

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    Boolean removeIdentity = true; // Boolean | 
    try {
      ResellerContactDto result = apiInstance.deleteResellerContact(isvId, resellerId, contactId, removeIdentity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#deleteResellerContact");
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
| **resellerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **removeIdentity** | **Boolean**|  | [optional] [default to true] |

### Return type

[**ResellerContactDto**](ResellerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="deleteResellerTemplate"></a>
# **deleteResellerTemplate**
> ResellerTemplateDto deleteResellerTemplate(isvId, resellerId, templateId)

Revokes access to a product templates (edition)

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    try {
      ResellerTemplateDto result = apiInstance.deleteResellerTemplate(isvId, resellerId, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#deleteResellerTemplate");
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
| **resellerId** | **UUID**|  | |
| **templateId** | **UUID**|  | |

### Return type

[**ResellerTemplateDto**](ResellerTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getAllResellers"></a>
# **getAllResellers**
> List&lt;ResellerDto&gt; getAllResellers(isvId, name)

Returns all resellers

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    try {
      List<ResellerDto> result = apiInstance.getAllResellers(isvId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getAllResellers");
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

[**List&lt;ResellerDto&gt;**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getAllResellersLight"></a>
# **getAllResellersLight**
> List&lt;ResellerLightDto&gt; getAllResellersLight(isvId)

Returns all resellers with reduced information

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      List<ResellerLightDto> result = apiInstance.getAllResellersLight(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getAllResellersLight");
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

[**List&lt;ResellerLightDto&gt;**](ResellerLightDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getFilteredResellers"></a>
# **getFilteredResellers**
> ResellerLazyLoadDto getFilteredResellers(isvId, resellerFilterDto)

Returns all resellers matching a filter

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerFilterDto resellerFilterDto = new ResellerFilterDto(); // ResellerFilterDto | 
    try {
      ResellerLazyLoadDto result = apiInstance.getFilteredResellers(isvId, resellerFilterDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getFilteredResellers");
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
| **resellerFilterDto** | [**ResellerFilterDto**](ResellerFilterDto.md)|  | |

### Return type

[**ResellerLazyLoadDto**](ResellerLazyLoadDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getReseller"></a>
# **getReseller**
> ResellerDto getReseller(isvId, resellerId)

Returns a reseller

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    try {
      ResellerDto result = apiInstance.getReseller(isvId, resellerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getReseller");
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
| **resellerId** | **UUID**|  | |

### Return type

[**ResellerDto**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerByNumber"></a>
# **getResellerByNumber**
> ResellerDto getResellerByNumber(isvId, resellerNumber)

Returns a reseller

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    String resellerNumber = "resellerNumber_example"; // String | 
    try {
      ResellerDto result = apiInstance.getResellerByNumber(isvId, resellerNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerByNumber");
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
| **resellerNumber** | **String**|  | |

### Return type

[**ResellerDto**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerByUser"></a>
# **getResellerByUser**
> ResellerDto getResellerByUser(isvId)

Returns all resellers of the logged in user

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      ResellerDto result = apiInstance.getResellerByUser(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerByUser");
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

[**ResellerDto**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerContactByUserId"></a>
# **getResellerContactByUserId**
> List&lt;ResellerContactDto&gt; getResellerContactByUserId(isvId)

Returns a reseller contact

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      List<ResellerContactDto> result = apiInstance.getResellerContactByUserId(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerContactByUserId");
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

[**List&lt;ResellerContactDto&gt;**](ResellerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerContacts"></a>
# **getResellerContacts**
> List&lt;ResellerContactDto&gt; getResellerContacts(isvId, resellerId)

Returns a reseller&#39;s contacts

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    try {
      List<ResellerContactDto> result = apiInstance.getResellerContacts(isvId, resellerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerContacts");
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
| **resellerId** | **UUID**|  | |

### Return type

[**List&lt;ResellerContactDto&gt;**](ResellerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerCount"></a>
# **getResellerCount**
> List&lt;Object&gt; getResellerCount(isvId)

Returns the number of all resellers

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      List<Object> result = apiInstance.getResellerCount(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerCount");
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

**List&lt;Object&gt;**

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerTemplates"></a>
# **getResellerTemplates**
> List&lt;ResellerTemplateDto&gt; getResellerTemplates(isvId, resellerId)

Returns all available product templates (editions) for a reseller

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    try {
      List<ResellerTemplateDto> result = apiInstance.getResellerTemplates(isvId, resellerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerTemplates");
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
| **resellerId** | **UUID**|  | |

### Return type

[**List&lt;ResellerTemplateDto&gt;**](ResellerTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getResellerTypes"></a>
# **getResellerTypes**
> List&lt;ResellerTypeDto&gt; getResellerTypes(isvId, name)

Returns all reseller types

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    try {
      List<ResellerTypeDto> result = apiInstance.getResellerTypes(isvId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#getResellerTypes");
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

[**List&lt;ResellerTypeDto&gt;**](ResellerTypeDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="removeResellerType"></a>
# **removeResellerType**
> ResellerTypeDto removeResellerType(isvId, typeId, newTypeId)

Deletes a reseller type

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID typeId = UUID.randomUUID(); // UUID | 
    UUID newTypeId = UUID.randomUUID(); // UUID | 
    try {
      ResellerTypeDto result = apiInstance.removeResellerType(isvId, typeId, newTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#removeResellerType");
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
| **typeId** | **UUID**|  | |
| **newTypeId** | **UUID**|  | |

### Return type

[**ResellerTypeDto**](ResellerTypeDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="resellerGetResellerByResellerNumberDeprecated"></a>
# **resellerGetResellerByResellerNumberDeprecated**
> ResellerDto resellerGetResellerByResellerNumberDeprecated(isvId, resellerNumber)

Returns a reseller (deprecated; use api/v{version:apiVersion}/isv/{isv_id}/resellers/by_number instead)

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    String resellerNumber = "resellerNumber_example"; // String | 
    try {
      ResellerDto result = apiInstance.resellerGetResellerByResellerNumberDeprecated(isvId, resellerNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#resellerGetResellerByResellerNumberDeprecated");
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
| **resellerNumber** | **String**|  | |

### Return type

[**ResellerDto**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="resendResellerContactInvitation"></a>
# **resendResellerContactInvitation**
> resendResellerContactInvitation(isvId, resellerId, contactId)

Sends a new invitation email to a reseller contact

A first invitation is send during creation of a contact

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.resendResellerContactInvitation(isvId, resellerId, contactId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#resendResellerContactInvitation");
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
| **resellerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |

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
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="toggleResellerContactState"></a>
# **toggleResellerContactState**
> ResellerContactDto toggleResellerContactState(isvId, resellerId, contactId)

Toggles a reseller contact state

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    try {
      ResellerContactDto result = apiInstance.toggleResellerContactState(isvId, resellerId, contactId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#toggleResellerContactState");
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
| **resellerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |

### Return type

[**ResellerContactDto**](ResellerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateReseller"></a>
# **updateReseller**
> ResellerDto updateReseller(isvId, resellerDto)

Updates a reseller

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerDto resellerDto = new ResellerDto(); // ResellerDto | 
    try {
      ResellerDto result = apiInstance.updateReseller(isvId, resellerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#updateReseller");
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
| **resellerDto** | [**ResellerDto**](ResellerDto.md)|  | |

### Return type

[**ResellerDto**](ResellerDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateResellerContact"></a>
# **updateResellerContact**
> ResellerContactDto updateResellerContact(isvId, resellerId, resellerContactDto)

Updates a reseller contact

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID resellerId = UUID.randomUUID(); // UUID | 
    ResellerContactDto resellerContactDto = new ResellerContactDto(); // ResellerContactDto | 
    try {
      ResellerContactDto result = apiInstance.updateResellerContact(isvId, resellerId, resellerContactDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#updateResellerContact");
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
| **resellerId** | **UUID**|  | |
| **resellerContactDto** | [**ResellerContactDto**](ResellerContactDto.md)|  | |

### Return type

[**ResellerContactDto**](ResellerContactDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateResellerTemplate"></a>
# **updateResellerTemplate**
> ResellerTemplateDto updateResellerTemplate(isvId, resellerTemplateDto)

Updates access to a product templates (edition)

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerTemplateDto resellerTemplateDto = new ResellerTemplateDto(); // ResellerTemplateDto | 
    try {
      ResellerTemplateDto result = apiInstance.updateResellerTemplate(isvId, resellerTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#updateResellerTemplate");
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
| **resellerTemplateDto** | [**ResellerTemplateDto**](ResellerTemplateDto.md)|  | |

### Return type

[**ResellerTemplateDto**](ResellerTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateResellerType"></a>
# **updateResellerType**
> ResellerTypeDto updateResellerType(isvId, resellerTypeDto)

Updates a reseller type

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ResellerApi;

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

    ResellerApi apiInstance = new ResellerApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ResellerTypeDto resellerTypeDto = new ResellerTypeDto(); // ResellerTypeDto | 
    try {
      ResellerTypeDto result = apiInstance.updateResellerType(isvId, resellerTypeDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResellerApi#updateResellerType");
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
| **resellerTypeDto** | [**ResellerTypeDto**](ResellerTypeDto.md)|  | |

### Return type

[**ResellerTypeDto**](ResellerTypeDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

