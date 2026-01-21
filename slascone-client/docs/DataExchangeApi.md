# DataExchangeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomerAsync**](DataExchangeApi.md#addCustomerAsync) | **POST** /api/v2/isv/{isv_id}/data_exchange/customers | Creates a customer |
| [**addLicenseAsync**](DataExchangeApi.md#addLicenseAsync) | **POST** /api/v2/isv/{isv_id}/data_exchange/licenses/by_template | Creates a license based on an edition (template) |
| [**addLicenseByDetailsAsync**](DataExchangeApi.md#addLicenseByDetailsAsync) | **POST** /api/v2/isv/{isv_id}/data_exchange/licenses | Creates a license allowing to define all feature/variable/limitation values |
| [**addOrUpdateCustomerContactAsync**](DataExchangeApi.md#addOrUpdateCustomerContactAsync) | **PUT** /api/v2/isv/{isv_id}/data_exchange/customers/contacts | Creates a customer contact |
| [**downloadCustomerCsvTemplate**](DataExchangeApi.md#downloadCustomerCsvTemplate) | **GET** /api/v2/isv/{isv_id}/data_exchange/customers/download_csv | Downloads a csv customer file template |
| [**downloadLicenseCsvTemplate**](DataExchangeApi.md#downloadLicenseCsvTemplate) | **GET** /api/v2/isv/{isv_id}/data_exchange/licenses/download_csv | Downloads a csv license file template |
| [**importCustomersFromCsv**](DataExchangeApi.md#importCustomersFromCsv) | **POST** /api/v2/isv/{isv_id}/data_exchange/customers/import_csv | Imports a csv customer file |
| [**importLicensesFromCsv**](DataExchangeApi.md#importLicensesFromCsv) | **POST** /api/v2/isv/{isv_id}/data_exchange/licenses/import_csv | Imports a csv license file |
| [**patchLicenseByDetailsAsync**](DataExchangeApi.md#patchLicenseByDetailsAsync) | **PATCH** /api/v2/isv/{isv_id}/data_exchange/licenses | Updates a license allowing to define all feature/variable/limitation values |
| [**updateCustomerAsync**](DataExchangeApi.md#updateCustomerAsync) | **PATCH** /api/v2/isv/{isv_id}/data_exchange/customers | Updates a customer |
| [**updateLicenseAsync**](DataExchangeApi.md#updateLicenseAsync) | **PATCH** /api/v2/isv/{isv_id}/data_exchange/licenses/by_template | Updates a license based on an edition (template) |
| [**updateLicenseByDetailsAsync**](DataExchangeApi.md#updateLicenseByDetailsAsync) | **PUT** /api/v2/isv/{isv_id}/data_exchange/licenses | Updates a license allowing to define all feature/variable/limitation values |


<a id="addCustomerAsync"></a>
# **addCustomerAsync**
> CustomerDto addCustomerAsync(isvId, dataExchangeAddCustomerDto)

Creates a customer

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM\&quot;&gt;More Information&lt;/a&gt;

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    DataExchangeAddCustomerDto dataExchangeAddCustomerDto = new DataExchangeAddCustomerDto(); // DataExchangeAddCustomerDto | 
    try {
      CustomerDto result = apiInstance.addCustomerAsync(isvId, dataExchangeAddCustomerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#addCustomerAsync");
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
| **dataExchangeAddCustomerDto** | [**DataExchangeAddCustomerDto**](DataExchangeAddCustomerDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="addLicenseAsync"></a>
# **addLicenseAsync**
> UUID addLicenseAsync(isvId, dataExchangeAddLicenseDto)

Creates a license based on an edition (template)

Check the &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM/\&quot;&gt;documentation&lt;/a&gt; for more details.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    DataExchangeAddLicenseDto dataExchangeAddLicenseDto = new DataExchangeAddLicenseDto(); // DataExchangeAddLicenseDto | 
    try {
      UUID result = apiInstance.addLicenseAsync(isvId, dataExchangeAddLicenseDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#addLicenseAsync");
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
| **dataExchangeAddLicenseDto** | [**DataExchangeAddLicenseDto**](DataExchangeAddLicenseDto.md)|  | |

### Return type

[**UUID**](UUID.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

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

<a id="addLicenseByDetailsAsync"></a>
# **addLicenseByDetailsAsync**
> UUID addLicenseByDetailsAsync(isvId, licenseImportByDetailsDto)

Creates a license allowing to define all feature/variable/limitation values

Check the &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM/\&quot;&gt;documentation&lt;/a&gt; for more details.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    LicenseImportByDetailsDto licenseImportByDetailsDto = new LicenseImportByDetailsDto(); // LicenseImportByDetailsDto | 
    try {
      UUID result = apiInstance.addLicenseByDetailsAsync(isvId, licenseImportByDetailsDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#addLicenseByDetailsAsync");
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
| **licenseImportByDetailsDto** | [**LicenseImportByDetailsDto**](LicenseImportByDetailsDto.md)|  | |

### Return type

[**UUID**](UUID.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

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

<a id="addOrUpdateCustomerContactAsync"></a>
# **addOrUpdateCustomerContactAsync**
> CustomerContactDto addOrUpdateCustomerContactAsync(isvId, dataExchangeAddOrUpdateCustomerContactDto)

Creates a customer contact

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    DataExchangeAddOrUpdateCustomerContactDto dataExchangeAddOrUpdateCustomerContactDto = new DataExchangeAddOrUpdateCustomerContactDto(); // DataExchangeAddOrUpdateCustomerContactDto | 
    try {
      CustomerContactDto result = apiInstance.addOrUpdateCustomerContactAsync(isvId, dataExchangeAddOrUpdateCustomerContactDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#addOrUpdateCustomerContactAsync");
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
| **dataExchangeAddOrUpdateCustomerContactDto** | [**DataExchangeAddOrUpdateCustomerContactDto**](DataExchangeAddOrUpdateCustomerContactDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="downloadCustomerCsvTemplate"></a>
# **downloadCustomerCsvTemplate**
> File downloadCustomerCsvTemplate(isvId)

Downloads a csv customer file template

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.downloadCustomerCsvTemplate(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#downloadCustomerCsvTemplate");
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

[**File**](File.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="downloadLicenseCsvTemplate"></a>
# **downloadLicenseCsvTemplate**
> File downloadLicenseCsvTemplate(isvId)

Downloads a csv license file template

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.downloadLicenseCsvTemplate(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#downloadLicenseCsvTemplate");
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

[**File**](File.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="importCustomersFromCsv"></a>
# **importCustomersFromCsv**
> ImportResultDto importCustomersFromCsv(isvId, delimiter, overwriteExisting, resumeOnError, _file)

Imports a csv customer file

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    String delimiter = "delimiter_example"; // String | 
    Boolean overwriteExisting = true; // Boolean | 
    Boolean resumeOnError = true; // Boolean | 
    File _file = new File("/path/to/file"); // File | 
    try {
      ImportResultDto result = apiInstance.importCustomersFromCsv(isvId, delimiter, overwriteExisting, resumeOnError, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#importCustomersFromCsv");
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
| **delimiter** | **String**|  | [optional] |
| **overwriteExisting** | **Boolean**|  | [optional] |
| **resumeOnError** | **Boolean**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**ImportResultDto**](ImportResultDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a id="importLicensesFromCsv"></a>
# **importLicensesFromCsv**
> ImportResultDto importLicensesFromCsv(isvId, productId, delimiter, resumeOnError, _file)

Imports a csv license file

&lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    UUID productId = UUID.randomUUID(); // UUID | 
    String delimiter = "delimiter_example"; // String | 
    Boolean resumeOnError = true; // Boolean | 
    File _file = new File("/path/to/file"); // File | 
    try {
      ImportResultDto result = apiInstance.importLicensesFromCsv(isvId, productId, delimiter, resumeOnError, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#importLicensesFromCsv");
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
| **delimiter** | **String**|  | [optional] |
| **resumeOnError** | **Boolean**|  | [optional] |
| **_file** | **File**|  | [optional] |

### Return type

[**ImportResultDto**](ImportResultDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a id="patchLicenseByDetailsAsync"></a>
# **patchLicenseByDetailsAsync**
> UUID patchLicenseByDetailsAsync(isvId, licenseImportByDetailsPatchDto)

Updates a license allowing to define all feature/variable/limitation values

Check the &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM/\&quot;&gt;documentation&lt;/a&gt; for more details.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    LicenseImportByDetailsPatchDto licenseImportByDetailsPatchDto = new LicenseImportByDetailsPatchDto(); // LicenseImportByDetailsPatchDto | 
    try {
      UUID result = apiInstance.patchLicenseByDetailsAsync(isvId, licenseImportByDetailsPatchDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#patchLicenseByDetailsAsync");
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
| **licenseImportByDetailsPatchDto** | [**LicenseImportByDetailsPatchDto**](LicenseImportByDetailsPatchDto.md)|  | |

### Return type

[**UUID**](UUID.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

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

<a id="updateCustomerAsync"></a>
# **updateCustomerAsync**
> CustomerDto updateCustomerAsync(isvId, dataExchangeUpdateCustomerDto)

Updates a customer

Based on customer_number &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM\&quot;&gt;More Information&lt;/a&gt;.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    DataExchangeUpdateCustomerDto dataExchangeUpdateCustomerDto = new DataExchangeUpdateCustomerDto(); // DataExchangeUpdateCustomerDto | 
    try {
      CustomerDto result = apiInstance.updateCustomerAsync(isvId, dataExchangeUpdateCustomerDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#updateCustomerAsync");
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
| **dataExchangeUpdateCustomerDto** | [**DataExchangeUpdateCustomerDto**](DataExchangeUpdateCustomerDto.md)|  | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Warning |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateLicenseAsync"></a>
# **updateLicenseAsync**
> UUID updateLicenseAsync(isvId, dataExchangeUpdateLicenseDto)

Updates a license based on an edition (template)

Check the &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM/\&quot;&gt;documentation&lt;/a&gt; for more details.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    DataExchangeUpdateLicenseDto dataExchangeUpdateLicenseDto = new DataExchangeUpdateLicenseDto(); // DataExchangeUpdateLicenseDto | 
    try {
      UUID result = apiInstance.updateLicenseAsync(isvId, dataExchangeUpdateLicenseDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#updateLicenseAsync");
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
| **dataExchangeUpdateLicenseDto** | [**DataExchangeUpdateLicenseDto**](DataExchangeUpdateLicenseDto.md)|  | |

### Return type

[**UUID**](UUID.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

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

<a id="updateLicenseByDetailsAsync"></a>
# **updateLicenseByDetailsAsync**
> UUID updateLicenseByDetailsAsync(isvId, licenseImportByDetailsPutDto)

Updates a license allowing to define all feature/variable/limitation values

Check the &lt;a href&#x3D;\&quot;https://support.slascone.com/hc/en-us/articles/360016150778-IMPORTING-DATA-FROM-YOUR-ERP-CRM\&quot;&gt;documentation&lt;/a&gt; for more details.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.DataExchangeApi;

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

    DataExchangeApi apiInstance = new DataExchangeApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | 
    LicenseImportByDetailsPutDto licenseImportByDetailsPutDto = new LicenseImportByDetailsPutDto(); // LicenseImportByDetailsPutDto | 
    try {
      UUID result = apiInstance.updateLicenseByDetailsAsync(isvId, licenseImportByDetailsPutDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExchangeApi#updateLicenseByDetailsAsync");
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
| **licenseImportByDetailsPutDto** | [**LicenseImportByDetailsPutDto**](LicenseImportByDetailsPutDto.md)|  | |

### Return type

[**UUID**](UUID.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

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

