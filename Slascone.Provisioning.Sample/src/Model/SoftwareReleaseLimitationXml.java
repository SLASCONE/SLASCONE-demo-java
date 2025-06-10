package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SoftwareReleaseLimitationXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "software_release_id")
    private String softwareReleaseId;
    
    @JacksonXmlProperty(localName = "software_release_name")
    private String softwareReleaseName;
    
    @JacksonXmlProperty(localName = "product_id")
    private String productId;
    
    @JacksonXmlProperty(localName = "kind")
    private int kind;  // 0 = min, 1 = exact, 2 = max
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getSoftwareReleaseId() {
        return softwareReleaseId;
    }
    
    public void setSoftwareReleaseId(String softwareReleaseId) {
        this.softwareReleaseId = softwareReleaseId;
    }
    
    public String getSoftwareReleaseName() {
        return softwareReleaseName;
    }
    
    public void setSoftwareReleaseName(String softwareReleaseName) {
        this.softwareReleaseName = softwareReleaseName;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public int getKind() {
        return kind;
    }
    
    public void setKind(int kind) {
        this.kind = kind;
    }
}
