package Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LicenseUserXml {
    @JacksonXmlProperty(localName = "id")
    private String id;
    
    @JacksonXmlProperty(localName = "user_name")
    private String userName;
    
    @JacksonXmlProperty(localName = "email")
    private String email;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
