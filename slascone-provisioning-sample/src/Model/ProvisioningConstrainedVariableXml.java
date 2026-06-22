package Model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class ProvisioningConstrainedVariableXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "name")
    private String name;
    
    @JacksonXmlProperty(localName = "description")
    private String description;
    
    @JacksonXmlProperty(localName = "custom_list_id")
    private String customListId;
    
    @JacksonXmlProperty(localName = "values")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> values;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getCustomListId() {
        return customListId;
    }
    
    public void setCustomListId(String customListId) {
        this.customListId = customListId;
    }
    
    public List<String> getValues() {
        return values;
    }
    
    public void setValues(List<String> values) {
        this.values = values;
    }
}
