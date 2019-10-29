package Proxy;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import Model.ActivateInfo;
import Model.AnalyticalHeartbeat;
import Model.LicenseInfo;
import Model.ProvisioningInfo;
import Model.WarningInfo;

public class SampleProxy {
	
	private String ApiBaseUrl = "https://api.slascone.com";
    private String ProvisioningKey = "NfEpJ2DFfgdz5gHb+y6VtxnqhDnGvgBEqfKFU8E/lqGDgt1I18v8Lhdl37vr+8Vo2LHAgu3VSkUgznKa2F6BcmTkWvR8d8jzlbT9bSzEjzoG6aOhelZhkNtv6q3V8XNR";
    private String IsvId = "06d61aa1-2e6e-4bed-a6d1-ddb6beee4d78";
    private HttpClient client; 
	
    public SampleProxy() {
    	Header acceptHeader = new BasicHeader("accept", "application/json");
    	Header contentTypeHeader = new BasicHeader("Content-type", "application/json");
    	Header provisioningHeader = new BasicHeader("ProvisioningKey", this.ProvisioningKey);
    	List<Header> headers = new ArrayList<Header>();
    	headers.add(acceptHeader);
    	headers.add(contentTypeHeader);
    	headers.add(provisioningHeader);
    	
    	this.client = HttpClients.custom().setDefaultHeaders(headers).build();
    }
    
