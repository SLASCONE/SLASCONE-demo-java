package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CustomerAccountXml {
    @JacksonXmlProperty(localName = "customer_id")
    private String customerId;
    
    @JacksonXmlProperty(localName = "company_name")
    private String companyName;
    
    @JacksonXmlProperty(localName = "customer_name")
    private String customerName;
    
    @JacksonXmlProperty(localName = "customer_number")
    private String customerNumber;
    
    @JacksonXmlProperty(localName = "email")
    private String email;
    
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerNumber() {
        return customerNumber;
    }
    
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
