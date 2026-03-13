# CustomerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomer**](CustomerApi.md#addCustomer) | **POST** /api/v2/isv/{isv_id}/customers | Creates a customer |
| [**addCustomerWithHttpInfo**](CustomerApi.md#addCustomerWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/customers | Creates a customer |
| [**addCustomerContact**](CustomerApi.md#addCustomerContact) | **POST** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Creates a customer contact |
| [**addCustomerContactWithHttpInfo**](CustomerApi.md#addCustomerContactWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Creates a customer contact |
| [**addCustomerType**](CustomerApi.md#addCustomerType) | **POST** /api/v2/isv/{isv_id}/customers/types | Creates a customer type |
| [**addCustomerTypeWithHttpInfo**](CustomerApi.md#addCustomerTypeWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/customers/types | Creates a customer type |
| [**customerGetCustomerByCustomerNumberDeprecated**](CustomerApi.md#customerGetCustomerByCustomerNumberDeprecated) | **GET** /api/v2/isv/{isv_id}/customers/number/{customer_number} | Returns a specific customer (deprecated; use api/v2/isv/{isv_id}/customers/by_number instead) |
| [**customerGetCustomerByCustomerNumberDeprecatedWithHttpInfo**](CustomerApi.md#customerGetCustomerByCustomerNumberDeprecatedWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/number/{customer_number} | Returns a specific customer (deprecated; use api/v2/isv/{isv_id}/customers/by_number instead) |
| [**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /api/v2/isv/{isv_id}/customers/{customer_id} | Deletes a customer |
| [**deleteCustomerWithHttpInfo**](CustomerApi.md#deleteCustomerWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/customers/{customer_id} | Deletes a customer |
| [**deleteCustomerContact**](CustomerApi.md#deleteCustomerContact) | **DELETE** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/{contact_id} | Deletes a customer contact |
| [**deleteCustomerContactWithHttpInfo**](CustomerApi.md#deleteCustomerContactWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/{contact_id} | Deletes a customer contact |
| [**getAllCustomers**](CustomerApi.md#getAllCustomers) | **GET** /api/v2/isv/{isv_id}/customers | Returns all customers |
| [**getAllCustomersWithHttpInfo**](CustomerApi.md#getAllCustomersWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers | Returns all customers |
| [**getAllCustomersLight**](CustomerApi.md#getAllCustomersLight) | **GET** /api/v2/isv/{isv_id}/customers/light | Returns all customers with reduced information |
| [**getAllCustomersLightWithHttpInfo**](CustomerApi.md#getAllCustomersLightWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/light | Returns all customers with reduced information |
| [**getCustomer**](CustomerApi.md#getCustomer) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id} | Returns a specific customer |
| [**getCustomerWithHttpInfo**](CustomerApi.md#getCustomerWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id} | Returns a specific customer |
| [**getCustomerByNumber**](CustomerApi.md#getCustomerByNumber) | **GET** /api/v2/isv/{isv_id}/customers/by_number | Returns a specific customer |
| [**getCustomerByNumberWithHttpInfo**](CustomerApi.md#getCustomerByNumberWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/by_number | Returns a specific customer |
| [**getCustomerContactByUserId**](CustomerApi.md#getCustomerContactByUserId) | **GET** /api/v2/isv/{isv_id}/customers/contacts/by_user | Returns the customer contact matching the id of the logged in user |
| [**getCustomerContactByUserIdWithHttpInfo**](CustomerApi.md#getCustomerContactByUserIdWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/contacts/by_user | Returns the customer contact matching the id of the logged in user |
| [**getCustomerContactLanguages**](CustomerApi.md#getCustomerContactLanguages) | **GET** /api/v2/isv/{isv_id}/customers/contacts/language | Returns the available customer contact languages |
| [**getCustomerContactLanguagesWithHttpInfo**](CustomerApi.md#getCustomerContactLanguagesWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/contacts/language | Returns the available customer contact languages |
| [**getCustomerContacts**](CustomerApi.md#getCustomerContacts) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Returns a customer&#39;s contacts |
| [**getCustomerContactsWithHttpInfo**](CustomerApi.md#getCustomerContactsWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Returns a customer&#39;s contacts |
| [**getCustomerCount**](CustomerApi.md#getCustomerCount) | **GET** /api/v2/isv/{isv_id}/customers/count | Returns the number of customers |
| [**getCustomerCountWithHttpInfo**](CustomerApi.md#getCustomerCountWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/count | Returns the number of customers |
| [**getCustomerTagAssignments**](CustomerApi.md#getCustomerTagAssignments) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/tags | Returns all tags of a customer |
| [**getCustomerTagAssignmentsWithHttpInfo**](CustomerApi.md#getCustomerTagAssignmentsWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/tags | Returns all tags of a customer |
| [**getCustomerTypes**](CustomerApi.md#getCustomerTypes) | **GET** /api/v2/isv/{isv_id}/customers/types | Returns all customer types |
| [**getCustomerTypesWithHttpInfo**](CustomerApi.md#getCustomerTypesWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/types | Returns all customer types |
| [**getFilteredCustomers**](CustomerApi.md#getFilteredCustomers) | **POST** /api/v2/isv/{isv_id}/customers/filtered | Returns all customers matching a filter |
| [**getFilteredCustomersWithHttpInfo**](CustomerApi.md#getFilteredCustomersWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/customers/filtered | Returns all customers matching a filter |
| [**removeCustomerType**](CustomerApi.md#removeCustomerType) | **DELETE** /api/v2/isv/{isv_id}/customers/types/{type_id}/new_type/{new_type_id} | Deletes a customer type |
| [**removeCustomerTypeWithHttpInfo**](CustomerApi.md#removeCustomerTypeWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/customers/types/{type_id}/new_type/{new_type_id} | Deletes a customer type |
| [**resendCustomerContactInvitation**](CustomerApi.md#resendCustomerContactInvitation) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/email/{contact_id} | Sends a new invitation email to a customer contact |
| [**resendCustomerContactInvitationWithHttpInfo**](CustomerApi.md#resendCustomerContactInvitationWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/email/{contact_id} | Sends a new invitation email to a customer contact |
| [**toggleCustomerContactState**](CustomerApi.md#toggleCustomerContactState) | **PUT** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/{contact_id} | Toggles a customer contact state |
| [**toggleCustomerContactStateWithHttpInfo**](CustomerApi.md#toggleCustomerContactStateWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/{contact_id} | Toggles a customer contact state |
| [**updateCustomer**](CustomerApi.md#updateCustomer) | **PATCH** /api/v2/isv/{isv_id}/customers | Updates a customer |
| [**updateCustomerWithHttpInfo**](CustomerApi.md#updateCustomerWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/customers | Updates a customer |
| [**updateCustomerContact**](CustomerApi.md#updateCustomerContact) | **PATCH** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Updates a customer contact |
| [**updateCustomerContactWithHttpInfo**](CustomerApi.md#updateCustomerContactWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Updates a customer contact |
| [**updateCustomerTagAssignments**](CustomerApi.md#updateCustomerTagAssignments) | **PUT** /api/v2/isv/{isv_id}/customers/{customer_id}/tags | Updates the tags of a customer |
| [**updateCustomerTagAssignmentsWithHttpInfo**](CustomerApi.md#updateCustomerTagAssignmentsWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/customers/{customer_id}/tags | Updates the tags of a customer |
| [**updateCustomerType**](CustomerApi.md#updateCustomerType) | **PATCH** /api/v2/isv/{isv_id}/customers/types | Updates a customer type |
| [**updateCustomerTypeWithHttpInfo**](CustomerApi.md#updateCustomerTypeWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/customers/types | Updates a customer type |



## addCustomer

> CustomerDto addCustomer(isvId, customerDto)

Creates a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerDto customerDto = new CustomerDto(); // CustomerDto | 
        try {
            CustomerDto result = apiInstance.addCustomer(isvId, customerDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomer");
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
| **customerDto** | [**CustomerDto**](CustomerDto.md)|  | |

### Return type

[**CustomerDto**](CustomerDto.md)


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

## addCustomerWithHttpInfo

> ApiResponse<CustomerDto> addCustomer addCustomerWithHttpInfo(isvId, customerDto)

Creates a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerDto customerDto = new CustomerDto(); // CustomerDto | 
        try {
            ApiResponse<CustomerDto> response = apiInstance.addCustomerWithHttpInfo(isvId, customerDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomer");
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
| **customerDto** | [**CustomerDto**](CustomerDto.md)|  | |

### Return type

ApiResponse<[**CustomerDto**](CustomerDto.md)>


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


## addCustomerContact

> CustomerContactDto addCustomerContact(isvId, customerId, customerContactDto)

Creates a customer contact

Sends also an invitation email to the contact address

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        CustomerContactDto customerContactDto = new CustomerContactDto(); // CustomerContactDto | 
        try {
            CustomerContactDto result = apiInstance.addCustomerContact(isvId, customerId, customerContactDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomerContact");
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
| **customerId** | **UUID**|  | |
| **customerContactDto** | [**CustomerContactDto**](CustomerContactDto.md)|  | |

### Return type

[**CustomerContactDto**](CustomerContactDto.md)


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

## addCustomerContactWithHttpInfo

> ApiResponse<CustomerContactDto> addCustomerContact addCustomerContactWithHttpInfo(isvId, customerId, customerContactDto)

Creates a customer contact

Sends also an invitation email to the contact address

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        CustomerContactDto customerContactDto = new CustomerContactDto(); // CustomerContactDto | 
        try {
            ApiResponse<CustomerContactDto> response = apiInstance.addCustomerContactWithHttpInfo(isvId, customerId, customerContactDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomerContact");
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
| **customerId** | **UUID**|  | |
| **customerContactDto** | [**CustomerContactDto**](CustomerContactDto.md)|  | |

### Return type

ApiResponse<[**CustomerContactDto**](CustomerContactDto.md)>


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


## addCustomerType

> CustomerTypeDto addCustomerType(isvId, customerTypeDto)

Creates a customer type

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerTypeDto customerTypeDto = new CustomerTypeDto(); // CustomerTypeDto | 
        try {
            CustomerTypeDto result = apiInstance.addCustomerType(isvId, customerTypeDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomerType");
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
| **customerTypeDto** | [**CustomerTypeDto**](CustomerTypeDto.md)|  | |

### Return type

[**CustomerTypeDto**](CustomerTypeDto.md)


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

## addCustomerTypeWithHttpInfo

> ApiResponse<CustomerTypeDto> addCustomerType addCustomerTypeWithHttpInfo(isvId, customerTypeDto)

Creates a customer type

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerTypeDto customerTypeDto = new CustomerTypeDto(); // CustomerTypeDto | 
        try {
            ApiResponse<CustomerTypeDto> response = apiInstance.addCustomerTypeWithHttpInfo(isvId, customerTypeDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomerType");
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
| **customerTypeDto** | [**CustomerTypeDto**](CustomerTypeDto.md)|  | |

### Return type

ApiResponse<[**CustomerTypeDto**](CustomerTypeDto.md)>


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


## customerGetCustomerByCustomerNumberDeprecated

> CustomerDto customerGetCustomerByCustomerNumberDeprecated(isvId, customerNumber)

Returns a specific customer (deprecated; use api/v2/isv/{isv_id}/customers/by_number instead)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String customerNumber = "customerNumber_example"; // String | 
        try {
            CustomerDto result = apiInstance.customerGetCustomerByCustomerNumberDeprecated(isvId, customerNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#customerGetCustomerByCustomerNumberDeprecated");
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
| **customerNumber** | **String**|  | |

### Return type

[**CustomerDto**](CustomerDto.md)


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

## customerGetCustomerByCustomerNumberDeprecatedWithHttpInfo

> ApiResponse<CustomerDto> customerGetCustomerByCustomerNumberDeprecated customerGetCustomerByCustomerNumberDeprecatedWithHttpInfo(isvId, customerNumber)

Returns a specific customer (deprecated; use api/v2/isv/{isv_id}/customers/by_number instead)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String customerNumber = "customerNumber_example"; // String | 
        try {
            ApiResponse<CustomerDto> response = apiInstance.customerGetCustomerByCustomerNumberDeprecatedWithHttpInfo(isvId, customerNumber);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#customerGetCustomerByCustomerNumberDeprecated");
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
| **customerNumber** | **String**|  | |

### Return type

ApiResponse<[**CustomerDto**](CustomerDto.md)>


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


## deleteCustomer

> CustomerDto deleteCustomer(isvId, customerId)

Deletes a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            CustomerDto result = apiInstance.deleteCustomer(isvId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomer");
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
| **customerId** | **UUID**|  | |

### Return type

[**CustomerDto**](CustomerDto.md)


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

## deleteCustomerWithHttpInfo

> ApiResponse<CustomerDto> deleteCustomer deleteCustomerWithHttpInfo(isvId, customerId)

Deletes a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<CustomerDto> response = apiInstance.deleteCustomerWithHttpInfo(isvId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomer");
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
| **customerId** | **UUID**|  | |

### Return type

ApiResponse<[**CustomerDto**](CustomerDto.md)>


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


## deleteCustomerContact

> CustomerContactDto deleteCustomerContact(isvId, customerId, contactId, removeIdentity)

Deletes a customer contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        UUID contactId = UUID.randomUUID(); // UUID | 
        Boolean removeIdentity = true; // Boolean | 
        try {
            CustomerContactDto result = apiInstance.deleteCustomerContact(isvId, customerId, contactId, removeIdentity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomerContact");
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
| **customerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **removeIdentity** | **Boolean**|  | [optional] [default to true] |

### Return type

[**CustomerContactDto**](CustomerContactDto.md)


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

## deleteCustomerContactWithHttpInfo

> ApiResponse<CustomerContactDto> deleteCustomerContact deleteCustomerContactWithHttpInfo(isvId, customerId, contactId, removeIdentity)

Deletes a customer contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        UUID contactId = UUID.randomUUID(); // UUID | 
        Boolean removeIdentity = true; // Boolean | 
        try {
            ApiResponse<CustomerContactDto> response = apiInstance.deleteCustomerContactWithHttpInfo(isvId, customerId, contactId, removeIdentity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomerContact");
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
| **customerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **removeIdentity** | **Boolean**|  | [optional] [default to true] |

### Return type

ApiResponse<[**CustomerContactDto**](CustomerContactDto.md)>


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


## getAllCustomers

> List<CustomerDto> getAllCustomers(isvId, name)

Returns all customers

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            List<CustomerDto> result = apiInstance.getAllCustomers(isvId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getAllCustomers");
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

[**List&lt;CustomerDto&gt;**](CustomerDto.md)


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

## getAllCustomersWithHttpInfo

> ApiResponse<List<CustomerDto>> getAllCustomers getAllCustomersWithHttpInfo(isvId, name)

Returns all customers

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            ApiResponse<List<CustomerDto>> response = apiInstance.getAllCustomersWithHttpInfo(isvId, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getAllCustomers");
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

ApiResponse<[**List&lt;CustomerDto&gt;**](CustomerDto.md)>


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


## getAllCustomersLight

> List<CustomerLightDto> getAllCustomersLight(isvId)

Returns all customers with reduced information

Returns only Id, Name, CustomerNumber, and Email address.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            List<CustomerLightDto> result = apiInstance.getAllCustomersLight(isvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getAllCustomersLight");
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

[**List&lt;CustomerLightDto&gt;**](CustomerLightDto.md)


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

## getAllCustomersLightWithHttpInfo

> ApiResponse<List<CustomerLightDto>> getAllCustomersLight getAllCustomersLightWithHttpInfo(isvId)

Returns all customers with reduced information

Returns only Id, Name, CustomerNumber, and Email address.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<CustomerLightDto>> response = apiInstance.getAllCustomersLightWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getAllCustomersLight");
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

ApiResponse<[**List&lt;CustomerLightDto&gt;**](CustomerLightDto.md)>


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


## getCustomer

> CustomerDto getCustomer(isvId, customerId)

Returns a specific customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            CustomerDto result = apiInstance.getCustomer(isvId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomer");
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
| **customerId** | **UUID**|  | |

### Return type

[**CustomerDto**](CustomerDto.md)


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

## getCustomerWithHttpInfo

> ApiResponse<CustomerDto> getCustomer getCustomerWithHttpInfo(isvId, customerId)

Returns a specific customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<CustomerDto> response = apiInstance.getCustomerWithHttpInfo(isvId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomer");
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
| **customerId** | **UUID**|  | |

### Return type

ApiResponse<[**CustomerDto**](CustomerDto.md)>


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


## getCustomerByNumber

> CustomerDto getCustomerByNumber(isvId, customerNumber)

Returns a specific customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String customerNumber = "customerNumber_example"; // String | 
        try {
            CustomerDto result = apiInstance.getCustomerByNumber(isvId, customerNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerByNumber");
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
| **customerNumber** | **String**|  | |

### Return type

[**CustomerDto**](CustomerDto.md)


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

## getCustomerByNumberWithHttpInfo

> ApiResponse<CustomerDto> getCustomerByNumber getCustomerByNumberWithHttpInfo(isvId, customerNumber)

Returns a specific customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String customerNumber = "customerNumber_example"; // String | 
        try {
            ApiResponse<CustomerDto> response = apiInstance.getCustomerByNumberWithHttpInfo(isvId, customerNumber);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerByNumber");
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
| **customerNumber** | **String**|  | |

### Return type

ApiResponse<[**CustomerDto**](CustomerDto.md)>


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


## getCustomerContactByUserId

> List<CustomerContactDto> getCustomerContactByUserId(isvId)

Returns the customer contact matching the id of the logged in user

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            List<CustomerContactDto> result = apiInstance.getCustomerContactByUserId(isvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerContactByUserId");
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getCustomerContactByUserIdWithHttpInfo

> ApiResponse<List<CustomerContactDto>> getCustomerContactByUserId getCustomerContactByUserIdWithHttpInfo(isvId)

Returns the customer contact matching the id of the logged in user

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<CustomerContactDto>> response = apiInstance.getCustomerContactByUserIdWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerContactByUserId");
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

ApiResponse<[**List&lt;CustomerContactDto&gt;**](CustomerContactDto.md)>


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


## getCustomerContactLanguages

> List<String> getCustomerContactLanguages(isvId)

Returns the available customer contact languages

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            List<String> result = apiInstance.getCustomerContactLanguages(isvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerContactLanguages");
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

**List&lt;String&gt;**


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

## getCustomerContactLanguagesWithHttpInfo

> ApiResponse<List<String>> getCustomerContactLanguages getCustomerContactLanguagesWithHttpInfo(isvId)

Returns the available customer contact languages

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<String>> response = apiInstance.getCustomerContactLanguagesWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerContactLanguages");
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

ApiResponse<**List&lt;String&gt;**>


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


## getCustomerContacts

> List<CustomerContactDto> getCustomerContacts(isvId, customerId)

Returns a customer&#39;s contacts

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            List<CustomerContactDto> result = apiInstance.getCustomerContacts(isvId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerContacts");
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
| **customerId** | **UUID**|  | |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **204** | No content |  -  |
| **409** | Conflict |  -  |
| **200** | Success |  -  |

## getCustomerContactsWithHttpInfo

> ApiResponse<List<CustomerContactDto>> getCustomerContacts getCustomerContactsWithHttpInfo(isvId, customerId)

Returns a customer&#39;s contacts

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<CustomerContactDto>> response = apiInstance.getCustomerContactsWithHttpInfo(isvId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerContacts");
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
| **customerId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;CustomerContactDto&gt;**](CustomerContactDto.md)>


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


## getCustomerCount

> List<Object> getCustomerCount(isvId)

Returns the number of customers

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            List<Object> result = apiInstance.getCustomerCount(isvId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerCount");
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

## getCustomerCountWithHttpInfo

> ApiResponse<List<Object>> getCustomerCount getCustomerCountWithHttpInfo(isvId)

Returns the number of customers

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<Object>> response = apiInstance.getCustomerCountWithHttpInfo(isvId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerCount");
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


## getCustomerTagAssignments

> List<ItemTagAssignmentDto> getCustomerTagAssignments(isvId, customerId)

Returns all tags of a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            List<ItemTagAssignmentDto> result = apiInstance.getCustomerTagAssignments(isvId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerTagAssignments");
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
| **customerId** | **UUID**|  | |

### Return type

[**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)


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

## getCustomerTagAssignmentsWithHttpInfo

> ApiResponse<List<ItemTagAssignmentDto>> getCustomerTagAssignments getCustomerTagAssignmentsWithHttpInfo(isvId, customerId)

Returns all tags of a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<ItemTagAssignmentDto>> response = apiInstance.getCustomerTagAssignmentsWithHttpInfo(isvId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerTagAssignments");
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
| **customerId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)>


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


## getCustomerTypes

> List<CustomerTypeDto> getCustomerTypes(isvId, name)

Returns all customer types

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            List<CustomerTypeDto> result = apiInstance.getCustomerTypes(isvId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerTypes");
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

[**List&lt;CustomerTypeDto&gt;**](CustomerTypeDto.md)


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

## getCustomerTypesWithHttpInfo

> ApiResponse<List<CustomerTypeDto>> getCustomerTypes getCustomerTypesWithHttpInfo(isvId, name)

Returns all customer types

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            ApiResponse<List<CustomerTypeDto>> response = apiInstance.getCustomerTypesWithHttpInfo(isvId, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerTypes");
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

ApiResponse<[**List&lt;CustomerTypeDto&gt;**](CustomerTypeDto.md)>


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


## getFilteredCustomers

> CustomerLazyLoadDto getFilteredCustomers(isvId, customerFilterDto)

Returns all customers matching a filter

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerFilterDto customerFilterDto = new CustomerFilterDto(); // CustomerFilterDto | 
        try {
            CustomerLazyLoadDto result = apiInstance.getFilteredCustomers(isvId, customerFilterDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getFilteredCustomers");
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
| **customerFilterDto** | [**CustomerFilterDto**](CustomerFilterDto.md)|  | |

### Return type

[**CustomerLazyLoadDto**](CustomerLazyLoadDto.md)


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

## getFilteredCustomersWithHttpInfo

> ApiResponse<CustomerLazyLoadDto> getFilteredCustomers getFilteredCustomersWithHttpInfo(isvId, customerFilterDto)

Returns all customers matching a filter

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerFilterDto customerFilterDto = new CustomerFilterDto(); // CustomerFilterDto | 
        try {
            ApiResponse<CustomerLazyLoadDto> response = apiInstance.getFilteredCustomersWithHttpInfo(isvId, customerFilterDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getFilteredCustomers");
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
| **customerFilterDto** | [**CustomerFilterDto**](CustomerFilterDto.md)|  | |

### Return type

ApiResponse<[**CustomerLazyLoadDto**](CustomerLazyLoadDto.md)>


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


## removeCustomerType

> CustomerTypeDto removeCustomerType(isvId, typeId, newTypeId)

Deletes a customer type

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID typeId = UUID.randomUUID(); // UUID | 
        UUID newTypeId = UUID.randomUUID(); // UUID | 
        try {
            CustomerTypeDto result = apiInstance.removeCustomerType(isvId, typeId, newTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#removeCustomerType");
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

[**CustomerTypeDto**](CustomerTypeDto.md)


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

## removeCustomerTypeWithHttpInfo

> ApiResponse<CustomerTypeDto> removeCustomerType removeCustomerTypeWithHttpInfo(isvId, typeId, newTypeId)

Deletes a customer type

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID typeId = UUID.randomUUID(); // UUID | 
        UUID newTypeId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<CustomerTypeDto> response = apiInstance.removeCustomerTypeWithHttpInfo(isvId, typeId, newTypeId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#removeCustomerType");
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

ApiResponse<[**CustomerTypeDto**](CustomerTypeDto.md)>


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


## resendCustomerContactInvitation

> void resendCustomerContactInvitation(isvId, customerId, contactId)

Sends a new invitation email to a customer contact

A first invitation is send during creation of a contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        UUID contactId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.resendCustomerContactInvitation(isvId, customerId, contactId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#resendCustomerContactInvitation");
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
| **customerId** | **UUID**|  | |
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

## resendCustomerContactInvitationWithHttpInfo

> ApiResponse<Void> resendCustomerContactInvitation resendCustomerContactInvitationWithHttpInfo(isvId, customerId, contactId)

Sends a new invitation email to a customer contact

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
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        UUID contactId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Void> response = apiInstance.resendCustomerContactInvitationWithHttpInfo(isvId, customerId, contactId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#resendCustomerContactInvitation");
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
| **customerId** | **UUID**|  | |
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


## toggleCustomerContactState

> CustomerContactDto toggleCustomerContactState(isvId, customerId, contactId)

Toggles a customer contact state

Toggles &#39;isActive&#39; state of a customer contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        UUID contactId = UUID.randomUUID(); // UUID | 
        try {
            CustomerContactDto result = apiInstance.toggleCustomerContactState(isvId, customerId, contactId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#toggleCustomerContactState");
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
| **customerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |

### Return type

[**CustomerContactDto**](CustomerContactDto.md)


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

## toggleCustomerContactStateWithHttpInfo

> ApiResponse<CustomerContactDto> toggleCustomerContactState toggleCustomerContactStateWithHttpInfo(isvId, customerId, contactId)

Toggles a customer contact state

Toggles &#39;isActive&#39; state of a customer contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        UUID contactId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<CustomerContactDto> response = apiInstance.toggleCustomerContactStateWithHttpInfo(isvId, customerId, contactId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#toggleCustomerContactState");
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
| **customerId** | **UUID**|  | |
| **contactId** | **UUID**|  | |

### Return type

ApiResponse<[**CustomerContactDto**](CustomerContactDto.md)>


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


## updateCustomer

> CustomerDto updateCustomer(isvId, customerDto)

Updates a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerDto customerDto = new CustomerDto(); // CustomerDto | 
        try {
            CustomerDto result = apiInstance.updateCustomer(isvId, customerDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomer");
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
| **customerDto** | [**CustomerDto**](CustomerDto.md)|  | |

### Return type

[**CustomerDto**](CustomerDto.md)


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

## updateCustomerWithHttpInfo

> ApiResponse<CustomerDto> updateCustomer updateCustomerWithHttpInfo(isvId, customerDto)

Updates a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerDto customerDto = new CustomerDto(); // CustomerDto | 
        try {
            ApiResponse<CustomerDto> response = apiInstance.updateCustomerWithHttpInfo(isvId, customerDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomer");
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
| **customerDto** | [**CustomerDto**](CustomerDto.md)|  | |

### Return type

ApiResponse<[**CustomerDto**](CustomerDto.md)>


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


## updateCustomerContact

> CustomerContactDto updateCustomerContact(isvId, customerId, customerContactDto)

Updates a customer contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        CustomerContactDto customerContactDto = new CustomerContactDto(); // CustomerContactDto | 
        try {
            CustomerContactDto result = apiInstance.updateCustomerContact(isvId, customerId, customerContactDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerContact");
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
| **customerId** | **UUID**|  | |
| **customerContactDto** | [**CustomerContactDto**](CustomerContactDto.md)|  | |

### Return type

[**CustomerContactDto**](CustomerContactDto.md)


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

## updateCustomerContactWithHttpInfo

> ApiResponse<CustomerContactDto> updateCustomerContact updateCustomerContactWithHttpInfo(isvId, customerId, customerContactDto)

Updates a customer contact

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        CustomerContactDto customerContactDto = new CustomerContactDto(); // CustomerContactDto | 
        try {
            ApiResponse<CustomerContactDto> response = apiInstance.updateCustomerContactWithHttpInfo(isvId, customerId, customerContactDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerContact");
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
| **customerId** | **UUID**|  | |
| **customerContactDto** | [**CustomerContactDto**](CustomerContactDto.md)|  | |

### Return type

ApiResponse<[**CustomerContactDto**](CustomerContactDto.md)>


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


## updateCustomerTagAssignments

> List<ItemTagAssignmentDto> updateCustomerTagAssignments(isvId, customerId, itemTagAssignmentDto)

Updates the tags of a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        List<ItemTagAssignmentDto> itemTagAssignmentDto = Arrays.asList(); // List<ItemTagAssignmentDto> | 
        try {
            List<ItemTagAssignmentDto> result = apiInstance.updateCustomerTagAssignments(isvId, customerId, itemTagAssignmentDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerTagAssignments");
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
| **customerId** | **UUID**|  | |
| **itemTagAssignmentDto** | [**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)|  | |

### Return type

[**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)


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

## updateCustomerTagAssignmentsWithHttpInfo

> ApiResponse<List<ItemTagAssignmentDto>> updateCustomerTagAssignments updateCustomerTagAssignmentsWithHttpInfo(isvId, customerId, itemTagAssignmentDto)

Updates the tags of a customer

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID customerId = UUID.randomUUID(); // UUID | 
        List<ItemTagAssignmentDto> itemTagAssignmentDto = Arrays.asList(); // List<ItemTagAssignmentDto> | 
        try {
            ApiResponse<List<ItemTagAssignmentDto>> response = apiInstance.updateCustomerTagAssignmentsWithHttpInfo(isvId, customerId, itemTagAssignmentDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerTagAssignments");
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
| **customerId** | **UUID**|  | |
| **itemTagAssignmentDto** | [**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)|  | |

### Return type

ApiResponse<[**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)>


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


## updateCustomerType

> CustomerTypeDto updateCustomerType(isvId, customerTypeDto)

Updates a customer type

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerTypeDto customerTypeDto = new CustomerTypeDto(); // CustomerTypeDto | 
        try {
            CustomerTypeDto result = apiInstance.updateCustomerType(isvId, customerTypeDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerType");
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
| **customerTypeDto** | [**CustomerTypeDto**](CustomerTypeDto.md)|  | |

### Return type

[**CustomerTypeDto**](CustomerTypeDto.md)


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

## updateCustomerTypeWithHttpInfo

> ApiResponse<CustomerTypeDto> updateCustomerType updateCustomerTypeWithHttpInfo(isvId, customerTypeDto)

Updates a customer type

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150318-CUSTOM-TYPES-AND-TAGS\&quot;&gt;custom types and tags&lt;/a&gt;.

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.CustomerApi;

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

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        CustomerTypeDto customerTypeDto = new CustomerTypeDto(); // CustomerTypeDto | 
        try {
            ApiResponse<CustomerTypeDto> response = apiInstance.updateCustomerTypeWithHttpInfo(isvId, customerTypeDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerType");
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
| **customerTypeDto** | [**CustomerTypeDto**](CustomerTypeDto.md)|  | |

### Return type

ApiResponse<[**CustomerTypeDto**](CustomerTypeDto.md)>


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

