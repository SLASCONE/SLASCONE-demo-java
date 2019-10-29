package Model;

import java.util.List;

public class AnalyticalHeartbeat {
	private String uniqueDeviceId = null;

	private List<AnalyticalFieldValue> analyticalHeartbeatInfo = null;

	private String deviceLicenseKey = null;
	
	public AnalyticalHeartbeat(String uniqueDeviceId, List<AnalyticalFieldValue> analyticalHeartbeatInfo,
			String deviceLicenseKey) {
		super();
		this.uniqueDeviceId = uniqueDeviceId;
		this.analyticalHeartbeatInfo = analyticalHeartbeatInfo;
		this.deviceLicenseKey = deviceLicenseKey;
	}
	
	public AnalyticalHeartbeat() {
		super();
	}
	
	public String getUniqueDeviceId() {
		return uniqueDeviceId;
	}

	public void setUniqueDeviceId(String uniqueDeviceId) {
		this.uniqueDeviceId = uniqueDeviceId;
	}

	public List<AnalyticalFieldValue> getAnalyticalHeartbeatInfo() {
		return analyticalHeartbeatInfo;
	}

	public void setAnalyticalHeartbeatInfo(List<AnalyticalFieldValue> analyticalHeartbeatInfo) {
		this.analyticalHeartbeatInfo = analyticalHeartbeatInfo;
	}

	public String getDeviceLicenseKey() {
		return deviceLicenseKey;
	}

	public void setDeviceLicenseKey(String deviceLicenseKey) {
		this.deviceLicenseKey = deviceLicenseKey;
	}
}
