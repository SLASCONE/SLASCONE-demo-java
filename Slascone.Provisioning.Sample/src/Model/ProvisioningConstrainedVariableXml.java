package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningConstrainedVariableXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "variable_id")
    private String variableId;
    
    @JacksonXmlProperty(localName = "variable_name")
    private String variableName;
    
    @JacksonXmlProperty(localName = "variable_key")
    private String variableKey;
    
    @JacksonXmlProperty(localName = "variable_description")
    private String variableDescription;
    
    @JacksonXmlProperty(localName = "variable_value")
    private String variableValue;
    
    @JacksonXmlProperty(localName = "min_value")
    private String minValue;
    
    @JacksonXmlProperty(localName = "max_value")
    private String maxValue;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getVariableId() {
        return variableId;
    }
    
    public void setVariableId(String variableId) {
        this.variableId = variableId;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
    
    public String getVariableKey() {
        return variableKey;
    }
    
    public void setVariableKey(String variableKey) {
        this.variableKey = variableKey;
    }
    
    public String getVariableDescription() {
        return variableDescription;
    }
    
    public void setVariableDescription(String variableDescription) {
        this.variableDescription = variableDescription;
    }
    
    public String getVariableValue() {
        return variableValue;
    }
    
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }
    
    public String getMinValue() {
        return minValue;
    }
    
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }
    
    public String getMaxValue() {
        return maxValue;
    }
    
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }
}
