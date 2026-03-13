# LicenseApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLicense**](LicenseApi.md#addLicense) | **POST** /api/v2/isv/{isv_id}/licenses | Creates a license |
| [**addLicenseWithHttpInfo**](LicenseApi.md#addLicenseWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses | Creates a license |
| [**addLicenseType**](LicenseApi.md#addLicenseType) | **POST** /api/v2/isv/{isv_id}/licenses/types | Creates a license type |
| [**addLicenseTypeWithHttpInfo**](LicenseApi.md#addLicenseTypeWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/types | Creates a license type |
| [**addLicenseUserAsync**](LicenseApi.md#addLicenseUserAsync) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/users | Creates a license user |
| [**addLicenseUserAsyncWithHttpInfo**](LicenseApi.md#addLicenseUserAsyncWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/users | Creates a license user |
| [**addLicenseUserGroupAsync**](LicenseApi.md#addLicenseUserGroupAsync) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups | Creates a license user group |
| [**addLicenseUserGroupAsyncWithHttpInfo**](LicenseApi.md#addLicenseUserGroupAsyncWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups | Creates a license user group |
| [**closeAllSessionsAsync**](LicenseApi.md#closeAllSessionsAsync) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/opensessions/close | Closes all open sessions for a license |
| [**closeAllSessionsAsyncWithHttpInfo**](LicenseApi.md#closeAllSessionsAsyncWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/opensessions/close | Closes all open sessions for a license |
| [**deleteLicense**](LicenseApi.md#deleteLicense) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id} | Deletes a license |
| [**deleteLicenseWithHttpInfo**](LicenseApi.md#deleteLicenseWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id} | Deletes a license |
| [**deleteLicenseAssignment**](LicenseApi.md#deleteLicenseAssignment) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments/{assignment_id} | Deletes a license assignment |
| [**deleteLicenseAssignmentWithHttpInfo**](LicenseApi.md#deleteLicenseAssignmentWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments/{assignment_id} | Deletes a license assignment |
| [**deleteLicenseUserAsync**](LicenseApi.md#deleteLicenseUserAsync) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id}/users/{user_id} | Deletes a license user |
| [**deleteLicenseUserAsyncWithHttpInfo**](LicenseApi.md#deleteLicenseUserAsyncWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id}/users/{user_id} | Deletes a license user |
| [**deleteLicenseUserGroupAsync**](LicenseApi.md#deleteLicenseUserGroupAsync) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups/{user_group_id} | Deletes a license user group |
| [**deleteLicenseUserGroupAsyncWithHttpInfo**](LicenseApi.md#deleteLicenseUserGroupAsyncWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups/{user_group_id} | Deletes a license user group |
| [**deleteLicenseUsersAsync**](LicenseApi.md#deleteLicenseUsersAsync) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/users/bulk-delete | Deletes many license users |
| [**deleteLicenseUsersAsyncWithHttpInfo**](LicenseApi.md#deleteLicenseUsersAsyncWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/{license_id}/users/bulk-delete | Deletes many license users |
| [**downloadLicenseFileXml**](LicenseApi.md#downloadLicenseFileXml) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/xml | Downloads an XML license file |
| [**downloadLicenseFileXmlWithHttpInfo**](LicenseApi.md#downloadLicenseFileXmlWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/xml | Downloads an XML license file |
| [**getAllLicenseHistory**](LicenseApi.md#getAllLicenseHistory) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/history | Returns the entire history of a license |
| [**getAllLicenseHistoryWithHttpInfo**](LicenseApi.md#getAllLicenseHistoryWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/history | Returns the entire history of a license |
| [**getAssignmentAsync**](LicenseApi.md#getAssignmentAsync) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments/{assignment_id} | Returns a license assignment |
| [**getAssignmentAsyncWithHttpInfo**](LicenseApi.md#getAssignmentAsyncWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments/{assignment_id} | Returns a license assignment |
| [**getConsumptionBalance**](LicenseApi.md#getConsumptionBalance) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/balance | Returns a consumption balance |
| [**getConsumptionBalanceWithHttpInfo**](LicenseApi.md#getConsumptionBalanceWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/balance | Returns a consumption balance |
| [**getConsumptionHeartbeats**](LicenseApi.md#getConsumptionHeartbeats) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/heartbeats | Returns all consumption heartbeats |
| [**getConsumptionHeartbeatsWithHttpInfo**](LicenseApi.md#getConsumptionHeartbeatsWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/heartbeats | Returns all consumption heartbeats |
| [**getLicense**](LicenseApi.md#getLicense) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id} | Returns a license |
| [**getLicenseWithHttpInfo**](LicenseApi.md#getLicenseWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id} | Returns a license |
| [**getLicenseAssignments**](LicenseApi.md#getLicenseAssignments) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments | Returns all license assignments |
| [**getLicenseAssignmentsWithHttpInfo**](LicenseApi.md#getLicenseAssignmentsWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments | Returns all license assignments |
| [**getLicenseHistory**](LicenseApi.md#getLicenseHistory) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/history/{history_id} | Returns a specific license snapshot |
| [**getLicenseHistoryWithHttpInfo**](LicenseApi.md#getLicenseHistoryWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/history/{history_id} | Returns a specific license snapshot |
| [**getLicenseTagAssignments**](LicenseApi.md#getLicenseTagAssignments) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/tags | Returns all license tags |
| [**getLicenseTagAssignmentsWithHttpInfo**](LicenseApi.md#getLicenseTagAssignmentsWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/tags | Returns all license tags |
| [**getLicenseTypes**](LicenseApi.md#getLicenseTypes) | **GET** /api/v2/isv/{isv_id}/licenses/types | Returns all license types |
| [**getLicenseTypesWithHttpInfo**](LicenseApi.md#getLicenseTypesWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/types | Returns all license types |
| [**getLicenseUserGroupsAsync**](LicenseApi.md#getLicenseUserGroupsAsync) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups | Returns all user groups |
| [**getLicenseUserGroupsAsyncWithHttpInfo**](LicenseApi.md#getLicenseUserGroupsAsyncWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups | Returns all user groups |
| [**getLicenseUsersAsync**](LicenseApi.md#getLicenseUsersAsync) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/users | Returns license users |
| [**getLicenseUsersAsyncWithHttpInfo**](LicenseApi.md#getLicenseUsersAsyncWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/users | Returns license users |
| [**getLicensesByFilter**](LicenseApi.md#getLicensesByFilter) | **POST** /api/v2/isv/{isv_id}/licenses/filtered/detailed | Returns all licenses matching a filter setting (detailed) |
| [**getLicensesByFilterWithHttpInfo**](LicenseApi.md#getLicensesByFilterWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/filtered/detailed | Returns all licenses matching a filter setting (detailed) |
| [**getLicensesByFilterSettings**](LicenseApi.md#getLicensesByFilterSettings) | **POST** /api/v2/isv/{isv_id}/licenses/filtered | Returns all licenses matching a filter setting (light) |
| [**getLicensesByFilterSettingsWithHttpInfo**](LicenseApi.md#getLicensesByFilterSettingsWithHttpInfo) | **POST** /api/v2/isv/{isv_id}/licenses/filtered | Returns all licenses matching a filter setting (light) |
| [**getOpenSessionsAsync**](LicenseApi.md#getOpenSessionsAsync) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/opensessions | Returns all open sessions |
| [**getOpenSessionsAsyncWithHttpInfo**](LicenseApi.md#getOpenSessionsAsyncWithHttpInfo) | **GET** /api/v2/isv/{isv_id}/licenses/{license_id}/opensessions | Returns all open sessions |
| [**recalculateConsumptionBalance**](LicenseApi.md#recalculateConsumptionBalance) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/balance/limitations/{limitation_id}/recalculate | Recalculates a consumption balance |
| [**recalculateConsumptionBalanceWithHttpInfo**](LicenseApi.md#recalculateConsumptionBalanceWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/balance/limitations/{limitation_id}/recalculate | Recalculates a consumption balance |
| [**removeLicenseType**](LicenseApi.md#removeLicenseType) | **DELETE** /api/v2/isv/{isv_id}/licenses/types/{type_id}/new_type/{new_type_id} | Deletes a license type |
| [**removeLicenseTypeWithHttpInfo**](LicenseApi.md#removeLicenseTypeWithHttpInfo) | **DELETE** /api/v2/isv/{isv_id}/licenses/types/{type_id}/new_type/{new_type_id} | Deletes a license type |
| [**resetConsumptionBalance**](LicenseApi.md#resetConsumptionBalance) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/balance/limitations/{limitation_id}/reset | Resets a consumption balance |
| [**resetConsumptionBalanceWithHttpInfo**](LicenseApi.md#resetConsumptionBalanceWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/consumption/balance/limitations/{limitation_id}/reset | Resets a consumption balance |
| [**toggleLicenseStateAsync**](LicenseApi.md#toggleLicenseStateAsync) | **PATCH** /api/v2/isv/{isv_id}/licenses/{license_id}/toggle | Toggles the state of a license |
| [**toggleLicenseStateAsyncWithHttpInfo**](LicenseApi.md#toggleLicenseStateAsyncWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/licenses/{license_id}/toggle | Toggles the state of a license |
| [**updateAssignmentAsync**](LicenseApi.md#updateAssignmentAsync) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments | Updates a license assignment |
| [**updateAssignmentAsyncWithHttpInfo**](LicenseApi.md#updateAssignmentAsyncWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/assignments | Updates a license assignment |
| [**updateLicense**](LicenseApi.md#updateLicense) | **PATCH** /api/v2/isv/{isv_id}/licenses | Updates a license |
| [**updateLicenseWithHttpInfo**](LicenseApi.md#updateLicenseWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/licenses | Updates a license |
| [**updateLicenseTagAssignments**](LicenseApi.md#updateLicenseTagAssignments) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/tags | Updates the tags of a license |
| [**updateLicenseTagAssignmentsWithHttpInfo**](LicenseApi.md#updateLicenseTagAssignmentsWithHttpInfo) | **PUT** /api/v2/isv/{isv_id}/licenses/{license_id}/tags | Updates the tags of a license |
| [**updateLicenseType**](LicenseApi.md#updateLicenseType) | **PATCH** /api/v2/isv/{isv_id}/licenses/types | Updates a license type |
| [**updateLicenseTypeWithHttpInfo**](LicenseApi.md#updateLicenseTypeWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/licenses/types | Updates a license type |
| [**updateLicenseUserAsync**](LicenseApi.md#updateLicenseUserAsync) | **PATCH** /api/v2/isv/{isv_id}/licenses/{license_id}/users | Updates a license user |
| [**updateLicenseUserAsyncWithHttpInfo**](LicenseApi.md#updateLicenseUserAsyncWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/licenses/{license_id}/users | Updates a license user |
| [**updateLicenseUserGroupAsync**](LicenseApi.md#updateLicenseUserGroupAsync) | **PATCH** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups | Updates a license user group |
| [**updateLicenseUserGroupAsyncWithHttpInfo**](LicenseApi.md#updateLicenseUserGroupAsyncWithHttpInfo) | **PATCH** /api/v2/isv/{isv_id}/licenses/{license_id}/usergroups | Updates a license user group |



## addLicense

> LicenseDto addLicense(isvId, licenseDto)

Creates a license

Sample request:                  GET /api/customers/123

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseDto licenseDto = new LicenseDto(); // LicenseDto | 
        try {
            LicenseDto result = apiInstance.addLicense(isvId, licenseDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicense");
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
| **licenseDto** | [**LicenseDto**](LicenseDto.md)|  | |

### Return type

[**LicenseDto**](LicenseDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## addLicenseWithHttpInfo

> ApiResponse<LicenseDto> addLicense addLicenseWithHttpInfo(isvId, licenseDto)

Creates a license

Sample request:                  GET /api/customers/123

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseDto licenseDto = new LicenseDto(); // LicenseDto | 
        try {
            ApiResponse<LicenseDto> response = apiInstance.addLicenseWithHttpInfo(isvId, licenseDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicense");
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
| **licenseDto** | [**LicenseDto**](LicenseDto.md)|  | |

### Return type

ApiResponse<[**LicenseDto**](LicenseDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## addLicenseType

> LicenseTypeDto addLicenseType(isvId, licenseTypeDto)

Creates a license type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseTypeDto licenseTypeDto = new LicenseTypeDto(); // LicenseTypeDto | 
        try {
            LicenseTypeDto result = apiInstance.addLicenseType(isvId, licenseTypeDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicenseType");
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
| **licenseTypeDto** | [**LicenseTypeDto**](LicenseTypeDto.md)|  | |

### Return type

[**LicenseTypeDto**](LicenseTypeDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## addLicenseTypeWithHttpInfo

> ApiResponse<LicenseTypeDto> addLicenseType addLicenseTypeWithHttpInfo(isvId, licenseTypeDto)

Creates a license type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseTypeDto licenseTypeDto = new LicenseTypeDto(); // LicenseTypeDto | 
        try {
            ApiResponse<LicenseTypeDto> response = apiInstance.addLicenseTypeWithHttpInfo(isvId, licenseTypeDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicenseType");
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
| **licenseTypeDto** | [**LicenseTypeDto**](LicenseTypeDto.md)|  | |

### Return type

ApiResponse<[**LicenseTypeDto**](LicenseTypeDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## addLicenseUserAsync

> LicenseUserDto addLicenseUserAsync(isvId, licenseId, licenseUserDto)

Creates a license user

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String licenseId = "licenseId_example"; // String | 
        LicenseUserDto licenseUserDto = new LicenseUserDto(); // LicenseUserDto | 
        try {
            LicenseUserDto result = apiInstance.addLicenseUserAsync(isvId, licenseId, licenseUserDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicenseUserAsync");
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
| **licenseId** | **String**|  | |
| **licenseUserDto** | [**LicenseUserDto**](LicenseUserDto.md)|  | |

### Return type

[**LicenseUserDto**](LicenseUserDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## addLicenseUserAsyncWithHttpInfo

> ApiResponse<LicenseUserDto> addLicenseUserAsync addLicenseUserAsyncWithHttpInfo(isvId, licenseId, licenseUserDto)

Creates a license user

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String licenseId = "licenseId_example"; // String | 
        LicenseUserDto licenseUserDto = new LicenseUserDto(); // LicenseUserDto | 
        try {
            ApiResponse<LicenseUserDto> response = apiInstance.addLicenseUserAsyncWithHttpInfo(isvId, licenseId, licenseUserDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicenseUserAsync");
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
| **licenseId** | **String**|  | |
| **licenseUserDto** | [**LicenseUserDto**](LicenseUserDto.md)|  | |

### Return type

ApiResponse<[**LicenseUserDto**](LicenseUserDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## addLicenseUserGroupAsync

> LicenseUserGroupDto addLicenseUserGroupAsync(isvId, licenseId, licenseUserGroupDto)

Creates a license user group

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        LicenseUserGroupDto licenseUserGroupDto = new LicenseUserGroupDto(); // LicenseUserGroupDto | 
        try {
            LicenseUserGroupDto result = apiInstance.addLicenseUserGroupAsync(isvId, licenseId, licenseUserGroupDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicenseUserGroupAsync");
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
| **licenseUserGroupDto** | [**LicenseUserGroupDto**](LicenseUserGroupDto.md)|  | |

### Return type

[**LicenseUserGroupDto**](LicenseUserGroupDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## addLicenseUserGroupAsyncWithHttpInfo

> ApiResponse<LicenseUserGroupDto> addLicenseUserGroupAsync addLicenseUserGroupAsyncWithHttpInfo(isvId, licenseId, licenseUserGroupDto)

Creates a license user group

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        LicenseUserGroupDto licenseUserGroupDto = new LicenseUserGroupDto(); // LicenseUserGroupDto | 
        try {
            ApiResponse<LicenseUserGroupDto> response = apiInstance.addLicenseUserGroupAsyncWithHttpInfo(isvId, licenseId, licenseUserGroupDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#addLicenseUserGroupAsync");
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
| **licenseId** | **UUID**|  | |
| **licenseUserGroupDto** | [**LicenseUserGroupDto**](LicenseUserGroupDto.md)|  | |

### Return type

ApiResponse<[**LicenseUserGroupDto**](LicenseUserGroupDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## closeAllSessionsAsync

> void closeAllSessionsAsync(isvId, licenseId, closeAllSessionsRequestDto)

Closes all open sessions for a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        CloseAllSessionsRequestDto closeAllSessionsRequestDto = new CloseAllSessionsRequestDto(); // CloseAllSessionsRequestDto | 
        try {
            apiInstance.closeAllSessionsAsync(isvId, licenseId, closeAllSessionsRequestDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#closeAllSessionsAsync");
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
| **closeAllSessionsRequestDto** | [**CloseAllSessionsRequestDto**](CloseAllSessionsRequestDto.md)|  | |

### Return type


null (empty response body)

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
| **409** | Warning |  -  |

## closeAllSessionsAsyncWithHttpInfo

> ApiResponse<Void> closeAllSessionsAsync closeAllSessionsAsyncWithHttpInfo(isvId, licenseId, closeAllSessionsRequestDto)

Closes all open sessions for a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        CloseAllSessionsRequestDto closeAllSessionsRequestDto = new CloseAllSessionsRequestDto(); // CloseAllSessionsRequestDto | 
        try {
            ApiResponse<Void> response = apiInstance.closeAllSessionsAsyncWithHttpInfo(isvId, licenseId, closeAllSessionsRequestDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#closeAllSessionsAsync");
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
| **licenseId** | **UUID**|  | |
| **closeAllSessionsRequestDto** | [**CloseAllSessionsRequestDto**](CloseAllSessionsRequestDto.md)|  | |

### Return type


ApiResponse<Void>

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
| **409** | Warning |  -  |


## deleteLicense

> LicenseDto deleteLicense(isvId, licenseId)

Deletes a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            LicenseDto result = apiInstance.deleteLicense(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicense");
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

[**LicenseDto**](LicenseDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## deleteLicenseWithHttpInfo

> ApiResponse<LicenseDto> deleteLicense deleteLicenseWithHttpInfo(isvId, licenseId)

Deletes a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LicenseDto> response = apiInstance.deleteLicenseWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicense");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**LicenseDto**](LicenseDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## deleteLicenseAssignment

> List<DeviceLicenseAssignmentDto> deleteLicenseAssignment(isvId, licenseId, assignmentId)

Deletes a license assignment

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID assignmentId = UUID.randomUUID(); // UUID | 
        try {
            List<DeviceLicenseAssignmentDto> result = apiInstance.deleteLicenseAssignment(isvId, licenseId, assignmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseAssignment");
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
| **assignmentId** | **UUID**|  | |

### Return type

[**List&lt;DeviceLicenseAssignmentDto&gt;**](DeviceLicenseAssignmentDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## deleteLicenseAssignmentWithHttpInfo

> ApiResponse<List<DeviceLicenseAssignmentDto>> deleteLicenseAssignment deleteLicenseAssignmentWithHttpInfo(isvId, licenseId, assignmentId)

Deletes a license assignment

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID assignmentId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<DeviceLicenseAssignmentDto>> response = apiInstance.deleteLicenseAssignmentWithHttpInfo(isvId, licenseId, assignmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseAssignment");
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
| **licenseId** | **UUID**|  | |
| **assignmentId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;DeviceLicenseAssignmentDto&gt;**](DeviceLicenseAssignmentDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## deleteLicenseUserAsync

> LicenseUserDto deleteLicenseUserAsync(isvId, userId, licenseId)

Deletes a license user

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String userId = "userId_example"; // String | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            LicenseUserDto result = apiInstance.deleteLicenseUserAsync(isvId, userId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseUserAsync");
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
| **userId** | **String**|  | |
| **licenseId** | **UUID**|  | |

### Return type

[**LicenseUserDto**](LicenseUserDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## deleteLicenseUserAsyncWithHttpInfo

> ApiResponse<LicenseUserDto> deleteLicenseUserAsync deleteLicenseUserAsyncWithHttpInfo(isvId, userId, licenseId)

Deletes a license user

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String userId = "userId_example"; // String | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LicenseUserDto> response = apiInstance.deleteLicenseUserAsyncWithHttpInfo(isvId, userId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseUserAsync");
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
| **userId** | **String**|  | |
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**LicenseUserDto**](LicenseUserDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## deleteLicenseUserGroupAsync

> LicenseUserGroupDto deleteLicenseUserGroupAsync(isvId, userGroupId, licenseId, removeUsers)

Deletes a license user group

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID userGroupId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        Boolean removeUsers = true; // Boolean | 
        try {
            LicenseUserGroupDto result = apiInstance.deleteLicenseUserGroupAsync(isvId, userGroupId, licenseId, removeUsers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseUserGroupAsync");
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
| **userGroupId** | **UUID**|  | |
| **licenseId** | **UUID**|  | |
| **removeUsers** | **Boolean**|  | [optional] |

### Return type

[**LicenseUserGroupDto**](LicenseUserGroupDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## deleteLicenseUserGroupAsyncWithHttpInfo

> ApiResponse<LicenseUserGroupDto> deleteLicenseUserGroupAsync deleteLicenseUserGroupAsyncWithHttpInfo(isvId, userGroupId, licenseId, removeUsers)

Deletes a license user group

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID userGroupId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        Boolean removeUsers = true; // Boolean | 
        try {
            ApiResponse<LicenseUserGroupDto> response = apiInstance.deleteLicenseUserGroupAsyncWithHttpInfo(isvId, userGroupId, licenseId, removeUsers);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseUserGroupAsync");
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
| **userGroupId** | **UUID**|  | |
| **licenseId** | **UUID**|  | |
| **removeUsers** | **Boolean**|  | [optional] |

### Return type

ApiResponse<[**LicenseUserGroupDto**](LicenseUserGroupDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## deleteLicenseUsersAsync

> List<BulkDeleteUserResultDto> deleteLicenseUsersAsync(isvId, licenseId, requestBody)

Deletes many license users

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            List<BulkDeleteUserResultDto> result = apiInstance.deleteLicenseUsersAsync(isvId, licenseId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseUsersAsync");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**List&lt;BulkDeleteUserResultDto&gt;**](BulkDeleteUserResultDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## deleteLicenseUsersAsyncWithHttpInfo

> ApiResponse<List<BulkDeleteUserResultDto>> deleteLicenseUsersAsync deleteLicenseUsersAsyncWithHttpInfo(isvId, licenseId, requestBody)

Deletes many license users

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            ApiResponse<List<BulkDeleteUserResultDto>> response = apiInstance.deleteLicenseUsersAsyncWithHttpInfo(isvId, licenseId, requestBody);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#deleteLicenseUsersAsync");
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
| **licenseId** | **UUID**|  | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

ApiResponse<[**List&lt;BulkDeleteUserResultDto&gt;**](BulkDeleteUserResultDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## downloadLicenseFileXml

> void downloadLicenseFileXml(isvId, licenseId, tokenKey)

Downloads an XML license file

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID tokenKey = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.downloadLicenseFileXml(isvId, licenseId, tokenKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#downloadLicenseFileXml");
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
| **tokenKey** | **UUID**|  | [optional] |

### Return type


null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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
| **409** | Warning |  -  |
| **200** | Xml Document |  -  |

## downloadLicenseFileXmlWithHttpInfo

> ApiResponse<Void> downloadLicenseFileXml downloadLicenseFileXmlWithHttpInfo(isvId, licenseId, tokenKey)

Downloads an XML license file

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID tokenKey = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Void> response = apiInstance.downloadLicenseFileXmlWithHttpInfo(isvId, licenseId, tokenKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#downloadLicenseFileXml");
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
| **licenseId** | **UUID**|  | |
| **tokenKey** | **UUID**|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

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
| **409** | Warning |  -  |
| **200** | Xml Document |  -  |


## getAllLicenseHistory

> List<HistoryDto> getAllLicenseHistory(isvId, licenseId)

Returns the entire history of a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            List<HistoryDto> result = apiInstance.getAllLicenseHistory(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getAllLicenseHistory");
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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getAllLicenseHistoryWithHttpInfo

> ApiResponse<List<HistoryDto>> getAllLicenseHistory getAllLicenseHistoryWithHttpInfo(isvId, licenseId)

Returns the entire history of a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<HistoryDto>> response = apiInstance.getAllLicenseHistoryWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getAllLicenseHistory");
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
| **licenseId** | **UUID**|  | |

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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getAssignmentAsync

> DeviceLicenseAssignmentDto getAssignmentAsync(isvId, licenseId, assignmentId)

Returns a license assignment

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID assignmentId = UUID.randomUUID(); // UUID | 
        try {
            DeviceLicenseAssignmentDto result = apiInstance.getAssignmentAsync(isvId, licenseId, assignmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getAssignmentAsync");
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
| **assignmentId** | **UUID**|  | |

### Return type

[**DeviceLicenseAssignmentDto**](DeviceLicenseAssignmentDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getAssignmentAsyncWithHttpInfo

> ApiResponse<DeviceLicenseAssignmentDto> getAssignmentAsync getAssignmentAsyncWithHttpInfo(isvId, licenseId, assignmentId)

Returns a license assignment

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID assignmentId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<DeviceLicenseAssignmentDto> response = apiInstance.getAssignmentAsyncWithHttpInfo(isvId, licenseId, assignmentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getAssignmentAsync");
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
| **licenseId** | **UUID**|  | |
| **assignmentId** | **UUID**|  | |

### Return type

ApiResponse<[**DeviceLicenseAssignmentDto**](DeviceLicenseAssignmentDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getConsumptionBalance

> List<ConsumptionBalanceDto> getConsumptionBalance(isvId, licenseId)

Returns a consumption balance

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            List<ConsumptionBalanceDto> result = apiInstance.getConsumptionBalance(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getConsumptionBalance");
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

[**List&lt;ConsumptionBalanceDto&gt;**](ConsumptionBalanceDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getConsumptionBalanceWithHttpInfo

> ApiResponse<List<ConsumptionBalanceDto>> getConsumptionBalance getConsumptionBalanceWithHttpInfo(isvId, licenseId)

Returns a consumption balance

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<ConsumptionBalanceDto>> response = apiInstance.getConsumptionBalanceWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getConsumptionBalance");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;ConsumptionBalanceDto&gt;**](ConsumptionBalanceDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getConsumptionHeartbeats

> ConsumptionHeartbeatLazyLoadDto getConsumptionHeartbeats(isvId, licenseId, transactionId, userId, clientId, dateFrom, dateTo, limitations)

Returns all consumption heartbeats

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID transactionId = UUID.randomUUID(); // UUID | 
        String userId = "userId_example"; // String | 
        String clientId = "clientId_example"; // String | 
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        List<UUID> limitations = Arrays.asList(); // List<UUID> | 
        try {
            ConsumptionHeartbeatLazyLoadDto result = apiInstance.getConsumptionHeartbeats(isvId, licenseId, transactionId, userId, clientId, dateFrom, dateTo, limitations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getConsumptionHeartbeats");
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
| **transactionId** | **UUID**|  | [optional] |
| **userId** | **String**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **dateFrom** | **OffsetDateTime**|  | [optional] |
| **dateTo** | **OffsetDateTime**|  | [optional] |
| **limitations** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |

### Return type

[**ConsumptionHeartbeatLazyLoadDto**](ConsumptionHeartbeatLazyLoadDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getConsumptionHeartbeatsWithHttpInfo

> ApiResponse<ConsumptionHeartbeatLazyLoadDto> getConsumptionHeartbeats getConsumptionHeartbeatsWithHttpInfo(isvId, licenseId, transactionId, userId, clientId, dateFrom, dateTo, limitations)

Returns all consumption heartbeats

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID transactionId = UUID.randomUUID(); // UUID | 
        String userId = "userId_example"; // String | 
        String clientId = "clientId_example"; // String | 
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        List<UUID> limitations = Arrays.asList(); // List<UUID> | 
        try {
            ApiResponse<ConsumptionHeartbeatLazyLoadDto> response = apiInstance.getConsumptionHeartbeatsWithHttpInfo(isvId, licenseId, transactionId, userId, clientId, dateFrom, dateTo, limitations);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getConsumptionHeartbeats");
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
| **licenseId** | **UUID**|  | |
| **transactionId** | **UUID**|  | [optional] |
| **userId** | **String**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **dateFrom** | **OffsetDateTime**|  | [optional] |
| **dateTo** | **OffsetDateTime**|  | [optional] |
| **limitations** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |

### Return type

ApiResponse<[**ConsumptionHeartbeatLazyLoadDto**](ConsumptionHeartbeatLazyLoadDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicense

> LicenseDto getLicense(isvId, licenseId)

Returns a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            LicenseDto result = apiInstance.getLicense(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicense");
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

[**LicenseDto**](LicenseDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicenseWithHttpInfo

> ApiResponse<LicenseDto> getLicense getLicenseWithHttpInfo(isvId, licenseId)

Returns a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LicenseDto> response = apiInstance.getLicenseWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicense");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**LicenseDto**](LicenseDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicenseAssignments

> List<DeviceLicenseAssignmentDto> getLicenseAssignments(isvId, licenseId, sortOption, descending, includeAnalyticalHeartbeats, operatingSystems, versionNumber, page, pageSize)

Returns all license assignments

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        DevicesSortEnum sortOption = DevicesSortEnum.fromValue("0"); // DevicesSortEnum | 
        Boolean descending = true; // Boolean | 
        Boolean includeAnalyticalHeartbeats = true; // Boolean | 
        List<String> operatingSystems = Arrays.asList(); // List<String> | 
        List<String> versionNumber = Arrays.asList(); // List<String> | 
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<DeviceLicenseAssignmentDto> result = apiInstance.getLicenseAssignments(isvId, licenseId, sortOption, descending, includeAnalyticalHeartbeats, operatingSystems, versionNumber, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseAssignments");
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
| **sortOption** | [**DevicesSortEnum**](.md)|  | [optional] [enum: 0, 1, 2, 3] |
| **descending** | **Boolean**|  | [optional] |
| **includeAnalyticalHeartbeats** | **Boolean**|  | [optional] |
| **operatingSystems** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **versionNumber** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**List&lt;DeviceLicenseAssignmentDto&gt;**](DeviceLicenseAssignmentDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicenseAssignmentsWithHttpInfo

> ApiResponse<List<DeviceLicenseAssignmentDto>> getLicenseAssignments getLicenseAssignmentsWithHttpInfo(isvId, licenseId, sortOption, descending, includeAnalyticalHeartbeats, operatingSystems, versionNumber, page, pageSize)

Returns all license assignments

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        DevicesSortEnum sortOption = DevicesSortEnum.fromValue("0"); // DevicesSortEnum | 
        Boolean descending = true; // Boolean | 
        Boolean includeAnalyticalHeartbeats = true; // Boolean | 
        List<String> operatingSystems = Arrays.asList(); // List<String> | 
        List<String> versionNumber = Arrays.asList(); // List<String> | 
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            ApiResponse<List<DeviceLicenseAssignmentDto>> response = apiInstance.getLicenseAssignmentsWithHttpInfo(isvId, licenseId, sortOption, descending, includeAnalyticalHeartbeats, operatingSystems, versionNumber, page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseAssignments");
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
| **licenseId** | **UUID**|  | |
| **sortOption** | [**DevicesSortEnum**](.md)|  | [optional] [enum: 0, 1, 2, 3] |
| **descending** | **Boolean**|  | [optional] |
| **includeAnalyticalHeartbeats** | **Boolean**|  | [optional] |
| **operatingSystems** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **versionNumber** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

ApiResponse<[**List&lt;DeviceLicenseAssignmentDto&gt;**](DeviceLicenseAssignmentDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicenseHistory

> HistoryDto getLicenseHistory(isvId, licenseId, historyId)

Returns a specific license snapshot

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID historyId = UUID.randomUUID(); // UUID | 
        try {
            HistoryDto result = apiInstance.getLicenseHistory(isvId, licenseId, historyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseHistory");
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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicenseHistoryWithHttpInfo

> ApiResponse<HistoryDto> getLicenseHistory getLicenseHistoryWithHttpInfo(isvId, licenseId, historyId)

Returns a specific license snapshot

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID historyId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<HistoryDto> response = apiInstance.getLicenseHistoryWithHttpInfo(isvId, licenseId, historyId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseHistory");
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
| **licenseId** | **UUID**|  | |
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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicenseTagAssignments

> List<ItemTagAssignmentDto> getLicenseTagAssignments(isvId, licenseId)

Returns all license tags

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            List<ItemTagAssignmentDto> result = apiInstance.getLicenseTagAssignments(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseTagAssignments");
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

[**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicenseTagAssignmentsWithHttpInfo

> ApiResponse<List<ItemTagAssignmentDto>> getLicenseTagAssignments getLicenseTagAssignmentsWithHttpInfo(isvId, licenseId)

Returns all license tags

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<ItemTagAssignmentDto>> response = apiInstance.getLicenseTagAssignmentsWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseTagAssignments");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;ItemTagAssignmentDto&gt;**](ItemTagAssignmentDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicenseTypes

> List<LicenseTypeDto> getLicenseTypes(isvId, name)

Returns all license types

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            List<LicenseTypeDto> result = apiInstance.getLicenseTypes(isvId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseTypes");
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

[**List&lt;LicenseTypeDto&gt;**](LicenseTypeDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicenseTypesWithHttpInfo

> ApiResponse<List<LicenseTypeDto>> getLicenseTypes getLicenseTypesWithHttpInfo(isvId, name)

Returns all license types

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String name = "name_example"; // String | 
        try {
            ApiResponse<List<LicenseTypeDto>> response = apiInstance.getLicenseTypesWithHttpInfo(isvId, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseTypes");
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

ApiResponse<[**List&lt;LicenseTypeDto&gt;**](LicenseTypeDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicenseUserGroupsAsync

> List<LicenseUserGroupDto> getLicenseUserGroupsAsync(isvId, licenseId)

Returns all user groups

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            List<LicenseUserGroupDto> result = apiInstance.getLicenseUserGroupsAsync(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseUserGroupsAsync");
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

[**List&lt;LicenseUserGroupDto&gt;**](LicenseUserGroupDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## getLicenseUserGroupsAsyncWithHttpInfo

> ApiResponse<List<LicenseUserGroupDto>> getLicenseUserGroupsAsync getLicenseUserGroupsAsyncWithHttpInfo(isvId, licenseId)

Returns all user groups

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<LicenseUserGroupDto>> response = apiInstance.getLicenseUserGroupsAsyncWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseUserGroupsAsync");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;LicenseUserGroupDto&gt;**](LicenseUserGroupDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## getLicenseUsersAsync

> List<LicenseUserDto> getLicenseUsersAsync(isvId, licenseId)

Returns license users

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            List<LicenseUserDto> result = apiInstance.getLicenseUsersAsync(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseUsersAsync");
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

[**List&lt;LicenseUserDto&gt;**](LicenseUserDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## getLicenseUsersAsyncWithHttpInfo

> ApiResponse<List<LicenseUserDto>> getLicenseUsersAsync getLicenseUsersAsyncWithHttpInfo(isvId, licenseId)

Returns license users

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<LicenseUserDto>> response = apiInstance.getLicenseUsersAsyncWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicenseUsersAsync");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;LicenseUserDto&gt;**](LicenseUserDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## getLicensesByFilter

> List<LicenseDto> getLicensesByFilter(isvId, licenseFilterDto)

Returns all licenses matching a filter setting (detailed)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseFilterDto licenseFilterDto = new LicenseFilterDto(); // LicenseFilterDto | 
        try {
            List<LicenseDto> result = apiInstance.getLicensesByFilter(isvId, licenseFilterDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicensesByFilter");
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
| **licenseFilterDto** | [**LicenseFilterDto**](LicenseFilterDto.md)|  | |

### Return type

[**List&lt;LicenseDto&gt;**](LicenseDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicensesByFilterWithHttpInfo

> ApiResponse<List<LicenseDto>> getLicensesByFilter getLicensesByFilterWithHttpInfo(isvId, licenseFilterDto)

Returns all licenses matching a filter setting (detailed)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseFilterDto licenseFilterDto = new LicenseFilterDto(); // LicenseFilterDto | 
        try {
            ApiResponse<List<LicenseDto>> response = apiInstance.getLicensesByFilterWithHttpInfo(isvId, licenseFilterDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicensesByFilter");
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
| **licenseFilterDto** | [**LicenseFilterDto**](LicenseFilterDto.md)|  | |

### Return type

ApiResponse<[**List&lt;LicenseDto&gt;**](LicenseDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getLicensesByFilterSettings

> LicenseLazyLoadDto getLicensesByFilterSettings(isvId, licenseFilterDto)

Returns all licenses matching a filter setting (light)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseFilterDto licenseFilterDto = new LicenseFilterDto(); // LicenseFilterDto | 
        try {
            LicenseLazyLoadDto result = apiInstance.getLicensesByFilterSettings(isvId, licenseFilterDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicensesByFilterSettings");
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
| **licenseFilterDto** | [**LicenseFilterDto**](LicenseFilterDto.md)|  | |

### Return type

[**LicenseLazyLoadDto**](LicenseLazyLoadDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getLicensesByFilterSettingsWithHttpInfo

> ApiResponse<LicenseLazyLoadDto> getLicensesByFilterSettings getLicensesByFilterSettingsWithHttpInfo(isvId, licenseFilterDto)

Returns all licenses matching a filter setting (light)

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseFilterDto licenseFilterDto = new LicenseFilterDto(); // LicenseFilterDto | 
        try {
            ApiResponse<LicenseLazyLoadDto> response = apiInstance.getLicensesByFilterSettingsWithHttpInfo(isvId, licenseFilterDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getLicensesByFilterSettings");
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
| **licenseFilterDto** | [**LicenseFilterDto**](LicenseFilterDto.md)|  | |

### Return type

ApiResponse<[**LicenseLazyLoadDto**](LicenseLazyLoadDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## getOpenSessionsAsync

> List<SessionDto> getOpenSessionsAsync(isvId, licenseId)

Returns all open sessions

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            List<SessionDto> result = apiInstance.getOpenSessionsAsync(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getOpenSessionsAsync");
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

[**List&lt;SessionDto&gt;**](SessionDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## getOpenSessionsAsyncWithHttpInfo

> ApiResponse<List<SessionDto>> getOpenSessionsAsync getOpenSessionsAsyncWithHttpInfo(isvId, licenseId)

Returns all open sessions

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<SessionDto>> response = apiInstance.getOpenSessionsAsyncWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#getOpenSessionsAsync");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;SessionDto&gt;**](SessionDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## recalculateConsumptionBalance

> void recalculateConsumptionBalance(isvId, licenseId, limitationId)

Recalculates a consumption balance

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID limitationId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.recalculateConsumptionBalance(isvId, licenseId, limitationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#recalculateConsumptionBalance");
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Warning |  -  |
| **200** | Success |  -  |

## recalculateConsumptionBalanceWithHttpInfo

> ApiResponse<Void> recalculateConsumptionBalance recalculateConsumptionBalanceWithHttpInfo(isvId, licenseId, limitationId)

Recalculates a consumption balance

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID limitationId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Void> response = apiInstance.recalculateConsumptionBalanceWithHttpInfo(isvId, licenseId, limitationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#recalculateConsumptionBalance");
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
| **licenseId** | **UUID**|  | |
| **limitationId** | **UUID**|  | |

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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## removeLicenseType

> LicenseTypeDto removeLicenseType(isvId, typeId, newTypeId)

Deletes a license type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID typeId = UUID.randomUUID(); // UUID | 
        UUID newTypeId = UUID.randomUUID(); // UUID | 
        try {
            LicenseTypeDto result = apiInstance.removeLicenseType(isvId, typeId, newTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#removeLicenseType");
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

[**LicenseTypeDto**](LicenseTypeDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## removeLicenseTypeWithHttpInfo

> ApiResponse<LicenseTypeDto> removeLicenseType removeLicenseTypeWithHttpInfo(isvId, typeId, newTypeId)

Deletes a license type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID typeId = UUID.randomUUID(); // UUID | 
        UUID newTypeId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LicenseTypeDto> response = apiInstance.removeLicenseTypeWithHttpInfo(isvId, typeId, newTypeId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#removeLicenseType");
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

ApiResponse<[**LicenseTypeDto**](LicenseTypeDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## resetConsumptionBalance

> void resetConsumptionBalance(isvId, licenseId, limitationId)

Resets a consumption balance

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID limitationId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.resetConsumptionBalance(isvId, licenseId, limitationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#resetConsumptionBalance");
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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Warning |  -  |
| **200** | Success |  -  |

## resetConsumptionBalanceWithHttpInfo

> ApiResponse<Void> resetConsumptionBalance resetConsumptionBalanceWithHttpInfo(isvId, licenseId, limitationId)

Resets a consumption balance

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/10506993302557-UNDERSTANDING-CONSUMPTION-BASED-ASPECTS\&quot;&gt;consumption based aspects&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        UUID limitationId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Void> response = apiInstance.resetConsumptionBalanceWithHttpInfo(isvId, licenseId, limitationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#resetConsumptionBalance");
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
| **licenseId** | **UUID**|  | |
| **limitationId** | **UUID**|  | |

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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## toggleLicenseStateAsync

> LicenseDto toggleLicenseStateAsync(isvId, licenseId)

Toggles the state of a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            LicenseDto result = apiInstance.toggleLicenseStateAsync(isvId, licenseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#toggleLicenseStateAsync");
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

[**LicenseDto**](LicenseDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## toggleLicenseStateAsyncWithHttpInfo

> ApiResponse<LicenseDto> toggleLicenseStateAsync toggleLicenseStateAsyncWithHttpInfo(isvId, licenseId)

Toggles the state of a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LicenseDto> response = apiInstance.toggleLicenseStateAsyncWithHttpInfo(isvId, licenseId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#toggleLicenseStateAsync");
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
| **licenseId** | **UUID**|  | |

### Return type

ApiResponse<[**LicenseDto**](LicenseDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## updateAssignmentAsync

> DeviceLicenseAssignmentDto updateAssignmentAsync(isvId, licenseId, deviceLicenseAssignmentDto)

Updates a license assignment

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        DeviceLicenseAssignmentDto deviceLicenseAssignmentDto = new DeviceLicenseAssignmentDto(); // DeviceLicenseAssignmentDto | 
        try {
            DeviceLicenseAssignmentDto result = apiInstance.updateAssignmentAsync(isvId, licenseId, deviceLicenseAssignmentDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateAssignmentAsync");
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
| **deviceLicenseAssignmentDto** | [**DeviceLicenseAssignmentDto**](DeviceLicenseAssignmentDto.md)|  | |

### Return type

[**DeviceLicenseAssignmentDto**](DeviceLicenseAssignmentDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## updateAssignmentAsyncWithHttpInfo

> ApiResponse<DeviceLicenseAssignmentDto> updateAssignmentAsync updateAssignmentAsyncWithHttpInfo(isvId, licenseId, deviceLicenseAssignmentDto)

Updates a license assignment

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        DeviceLicenseAssignmentDto deviceLicenseAssignmentDto = new DeviceLicenseAssignmentDto(); // DeviceLicenseAssignmentDto | 
        try {
            ApiResponse<DeviceLicenseAssignmentDto> response = apiInstance.updateAssignmentAsyncWithHttpInfo(isvId, licenseId, deviceLicenseAssignmentDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateAssignmentAsync");
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
| **licenseId** | **UUID**|  | |
| **deviceLicenseAssignmentDto** | [**DeviceLicenseAssignmentDto**](DeviceLicenseAssignmentDto.md)|  | |

### Return type

ApiResponse<[**DeviceLicenseAssignmentDto**](DeviceLicenseAssignmentDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## updateLicense

> LicenseDto updateLicense(isvId, licenseDto, applyTemplateProperties)

Updates a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseDto licenseDto = new LicenseDto(); // LicenseDto | 
        Boolean applyTemplateProperties = true; // Boolean | Set to true to apply template values for any missing properties.
        try {
            LicenseDto result = apiInstance.updateLicense(isvId, licenseDto, applyTemplateProperties);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicense");
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
| **licenseDto** | [**LicenseDto**](LicenseDto.md)|  | |
| **applyTemplateProperties** | **Boolean**| Set to true to apply template values for any missing properties. | [optional] |

### Return type

[**LicenseDto**](LicenseDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## updateLicenseWithHttpInfo

> ApiResponse<LicenseDto> updateLicense updateLicenseWithHttpInfo(isvId, licenseDto, applyTemplateProperties)

Updates a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseDto licenseDto = new LicenseDto(); // LicenseDto | 
        Boolean applyTemplateProperties = true; // Boolean | Set to true to apply template values for any missing properties.
        try {
            ApiResponse<LicenseDto> response = apiInstance.updateLicenseWithHttpInfo(isvId, licenseDto, applyTemplateProperties);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicense");
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
| **licenseDto** | [**LicenseDto**](LicenseDto.md)|  | |
| **applyTemplateProperties** | **Boolean**| Set to true to apply template values for any missing properties. | [optional] |

### Return type

ApiResponse<[**LicenseDto**](LicenseDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## updateLicenseTagAssignments

> List<ItemTagAssignmentDto> updateLicenseTagAssignments(isvId, licenseId, itemTagAssignmentDto)

Updates the tags of a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        List<ItemTagAssignmentDto> itemTagAssignmentDto = Arrays.asList(); // List<ItemTagAssignmentDto> | 
        try {
            List<ItemTagAssignmentDto> result = apiInstance.updateLicenseTagAssignments(isvId, licenseId, itemTagAssignmentDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseTagAssignments");
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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## updateLicenseTagAssignmentsWithHttpInfo

> ApiResponse<List<ItemTagAssignmentDto>> updateLicenseTagAssignments updateLicenseTagAssignmentsWithHttpInfo(isvId, licenseId, itemTagAssignmentDto)

Updates the tags of a license

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        List<ItemTagAssignmentDto> itemTagAssignmentDto = Arrays.asList(); // List<ItemTagAssignmentDto> | 
        try {
            ApiResponse<List<ItemTagAssignmentDto>> response = apiInstance.updateLicenseTagAssignmentsWithHttpInfo(isvId, licenseId, itemTagAssignmentDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseTagAssignments");
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
| **licenseId** | **UUID**|  | |
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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## updateLicenseType

> LicenseTypeDto updateLicenseType(isvId, licenseTypeDto)

Updates a license type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseTypeDto licenseTypeDto = new LicenseTypeDto(); // LicenseTypeDto | 
        try {
            LicenseTypeDto result = apiInstance.updateLicenseType(isvId, licenseTypeDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseType");
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
| **licenseTypeDto** | [**LicenseTypeDto**](LicenseTypeDto.md)|  | |

### Return type

[**LicenseTypeDto**](LicenseTypeDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |

## updateLicenseTypeWithHttpInfo

> ApiResponse<LicenseTypeDto> updateLicenseType updateLicenseTypeWithHttpInfo(isvId, licenseTypeDto)

Updates a license type

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        LicenseTypeDto licenseTypeDto = new LicenseTypeDto(); // LicenseTypeDto | 
        try {
            ApiResponse<LicenseTypeDto> response = apiInstance.updateLicenseTypeWithHttpInfo(isvId, licenseTypeDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseType");
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
| **licenseTypeDto** | [**LicenseTypeDto**](LicenseTypeDto.md)|  | |

### Return type

ApiResponse<[**LicenseTypeDto**](LicenseTypeDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |


## updateLicenseUserAsync

> LicenseUserDto updateLicenseUserAsync(isvId, licenseId, licenseUserDto)

Updates a license user

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String licenseId = "licenseId_example"; // String | 
        LicenseUserDto licenseUserDto = new LicenseUserDto(); // LicenseUserDto | 
        try {
            LicenseUserDto result = apiInstance.updateLicenseUserAsync(isvId, licenseId, licenseUserDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseUserAsync");
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
| **licenseId** | **String**|  | |
| **licenseUserDto** | [**LicenseUserDto**](LicenseUserDto.md)|  | |

### Return type

[**LicenseUserDto**](LicenseUserDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## updateLicenseUserAsyncWithHttpInfo

> ApiResponse<LicenseUserDto> updateLicenseUserAsync updateLicenseUserAsyncWithHttpInfo(isvId, licenseId, licenseUserDto)

Updates a license user

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        String licenseId = "licenseId_example"; // String | 
        LicenseUserDto licenseUserDto = new LicenseUserDto(); // LicenseUserDto | 
        try {
            ApiResponse<LicenseUserDto> response = apiInstance.updateLicenseUserAsyncWithHttpInfo(isvId, licenseId, licenseUserDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseUserAsync");
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
| **licenseId** | **String**|  | |
| **licenseUserDto** | [**LicenseUserDto**](LicenseUserDto.md)|  | |

### Return type

ApiResponse<[**LicenseUserDto**](LicenseUserDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |


## updateLicenseUserGroupAsync

> LicenseUserGroupDto updateLicenseUserGroupAsync(isvId, licenseId, licenseUserGroupDto)

Updates a license user group

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        LicenseUserGroupDto licenseUserGroupDto = new LicenseUserGroupDto(); // LicenseUserGroupDto | 
        try {
            LicenseUserGroupDto result = apiInstance.updateLicenseUserGroupAsync(isvId, licenseId, licenseUserGroupDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseUserGroupAsync");
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
| **licenseUserGroupDto** | [**LicenseUserGroupDto**](LicenseUserGroupDto.md)|  | |

### Return type

[**LicenseUserGroupDto**](LicenseUserGroupDto.md)


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

## updateLicenseUserGroupAsyncWithHttpInfo

> ApiResponse<LicenseUserGroupDto> updateLicenseUserGroupAsync updateLicenseUserGroupAsyncWithHttpInfo(isvId, licenseId, licenseUserGroupDto)

Updates a license user group

More information about &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360017647817-NAMED-USER-LICENSES\&quot;&gt;named user licenses&lt;/a&gt;

### Example

```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.ApiResponse;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.LicenseApi;

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

        LicenseApi apiInstance = new LicenseApi(defaultClient);
        UUID isvId = UUID.randomUUID(); // UUID | 
        UUID licenseId = UUID.randomUUID(); // UUID | 
        LicenseUserGroupDto licenseUserGroupDto = new LicenseUserGroupDto(); // LicenseUserGroupDto | 
        try {
            ApiResponse<LicenseUserGroupDto> response = apiInstance.updateLicenseUserGroupAsyncWithHttpInfo(isvId, licenseId, licenseUserGroupDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LicenseApi#updateLicenseUserGroupAsync");
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
| **licenseId** | **UUID**|  | |
| **licenseUserGroupDto** | [**LicenseUserGroupDto**](LicenseUserGroupDto.md)|  | |

### Return type

ApiResponse<[**LicenseUserGroupDto**](LicenseUserGroupDto.md)>


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
| **409** | Warning |  -  |
| **200** | Success |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |

