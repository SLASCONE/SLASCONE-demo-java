package Model;

public class ActivateInfo {
	private String productId = null;
	
	private String deviceLicenseKey = null;
	
	private String uniqueDeviceId = null;
	
	private String deviceName = null;
	
	private String deviceDescription = null;

	public ActivateInfo(String productId, String deviceLicenseKey, String uniqueDeviceId, String deviceName,
			String deviceDescription) {
		super();
		this.productId = productId;
		this.deviceLicenseKey = deviceLicenseKey;
		this.uniqueDeviceId = uniqueDeviceId;
		this.deviceName = deviceName;
		this.deviceDescription = deviceDescription;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDeviceLicenseKey() {
		return deviceLicenseKey;
	}

	public void setDeviceLicenseKey(String deviceLicenseKey) {
		this.deviceLicenseKey = deviceLicenseKey;
	}

	public String getUniqueDeviceId() {
		return uniqueDeviceId;
	}

	public void setUniqueDeviceId(String uniqueDeviceId) {
		this.uniqueDeviceId = uniqueDeviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceDescription() {
		return deviceDescription;
	}

	public void setDeviceDescription(String deviceDescription) {
		this.deviceDescription = deviceDescription;
	}
	
	
}
