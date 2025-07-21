

# ProductDto


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



