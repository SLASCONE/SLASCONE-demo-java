# NotificationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserEmailTemplate**](NotificationApi.md#addUserEmailTemplate) | **POST** /api/v2/isv/{isv_id}/notifications/useremailtemplates | Adds a new user email template for the specified ISV. |
| [**deleteUserEmailTemplate**](NotificationApi.md#deleteUserEmailTemplate) | **DELETE** /api/v2/isv/{isv_id}/notifications/useremailtemplates/{email_template_id} | Deletes a user email template for the specified ISV. |
| [**getAllUserEmailTemplates**](NotificationApi.md#getAllUserEmailTemplates) | **GET** /api/v2/isv/{isv_id}/notifications/useremailtemplates | Gets all user email templates for the specified ISV. |
| [**getNotificationSettings**](NotificationApi.md#getNotificationSettings) | **GET** /api/v2/isv/{isv_id}/notifications/configurations | Gets the current email notification settings for the specified ISV. |
| [**getUserEmailTemplate**](NotificationApi.md#getUserEmailTemplate) | **GET** /api/v2/isv/{isv_id}/notifications/useremailtemplates/{email_template_id} | Gets a specific user email template by its identifier. |
| [**getUserEmailTemplatesByPurpose**](NotificationApi.md#getUserEmailTemplatesByPurpose) | **GET** /api/v2/isv/{isv_id}/notifications/useremailtemplates/purpose/{purpose} | Gets user email templates by their purpose. |
| [**patchUserEmailTemplate**](NotificationApi.md#patchUserEmailTemplate) | **PATCH** /api/v2/isv/{isv_id}/notifications/useremailtemplates/{email_template_id} | Partially updates a user email template for the specified ISV. |
| [**sendLicenseMail**](NotificationApi.md#sendLicenseMail) | **POST** /api/v2/isv/{isv_id}/notifications/emails | Sends a license-related email using the specified template and recipients. |
| [**sendTestEmail**](NotificationApi.md#sendTestEmail) | **GET** /api/v2/isv/{isv_id}/notifications/configurations/tests | Sends a test email to verify the email configuration for the specified ISV. |
| [**updateNotificationSettings**](NotificationApi.md#updateNotificationSettings) | **POST** /api/v2/isv/{isv_id}/notifications/configurations | Updates the email notification settings for the specified ISV. |
| [**updateUserEmailTemplate**](NotificationApi.md#updateUserEmailTemplate) | **PUT** /api/v2/isv/{isv_id}/notifications/useremailtemplates | Updates an existing user email template for the specified ISV. |


<a id="addUserEmailTemplate"></a>
# **addUserEmailTemplate**
> UserEmailTemplateDto addUserEmailTemplate(isvId, userEmailTemplateDto)

Adds a new user email template for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    UserEmailTemplateDto userEmailTemplateDto = new UserEmailTemplateDto(); // UserEmailTemplateDto | The user email template to add.
    try {
      UserEmailTemplateDto result = apiInstance.addUserEmailTemplate(isvId, userEmailTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#addUserEmailTemplate");
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
| **userEmailTemplateDto** | [**UserEmailTemplateDto**](UserEmailTemplateDto.md)| The user email template to add. | |

### Return type

[**UserEmailTemplateDto**](UserEmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="deleteUserEmailTemplate"></a>
# **deleteUserEmailTemplate**
> deleteUserEmailTemplate(isvId, emailTemplateId)

Deletes a user email template for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    UUID emailTemplateId = UUID.randomUUID(); // UUID | The email template identifier.
    try {
      apiInstance.deleteUserEmailTemplate(isvId, emailTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#deleteUserEmailTemplate");
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
| **emailTemplateId** | **UUID**| The email template identifier. | |

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
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getAllUserEmailTemplates"></a>
# **getAllUserEmailTemplates**
> List&lt;UserEmailTemplateDto&gt; getAllUserEmailTemplates(isvId)

Gets all user email templates for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    try {
      List<UserEmailTemplateDto> result = apiInstance.getAllUserEmailTemplates(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#getAllUserEmailTemplates");
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

[**List&lt;UserEmailTemplateDto&gt;**](UserEmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getNotificationSettings"></a>
# **getNotificationSettings**
> EmailConfigurationDto getNotificationSettings(isvId)

Gets the current email notification settings for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    try {
      EmailConfigurationDto result = apiInstance.getNotificationSettings(isvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#getNotificationSettings");
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

[**EmailConfigurationDto**](EmailConfigurationDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getUserEmailTemplate"></a>
# **getUserEmailTemplate**
> UserEmailTemplateDto getUserEmailTemplate(isvId, emailTemplateId)

Gets a specific user email template by its identifier.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    UUID emailTemplateId = UUID.randomUUID(); // UUID | The email template identifier.
    try {
      UserEmailTemplateDto result = apiInstance.getUserEmailTemplate(isvId, emailTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#getUserEmailTemplate");
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
| **emailTemplateId** | **UUID**| The email template identifier. | |

### Return type

[**UserEmailTemplateDto**](UserEmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="getUserEmailTemplatesByPurpose"></a>
# **getUserEmailTemplatesByPurpose**
> List&lt;UserEmailTemplateDto&gt; getUserEmailTemplatesByPurpose(isvId, purpose)

Gets user email templates by their purpose.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    String purpose = "purpose_example"; // String | The purpose of the email templates.
    try {
      List<UserEmailTemplateDto> result = apiInstance.getUserEmailTemplatesByPurpose(isvId, purpose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#getUserEmailTemplatesByPurpose");
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
| **purpose** | **String**| The purpose of the email templates. | |

### Return type

[**List&lt;UserEmailTemplateDto&gt;**](UserEmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="patchUserEmailTemplate"></a>
# **patchUserEmailTemplate**
> UserEmailTemplateDto patchUserEmailTemplate(isvId, emailTemplateId, userEmailTemplateDto)

Partially updates a user email template for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    UUID emailTemplateId = UUID.randomUUID(); // UUID | The email template identifier.
    UserEmailTemplateDto userEmailTemplateDto = new UserEmailTemplateDto(); // UserEmailTemplateDto | The user email template with updated fields.
    try {
      UserEmailTemplateDto result = apiInstance.patchUserEmailTemplate(isvId, emailTemplateId, userEmailTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#patchUserEmailTemplate");
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
| **emailTemplateId** | **UUID**| The email template identifier. | |
| **userEmailTemplateDto** | [**UserEmailTemplateDto**](UserEmailTemplateDto.md)| The user email template with updated fields. | |

### Return type

[**UserEmailTemplateDto**](UserEmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="sendLicenseMail"></a>
# **sendLicenseMail**
> String sendLicenseMail(isvId, licenseMailDto)

Sends a license-related email using the specified template and recipients.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    LicenseMailDto licenseMailDto = new LicenseMailDto(); // LicenseMailDto | The license mail details including template and recipients.
    try {
      String result = apiInstance.sendLicenseMail(isvId, licenseMailDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#sendLicenseMail");
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
| **licenseMailDto** | [**LicenseMailDto**](LicenseMailDto.md)| The license mail details including template and recipients. | |

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
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="sendTestEmail"></a>
# **sendTestEmail**
> String sendTestEmail(isvId, toEmail)

Sends a test email to verify the email configuration for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    String toEmail = "toEmail_example"; // String | The recipient email address.
    try {
      String result = apiInstance.sendTestEmail(isvId, toEmail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#sendTestEmail");
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
| **toEmail** | **String**| The recipient email address. | [optional] |

### Return type

**String**

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateNotificationSettings"></a>
# **updateNotificationSettings**
> String updateNotificationSettings(isvId, emailConfigurationDto)

Updates the email notification settings for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    EmailConfigurationDto emailConfigurationDto = new EmailConfigurationDto(); // EmailConfigurationDto | The email configuration settings.
    try {
      String result = apiInstance.updateNotificationSettings(isvId, emailConfigurationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#updateNotificationSettings");
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
| **emailConfigurationDto** | [**EmailConfigurationDto**](EmailConfigurationDto.md)| The email configuration settings. | |

### Return type

**String**

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
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

<a id="updateUserEmailTemplate"></a>
# **updateUserEmailTemplate**
> UserEmailTemplateDto updateUserEmailTemplate(isvId, userEmailTemplateDto)

Updates an existing user email template for the specified ISV.

### Example
```java
// Import classes:
import com.slascone.ApiClient;
import com.slascone.ApiException;
import com.slascone.Configuration;
import com.slascone.auth.*;
import com.slascone.models.*;
import com.slascone.api.NotificationApi;

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

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    UUID isvId = UUID.randomUUID(); // UUID | The ISV identifier.
    UserEmailTemplateDto userEmailTemplateDto = new UserEmailTemplateDto(); // UserEmailTemplateDto | The user email template to update.
    try {
      UserEmailTemplateDto result = apiInstance.updateUserEmailTemplate(isvId, userEmailTemplateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#updateUserEmailTemplate");
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
| **userEmailTemplateDto** | [**UserEmailTemplateDto**](UserEmailTemplateDto.md)| The user email template to update. | |

### Return type

[**UserEmailTemplateDto**](UserEmailTemplateDto.md)

### Authorization

[AdminKey](../README.md#AdminKey), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **503** | Service unavailable |  -  |

