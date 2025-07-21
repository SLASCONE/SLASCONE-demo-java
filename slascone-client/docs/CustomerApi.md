# CustomerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomer**](CustomerApi.md#addCustomer) | **POST** /api/v2/isv/{isv_id}/customers | Creates a customer |
| [**addCustomerContact**](CustomerApi.md#addCustomerContact) | **POST** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Creates a customer contact |
| [**addCustomerType**](CustomerApi.md#addCustomerType) | **POST** /api/v2/isv/{isv_id}/customers/types | Creates a customer type |
| [**customerGetCustomerByCustomerNumberDeprecated**](CustomerApi.md#customerGetCustomerByCustomerNumberDeprecated) | **GET** /api/v2/isv/{isv_id}/customers/number/{customer_number} | Returns a specific customer (deprecated; use api/v2/isv/{isv_id}/customers/by_number instead) |
| [**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /api/v2/isv/{isv_id}/customers/{customer_id} | Deletes a customer |
| [**deleteCustomerContact**](CustomerApi.md#deleteCustomerContact) | **DELETE** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/{contact_id} | Deletes a customer contact |
| [**getAllCustomers**](CustomerApi.md#getAllCustomers) | **GET** /api/v2/isv/{isv_id}/customers | Returns all customers |
| [**getAllCustomersLight**](CustomerApi.md#getAllCustomersLight) | **GET** /api/v2/isv/{isv_id}/customers/light | Returns all customers with reduced information |
| [**getCustomer**](CustomerApi.md#getCustomer) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id} | Returns a specific customer |
| [**getCustomerByNumber**](CustomerApi.md#getCustomerByNumber) | **GET** /api/v2/isv/{isv_id}/customers/by_number | Returns a specific customer |
| [**getCustomerContactByUserId**](CustomerApi.md#getCustomerContactByUserId) | **GET** /api/v2/isv/{isv_id}/customers/contacts/by_user | Returns the customer contact matching the id of the logged in user |
| [**getCustomerContactLanguages**](CustomerApi.md#getCustomerContactLanguages) | **GET** /api/v2/isv/{isv_id}/customers/contacts/language | Returns the available customer contact languages |
| [**getCustomerContacts**](CustomerApi.md#getCustomerContacts) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Returns a customer&#39;s contacts |
| [**getCustomerCount**](CustomerApi.md#getCustomerCount) | **GET** /api/v2/isv/{isv_id}/customers/count | Returns the number of customers |
| [**getCustomerTagAssignments**](CustomerApi.md#getCustomerTagAssignments) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/tags | Returns all tags of a customer |
| [**getCustomerTypes**](CustomerApi.md#getCustomerTypes) | **GET** /api/v2/isv/{isv_id}/customers/types | Returns all customer types |
| [**getFilteredCustomers**](CustomerApi.md#getFilteredCustomers) | **POST** /api/v2/isv/{isv_id}/customers/filtered | Returns all customers matching a filter |
| [**removeCustomerType**](CustomerApi.md#removeCustomerType) | **DELETE** /api/v2/isv/{isv_id}/customers/types/{type_id}/new_type/{new_type_id} | Deletes a customer type |
| [**resendCustomerContactInvitation**](CustomerApi.md#resendCustomerContactInvitation) | **GET** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/email/{contact_id} | Sends a new invitation email to a customer contact |
| [**toggleCustomerContactState**](CustomerApi.md#toggleCustomerContactState) | **PUT** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts/{contact_id} | Toggles a customer contact state |
| [**updateCustomer**](CustomerApi.md#updateCustomer) | **PATCH** /api/v2/isv/{isv_id}/customers | Updates a customer |
| [**updateCustomerContact**](CustomerApi.md#updateCustomerContact) | **PATCH** /api/v2/isv/{isv_id}/customers/{customer_id}/contacts | Updates a customer contact |
| [**updateCustomerTagAssignments**](CustomerApi.md#updateCustomerTagAssignments) | **PUT** /api/v2/isv/{isv_id}/customers/{customer_id}/tags | Updates the tags of a customer |
| [**updateCustomerType**](CustomerApi.md#updateCustomerType) | **PATCH** /api/v2/isv/{isv_id}/customers/types | Updates a customer type |


<a id="addCustomer"></a>
# **addCustomer**
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

<a id="addCustomerContact"></a>
# **addCustomerContact**
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

<a id="addCustomerType"></a>
# **addCustomerType**
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

<a id="customerGetCustomerByCustomerNumberDeprecated"></a>
# **customerGetCustomerByCustomerNumberDeprecated**
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

<a id="deleteCustomer"></a>
# **deleteCustomer**
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

<a id="deleteCustomerContact"></a>
# **deleteCustomerContact**
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

<a id="getAllCustomers"></a>
# **getAllCustomers**
> List&lt;CustomerDto&gt; getAllCustomers(isvId, name)

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

<a id="getAllCustomersLight"></a>
# **getAllCustomersLight**
> List&lt;CustomerLightDto&gt; getAllCustomersLight(isvId)

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

<a id="getCustomer"></a>
# **getCustomer**
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

<a id="getCustomerByNumber"></a>
# **getCustomerByNumber**
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

<a id="getCustomerContactByUserId"></a>
# **getCustomerContactByUserId**
> List&lt;CustomerContactDto&gt; getCustomerContactByUserId(isvId)

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

<a id="getCustomerContactLanguages"></a>
# **getCustomerContactLanguages**
> List&lt;String&gt; getCustomerContactLanguages(isvId)

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

<a id="getCustomerContacts"></a>
# **getCustomerContacts**
> List&lt;CustomerContactDto&gt; getCustomerContacts(isvId, customerId)

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

<a id="getCustomerCount"></a>
# **getCustomerCount**
> List&lt;Object&gt; getCustomerCount(isvId)

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

<a id="getCustomerTagAssignments"></a>
# **getCustomerTagAssignments**
> List&lt;ItemTagAssignmentDto&gt; getCustomerTagAssignments(isvId, customerId)

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

<a id="getCustomerTypes"></a>
# **getCustomerTypes**
> List&lt;CustomerTypeDto&gt; getCustomerTypes(isvId, name)

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

<a id="getFilteredCustomers"></a>
# **getFilteredCustomers**
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

<a id="removeCustomerType"></a>
# **removeCustomerType**
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

<a id="resendCustomerContactInvitation"></a>
# **resendCustomerContactInvitation**
> resendCustomerContactInvitation(isvId, customerId, contactId)

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

<a id="toggleCustomerContactState"></a>
# **toggleCustomerContactState**
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

<a id="updateCustomer"></a>
# **updateCustomer**
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

<a id="updateCustomerContact"></a>
# **updateCustomerContact**
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

<a id="updateCustomerTagAssignments"></a>
# **updateCustomerTagAssignments**
> List&lt;ItemTagAssignmentDto&gt; updateCustomerTagAssignments(isvId, customerId, itemTagAssignmentDto)

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

<a id="updateCustomerType"></a>
# **updateCustomerType**
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

