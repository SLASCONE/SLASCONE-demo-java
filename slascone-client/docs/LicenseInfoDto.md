

# LicenseInfoDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**CustomerAccountDto**](CustomerAccountDto.md) |  |  [optional] |
|**licenseName** | **String** |  |  [optional] |
|**licenseKey** | **String** |  |  [optional] |
|**tokenKey** | **UUID** |  |  [optional] |
|**legacyLicenseKey** | **String** |  |  [optional] |
|**clientId** | **String** |  |  [optional] |
|**clientDescription** | **String** |  |  [optional] |
|**productName** | **String** |  |  [optional] |
|**productId** | **UUID** |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**templateId** | **UUID** |  |  [optional] |
|**provisioningMode** | **ProvisioningMode** |  |  [optional] |
|**clientType** | **ClientType** |  |  [optional] |
|**isLicenseActive** | **Boolean** |  |  [optional] |
|**isLicenseExpired** | **Boolean** |  |  [optional] |
|**isLicenseValid** | **Boolean** |  |  [optional] |
|**startDateUtc** | **OffsetDateTime** |  |  [optional] |
|**expirationDateUtc** | **OffsetDateTime** |  |  [optional] |
|**dateValidity** | **DateValidity** |  |  [optional] |
|**tokenLimit** | **Integer** |  |  [optional] |
|**floatingTokenLimit** | **Integer** |  |  [optional] |
|**isTemporary** | **Boolean** |  |  [optional] |
|**isSoftwareVersionValid** | **Boolean** |  |  [optional] |
|**softwareReleaseLimitation** | [**SoftwareReleaseLimitationDto**](SoftwareReleaseLimitationDto.md) |  |  [optional] |
|**isNewerSoftwareShipmentAvailable** | **Boolean** |  |  [optional] |
|**latestSoftwareShipment** | [**SoftwareShipmentDto**](SoftwareShipmentDto.md) |  |  [optional] |
|**sessionPeriod** | **Integer** |  |  [optional] |
|**heartbeatPeriod** | **Integer** |  |  [optional] |
|**freeride** | **Integer** |  |  [optional] |
|**enforceSoftwareVersionUpgrade** | **Boolean** |  |  [optional] |
|**features** | [**List&lt;ProvisioningFeatureDto&gt;**](ProvisioningFeatureDto.md) |  |  [optional] |
|**limitations** | [**List&lt;ProvisioningLimitationDto&gt;**](ProvisioningLimitationDto.md) |  |  [optional] |
|**variables** | [**List&lt;ProvisioningVariableDto&gt;**](ProvisioningVariableDto.md) |  |  [optional] |
|**constrainedVariables** | [**List&lt;ProvisioningConstrainedVariableDto&gt;**](ProvisioningConstrainedVariableDto.md) |  |  [optional] |
|**licenseUsers** | [**List&lt;LicenseUserDto&gt;**](LicenseUserDto.md) |  |  [optional] |
|**createdDateUtc** | **OffsetDateTime** |  |  [optional] |
|**licenseType** | [**LicenseTypeDto**](LicenseTypeDto.md) |  |  [optional] |



