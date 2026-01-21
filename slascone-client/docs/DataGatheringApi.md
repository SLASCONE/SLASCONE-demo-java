# DataGatheringApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAnalyticalHeartbeat**](DataGatheringApi.md#addAnalyticalHeartbeat) | **POST** /api/v2/isv/{isv_id}/data_gathering/analytical_heartbeats | Creates an analytical heartbeat |
| [**addConsumptionHeartbeat**](DataGatheringApi.md#addConsumptionHeartbeat) | **POST** /api/v2/isv/{isv_id}/data_gathering/consumption_heartbeats | Creates a consumption heartbeat |
| [**addUsageHeartbeat**](DataGatheringApi.md#addUsageHeartbeat) | **POST** /api/v2/isv/{isv_id}/data_gathering/usage_heartbeats | Creates a usage heartbeat |
| [**addUsageHeartbeatByName**](DataGatheringApi.md#addUsageHeartbeatByName) | **POST** /api/v2/isv/{isv_id}/data_gathering/usage_heartbeats_by_name | Creates a usage heartbeat (alternative method based on the feature&#39;s name instead of its Id) |
| [**rollbackConsumptionHeartbeat**](DataGatheringApi.md#rollbackConsumptionHeartbeat) | **POST** /api/v2/isv/{isv_id}/data_gathering/consumption_heartbeats/rollback | Rollbacks a consumption heartbeat |


<a id="addAnalyticalHeartbeat"></a>
# **addAnalyticalHeartbeat**
> String addAnalyticalHeartbeat(isvId, analyticalHeartbeatDto)

Creates an analytical heartbeat

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016055537-PRODUCT-ANALYTICS\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataGatheringApi;

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

    DataGatheringApi apiInstance = new DataGatheringApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    AnalyticalHeartbeatDto analyticalHeartbeatDto = new AnalyticalHeartbeatDto(); // AnalyticalHeartbeatDto | 
    try {
      String result = apiInstance.addAnalyticalHeartbeat(isvId, analyticalHeartbeatDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataGatheringApi#addAnalyticalHeartbeat");
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
| **analyticalHeartbeatDto** | [**AnalyticalHeartbeatDto**](AnalyticalHeartbeatDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addConsumptionHeartbeat"></a>
# **addConsumptionHeartbeat**
> List&lt;ConsumptionDto&gt; addConsumptionHeartbeat(isvId, fullConsumptionHeartbeatDto)

Creates a consumption heartbeat

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016057197-CONSUMPTION-BASED-LIMITATIONS\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataGatheringApi;

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

    DataGatheringApi apiInstance = new DataGatheringApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    FullConsumptionHeartbeatDto fullConsumptionHeartbeatDto = new FullConsumptionHeartbeatDto(); // FullConsumptionHeartbeatDto | 
    try {
      List<ConsumptionDto> result = apiInstance.addConsumptionHeartbeat(isvId, fullConsumptionHeartbeatDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataGatheringApi#addConsumptionHeartbeat");
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
| **fullConsumptionHeartbeatDto** | [**FullConsumptionHeartbeatDto**](FullConsumptionHeartbeatDto.md)|  | |

### Return type

[**List&lt;ConsumptionDto&gt;**](ConsumptionDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [ProvisioningKey](../README.md#ProvisioningKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addUsageHeartbeat"></a>
# **addUsageHeartbeat**
> String addUsageHeartbeat(isvId, fullUsageHeartbeatDto)

Creates a usage heartbeat

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016055537-PRODUCT-ANALYTICS\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataGatheringApi;

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

    DataGatheringApi apiInstance = new DataGatheringApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    FullUsageHeartbeatDto fullUsageHeartbeatDto = new FullUsageHeartbeatDto(); // FullUsageHeartbeatDto | 
    try {
      String result = apiInstance.addUsageHeartbeat(isvId, fullUsageHeartbeatDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataGatheringApi#addUsageHeartbeat");
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
| **fullUsageHeartbeatDto** | [**FullUsageHeartbeatDto**](FullUsageHeartbeatDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addUsageHeartbeatByName"></a>
# **addUsageHeartbeatByName**
> String addUsageHeartbeatByName(isvId, fullUsageHeartbeatByNameDto)

Creates a usage heartbeat (alternative method based on the feature&#39;s name instead of its Id)

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016055537-PRODUCT-ANALYTICS\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataGatheringApi;

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

    DataGatheringApi apiInstance = new DataGatheringApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    FullUsageHeartbeatByNameDto fullUsageHeartbeatByNameDto = new FullUsageHeartbeatByNameDto(); // FullUsageHeartbeatByNameDto | 
    try {
      String result = apiInstance.addUsageHeartbeatByName(isvId, fullUsageHeartbeatByNameDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataGatheringApi#addUsageHeartbeatByName");
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
| **fullUsageHeartbeatByNameDto** | [**FullUsageHeartbeatByNameDto**](FullUsageHeartbeatByNameDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="rollbackConsumptionHeartbeat"></a>
# **rollbackConsumptionHeartbeat**
> ConsumptionDto rollbackConsumptionHeartbeat(isvId, consumptionTransactionDto)

Rollbacks a consumption heartbeat

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016057197-CONSUMPTION-BASED-LIMITATIONS\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataGatheringApi;

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

    DataGatheringApi apiInstance = new DataGatheringApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    ConsumptionTransactionDto consumptionTransactionDto = new ConsumptionTransactionDto(); // ConsumptionTransactionDto | 
    try {
      ConsumptionDto result = apiInstance.rollbackConsumptionHeartbeat(isvId, consumptionTransactionDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataGatheringApi#rollbackConsumptionHeartbeat");
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
| **consumptionTransactionDto** | [**ConsumptionTransactionDto**](ConsumptionTransactionDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

