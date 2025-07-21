# ProvisioningApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLicense**](ProvisioningApi.md#activateLicense) | **POST** /api/v2/isv/{isv_id}/provisioning/activations | Activates a client (assigns a token to a client) |
| [**activateOfflineLicense**](ProvisioningApi.md#activateOfflineLicense) | **GET** /api/v2/isv/{isv_id}/provisioning/activations/offline | Activates an offline client (assigns a token to a offline client) |
| [**addHeartbeat**](ProvisioningApi.md#addHeartbeat) | **POST** /api/v2/isv/{isv_id}/provisioning/heartbeats | Creates a license heartbeat |
| [**closeSession**](ProvisioningApi.md#closeSession) | **POST** /api/v2/isv/{isv_id}/provisioning/session/close | Closes a (floating) session |
| [**getActiveFloatingTokensCount**](ProvisioningApi.md#getActiveFloatingTokensCount) | **GET** /api/v2/isv/{isv_id}/provisioning/licenses/{license_id}/tokens/floating/active/count | Returns the number of actively used floating tokens. |
| [**getConsumptionStatus**](ProvisioningApi.md#getConsumptionStatus) | **POST** /api/v2/isv/{isv_id}/provisioning/validate/consumption | Checks the consumption status of a limitation |
| [**getDeviceInfo**](ProvisioningApi.md#getDeviceInfo) | **POST** /api/v2/isv/{isv_id}/provisioning/validate | Checks the validity of a license |
| [**getLicensesByCustomerAsync**](ProvisioningApi.md#getLicensesByCustomerAsync) | **POST** /api/v2/isv/{isv_id}/provisioning/licenses/by_customer | Returns all licenses of a customer |
| [**getLicensesByLicenseKeyAsync**](ProvisioningApi.md#getLicensesByLicenseKeyAsync) | **POST** /api/v2/isv/{isv_id}/provisioning/licenses/by_license | Returns all licenses of a (legacy) key |
| [**getLicensesByUserAsync**](ProvisioningApi.md#getLicensesByUserAsync) | **POST** /api/v2/isv/{isv_id}/provisioning/licenses/by_user | Returns all licenses of a named user |
| [**openSession**](ProvisioningApi.md#openSession) | **POST** /api/v2/isv/{isv_id}/provisioning/session/open | Opens a (floating) session |
| [**toogleLicenseStateAsync**](ProvisioningApi.md#toogleLicenseStateAsync) | **POST** /api/v2/isv/{isv_id}/provisioning/licenses/state/toggle | Toggles the license state (active/inactive) |
| [**unassignLicense**](ProvisioningApi.md#unassignLicense) | **POST** /api/v2/isv/{isv_id}/provisioning/unassign | Unassigns a token from a client |


<a id="activateLicense"></a>
# **activateLicense**
> LicenseInfoDto activateLicense(isvId, activateClientDto)

Activates a client (assigns a token to a client)

Typically used in named device scenarios. &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016001677-CORE-API\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ActivateClientDto activateClientDto = new ActivateClientDto(); // ActivateClientDto | 
    try {
      LicenseInfoDto result = apiInstance.activateLicense(isvId, activateClientDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#activateLicense");
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
| **activateClientDto** | [**ActivateClientDto**](ActivateClientDto.md)|  | |

### Return type

[**LicenseInfoDto**](LicenseInfoDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="activateOfflineLicense"></a>
# **activateOfflineLicense**
> activateOfflineLicense(isvId, productId, licenseKey, clientId, softwareVersion, tags, fileName)

Activates an offline client (assigns a token to a offline client)

Typically used in offline device scenarios. &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016001677-CORE-API\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    // Configure API key authorization: CustomerPortalKey
    ApiKeyAuth CustomerPortalKey = (ApiKeyAuth) defaultClient.getAuthentication("CustomerPortalKey");
    CustomerPortalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //CustomerPortalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    String licenseKey = "licenseKey_example"; // String | 
    String clientId = "clientId_example"; // String | 
    String softwareVersion = "softwareVersion_example"; // String | 
    List<String> tags = Arrays.asList(); // List<String> | 
    String fileName = "fileName_example"; // String | 
    try {
      apiInstance.activateOfflineLicense(isvId, productId, licenseKey, clientId, softwareVersion, tags, fileName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#activateOfflineLicense");
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
| **licenseKey** | **String**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **softwareVersion** | **String**|  | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **fileName** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [CustomerPortalKey](../README.md#CustomerPortalKey), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **200** | Xml Document |  -  |

<a id="addHeartbeat"></a>
# **addHeartbeat**
> LicenseInfoDto addHeartbeat(isvId, addHeartbeatDto)

Creates a license heartbeat

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016001677-CORE-API\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    AddHeartbeatDto addHeartbeatDto = new AddHeartbeatDto(); // AddHeartbeatDto | 
    try {
      LicenseInfoDto result = apiInstance.addHeartbeat(isvId, addHeartbeatDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#addHeartbeat");
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
| **addHeartbeatDto** | [**AddHeartbeatDto**](AddHeartbeatDto.md)|  | |

### Return type

[**LicenseInfoDto**](LicenseInfoDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="closeSession"></a>
# **closeSession**
> String closeSession(isvId, sessionRequestDto)

Closes a (floating) session

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016152858-FLOATING-LICENSES\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    SessionRequestDto sessionRequestDto = new SessionRequestDto(); // SessionRequestDto | 
    try {
      String result = apiInstance.closeSession(isvId, sessionRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#closeSession");
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
| **sessionRequestDto** | [**SessionRequestDto**](SessionRequestDto.md)|  | |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="getActiveFloatingTokensCount"></a>
# **getActiveFloatingTokensCount**
> Integer getActiveFloatingTokensCount(isvId, licenseId)

Returns the number of actively used floating tokens.

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016152858-FLOATING-DEVICE-LICENSES\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID licenseId = UUID.randomUUID(); // UUID | 
    try {
      Integer result = apiInstance.getActiveFloatingTokensCount(isvId, licenseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#getActiveFloatingTokensCount");
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
| **licenseId** | **UUID**|  | |

### Return type

**Integer**

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="getConsumptionStatus"></a>
# **getConsumptionStatus**
> ConsumptionDto getConsumptionStatus(isvId, validateConsumptionStatusDto)

Checks the consumption status of a limitation

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016057197-CONSUMPTION-BASED-LIMITATIONS\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ValidateConsumptionStatusDto validateConsumptionStatusDto = new ValidateConsumptionStatusDto(); // ValidateConsumptionStatusDto | 
    try {
      ConsumptionDto result = apiInstance.getConsumptionStatus(isvId, validateConsumptionStatusDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#getConsumptionStatus");
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
| **validateConsumptionStatusDto** | [**ValidateConsumptionStatusDto**](ValidateConsumptionStatusDto.md)|  | |

### Return type

[**ConsumptionDto**](ConsumptionDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="getDeviceInfo"></a>
# **getDeviceInfo**
> LicenseInfoDto getDeviceInfo(isvId, validateLicenseDto)

Checks the validity of a license

Checks the validity of a license.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ValidateLicenseDto validateLicenseDto = new ValidateLicenseDto(); // ValidateLicenseDto | 
    try {
      LicenseInfoDto result = apiInstance.getDeviceInfo(isvId, validateLicenseDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#getDeviceInfo");
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
| **validateLicenseDto** | [**ValidateLicenseDto**](ValidateLicenseDto.md)|  | |

### Return type

[**LicenseInfoDto**](LicenseInfoDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="getLicensesByCustomerAsync"></a>
# **getLicensesByCustomerAsync**
> List&lt;LicenseDto&gt; getLicensesByCustomerAsync(isvId, getLicensesByCustomerDto)

Returns all licenses of a customer

Typically used in SaaS scenarios. &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    GetLicensesByCustomerDto getLicensesByCustomerDto = new GetLicensesByCustomerDto(); // GetLicensesByCustomerDto | 
    try {
      List<LicenseDto> result = apiInstance.getLicensesByCustomerAsync(isvId, getLicensesByCustomerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#getLicensesByCustomerAsync");
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
| **getLicensesByCustomerDto** | [**GetLicensesByCustomerDto**](GetLicensesByCustomerDto.md)|  | |

### Return type

[**List&lt;LicenseDto&gt;**](LicenseDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="getLicensesByLicenseKeyAsync"></a>
# **getLicensesByLicenseKeyAsync**
> List&lt;LicenseDto&gt; getLicensesByLicenseKeyAsync(isvId, getLicensesByLicenseKeyDto)

Returns all licenses of a (legacy) key

Typically used in order to map a license/key/subscription of a backoffice system to the SLASCONE license. &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    GetLicensesByLicenseKeyDto getLicensesByLicenseKeyDto = new GetLicensesByLicenseKeyDto(); // GetLicensesByLicenseKeyDto | 
    try {
      List<LicenseDto> result = apiInstance.getLicensesByLicenseKeyAsync(isvId, getLicensesByLicenseKeyDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#getLicensesByLicenseKeyAsync");
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
| **getLicensesByLicenseKeyDto** | [**GetLicensesByLicenseKeyDto**](GetLicensesByLicenseKeyDto.md)|  | |

### Return type

[**List&lt;LicenseDto&gt;**](LicenseDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="getLicensesByUserAsync"></a>
# **getLicensesByUserAsync**
> List&lt;LicenseDto&gt; getLicensesByUserAsync(isvId, getLicensesByUserDto)

Returns all licenses of a named user

Typically used in SaaS/Web scenarios. &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    GetLicensesByUserDto getLicensesByUserDto = new GetLicensesByUserDto(); // GetLicensesByUserDto | 
    try {
      List<LicenseDto> result = apiInstance.getLicensesByUserAsync(isvId, getLicensesByUserDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#getLicensesByUserAsync");
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
| **getLicensesByUserDto** | [**GetLicensesByUserDto**](GetLicensesByUserDto.md)|  | |

### Return type

[**List&lt;LicenseDto&gt;**](LicenseDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="openSession"></a>
# **openSession**
> SessionStatusDto openSession(isvId, sessionRequestDto)

Opens a (floating) session

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016152858-FLOATING-LICENSES\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    SessionRequestDto sessionRequestDto = new SessionRequestDto(); // SessionRequestDto | 
    try {
      SessionStatusDto result = apiInstance.openSession(isvId, sessionRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#openSession");
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
| **sessionRequestDto** | [**SessionRequestDto**](SessionRequestDto.md)|  | |

### Return type

[**SessionStatusDto**](SessionStatusDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="toogleLicenseStateAsync"></a>
# **toogleLicenseStateAsync**
> LicenseStateDto toogleLicenseStateAsync(isvId, toggleLicenseStateDto)

Toggles the license state (active/inactive)

Toggles the license state (active/inactive).

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ToggleLicenseStateDto toggleLicenseStateDto = new ToggleLicenseStateDto(); // ToggleLicenseStateDto | 
    try {
      LicenseStateDto result = apiInstance.toogleLicenseStateAsync(isvId, toggleLicenseStateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#toogleLicenseStateAsync");
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
| **toggleLicenseStateDto** | [**ToggleLicenseStateDto**](ToggleLicenseStateDto.md)|  | |

### Return type

[**LicenseStateDto**](LicenseStateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

<a id="unassignLicense"></a>
# **unassignLicense**
> String unassignLicense(isvId, unassignDto)

Unassigns a token from a client

Typically used in named device scenarios. &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016001677-CORE-API\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: AdminKey
    ApiKeyAuth AdminKey = (ApiKeyAuth) defaultClient.getAuthentication("AdminKey");
    AdminKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AdminKey.setApiKeyPrefix("Token");

    // Configure API key authorization: ProvisioningKey
    ApiKeyAuth ProvisioningKey = (ApiKeyAuth) defaultClient.getAuthentication("ProvisioningKey");
    ProvisioningKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ProvisioningKey.setApiKeyPrefix("Token");

    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UnassignDto unassignDto = new UnassignDto(); // UnassignDto | 
    try {
      String result = apiInstance.unassignLicense(isvId, unassignDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#unassignLicense");
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
| **unassignDto** | [**UnassignDto**](UnassignDto.md)|  | |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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

