package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningLimitationXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "name")
    private String name; 
    
    @JacksonXmlProperty(localName = "description")
    private String description;
    
    @JacksonXmlProperty(localName = "value")
    private int value; // Use the exact field name from XML
    
    @JacksonXmlProperty(localName = "consumption_reset_mode")
    private int consumptionResetMode;
    
    @JacksonXmlProperty(localName = "consumption_reset_period_days")
    private Integer consumptionResetPeriodDays;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getLimitationName() {
        return name; // Return the field from XML
    }
    
    public void setLimitationName(String limitationName) {
        this.name = limitationName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public String getLimitationDescription() {
        return description;
    }
    
    public void setLimitationDescription(String limitationDescription) {
        this.description = limitationDescription;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getLimitValue() {
        return value;
    }
    
    public void setLimitValue(int limitValue) {
        this.value = limitValue;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getConsumptionResetMode() {
        return consumptionResetMode;
    }
    
    public void setConsumptionResetMode(int consumptionResetMode) {
        this.consumptionResetMode = consumptionResetMode;
    }
    
    public Integer getConsumptionResetPeriodDays() {
        return consumptionResetPeriodDays;
    }
    
    public void setConsumptionResetPeriodDays(Integer consumptionResetPeriodDays) {
        this.consumptionResetPeriodDays = consumptionResetPeriodDays;
    }
}
