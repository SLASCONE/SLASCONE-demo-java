

# DeviceLicenseAssignmentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**licenseId** | **UUID** |  |  [optional] |
|**productId** | **UUID** |  |  [optional] |
|**deviceName** | **String** |  |  [optional] |
|**deviceDescription** | **String** |  |  [optional] |
|**tokenKey** | **UUID** |  |  [optional] |
|**userEmail** | **String** |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**clientId** | **String** |  |  [optional] |
|**activated** | **Boolean** |  |  [optional] |
|**isSoftwareVersionValid** | **Boolean** |  |  [optional] |
|**isGoodwillLicense** | **Boolean** |  |  [optional] |
|**hasHeartbeats** | **Boolean** |  |  [optional] |
|**hasConsumptionHeartbeats** | **Boolean** |  |  [optional] |
|**activatedDateUtc** | **OffsetDateTime** |  |  [optional] |
|**heartbeatInfo** | [**DeviceHeartbeatDto**](DeviceHeartbeatDto.md) |  |  [optional] |
|**enforceSoftwareVersionUpgrade** | **Boolean** |  |  [optional] |
|**deviceAnalyticalHeartbeats** | [**List&lt;DeviceAnalyticalHeartbeatDto&gt;**](DeviceAnalyticalHeartbeatDto.md) |  |  [optional] |
|**softwareVersion** | **String** |  |  [optional] |
|**operatingSystem** | **String** |  |  [optional] |
|**tagAssignments** | [**List&lt;TagAssignmentDto&gt;**](TagAssignmentDto.md) |  |  [optional] |
|**licenseActivationType** | **LicenseActivationType** |  |  [optional] |
|**suspendedUntilUtc** | **OffsetDateTime** |  |  [optional] |
|**createdDateUtc** | **OffsetDateTime** |  |  [optional] |
|**modifiedDateUtc** | **OffsetDateTime** |  |  [optional] |
|**lastModifiedBy** | **String** |  |  [optional] |



