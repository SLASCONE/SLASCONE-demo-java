

# LicenseDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expirationDateUtc** | **OffsetDateTime** |  |  [optional] |
|**expirationMode** | **ExpirationMode** |  |  [optional] |
|**validDaysCount** | **Integer** |  |  [optional] |
|**trialDaysCount** | **Integer** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**isExpired** | **Boolean** |  |  [optional] |
|**dateValidity** | **DateValidity** |  |  [optional] |
|**isValid** | **Boolean** |  |  [optional] |
|**isSoftwareReleaseValid** | **Boolean** |  |  [optional] |
|**isGroupValid** | **Boolean** |  |  [optional] |
|**groupCount** | **Integer** |  |  [optional] |
|**dateOfIssueUtc** | **OffsetDateTime** |  |  [optional] |
|**startDateUtc** | **OffsetDateTime** |  |  [optional] |
|**id** | **UUID** |  |  |
|**customerId** | **UUID** |  |  |
|**productId** | **UUID** |  |  |
|**templateId** | **UUID** |  |  |
|**licenseTypeId** | **UUID** |  |  [optional] |
|**legacyLicenseKey** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**tokenLimit** | **Integer** |  |  |
|**goodwillTokenLimit** | **Integer** |  |  [optional] |
|**floatingTokenLimit** | **Integer** |  |  [optional] |
|**userLimit** | **Integer** |  |  [optional] |
|**softwareReleaseLimitationId** | **UUID** |  |  [optional] |
|**isTemporary** | **Boolean** |  |  [optional] |
|**licenseFeatures** | [**List&lt;LicenseFeatureDto&gt;**](LicenseFeatureDto.md) |  |  [optional] |
|**licenseLimitations** | [**List&lt;LicenseLimitationDto&gt;**](LicenseLimitationDto.md) |  |  [optional] |
|**licenseConstrainedVariables** | [**List&lt;LicenseConstrainedVariableDto&gt;**](LicenseConstrainedVariableDto.md) |  |  [optional] |
|**licenseVariables** | [**List&lt;LicenseVariableDto&gt;**](LicenseVariableDto.md) |  |  [optional] |
|**licenseUsersGroups** | [**List&lt;LicenseUserGroupDto&gt;**](LicenseUserGroupDto.md) |  |  [optional] |
|**licenseUsers** | [**List&lt;LicenseUserDto&gt;**](LicenseUserDto.md) |  |  [optional] |
|**createdDateUtc** | **OffsetDateTime** |  |  [optional] |
|**modifiedDateUtc** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**customer** | [**CustomerDto**](CustomerDto.md) |  |  [optional] |
|**product** | [**ProductDto**](ProductDto.md) |  |  [optional] |
|**template** | [**TemplateDto**](TemplateDto.md) |  |  [optional] |
|**licenseType** | [**LicenseTypeDto**](LicenseTypeDto.md) |  |  [optional] |
|**softwareReleaseLimitation** | [**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md) |  |  [optional] |
|**prioritizedSoftwareRelease** | **String** |  |  [optional] |
|**mailLogs** | [**List&lt;MailLogDto&gt;**](MailLogDto.md) |  |  [optional] |
|**clientId** | **String** |  |  [optional] |



