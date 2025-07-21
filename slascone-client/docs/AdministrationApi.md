# AdministrationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomList**](AdministrationApi.md#addCustomList) | **POST** /api/v2/isv/{isv_id}/administration/customlist | Adds a new custom list for the specified ISV. |
| [**customOperations**](AdministrationApi.md#customOperations) | **PUT** /api/v2/isv/{isv_id}/administration/customoperations | Executes custom operations for the specified ISV. |
| [**deleteCustomList**](AdministrationApi.md#deleteCustomList) | **DELETE** /api/v2/isv/{isv_id}/administration/customlist/{custom_list_id} | Deletes a custom list by its ID for the specified ISV. |
| [**deleteInactiveSessions**](AdministrationApi.md#deleteInactiveSessions) | **PUT** /api/v2/isv/{isv_id}/administration/deleteinactivesessions | Deletes inactive sessions for the specified ISV. |
| [**gatherAnalytics**](AdministrationApi.md#gatherAnalytics) | **PUT** /api/v2/isv/{isv_id}/administration/gatheranalytics | Gathers analytics by sending consumption heartbeats. |
| [**getAllCustomLists**](AdministrationApi.md#getAllCustomLists) | **GET** /api/v2/isv/{isv_id}/administration/customlist | Gets all custom lists for the specified ISV. |
| [**getBackupStorage**](AdministrationApi.md#getBackupStorage) | **GET** /api/v2/isv/{isv_id}/administration/backupstorage | Gets the backup storage configuration for the specified ISV. |
| [**getBackupStorageAccessToken**](AdministrationApi.md#getBackupStorageAccessToken) | **GET** /api/v2/isv/{isv_id}/administration/backupstorage/access_token | Gets a shared access token for the backup storage of the specified ISV. |
| [**getConfiguration**](AdministrationApi.md#getConfiguration) | **GET** /api/v2/isv/{isv_id}/administration/configuration | Gets the configuration for the specified ISV. |
| [**getCustomList**](AdministrationApi.md#getCustomList) | **GET** /api/v2/isv/{isv_id}/administration/customlist/{custom_list_id} | Gets a specific custom list by its ID for the specified ISV. |
| [**getLicenseSeats**](AdministrationApi.md#getLicenseSeats) | **GET** /api/v2/isv/{isv_id}/administration/licenseseats | Gets the number of license seats for the specified ISV and filter criteria. |
| [**getSlasconeLicenseInfo**](AdministrationApi.md#getSlasconeLicenseInfo) | **GET** /api/v2/isv/{isv_id}/administration/slasconelicenseinfo | Retrieve Slascone licensing state and license info |
| [**healthCheck**](AdministrationApi.md#healthCheck) | **GET** /api/v2/isv/{isv_id}/administration/healthcheck | Performs a health check for the specified ISV, including product and user role validation and migration. |
| [**initBackupStorage**](AdministrationApi.md#initBackupStorage) | **POST** /api/v2/isv/{isv_id}/administration/backupstorage/init | Initializes backup storage for the specified ISV, optionally for a specific customer and including inactive licenses. |
| [**migrateDatabase**](AdministrationApi.md#migrateDatabase) | **PUT** /api/v2/isv/{isv_id}/administration/migratedatabase | Migrates the database for the specified ISV. |
| [**patchConfiguration**](AdministrationApi.md#patchConfiguration) | **PATCH** /api/v2/isv/{isv_id}/administration/configuration | Updates the configuration for the specified ISV. |
| [**patchCustomList**](AdministrationApi.md#patchCustomList) | **PATCH** /api/v2/isv/{isv_id}/administration/customlist | Partially updates an existing custom list for the specified ISV. |
| [**signatureCheck**](AdministrationApi.md#signatureCheck) | **POST** /api/v2/isv/{isv_id}/administration/healthcheck/signaturecheck | Checks the validity of a signature for the specified ISV. |
| [**updateBackupStorage**](AdministrationApi.md#updateBackupStorage) | **PUT** /api/v2/isv/{isv_id}/administration/backupstorage | Updates the backup storage configuration for the specified ISV. |
| [**updateCustomList**](AdministrationApi.md#updateCustomList) | **PUT** /api/v2/isv/{isv_id}/administration/customlist | Updates an existing custom list for the specified ISV. |
| [**validateAlerts**](AdministrationApi.md#validateAlerts) | **PUT** /api/v2/isv/{isv_id}/administration/alert | Validates and sends alerts for licenses based on alert configuration. |
| [**validateAssignments**](AdministrationApi.md#validateAssignments) | **PUT** /api/v2/isv/{isv_id}/administration/autounassign | Automatically unassigns tokens based on inactivity for all products. |
| [**validateAssignmentsByProductId**](AdministrationApi.md#validateAssignmentsByProductId) | **PUT** /api/v2/isv/{isv_id}/administration/product/{product_id}/autounassign | Automatically unassigns tokens for a specific product based on inactivity. |
| [**validateConsumptionBalances**](AdministrationApi.md#validateConsumptionBalances) | **PUT** /api/v2/isv/{isv_id}/administration/consumptionbalance | Validates and updates consumption balances for the specified ISV. |
| [**validateHeartbeatGroups**](AdministrationApi.md#validateHeartbeatGroups) | **PUT** /api/v2/isv/{isv_id}/administration/validateheartbeatgroups | Validates heartbeat groups for the specified ISV. |
| [**validateLicenseExpirationDate**](AdministrationApi.md#validateLicenseExpirationDate) | **PUT** /api/v2/isv/{isv_id}/administration/validatelicensesexpirationdate | Validates license expiration dates, feature expiration, and license start dates. |
| [**validateSoftwareVersions**](AdministrationApi.md#validateSoftwareVersions) | **PUT** /api/v2/isv/{isv_id}/administration/validatesoftwareversions | Validates software versions for the specified ISV. |


<a id="addCustomList"></a>
# **addCustomList**
> CustomListDto addCustomList(isvId, customListDto)

Adds a new custom list for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    CustomListDto customListDto = new CustomListDto(); // CustomListDto | 
    try {
      CustomListDto result = apiInstance.addCustomList(isvId, customListDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#addCustomList");
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
| **customListDto** | [**CustomListDto**](CustomListDto.md)|  | |

### Return type

[**CustomListDto**](CustomListDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="customOperations"></a>
# **customOperations**
> customOperations(isvId)

Executes custom operations for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.customOperations(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#customOperations");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="deleteCustomList"></a>
# **deleteCustomList**
> deleteCustomList(isvId, customListId)

Deletes a custom list by its ID for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID customListId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteCustomList(isvId, customListId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#deleteCustomList");
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
| **customListId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **204** | No content |  -  |

<a id="deleteInactiveSessions"></a>
# **deleteInactiveSessions**
> deleteInactiveSessions(isvId)

Deletes inactive sessions for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteInactiveSessions(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#deleteInactiveSessions");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="gatherAnalytics"></a>
# **gatherAnalytics**
> gatherAnalytics(isvId)

Gathers analytics by sending consumption heartbeats.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.gatherAnalytics(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#gatherAnalytics");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="getAllCustomLists"></a>
# **getAllCustomLists**
> List&lt;CustomListDto&gt; getAllCustomLists(isvId)

Gets all custom lists for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      List<CustomListDto> result = apiInstance.getAllCustomLists(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getAllCustomLists");
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

[**List&lt;CustomListDto&gt;**](CustomListDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="getBackupStorage"></a>
# **getBackupStorage**
> BackupStorageDto getBackupStorage(isvId)

Gets the backup storage configuration for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      BackupStorageDto result = apiInstance.getBackupStorage(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getBackupStorage");
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

[**BackupStorageDto**](BackupStorageDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="getBackupStorageAccessToken"></a>
# **getBackupStorageAccessToken**
> String getBackupStorageAccessToken(isvId)

Gets a shared access token for the backup storage of the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    try {
      String result = apiInstance.getBackupStorageAccessToken(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getBackupStorageAccessToken");
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
| **isvId** | **UUID**| The ISV identifier. | |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Plain text |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="getConfiguration"></a>
# **getConfiguration**
> ConfigurationDto getConfiguration(isvId)

Gets the configuration for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    try {
      ConfigurationDto result = apiInstance.getConfiguration(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getConfiguration");
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
| **isvId** | **UUID**| The ISV identifier. | |

### Return type

[**ConfigurationDto**](ConfigurationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="getCustomList"></a>
# **getCustomList**
> CustomListDto getCustomList(isvId, customListId)

Gets a specific custom list by its ID for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID customListId = UUID.randomUUID(); // UUID | 
    try {
      CustomListDto result = apiInstance.getCustomList(isvId, customListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getCustomList");
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
| **customListId** | **UUID**|  | |

### Return type

[**CustomListDto**](CustomListDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **404** |  |  -  |

<a id="getLicenseSeats"></a>
# **getLicenseSeats**
> Integer getLicenseSeats(isvId, productId, templateIds, customerTypeIds, licenseTypeIds)

Gets the number of license seats for the specified ISV and filter criteria.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    UUID productId = UUID.randomUUID(); // UUID | The product identifier.
    List<UUID> templateIds = Arrays.asList(); // List<UUID> | The list of template identifiers.
    List<UUID> customerTypeIds = Arrays.asList(); // List<UUID> | The list of customer type identifiers.
    List<UUID> licenseTypeIds = Arrays.asList(); // List<UUID> | The list of license type identifiers.
    try {
      Integer result = apiInstance.getLicenseSeats(isvId, productId, templateIds, customerTypeIds, licenseTypeIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getLicenseSeats");
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
| **isvId** | **UUID**| The ISV identifier. | |
| **productId** | **UUID**| The product identifier. | [optional] |
| **templateIds** | [**List&lt;UUID&gt;**](UUID.md)| The list of template identifiers. | [optional] |
| **customerTypeIds** | [**List&lt;UUID&gt;**](UUID.md)| The list of customer type identifiers. | [optional] |
| **licenseTypeIds** | [**List&lt;UUID&gt;**](UUID.md)| The list of license type identifiers. | [optional] |

### Return type

**Integer**

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="getSlasconeLicenseInfo"></a>
# **getSlasconeLicenseInfo**
> SlasconeLicenseInfoDto getSlasconeLicenseInfo(isvId, forceSendHeartbeat)

Retrieve Slascone licensing state and license info

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    Boolean forceSendHeartbeat = true; // Boolean | 
    try {
      SlasconeLicenseInfoDto result = apiInstance.getSlasconeLicenseInfo(isvId, forceSendHeartbeat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#getSlasconeLicenseInfo");
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
| **forceSendHeartbeat** | **Boolean**|  | [optional] |

### Return type

[**SlasconeLicenseInfoDto**](SlasconeLicenseInfoDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="healthCheck"></a>
# **healthCheck**
> String healthCheck(isvId)

Performs a health check for the specified ISV, including product and user role validation and migration.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    try {
      String result = apiInstance.healthCheck(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#healthCheck");
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
| **isvId** | **UUID**| The ISV identifier. | |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Plain text |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="initBackupStorage"></a>
# **initBackupStorage**
> String initBackupStorage(isvId, customerId, includeInactive)

Initializes backup storage for the specified ISV, optionally for a specific customer and including inactive licenses.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    String customerId = "customerId_example"; // String | The customer identifier or customer number (optional).
    Boolean includeInactive = true; // Boolean | Whether to include inactive licenses (optional).
    try {
      String result = apiInstance.initBackupStorage(isvId, customerId, includeInactive);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#initBackupStorage");
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
| **isvId** | **UUID**| The ISV identifier. | |
| **customerId** | **String**| The customer identifier or customer number (optional). | [optional] |
| **includeInactive** | **Boolean**| Whether to include inactive licenses (optional). | [optional] |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Plain text |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="migrateDatabase"></a>
# **migrateDatabase**
> migrateDatabase(isvId)

Migrates the database for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.migrateDatabase(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#migrateDatabase");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="patchConfiguration"></a>
# **patchConfiguration**
> ConfigurationDto patchConfiguration(isvId, configurationDto)

Updates the configuration for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    ConfigurationDto configurationDto = new ConfigurationDto(); // ConfigurationDto | The configuration data transfer object.
    try {
      ConfigurationDto result = apiInstance.patchConfiguration(isvId, configurationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#patchConfiguration");
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
| **isvId** | **UUID**| The ISV identifier. | |
| **configurationDto** | [**ConfigurationDto**](ConfigurationDto.md)| The configuration data transfer object. | |

### Return type

[**ConfigurationDto**](ConfigurationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="patchCustomList"></a>
# **patchCustomList**
> CustomListDto patchCustomList(isvId, customListDto)

Partially updates an existing custom list for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    CustomListDto customListDto = new CustomListDto(); // CustomListDto | 
    try {
      CustomListDto result = apiInstance.patchCustomList(isvId, customListDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#patchCustomList");
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
| **customListDto** | [**CustomListDto**](CustomListDto.md)|  | |

### Return type

[**CustomListDto**](CustomListDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **404** | Not found |  -  |

<a id="signatureCheck"></a>
# **signatureCheck**
> String signatureCheck(isvId, body)

Checks the validity of a signature for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    String body = "body_example"; // String | The signature to check.
    try {
      String result = apiInstance.signatureCheck(isvId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#signatureCheck");
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
| **isvId** | **UUID**| The ISV identifier. | |
| **body** | **String**| The signature to check. | |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Plain text |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="updateBackupStorage"></a>
# **updateBackupStorage**
> BackupStorageDto updateBackupStorage(isvId, backupStorageDto)

Updates the backup storage configuration for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    BackupStorageDto backupStorageDto = new BackupStorageDto(); // BackupStorageDto | 
    try {
      BackupStorageDto result = apiInstance.updateBackupStorage(isvId, backupStorageDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#updateBackupStorage");
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
| **backupStorageDto** | [**BackupStorageDto**](BackupStorageDto.md)|  | |

### Return type

[**BackupStorageDto**](BackupStorageDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="updateCustomList"></a>
# **updateCustomList**
> CustomListDto updateCustomList(isvId, customListDto)

Updates an existing custom list for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    CustomListDto customListDto = new CustomListDto(); // CustomListDto | 
    try {
      CustomListDto result = apiInstance.updateCustomList(isvId, customListDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#updateCustomList");
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
| **customListDto** | [**CustomListDto**](CustomListDto.md)|  | |

### Return type

[**CustomListDto**](CustomListDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |
| **404** | Not found |  -  |

<a id="validateAlerts"></a>
# **validateAlerts**
> validateAlerts(isvId)

Validates and sends alerts for licenses based on alert configuration.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.validateAlerts(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateAlerts");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="validateAssignments"></a>
# **validateAssignments**
> validateAssignments(isvId)

Automatically unassigns tokens based on inactivity for all products.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.validateAssignments(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateAssignments");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="validateAssignmentsByProductId"></a>
# **validateAssignmentsByProductId**
> validateAssignmentsByProductId(isvId, productId, validateAssignmentsDto)

Automatically unassigns tokens for a specific product based on inactivity.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    ValidateAssignmentsDto validateAssignmentsDto = new ValidateAssignmentsDto(); // ValidateAssignmentsDto | 
    try {
      apiInstance.validateAssignmentsByProductId(isvId, productId, validateAssignmentsDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateAssignmentsByProductId");
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
| **productId** | **UUID**|  | |
| **validateAssignmentsDto** | [**ValidateAssignmentsDto**](ValidateAssignmentsDto.md)|  | |

### Return type

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="validateConsumptionBalances"></a>
# **validateConsumptionBalances**
> validateConsumptionBalances(isvId)

Validates and updates consumption balances for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.validateConsumptionBalances(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateConsumptionBalances");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="validateHeartbeatGroups"></a>
# **validateHeartbeatGroups**
> validateHeartbeatGroups(isvId)

Validates heartbeat groups for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.validateHeartbeatGroups(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateHeartbeatGroups");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="validateLicenseExpirationDate"></a>
# **validateLicenseExpirationDate**
> validateLicenseExpirationDate(isvId)

Validates license expiration dates, feature expiration, and license start dates.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.validateLicenseExpirationDate(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateLicenseExpirationDate");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

<a id="validateSoftwareVersions"></a>
# **validateSoftwareVersions**
> validateSoftwareVersions(isvId)

Validates software versions for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.AdministrationApi;

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

    // Configure API key authorization: DaemonKey
    ApiKeyAuth DaemonKey = (ApiKeyAuth) defaultClient.getAuthentication("DaemonKey");
    DaemonKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //DaemonKey.setApiKeyPrefix("Token");

    AdministrationApi apiInstance = new AdministrationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.validateSoftwareVersions(isvId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdministrationApi#validateSoftwareVersions");
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

null (empty response body)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer), [DaemonKey](../README.md#DaemonKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |
| **409** | Conflict |  -  |

