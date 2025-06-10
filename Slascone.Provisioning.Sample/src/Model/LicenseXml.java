package Model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "slascone_license_file")
public class LicenseXml {
    @JacksonXmlProperty(localName = "modified_date_utc")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date modifiedDateUtc;
    
    @JacksonXmlProperty(localName = "customer")
    private CustomerAccountXml customer;
    
    @JacksonXmlProperty(localName = "license_name")
    private String licenseName;
    
    @JacksonXmlProperty(localName = "license_key")
    private String licenseKey;
    
    @JacksonXmlProperty(localName = "legacy_license_key")
    private String legacyLicenseKey;
    
    @JacksonXmlProperty(localName = "license_type_id")
    private String licenseTypeId; // Using String instead of UUID for direct XML parsing
    
    @JacksonXmlProperty(localName = "license_type_name")
    private String licenseTypeName;
    
    @JacksonXmlProperty(localName = "client_id")
    private String clientId;
    
    @JacksonXmlProperty(localName = "product_name")
    private String productName;
    
    @JacksonXmlProperty(localName = "product_id")
    private String productId; // Using String instead of UUID for direct XML parsing
    
    @JacksonXmlProperty(localName = "template_name")
    private String templateName;
    
    @JacksonXmlProperty(localName = "template_id")
    private String templateId; // Using String instead of UUID for direct XML parsing
    
    @JacksonXmlProperty(localName = "provisioning_mode")
    private int provisioningMode;
    
    @JacksonXmlProperty(localName = "floating_tokens")
    private Integer floatingTokenLimit;
    
    @JacksonXmlProperty(localName = "user_limits")
    private Integer userLimits;
    
    @JacksonXmlProperty(localName = "expiration_date_utc")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date expirationDateUtc;
    
    @JacksonXmlProperty(localName = "is_temporary")
    private boolean isTemporary;
    
    @JacksonXmlProperty(localName = "software_release_limitation")
    private SoftwareReleaseLimitationXml softwareReleaseLimitation;
    
    @JacksonXmlProperty(localName = "session_period")
    private Integer sessionPeriod;
    
    @JacksonXmlProperty(localName = "heartbeat_period")
    private Integer heartBeatPeriod;
    
    @JacksonXmlProperty(localName = "freeride")
    private Integer freeRide;
    
    @JacksonXmlProperty(localName = "features")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ProvisioningFeatureXml> features;
    
    @JacksonXmlProperty(localName = "limitations")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ProvisioningLimitationXml> limitations;
    
    @JacksonXmlProperty(localName = "variables")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ProvisioningVariableXml> variables;
    
    @JacksonXmlProperty(localName = "constrained_variables")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ProvisioningConstrainedVariableXml> constrainedVariables;
    
    @JacksonXmlProperty(localName = "license_users")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<LicenseUserXml> licenseUsers;

    // Getters and Setters
    public Date getModifiedDateUtc() {
        return modifiedDateUtc;
    }

    public void setModifiedDateUtc(Date modifiedDateUtc) {
        this.modifiedDateUtc = modifiedDateUtc;
    }

    public CustomerAccountXml getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerAccountXml customer) {
        this.customer = customer;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getLegacyLicenseKey() {
        return legacyLicenseKey;
    }

    public void setLegacyLicenseKey(String legacyLicenseKey) {
        this.legacyLicenseKey = legacyLicenseKey;
    }

    public String getLicenseTypeId() {
        return licenseTypeId;
    }

    public void setLicenseTypeId(String licenseTypeId) {
        this.licenseTypeId = licenseTypeId;
    }

    // Convert from String to UUID when needed
    public UUID getLicenseTypeIdAsUUID() {
        return licenseTypeId != null ? UUID.fromString(licenseTypeId) : null;
    }

    public String getLicenseTypeName() {
        return licenseTypeName;
    }

    public void setLicenseTypeName(String licenseTypeName) {
        this.licenseTypeName = licenseTypeName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Convert from String to UUID when needed
    public UUID getProductIdAsUUID() {
        return productId != null ? UUID.fromString(productId) : null;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    // Convert from String to UUID when needed
    public UUID getTemplateIdAsUUID() {
        return templateId != null ? UUID.fromString(templateId) : null;
    }

    public int getProvisioningMode() {
        return provisioningMode;
    }

    public void setProvisioningMode(int provisioningMode) {
        this.provisioningMode = provisioningMode;
    }

    public Integer getFloatingTokenLimit() {
        return floatingTokenLimit;
    }

    public void setFloatingTokenLimit(Integer floatingTokenLimit) {
        this.floatingTokenLimit = floatingTokenLimit;
    }

    public Integer getUserLimits() {
        return userLimits;
    }

    public void setUserLimits(Integer userLimits) {
        this.userLimits = userLimits;
    }

    public Date getExpirationDateUtc() {
        return expirationDateUtc;
    }

    public void setExpirationDateUtc(Date expirationDateUtc) {
        this.expirationDateUtc = expirationDateUtc;
    }

    public boolean isTemporary() {
        return isTemporary;
    }

    public void setTemporary(boolean temporary) {
        isTemporary = temporary;
    }

    public SoftwareReleaseLimitationXml getSoftwareReleaseLimitation() {
        return softwareReleaseLimitation;
    }

    public void setSoftwareReleaseLimitation(SoftwareReleaseLimitationXml softwareReleaseLimitation) {
        this.softwareReleaseLimitation = softwareReleaseLimitation;
    }

    public Integer getSessionPeriod() {
        return sessionPeriod;
    }

    public void setSessionPeriod(Integer sessionPeriod) {
        this.sessionPeriod = sessionPeriod;
    }

    public Integer getHeartBeatPeriod() {
        return heartBeatPeriod;
    }

    public void setHeartBeatPeriod(Integer heartBeatPeriod) {
        this.heartBeatPeriod = heartBeatPeriod;
    }

    public Integer getFreeRide() {
        return freeRide;
    }

    public void setFreeRide(Integer freeRide) {
        this.freeRide = freeRide;
    }

    public List<ProvisioningFeatureXml> getFeatures() {
        return features;
    }

    public void setFeatures(List<ProvisioningFeatureXml> features) {
        this.features = features;
    }

    public List<ProvisioningLimitationXml> getLimitations() {
        return limitations;
    }

    public void setLimitations(List<ProvisioningLimitationXml> limitations) {
        this.limitations = limitations;
    }

    public List<ProvisioningVariableXml> getVariables() {
        return variables;
    }

    public void setVariables(List<ProvisioningVariableXml> variables) {
        this.variables = variables;
    }

    public List<ProvisioningConstrainedVariableXml> getConstrainedVariables() {
        return constrainedVariables;
    }

    public void setConstrainedVariables(List<ProvisioningConstrainedVariableXml> constrainedVariables) {
        this.constrainedVariables = constrainedVariables;
    }

    public List<LicenseUserXml> getLicenseUsers() {
        return licenseUsers;
    }

    public void setLicenseUsers(List<LicenseUserXml> licenseUsers) {
        this.licenseUsers = licenseUsers;
    }
}
