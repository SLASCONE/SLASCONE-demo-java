package Model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class LicenseInfo {		
	
	public String license_key = null;	
	
	public UUID token_key = null;	
	
    public String client_id = null;    
    
    public Boolean is_license_valid = null;
    
	public Boolean is_software_version_valid = null;
	
    public Date expiration_date_utc = null;
    
    public SoftwareReleaseLimitation software_release_limitation = null;
    
    public int heartbeat_period = 0;
    
    public int freeride = 0;
    
    public String product_name = null;
    
    public String template_name = null;
    
    public String license_name = null;
    
    public String client_description = null;
    
    public Boolean enforce_software_version_upgrade = null;
    
    public Customer customer = null;
    
    public List<LicenseFeature> features = null;
    
    public List<LicenseLimitation> limitations = null;
    
    public List<LicenseVariable> variables = null;
    
    public LicenseInfo() {
    	super();
    }

	public LicenseInfo(String license_key, UUID token_key, String client_id, Boolean is_license_valid,
			Boolean is_software_version_valid, Date expiration_date_utc,
			SoftwareReleaseLimitation software_release_limitation, int heartbeat_period, int freeride,
			String product_name, String template_name, String license_name, String client_description,
			Boolean enforce_software_version_upgrade, Customer customer, List<LicenseFeature> features,
			List<LicenseLimitation> limitations, List<LicenseVariable> variables) {
		super();
		this.license_key = license_key;
		this.token_key = token_key;
		this.client_id = client_id;
		this.is_license_valid = is_license_valid;
		this.is_software_version_valid = is_software_version_valid;
		this.expiration_date_utc = expiration_date_utc;
		this.software_release_limitation = software_release_limitation;
		this.heartbeat_period = heartbeat_period;
		this.freeride = freeride;
		this.product_name = product_name;
		this.template_name = template_name;
		this.license_name = license_name;
		this.client_description = client_description;
		this.enforce_software_version_upgrade = enforce_software_version_upgrade;
		this.customer = customer;
		this.features = features;
		this.limitations = limitations;
		this.variables = variables;
	}

	public String getLicense_key() {
		return license_key;
	}

	public void setLicense_key(String license_key) {
		this.license_key = license_key;
	}

	public UUID getToken_key() {
		return token_key;
	}

	public void setToken_key(UUID token_key) {
		this.token_key = token_key;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public Boolean getIs_license_valid() {
		return is_license_valid;
	}

	public void setIs_license_valid(Boolean is_license_valid) {
		this.is_license_valid = is_license_valid;
	}

	public Boolean getIs_software_version_valid() {
		return is_software_version_valid;
	}

	public void setIs_software_version_valid(Boolean is_software_version_valid) {
		this.is_software_version_valid = is_software_version_valid;
	}

	public Date getExpiration_date_utc() {
		return expiration_date_utc;
	}

	public void setExpiration_date_utc(Date expiration_date_utc) {
		this.expiration_date_utc = expiration_date_utc;
	}

	public SoftwareReleaseLimitation getSoftware_release_limitation() {
		return software_release_limitation;
	}

	public void setSoftware_release_limitation(SoftwareReleaseLimitation software_release_limitation) {
		this.software_release_limitation = software_release_limitation;
	}

	public int getHeartbeat_period() {
		return heartbeat_period;
	}

	public void setHeartbeat_period(int heartbeat_period) {
		this.heartbeat_period = heartbeat_period;
	}

	public int getFreeride() {
		return freeride;
	}

	public void setFreeride(int freeride) {
		this.freeride = freeride;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getTemplate_name() {
		return template_name;
	}

	public void setTemplate_name(String template_name) {
		this.template_name = template_name;
	}

	public String getLicense_name() {
		return license_name;
	}

	public void setLicense_name(String license_name) {
		this.license_name = license_name;
	}

	public String getClient_description() {
		return client_description;
	}

	public void setClient_description(String client_description) {
		this.client_description = client_description;
	}

	public Boolean getEnforce_software_version_upgrade() {
		return enforce_software_version_upgrade;
	}

	public void setEnforce_software_version_upgrade(Boolean enforce_software_version_upgrade) {
		this.enforce_software_version_upgrade = enforce_software_version_upgrade;
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
