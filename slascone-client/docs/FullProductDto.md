

# FullProductDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**shortDescription** | **String** |  |  [optional] |
|**minimumSoftwareReleaseId** | **UUID** |  |  [optional] |
|**softwareRelease** | [**List&lt;SoftwareReleaseLimitationDto&gt;**](SoftwareReleaseLimitationDto.md) |  |  [optional] |
|**isGoodwillVisible** | **Boolean** |  |  [optional] |
|**isUpgradeComplianceVisible** | **Boolean** |  |  [optional] |
|**isGroupComplianceVisible** | **Boolean** |  |  [optional] |
|**isTemporaryLicenseRulesVisible** | **Boolean** |  |  [optional] |
|**prioritizedKey** | **PrioritizedKeyMode** |  |  |
|**offlineLicensing** | **OfflineLicensing** |  |  [optional] |
|**licenseFileName** | **String** |  |  [optional] |
|**userIdType** | **UserIdType** |  |  [optional] |
|**clientIdMode** | **ClientIdMode** |  |  [optional] |
|**maximumInactiveDays** | **Integer** |  |  [optional] |
|**maxLicensesPerUser** | **Integer** |  |  [optional] |
|**createdDateUtc** | **OffsetDateTime** |  |  [optional] |
|**modifiedDateUtc** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |
|**minimumSoftwareRelease** | [**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md) |  |  [optional] |
|**logo** | [**ResourceDto**](ResourceDto.md) |  |  [optional] |
|**features** | [**List&lt;FeatureDto&gt;**](FeatureDto.md) |  |  [optional] |
|**limitations** | [**List&lt;LimitationDto&gt;**](LimitationDto.md) |  |  [optional] |
|**constrainedVariables** | [**List&lt;ConstrainedVariableDto&gt;**](ConstrainedVariableDto.md) |  |  [optional] |
|**variables** | [**List&lt;VariableDto&gt;**](VariableDto.md) |  |  [optional] |
|**analyticalFields** | [**List&lt;AnalyticalFieldDto&gt;**](AnalyticalFieldDto.md) |  |  [optional] |
|**softwareShipmentProperties** | [**List&lt;ProductSoftwareShipmentPropertyDto&gt;**](ProductSoftwareShipmentPropertyDto.md) |  |  [optional] |
|**softwareReleaseLimitations** | [**List&lt;SoftwareReleaseLimitationDto&gt;**](SoftwareReleaseLimitationDto.md) |  |  [optional] |
|**usageFeatures** | [**List&lt;UsageFeatureDto&gt;**](UsageFeatureDto.md) |  |  [optional] |
|**usageModules** | [**List&lt;UsageModuleDto&gt;**](UsageModuleDto.md) |  |  [optional] |
|**emailTemplates** | [**List&lt;EmailTemplateDto&gt;**](EmailTemplateDto.md) |  |  [optional] |



