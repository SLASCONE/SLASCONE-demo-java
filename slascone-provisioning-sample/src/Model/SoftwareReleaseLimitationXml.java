package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SoftwareReleaseLimitationXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "product_id")
    private String productId;

    @JacksonXmlProperty(localName = "software_release")
    private String softwareRelease;

    @JacksonXmlProperty(localName = "description")
    private String description;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSoftwareRelease() {
        return softwareRelease;
    }

    public void setSoftwareRelease(String softwareRelease) {
        this.softwareRelease = softwareRelease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
