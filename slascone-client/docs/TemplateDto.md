

# TemplateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**productId** | **UUID** |  |  |
|**productName** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**shortDescription** | **String** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**tokenLimit** | **Integer** |  |  |
|**goodwillTokenLimit** | **Integer** |  |  [optional] |
|**floatingTokenLimit** | **Integer** |  |  [optional] |
|**enforceFloatingLimit** | **Boolean** |  |  [optional] |
|**userLimit** | **Integer** |  |  [optional] |
|**licenseTypeId** | **UUID** |  |  [optional] |
|**licenseType** | [**LicenseTypeDto**](LicenseTypeDto.md) |  |  [optional] |
|**isSoftwareReleaseLimitationAdjustable** | **Boolean** |  |  [optional] |
|**softwareReleaseLimitationId** | **UUID** |  |  [optional] |
|**allowsInvalidSoftwareRelease** | **Boolean** |  |  [optional] |
|**isExpirationModeAdjustable** | **Boolean** |  |  [optional] |
|**isExpirationHidden** | **Boolean** |  |  [optional] |
|**expirationMode** | **ExpirationMode** |  |  [optional] |
|**expirationDateUtc** | **OffsetDateTime** |  |  [optional] |
|**validDaysCount** | **Integer** |  |  [optional] |
|**trialDaysCount** | **Integer** |  |  [optional] |
|**heartbeatMode** | **HeartBeatMode** |  |  [optional] |
|**heartbeatPeriod** | **Integer** |  |  [optional] |
|**freeRide** | **Integer** |  |  [optional] |
|**clientType** | **ClientType** |  |  [optional] |
|**activationUponLicenseCreation** | **ActivationUponLicenseCreation** |  |  [optional] |
|**tokenUiMode** | **TokenUiMode** |  |  [optional] |
|**features** | [**List&lt;TemplateFeatureDto&gt;**](TemplateFeatureDto.md) |  |  [optional] |
|**limitations** | [**List&lt;TemplateLimitationDto&gt;**](TemplateLimitationDto.md) |  |  [optional] |
|**variables** | [**List&lt;TemplateVariableDto&gt;**](TemplateVariableDto.md) |  |  [optional] |
|**constrainedVariables** | [**List&lt;TemplateConstrainedVariableDto&gt;**](TemplateConstrainedVariableDto.md) |  |  [optional] |
|**provisioningMode** | **ProvisioningMode** |  |  [optional] |
|**sessionPeriod** | **Integer** |  |  [optional] |
|**maxFloatingSessionsWithSameClientId** | **Integer** |  |  [optional] |
|**isTemporary** | **Boolean** |  |  [optional] |
|**hasStrictHeartbeats** | **Boolean** |  |  [optional] |
|**createdDateUtc** | **OffsetDateTime** |  |  [optional] |
|**modifiedDateUtc** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**softwareReleaseLimitation** | [**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md) |  |  [optional] |
|**supportsLicenseUserGroups** | **Boolean** |  |  [optional] |
|**heartbeatSamplingRate** | **Integer** |  |  [optional] |



