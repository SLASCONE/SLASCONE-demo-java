package Model;

import java.util.List;

public class UsageHeartbeatDto {
	public String UniqueDeviceId = null;
	
    public List<UsageFeatureValueDto> UsageHeartbeat = null;
    
    public String DeviceLicenseKey = null;

    public UsageHeartbeatDto() {
    	super();
    }
    
	public UsageHeartbeatDto(String uniqueDeviceId, List<UsageFeatureValueDto> usageHeartbeat,
			String deviceLicenseKey) {
		super();
		UniqueDeviceId = uniqueDeviceId;
		UsageHeartbeat = usageHeartbeat;
		DeviceLicenseKey = deviceLicenseKey;
	}

	public String getUniqueDeviceId() {
		return UniqueDeviceId;
	}

	public void setUniqueDeviceId(String uniqueDeviceId) {
		UniqueDeviceId = uniqueDeviceId;
	}

	public List<UsageFeatureValueDto> getUsageHeartbeat() {
		return UsageHeartbeat;
	}

	public void setUsageHeartbeat(List<UsageFeatureValueDto> usageHeartbeat) {
		UsageHeartbeat = usageHeartbeat;
	}

	public String getDeviceLicenseKey() {
		return DeviceLicenseKey;
	}

	public void setDeviceLicenseKey(String deviceLicenseKey) {
		DeviceLicenseKey = deviceLicenseKey;
	}
}
