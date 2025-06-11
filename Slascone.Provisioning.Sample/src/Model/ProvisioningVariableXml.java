package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningVariableXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "description")
    private String description;

    @JacksonXmlProperty(localName = "value")
    private String value;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String variableName) {
        this.name = variableName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
}