    /// <summary>
    /// Activates a License
    /// </summary>
    /// <param name="productId">Specifies the product which the license is aligned.</param>
    /// <param name="deviceLicenseKey">Can be a DeviceLicenseKey, LicenseKey or LegacyLicenseKey.</param>
    /// <param name="uniqueDeviceId">Is the id which identifies the device.</param>
    /// <param name="deviceName">Is the name of a device.</param>
    /// <param name="deviceDescription">Is a description for a device.</param>
    /// <returns>ProvisioningInfo where LicenseInfoDto or WarningInfoDto is set.</returns>
    public ProvisioningInfo Activate(ActivateInfo activateDto) throws Exception {
        
    	URI uri = new URIBuilder()
    			.setPath(this.ApiBaseUrl + "/api/Provisioning/" + this.IsvId + "/devicelicense/activate").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(activateDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
    	    	
    	HttpUriRequest request = RequestBuilder.post().setUri(uri).setEntity(requestEntity).build();
    	HttpResponse response = this.client.execute(request); 

    	ObjectMapper mapper = new ObjectMapper();
    	
    	 // If activation was successful, the api returns a status code Ok(200) with the information of the license.
    	if(response.getStatusLine().getStatusCode() == 200) {
    		LicenseInfo licInfo = mapper.readValue(response.getEntity().getContent(), LicenseInfo.class);
    		ProvisioningInfo provInfo = new ProvisioningInfo();
    		provInfo.setLicenseInfo(licInfo);
    		
    		return provInfo;
    	}
    	
        // If activation was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		ProvisioningInfo provInfo = new ProvisioningInfo();
    		provInfo.setWarningInfo(warnInfo);
    		return provInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    // Creates a heartbeat
    // Response is either a LicenseInfoDto or a WarningInfoDto
    /// <summary>
    /// Creates a heartbeat
    /// </summary>
    /// <param name="productId">Specifies the product which the license is aligned.</param>
    /// <param name="deviceLicenseKey">Can be a DeviceLicenseKey, LicenseKey or LegacyLicenseKey.</param>
    /// <param name="softwareVersion">Is the software version which the license is currently assigned.</param>
    /// <param name="operatingSystem">Is the operating system on which the license is currently assigned.</param>
    /// <param name="uniqueDeviceId">Is the id which identifies the device.</param>
    /// <returns>ProvisioningInfo where LicenseInfoDto or WarningInfoDto is set.</returns>
    public ProvisioningInfo AddHeartbeat(String productId, String deviceLicenseKey, String softwareVersion,
    		String operatingSystem, String uniqueDeviceId) throws Exception {
    	
    	URI uri = new URIBuilder()
    			.setPath(this.ApiBaseUrl + "/api/Provisioning/isv/" + this.IsvId + "/productId/" + productId + "/softwareversion/" + softwareVersion + "/os/" + operatingSystem + "/deviceId/" + uniqueDeviceId).build();
    	   	    	
    	StringEntity requestEntity = new StringEntity(
    			"",
    		    ContentType.APPLICATION_JSON);
    	
    	HttpUriRequest request = RequestBuilder.post().setUri(uri).setEntity(requestEntity).build();
    	HttpResponse response = this.client.execute(request); 
    	  	
    	ObjectMapper mapper = new ObjectMapper();
		
        // If generating a heartbeat was successful, the api returns a status code Ok(200) with the information of the license.
    	if(response.getStatusLine().getStatusCode() == 200) {
    		LicenseInfo licInfo = mapper.readValue(response.getEntity().getContent(), LicenseInfo.class);
    		ProvisioningInfo provInfo = new ProvisioningInfo();
    		provInfo.setLicenseInfo(licInfo);
    		
    		return provInfo;
    	}
    	
        // If generating a heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		ProvisioningInfo provInfo = new ProvisioningInfo();
    		provInfo.setWarningInfo(warnInfo);
    		return provInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Creates a analytical heartbeat
    /// </summary>
    /// <param name="analyticalHeartbeat">Is the object which contains all analytical Heartbeat Information.</param>
    /// <returns>"Successfully created analytical heartbeat." or a WarningInfoDto</returns>
    public ProvisioningInfo AddAnalyticalHeartbeat(AnalyticalHeartbeat analyticalHeartbeat) throws Exception {
    	
    	URI uri = new URIBuilder()
    			.setPath(this.ApiBaseUrl + "/api/ProductAnalytics/isv/"+ this.IsvId + "/analyticalHeartbeat").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(analyticalHeartbeat);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);     	
    	ObjectMapper mapper = new ObjectMapper();
		
        // If generating a analytical heartbeat was successful, the api returns a status code Ok(200) with the message "Successfully created analytical heartbeat.".
    	if(response.getStatusLine().getStatusCode() == 200) {
    		LicenseInfo licInfo = mapper.readValue(response.getEntity().getContent(), LicenseInfo.class);
    		ProvisioningInfo provInfo = new ProvisioningInfo();
    		provInfo.setLicenseInfo(licInfo);
    		
    		return provInfo;
    	}
    	
        // If generating a analytical heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		ProvisioningInfo provInfo = new ProvisioningInfo();
    		provInfo.setWarningInfo(warnInfo);
    		return provInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
	
    /// <summary>
    /// Unassign a activated license.
    /// </summary>
    /// <param name="deviceLicenseKey">Is the key of the license assignment which you want to unassign.</param>
    /// <returns>"Successfully deactivated License." or a WarningInfoDto</returns>
    public String Unassign(String deviceLicenseKey) throws Exception {
    	
     	URI uri = new URIBuilder()
    			.setPath(this.ApiBaseUrl + "/api/Provisioning/" + this.IsvId + "/devicelicensekey/" + deviceLicenseKey + "/unassign").build();
    	   	    
     	StringEntity requestEntity = new StringEntity(
    			"",
    		    ContentType.APPLICATION_JSON);
     	
    	HttpUriRequest request = RequestBuilder.post().setUri(uri).setEntity(requestEntity).build();
    	HttpResponse response = this.client.execute(request); 
    	String responseBody = EntityUtils.toString(response.getEntity());
		
    	ObjectMapper mapper = new ObjectMapper();

		// If unassign was successful, the api returns a status code Ok(200) with the message "Successfully created analytical heartbeat.".
    	if(response.getStatusLine().getStatusCode() == 200) {
    		return responseBody;
    	}
    	
    	// If unassign was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		return warnInfo.ErrorMessage;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Get the license info
    /// </summary>
    /// <param name="deviceLicenseKey">Is the key of the license assignment where you want to get the depending license information.</param>
    /// <returns>LicenseInfo</returns>
    public LicenseInfo GetLicenseInfo(String deviceLicenseKey) throws Exception {
    	
    	URI uri = new URIBuilder()
    			.setPath(this.ApiBaseUrl + "/api/Provisioning/isv/" + this.IsvId + "/devicelicensekey/" + deviceLicenseKey).build();
    	   	    	
    	HttpUriRequest request = RequestBuilder.get().setUri(uri).build();
    	HttpResponse response = this.client.execute(request); 
    	ObjectMapper mapper = new ObjectMapper();
    	
    	if(response.getStatusLine().getStatusCode() == 200) {
    		LicenseInfo licInfo = mapper.readValue(response.getEntity().getContent(), LicenseInfo.class);
    		return licInfo;
    	}
    	    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Get a unique device id
    /// </summary>
    /// <returns>UUID via string</returns>
    public String GetUniqueDeviceId() {
    	
    	return UUID.randomUUID().toString();
    }
}
