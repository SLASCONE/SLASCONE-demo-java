package Model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class LicenseInfo {		
	
	public String licenseKey = null;	
	
	public UUID deviceLicenseKey = null;	
	
    public String uniqueDeviceId = null;    
    
    public Boolean isLicenseValid = null;
    
	public Boolean isSoftwareVersionValid = null;
	
    public Date expirationDateUtc = null;
    
    public SoftwareReleaseLimitation softwareReleaseLimitation = null;
    
    public int heartBeatPeriod = 0;
    
    public int freeRide = 0;
    
    public String productName = null;
    
    public String templateName = null;
    
    public String licenseName = null;
    
    public String deviceDescription = null;
    
    public Boolean enforceSoftwareVersionUpgrade = null;
    
    public Customer customer = null;
    
    public List<LicenseFeature> features = null;
    
    public List<LicenseLimitation> limitations = null;
    
    public List<LicenseVariable> variables = null;

	public LicenseInfo(String licenseKey, UUID deviceLicenseKey, String uniqueDeviceId, Boolean isLicenseValid,
			Boolean isSoftwareVersionValid, Date expirationDateUtc, SoftwareReleaseLimitation softwareReleaseLimitation,
			int heartBeatPeriod, int freeRide, String productName, String templateName, String licenseName,
			String deviceDescription, Boolean enforceSoftwareVersionUpgrade, Customer customer,
			List<LicenseFeature> features, List<LicenseLimitation> limitations, List<LicenseVariable> variables) {
		super();
		this.licenseKey = licenseKey;
		this.deviceLicenseKey = deviceLicenseKey;
		this.uniqueDeviceId = uniqueDeviceId;
		this.isLicenseValid = isLicenseValid;
		this.isSoftwareVersionValid = isSoftwareVersionValid;
		this.expirationDateUtc = expirationDateUtc;
		this.softwareReleaseLimitation = softwareReleaseLimitation;
		this.heartBeatPeriod = heartBeatPeriod;
		this.freeRide = freeRide;
		this.productName = productName;
		this.templateName = templateName;
		this.licenseName = licenseName;
		this.deviceDescription = deviceDescription;
		this.enforceSoftwareVersionUpgrade = enforceSoftwareVersionUpgrade;
		this.customer = customer;
		this.features = features;
		this.limitations = limitations;
		this.variables = variables;
	}

	public LicenseInfo() {
		super();
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public UUID getDeviceLicenseKey() {
		return deviceLicenseKey;
	}

	public void setDeviceLicenseKey(UUID deviceLicenseKey) {
		this.deviceLicenseKey = deviceLicenseKey;
	}

	public String getUniqueDeviceId() {
		return uniqueDeviceId;
	}

	public void setUniqueDeviceId(String uniqueDeviceId) {
		this.uniqueDeviceId = uniqueDeviceId;
	}

	public Boolean getIsLicenseValid() {
		return isLicenseValid;
	}

	public void setIsLicenseValid(Boolean isLicenseValid) {
		this.isLicenseValid = isLicenseValid;
	}

	public Boolean getIsSoftwareVersionValid() {
		return isSoftwareVersionValid;
	}

	public void setIsSoftwareVersionValid(Boolean isSoftwareVersionValid) {
		this.isSoftwareVersionValid = isSoftwareVersionValid;
	}

	public Date getExpirationDateUtc() {
		return expirationDateUtc;
	}

	public void setExpirationDateUtc(Date expirationDateUtc) {
		this.expirationDateUtc = expirationDateUtc;
	}

	public SoftwareReleaseLimitation getSoftwareReleaseLimitation() {
		return softwareReleaseLimitation;
	}

	public void setSoftwareReleaseLimitation(SoftwareReleaseLimitation softwareReleaseLimitation) {
		this.softwareReleaseLimitation = softwareReleaseLimitation;
	}

	public int getHeartBeatPeriod() {
		return heartBeatPeriod;
	}

	public void setHeartBeatPeriod(int heartBeatPeriod) {
		this.heartBeatPeriod = heartBeatPeriod;
	}

	public int getFreeRide() {
		return freeRide;
	}

	public void setFreeRide(int freeRide) {
		this.freeRide = freeRide;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getLicenseName() {
		return licenseName;
	}

	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public String getDeviceDescription() {
		return deviceDescription;
	}

	public void setDeviceDescription(String deviceDescription) {
		this.deviceDescription = deviceDescription;
	}

	public Boolean getEnforceSoftwareVersionUpgrade() {
		return enforceSoftwareVersionUpgrade;
	}

	public void setEnforceSoftwareVersionUpgrade(Boolean enforceSoftwareVersionUpgrade) {
		this.enforceSoftwareVersionUpgrade = enforceSoftwareVersionUpgrade;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<LicenseFeature> getFeatures() {
		return features;
	}

	public void setFeatures(List<LicenseFeature> features) {
		this.features = features;
	}

	public List<LicenseLimitation> getLimitations() {
		return limitations;
	}

	public void setLimitations(List<LicenseLimitation> limitations) {
		this.limitations = limitations;
	}

	public List<LicenseVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<LicenseVariable> variables) {
		this.variables = variables;
	}
}
