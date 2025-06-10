package Model;

public class ProvisioningInfo {
	public LicenseInfo LicenseInfo = null;
	
	public WarningInfo WarningInfo = null;

	public ProvisioningInfo(Model.LicenseInfo licenseInfo, Model.WarningInfo warningInfo) {
		super();
		LicenseInfo = licenseInfo;
		WarningInfo = warningInfo;
	}
	
	public ProvisioningInfo() {
		super();
	}

	public LicenseInfo getLicenseInfo() {
		return LicenseInfo;
	}

	public void setLicenseInfo(LicenseInfo licenseInfo) {
		LicenseInfo = licenseInfo;
	}

	public WarningInfo getWarningInfo() {
		return WarningInfo;
	}

	public void setWarningInfo(WarningInfo warningInfo) {
		WarningInfo = warningInfo;
	}
}
