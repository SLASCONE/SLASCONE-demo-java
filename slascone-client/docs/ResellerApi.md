# ResellerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReseller**](ResellerApi.md#addReseller) | **POST** /api/v2/isv/{isv_id}/resellers | Creates a reseller |
| [**addResellerWithHttpInfo**](ResellerApi.md#addResellerWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/resellers | Creates a reseller |
| [**addResellerContact**](ResellerApi.md#addResellerContact) | **POST** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Creates a reseller contact |
| [**addResellerContactWithHttpInfo**](ResellerApi.md#addResellerContactWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Creates a reseller contact |
| [**addResellerTemplate**](ResellerApi.md#addResellerTemplate) | **POST** /api/v2/isv/{isv_id}/resellers/templates | Grants access to a product templates (edition) |
| [**addResellerTemplateWithHttpInfo**](ResellerApi.md#addResellerTemplateWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/resellers/templates | Grants access to a product templates (edition) |
| [**addResellerType**](ResellerApi.md#addResellerType) | **POST** /api/v2/isv/{isv_id}/resellers/types | Creates a reseller type |
| [**addResellerTypeWithHttpInfo**](ResellerApi.md#addResellerTypeWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/resellers/types | Creates a reseller type |
| [**deleteReseller**](ResellerApi.md#deleteReseller) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id} | Deletes a reseller |
| [**deleteResellerWithHttpInfo**](ResellerApi.md#deleteResellerWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id} | Deletes a reseller |
| [**deleteResellerContact**](ResellerApi.md#deleteResellerContact) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/{contact_id} | Deletes a reseller contact |
| [**deleteResellerContactWithHttpInfo**](ResellerApi.md#deleteResellerContactWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/{contact_id} | Deletes a reseller contact |
| [**deleteResellerTemplate**](ResellerApi.md#deleteResellerTemplate) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id}/templates/{template_id} | Revokes access to a product templates (edition) |
| [**deleteResellerTemplateWithHttpInfo**](ResellerApi.md#deleteResellerTemplateWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/resellers/{reseller_id}/templates/{template_id} | Revokes access to a product templates (edition) |
| [**getAllResellers**](ResellerApi.md#getAllResellers) | **GET** /api/v2/isv/{isv_id}/resellers | Returns all resellers |
| [**getAllResellersWithHttpInfo**](ResellerApi.md#getAllResellersWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers | Returns all resellers |
| [**getAllResellersLight**](ResellerApi.md#getAllResellersLight) | **GET** /api/v2/isv/{isv_id}/resellers/light | Returns all resellers with reduced information |
| [**getAllResellersLightWithHttpInfo**](ResellerApi.md#getAllResellersLightWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/light | Returns all resellers with reduced information |
| [**getFilteredResellers**](ResellerApi.md#getFilteredResellers) | **POST** /api/v2/isv/{isv_id}/resellers/filtered | Returns all resellers matching a filter |
| [**getFilteredResellersWithHttpInfo**](ResellerApi.md#getFilteredResellersWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/resellers/filtered | Returns all resellers matching a filter |
| [**getReseller**](ResellerApi.md#getReseller) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id} | Returns a reseller |
| [**getResellerWithHttpInfo**](ResellerApi.md#getResellerWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id} | Returns a reseller |
| [**getResellerByNumber**](ResellerApi.md#getResellerByNumber) | **GET** /api/v2/isv/{isv_id}/resellers/by_number | Returns a reseller |
| [**getResellerByNumberWithHttpInfo**](ResellerApi.md#getResellerByNumberWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/by_number | Returns a reseller |
| [**getResellerByUser**](ResellerApi.md#getResellerByUser) | **GET** /api/v2/isv/{isv_id}/resellers/by_user | Returns all resellers of the logged in user |
| [**getResellerByUserWithHttpInfo**](ResellerApi.md#getResellerByUserWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/by_user | Returns all resellers of the logged in user |
| [**getResellerContactByUserId**](ResellerApi.md#getResellerContactByUserId) | **GET** /api/v2/isv/{isv_id}/resellers/contacts | Returns a reseller contact |
| [**getResellerContactByUserIdWithHttpInfo**](ResellerApi.md#getResellerContactByUserIdWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/contacts | Returns a reseller contact |
| [**getResellerContacts**](ResellerApi.md#getResellerContacts) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Returns a reseller&#39;s contacts |
| [**getResellerContactsWithHttpInfo**](ResellerApi.md#getResellerContactsWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Returns a reseller&#39;s contacts |
| [**getResellerCount**](ResellerApi.md#getResellerCount) | **GET** /api/v2/isv/{isv_id}/resellers/count | Returns the number of all resellers |
| [**getResellerCountWithHttpInfo**](ResellerApi.md#getResellerCountWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/count | Returns the number of all resellers |
| [**getResellerTemplates**](ResellerApi.md#getResellerTemplates) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/templates | Returns all available product templates (editions) for a reseller |
| [**getResellerTemplatesWithHttpInfo**](ResellerApi.md#getResellerTemplatesWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/templates | Returns all available product templates (editions) for a reseller |
| [**getResellerTypes**](ResellerApi.md#getResellerTypes) | **GET** /api/v2/isv/{isv_id}/resellers/types | Returns all reseller types |
| [**getResellerTypesWithHttpInfo**](ResellerApi.md#getResellerTypesWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/types | Returns all reseller types |
| [**removeResellerType**](ResellerApi.md#removeResellerType) | **DELETE** /api/v2/isv/{isv_id}/resellers/types/{type_id}/new_type/{new_type_id} | Deletes a reseller type |
| [**removeResellerTypeWithHttpInfo**](ResellerApi.md#removeResellerTypeWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/resellers/types/{type_id}/new_type/{new_type_id} | Deletes a reseller type |
| [**resellerGetResellerByResellerNumberDeprecated**](ResellerApi.md#resellerGetResellerByResellerNumberDeprecated) | **GET** /api/v2/isv/{isv_id}/resellers/number/{reseller_number} | Returns a reseller (deprecated; use api/v{version:apiVersion}/isv/{isv_id}/resellers/by_number instead) |
| [**resellerGetResellerByResellerNumberDeprecatedWithHttpInfo**](ResellerApi.md#resellerGetResellerByResellerNumberDeprecatedWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/number/{reseller_number} | Returns a reseller (deprecated; use api/v{version:apiVersion}/isv/{isv_id}/resellers/by_number instead) |
| [**resendResellerContactInvitation**](ResellerApi.md#resendResellerContactInvitation) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/email/{contact_id} | Sends a new invitation email to a reseller contact |
| [**resendResellerContactInvitationWithHttpInfo**](ResellerApi.md#resendResellerContactInvitationWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/email/{contact_id} | Sends a new invitation email to a reseller contact |
| [**toggleResellerContactState**](ResellerApi.md#toggleResellerContactState) | **PUT** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/{contact_id} | Toggles a reseller contact state |
| [**toggleResellerContactStateWithHttpInfo**](ResellerApi.md#toggleResellerContactStateWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts/{contact_id} | Toggles a reseller contact state |
| [**updateReseller**](ResellerApi.md#updateReseller) | **PATCH** /api/v2/isv/{isv_id}/resellers | Updates a reseller |
| [**updateResellerWithHttpInfo**](ResellerApi.md#updateResellerWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/resellers | Updates a reseller |
| [**updateResellerContact**](ResellerApi.md#updateResellerContact) | **PATCH** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Updates a reseller contact |
| [**updateResellerContactWithHttpInfo**](ResellerApi.md#updateResellerContactWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/resellers/{reseller_id}/contacts | Updates a reseller contact |
| [**updateResellerTemplate**](ResellerApi.md#updateResellerTemplate) | **PUT** /api/v2/isv/{isv_id}/resellers/templates | Updates access to a product templates (edition) |
| [**updateResellerTemplateWithHttpInfo**](ResellerApi.md#updateResellerTemplateWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/resellers/templates | Updates access to a product templates (edition) |
| [**updateResellerType**](ResellerApi.md#updateResellerType) | **PATCH** /api/v2/isv/{isv_id}/resellers/types | Updates a reseller type |
| [**updateResellerTypeWithHttpInfo**](ResellerApi.md#updateResellerTypeWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/resellers/types | Updates a reseller type |



## addReseller

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## addResellerWithHttpInfo

> ApiResponse<ResellerDto> addReseller addResellerWithHttpInfo(isvId, resellerDto)

Creates a reseller

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerDto> response = apiInstance.addResellerWithHttpInfo(isvId, resellerDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#addReseller");
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
| **resellerDto** | [**ResellerDto**](ResellerDto.md)|  | |

### Return type

ApiResponse<[**ResellerDto**](ResellerDto.md)>


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


## addResellerContact

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## addResellerContactWithHttpInfo

> ApiResponse<ResellerContactDto> addResellerContact addResellerContactWithHttpInfo(isvId, resellerId, resellerContactDto)

Creates a reseller contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerContactDto> response = apiInstance.addResellerContactWithHttpInfo(isvId, resellerId, resellerContactDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#addResellerContact");
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
| **resellerId** | **UUID**|  | |
| **resellerContactDto** | [**ResellerContactDto**](ResellerContactDto.md)|  | |

### Return type

ApiResponse<[**ResellerContactDto**](ResellerContactDto.md)>


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


## addResellerTemplate

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## addResellerTemplateWithHttpInfo

> ApiResponse<ResellerTemplateDto> addResellerTemplate addResellerTemplateWithHttpInfo(isvId, resellerTemplateDto)

Grants access to a product templates (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerTemplateDto> response = apiInstance.addResellerTemplateWithHttpInfo(isvId, resellerTemplateDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#addResellerTemplate");
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
| **resellerTemplateDto** | [**ResellerTemplateDto**](ResellerTemplateDto.md)|  | |

### Return type

ApiResponse<[**ResellerTemplateDto**](ResellerTemplateDto.md)>


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


## addResellerType

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## addResellerTypeWithHttpInfo

> ApiResponse<ResellerTypeDto> addResellerType addResellerTypeWithHttpInfo(isvId, resellerTypeDto)

Creates a reseller type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerTypeDto> response = apiInstance.addResellerTypeWithHttpInfo(isvId, resellerTypeDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#addResellerType");
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
| **resellerTypeDto** | [**ResellerTypeDto**](ResellerTypeDto.md)|  | |

### Return type

ApiResponse<[**ResellerTypeDto**](ResellerTypeDto.md)>


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


## deleteReseller

> List<ResellerDto> deleteReseller(isvId, resellerId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## deleteResellerWithHttpInfo

> ApiResponse<List<ResellerDto>> deleteReseller deleteResellerWithHttpInfo(isvId, resellerId)

Deletes a reseller

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerDto>> response = apiInstance.deleteResellerWithHttpInfo(isvId, resellerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#deleteReseller");
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
| **resellerId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;ResellerDto&gt;**](ResellerDto.md)>


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


## deleteResellerContact

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## deleteResellerContactWithHttpInfo

> ApiResponse<ResellerContactDto> deleteResellerContact deleteResellerContactWithHttpInfo(isvId, resellerId, contactId, removeIdentity)

Deletes a reseller contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerContactDto> response = apiInstance.deleteResellerContactWithHttpInfo(isvId, resellerId, contactId, removeIdentity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#deleteResellerContact");
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
| **resellerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **removeIdentity** | **Boolean**|  | [optional] [default to true] |

### Return type

ApiResponse<[**ResellerContactDto**](ResellerContactDto.md)>


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


## deleteResellerTemplate

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## deleteResellerTemplateWithHttpInfo

> ApiResponse<ResellerTemplateDto> deleteResellerTemplate deleteResellerTemplateWithHttpInfo(isvId, resellerId, templateId)

Revokes access to a product templates (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerTemplateDto> response = apiInstance.deleteResellerTemplateWithHttpInfo(isvId, resellerId, templateId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#deleteResellerTemplate");
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
| **resellerId** | **UUID**|  | |
| **templateId** | **UUID**|  | |

### Return type

ApiResponse<[**ResellerTemplateDto**](ResellerTemplateDto.md)>


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


## getAllResellers

> List<ResellerDto> getAllResellers(isvId, name)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getAllResellersWithHttpInfo

> ApiResponse<List<ResellerDto>> getAllResellers getAllResellersWithHttpInfo(isvId, name)

Returns all resellers

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerDto>> response = apiInstance.getAllResellersWithHttpInfo(isvId, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getAllResellers");
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
| **name** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;ResellerDto&gt;**](ResellerDto.md)>


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


## getAllResellersLight

> List<ResellerLightDto> getAllResellersLight(isvId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getAllResellersLightWithHttpInfo

> ApiResponse<List<ResellerLightDto>> getAllResellersLight getAllResellersLightWithHttpInfo(isvId)

Returns all resellers with reduced information

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerLightDto>> response = apiInstance.getAllResellersLightWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getAllResellersLight");
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

### Return type

ApiResponse<[**List&lt;ResellerLightDto&gt;**](ResellerLightDto.md)>


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


## getFilteredResellers

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getFilteredResellersWithHttpInfo

> ApiResponse<ResellerLazyLoadDto> getFilteredResellers getFilteredResellersWithHttpInfo(isvId, resellerFilterDto)

Returns all resellers matching a filter

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerLazyLoadDto> response = apiInstance.getFilteredResellersWithHttpInfo(isvId, resellerFilterDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getFilteredResellers");
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
| **resellerFilterDto** | [**ResellerFilterDto**](ResellerFilterDto.md)|  | |

### Return type

ApiResponse<[**ResellerLazyLoadDto**](ResellerLazyLoadDto.md)>


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


## getReseller

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerWithHttpInfo

> ApiResponse<ResellerDto> getReseller getResellerWithHttpInfo(isvId, resellerId)

Returns a reseller

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerDto> response = apiInstance.getResellerWithHttpInfo(isvId, resellerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getReseller");
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
| **resellerId** | **UUID**|  | |

### Return type

ApiResponse<[**ResellerDto**](ResellerDto.md)>


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


## getResellerByNumber

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerByNumberWithHttpInfo

> ApiResponse<ResellerDto> getResellerByNumber getResellerByNumberWithHttpInfo(isvId, resellerNumber)

Returns a reseller

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerDto> response = apiInstance.getResellerByNumberWithHttpInfo(isvId, resellerNumber);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerByNumber");
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
| **resellerNumber** | **String**|  | |

### Return type

ApiResponse<[**ResellerDto**](ResellerDto.md)>


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


## getResellerByUser

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerByUserWithHttpInfo

> ApiResponse<ResellerDto> getResellerByUser getResellerByUserWithHttpInfo(isvId)

Returns all resellers of the logged in user

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerDto> response = apiInstance.getResellerByUserWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerByUser");
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

### Return type

ApiResponse<[**ResellerDto**](ResellerDto.md)>


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


## getResellerContactByUserId

> List<ResellerContactDto> getResellerContactByUserId(isvId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerContactByUserIdWithHttpInfo

> ApiResponse<List<ResellerContactDto>> getResellerContactByUserId getResellerContactByUserIdWithHttpInfo(isvId)

Returns a reseller contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerContactDto>> response = apiInstance.getResellerContactByUserIdWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerContactByUserId");
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

### Return type

ApiResponse<[**List&lt;ResellerContactDto&gt;**](ResellerContactDto.md)>


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


## getResellerContacts

> List<ResellerContactDto> getResellerContacts(isvId, resellerId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerContactsWithHttpInfo

> ApiResponse<List<ResellerContactDto>> getResellerContacts getResellerContactsWithHttpInfo(isvId, resellerId)

Returns a reseller&#39;s contacts

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerContactDto>> response = apiInstance.getResellerContactsWithHttpInfo(isvId, resellerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerContacts");
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
| **resellerId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;ResellerContactDto&gt;**](ResellerContactDto.md)>


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


## getResellerCount

> List<Object> getResellerCount(isvId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerCountWithHttpInfo

> ApiResponse<List<Object>> getResellerCount getResellerCountWithHttpInfo(isvId)

Returns the number of all resellers

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<Object>> response = apiInstance.getResellerCountWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerCount");
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

### Return type

ApiResponse<**List&lt;Object&gt;**>


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


## getResellerTemplates

> List<ResellerTemplateDto> getResellerTemplates(isvId, resellerId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerTemplatesWithHttpInfo

> ApiResponse<List<ResellerTemplateDto>> getResellerTemplates getResellerTemplatesWithHttpInfo(isvId, resellerId)

Returns all available product templates (editions) for a reseller

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerTemplateDto>> response = apiInstance.getResellerTemplatesWithHttpInfo(isvId, resellerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerTemplates");
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
| **resellerId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;ResellerTemplateDto&gt;**](ResellerTemplateDto.md)>


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


## getResellerTypes

> List<ResellerTypeDto> getResellerTypes(isvId, name)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getResellerTypesWithHttpInfo

> ApiResponse<List<ResellerTypeDto>> getResellerTypes getResellerTypesWithHttpInfo(isvId, name)

Returns all reseller types

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<List<ResellerTypeDto>> response = apiInstance.getResellerTypesWithHttpInfo(isvId, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#getResellerTypes");
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
| **name** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;ResellerTypeDto&gt;**](ResellerTypeDto.md)>


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


## removeResellerType

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## removeResellerTypeWithHttpInfo

> ApiResponse<ResellerTypeDto> removeResellerType removeResellerTypeWithHttpInfo(isvId, typeId, newTypeId)

Deletes a reseller type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerTypeDto> response = apiInstance.removeResellerTypeWithHttpInfo(isvId, typeId, newTypeId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#removeResellerType");
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
| **typeId** | **UUID**|  | |
| **newTypeId** | **UUID**|  | |

### Return type

ApiResponse<[**ResellerTypeDto**](ResellerTypeDto.md)>


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


## resellerGetResellerByResellerNumberDeprecated

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## resellerGetResellerByResellerNumberDeprecatedWithHttpInfo

> ApiResponse<ResellerDto> resellerGetResellerByResellerNumberDeprecated resellerGetResellerByResellerNumberDeprecatedWithHttpInfo(isvId, resellerNumber)

Returns a reseller (deprecated; use api/v{version:apiVersion}/isv/{isv_id}/resellers/by_number instead)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerDto> response = apiInstance.resellerGetResellerByResellerNumberDeprecatedWithHttpInfo(isvId, resellerNumber);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#resellerGetResellerByResellerNumberDeprecated");
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
| **resellerNumber** | **String**|  | |

### Return type

ApiResponse<[**ResellerDto**](ResellerDto.md)>


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


## resendResellerContactInvitation

> void resendResellerContactInvitation(isvId, resellerId, contactId)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## resendResellerContactInvitationWithHttpInfo

> ApiResponse<Void> resendResellerContactInvitation resendResellerContactInvitationWithHttpInfo(isvId, resellerId, contactId)

Sends a new invitation email to a reseller contact

A first invitation is send during creation of a contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.resendResellerContactInvitationWithHttpInfo(isvId, resellerId, contactId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#resendResellerContactInvitation");
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
| **resellerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |

### Return type


ApiResponse<Void>

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


## toggleResellerContactState

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## toggleResellerContactStateWithHttpInfo

> ApiResponse<ResellerContactDto> toggleResellerContactState toggleResellerContactStateWithHttpInfo(isvId, resellerId, contactId)

Toggles a reseller contact state

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerContactDto> response = apiInstance.toggleResellerContactStateWithHttpInfo(isvId, resellerId, contactId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#toggleResellerContactState");
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
| **resellerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |

### Return type

ApiResponse<[**ResellerContactDto**](ResellerContactDto.md)>


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


## updateReseller

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## updateResellerWithHttpInfo

> ApiResponse<ResellerDto> updateReseller updateResellerWithHttpInfo(isvId, resellerDto)

Updates a reseller

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerDto> response = apiInstance.updateResellerWithHttpInfo(isvId, resellerDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#updateReseller");
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
| **resellerDto** | [**ResellerDto**](ResellerDto.md)|  | |

### Return type

ApiResponse<[**ResellerDto**](ResellerDto.md)>


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


## updateResellerContact

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## updateResellerContactWithHttpInfo

> ApiResponse<ResellerContactDto> updateResellerContact updateResellerContactWithHttpInfo(isvId, resellerId, resellerContactDto)

Updates a reseller contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerContactDto> response = apiInstance.updateResellerContactWithHttpInfo(isvId, resellerId, resellerContactDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#updateResellerContact");
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
| **resellerId** | **UUID**|  | |
| **resellerContactDto** | [**ResellerContactDto**](ResellerContactDto.md)|  | |

### Return type

ApiResponse<[**ResellerContactDto**](ResellerContactDto.md)>


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


## updateResellerTemplate

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## updateResellerTemplateWithHttpInfo

> ApiResponse<ResellerTemplateDto> updateResellerTemplate updateResellerTemplateWithHttpInfo(isvId, resellerTemplateDto)

Updates access to a product templates (edition)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerTemplateDto> response = apiInstance.updateResellerTemplateWithHttpInfo(isvId, resellerTemplateDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#updateResellerTemplate");
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
| **resellerTemplateDto** | [**ResellerTemplateDto**](ResellerTemplateDto.md)|  | |

### Return type

ApiResponse<[**ResellerTemplateDto**](ResellerTemplateDto.md)>


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


## updateResellerType

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## updateResellerTypeWithHttpInfo

> ApiResponse<ResellerTypeDto> updateResellerType updateResellerTypeWithHttpInfo(isvId, resellerTypeDto)

Updates a reseller type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
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
            ApiResponse<ResellerTypeDto> response = apiInstance.updateResellerTypeWithHttpInfo(isvId, resellerTypeDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResellerApi#updateResellerType");
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
| **resellerTypeDto** | [**ResellerTypeDto**](ResellerTypeDto.md)|  | |

### Return type

ApiResponse<[**ResellerTypeDto**](ResellerTypeDto.md)>


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

