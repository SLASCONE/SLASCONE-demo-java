package Model;

import java.util.List;

public class AnalyticalHeartbeat {
	private String uniqueDeviceId = null;

	private List<AnalyticalFieldValue> analyticalHeartbeatInfo = null;
	
	public AnalyticalHeartbeat(String uniqueDeviceId, List<AnalyticalFieldValue> analyticalHeartbeatInfo) {
		super();
		this.uniqueDeviceId = uniqueDeviceId;
		this.analyticalHeartbeatInfo = analyticalHeartbeatInfo;
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
}
