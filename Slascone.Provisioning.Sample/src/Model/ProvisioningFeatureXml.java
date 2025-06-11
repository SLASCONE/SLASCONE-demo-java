package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningFeatureXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "name")
    private String name;
    
    @JacksonXmlProperty(localName = "description")
    private String description;
    
    @JacksonXmlProperty(localName = "is_active")
    private boolean isActive;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getFeatureName() {
        return name; // Return the field from XML
    }
    
    public void setFeatureName(String featureName) {
        this.name = featureName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public String getFeatureDescription() {
        return description;
    }
    
    public void setFeatureDescription(String featureDescription) {
        this.description = featureDescription;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean isEnabled() {
        return isActive;
    }
    
    public void setEnabled(boolean enabled) {
        this.isActive = enabled;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean active) {
        this.isActive = active;
    }
}
