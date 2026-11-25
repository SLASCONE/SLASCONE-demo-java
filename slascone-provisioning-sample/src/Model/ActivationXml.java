package Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ActivationXml {
    @JacksonXmlProperty(localName = "license_key")
    private String licenseKey;
    
    @JacksonXmlProperty(localName = "revision_id")
    private String revisionId;

    @JacksonXmlProperty(localName = "token_key")
    private String tokenKey;

    @JacksonXmlProperty(localName = "client_id")
    private String clientId;

    @JacksonXmlProperty(localName = "activation_date_utc")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String activationDateUtc;

    // Getters and setters for the private fields
    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getActivationDateUtc() {
        return activationDateUtc;
    }

    public void setActivationDateUtc(String activationDateUtc) {
        this.activationDateUtc = activationDateUtc;
    }
}
