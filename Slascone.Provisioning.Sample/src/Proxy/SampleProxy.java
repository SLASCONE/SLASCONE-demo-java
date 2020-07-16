package Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
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
import Model.AddHeartbeatDto;
import Model.AnalyticalHeartbeat;
import Model.LicenseInfo;
import Model.ProvisioningInfo;
import Model.UnassignDto;
import Model.UsageHeartbeatDto;
import Model.ValidateLicenseDto;
import Model.WarningInfo;

public class SampleProxy {
	
    private String ApiBaseUrl = "https://api.slascone.com";
    private String ProvisioningKey = "NfEpJ2DFfgdDcNMgL2FMlKR7/+fUhT8vtqqj0yj90FOirQ/yQwZmSnO8UOeH0w2l2ddo6U87dr5ZKZB9D1GT8F8A9wtYS0KQZQg7tmIT4x+NrkwzxEZKBpZ7yPfwjJsa";
    private String IsvId = "a9430797-a7cf-4a9f-8438-a0b2eddd7664";
    private String SignatureKey = "NfEpJ2DFfgdDcNMgL2FMlKR7/+fUhT8vtqqj0yj90FOirQ/yQwZmSnO8UOeH0w2lP84UEt5qEpwBukOS+HOWo88Yns6tS9I+6r0oAD4oy++LPRFYr7TBUivE50J23hnU";
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
    /// <returns>ProvisioningInfo where LicenseInfoDto or WarningInfoDto is set.</returns>
    public ProvisioningInfo Activate(ActivateInfo activateDto) throws Exception {
        
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/activations").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(activateDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
    	    	
    	HttpUriRequest request = RequestBuilder.post().setUri(uri).setEntity(requestEntity).build();
    	HttpResponse response = this.client.execute(request); 
    	
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}

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
    /// <returns>ProvisioningInfo where LicenseInfoDto or WarningInfoDto is set.</returns>
    public ProvisioningInfo AddHeartbeat(AddHeartbeatDto heartbeatDto) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/heartbeats").build();
    	   	    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(heartbeatDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
    	    	
    	HttpUriRequest request = RequestBuilder.post().setUri(uri).setEntity(requestEntity).build();
    	HttpResponse response = this.client.execute(request); 
    	  	
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
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
    public String AddAnalyticalHeartbeat(AnalyticalHeartbeat analyticalHeartbeat) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/data_gathering/analytical_heartbeats").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(analyticalHeartbeat);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);     	
    	ObjectMapper mapper = new ObjectMapper();
		
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
        // If generating a analytical heartbeat was successful, the api returns a status code Ok(200) with the message "Successfully created analytical heartbeat.".
    	if(response.getStatusLine().getStatusCode() == 200) {  		
    		HttpEntity entity = response.getEntity();
    		return EntityUtils.toString(entity, "UTF-8");
    	}
    	
        // If generating a analytical heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		return warnInfo.message;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Creates a usage heartbeat
    /// </summary>
    /// <param name="usageHeartbeat">Is the object which contains all usage Heartbeat Information.</param>
    /// <returns>"Successfully created usage heartbeat." or a WarningInfoDto</returns>
    public String AddUsageHeartbeat(UsageHeartbeatDto usageHeartbeat) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/data_gathering/usage_heartbeats").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(usageHeartbeat);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);     	
    	ObjectMapper mapper = new ObjectMapper();
		
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
        // If generating a usage heartbeat was successful, the api returns a status code Ok(200) with the message "Successfully created usage heartbeat.".
    	if(response.getStatusLine().getStatusCode() == 200) {  	
    		HttpEntity entity = response.getEntity();
    		return EntityUtils.toString(entity, "UTF-8");
    	}
    	
        // If generating a usage heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		return warnInfo.message;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
	
    /// <summary>
    /// Unassign a activated license.
    /// </summary>
    /// <param name="deviceLicenseKey">Is the key of the license assignment which you want to unassign.</param>
    /// <returns>"Successfully deactivated License." or a WarningInfoDto</returns>
    public String Unassign(UnassignDto unassignDto) throws Exception {
    	
     	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/unassign").build();
    	   	    
     	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(unassignDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);  
    	String responseBody = EntityUtils.toString(response.getEntity());
    	
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
		
    	ObjectMapper mapper = new ObjectMapper();

		// If unassign was successful, the api returns a status code Ok(200) with the message "Successfully created analytical heartbeat.".
    	if(response.getStatusLine().getStatusCode() == 200) {
    		return responseBody;
    	}
    	
    	// If unassign was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		return warnInfo.message;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Get the license info
    /// </summary>
    /// <param name="deviceLicenseKey">Is the key of the license assignment where you want to get the depending license information.</param>
    /// <returns>LicenseInfo</returns>
    public LicenseInfo GetLicenseInfo(ValidateLicenseDto validateLicenseDto) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/validate").build();
    	   	    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(validateLicenseDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.get().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);  
    	ObjectMapper mapper = new ObjectMapper();
    	
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
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
    public String GetUniqueDeviceId() throws IOException {
    	String command = "wmic csproduct get UUID";
        StringBuffer output = new StringBuffer();

        Process SerNumProcess = Runtime.getRuntime().exec(command);
        BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

        String line = "";
        while ((line = sNumReader.readLine()) != null) {
            output.append(line + "\n");
        }
        String MachineID=output.toString().substring(output.indexOf("\n"), output.length()).trim();;
        return MachineID;
    }
    

    
    public static String encode(String key, String data) throws Exception {
    	  Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
    	  SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
    	  sha256_HMAC.init(secret_key);

    	  return Hex.encodeHexString(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
    	}
    
    /// <summary>
    /// Validates the authority by signature
    /// </summary>
    /// <returns>True if Signature is valid. False if Signature is invalid.</returns>
    private Boolean IsSignatureValid(HttpResponse response) throws IOException, NoSuchAlgorithmException, InvalidKeyException
    {
        var responseStream = EntityUtils.toByteArray(response.getEntity()); 

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
  	    SecretKeySpec secret_key = new SecretKeySpec(this.SignatureKey.getBytes("UTF-8"), "HmacSHA256");
  	    sha256_HMAC.init(secret_key);

  	    String hashString = Hex.encodeHexString(sha256_HMAC.doFinal(responseStream));

        if (response.getFirstHeader("x-slascone-signature").getValue() == hashString)
        {
            return true;
        }

        return false;

    }
}
