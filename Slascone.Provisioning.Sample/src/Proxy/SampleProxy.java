package Proxy;

import java.io.IOException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
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
import Model.ConsumptionDto;
import Model.ConsumptionHeartbeatDto;
import Model.ConsumptionInfo;
import Model.LicenseInfo;
import Model.ProvisioningInfo;
import Model.SessionDto;
import Model.SessionInfo;
import Model.OpenSessionInfo;
import Model.StringResultInfo;
import Model.UnassignDto;
import Model.UsageHeartbeatDto;
import Model.ValidateConsumptionStatusDto;
import Model.ValidateLicenseDto;
import Model.WarningInfo;
import Program.Helper;

public class SampleProxy {

	private String ApiBaseUrl = "https://api.slascone.com";
    private String ProvisioningKey = "NfEpJ2DFfgczdYqOjvmlgP2O/4VlqmRHXNE9xDXbqZcOwXTbH3TFeBAKKbEzga7D7ashHxFtZOR142LYgKWdNocibDgN75/P58YNvUZafLdaie7eGwI/2gX/XuDPtqDW";
    private String IsvId = "2af5fe02-6207-4214-946e-b00ac5309f53";

	private int SignatureValidationMode = 2;
    private HttpClient client; 
	
    public SampleProxy() {
    	Header acceptHeader = new BasicHeader("Accept", "application/json");
		Header acceptEncodingHeader = new BasicHeader("Accept-Encoding", "utf-8");
    	Header contentTypeHeader = new BasicHeader("Content-type", "application/json");
    	Header provisioningHeader = new BasicHeader("ProvisioningKey", this.ProvisioningKey);
    	List<Header> headers = new ArrayList<Header>();
    	headers.add(acceptHeader);
    	headers.add(acceptEncodingHeader);
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
    public StringResultInfo AddAnalyticalHeartbeat(AnalyticalHeartbeat analyticalHeartbeat) throws Exception {
    	
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
			StringResultInfo resInfo = new StringResultInfo();
			resInfo.setSuccessInfo(EntityUtils.toString(entity, "UTF-8"));
    		return resInfo;
    	}
    	
        // If generating a analytical heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
			WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		StringResultInfo resInfo = new StringResultInfo();
    		resInfo.setWarningInfo(warnInfo);
    		return resInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Creates a usage heartbeat
    /// </summary>
    /// <param name="usageHeartbeat">Is the object which contains all usage Heartbeat Information.</param>
    /// <returns>"Successfully created usage heartbeat." or a WarningInfoDto</returns>
    public StringResultInfo AddUsageHeartbeat(UsageHeartbeatDto usageHeartbeat) throws Exception {
    	
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
			StringResultInfo resInfo = new StringResultInfo();
			HttpEntity entity = response.getEntity();
			resInfo.setSuccessInfo(EntityUtils.toString(entity, "UTF-8"));
    		return resInfo;
    	}
    	
        // If generating a usage heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
			WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		StringResultInfo resInfo = new StringResultInfo();
    		resInfo.setWarningInfo(warnInfo);
    		return resInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Creates a consumption heartbeat
    /// </summary>
    /// <param name="consumptionHeartbeat">Is the object which contains all consumption Heartbeat Information.</param>
    /// <returns>"Successfully created consumption heartbeat." or a WarningInfoDto</returns>
    public ConsumptionInfo AddConsumptionHeartbeat(ConsumptionHeartbeatDto consumptionHeartbeat) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/data_gathering/consumption_heartbeats").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(consumptionHeartbeat);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);     	
    	
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}

		ObjectMapper mapper = new ObjectMapper();

		// If generating a consumption heartbeat was successful, the api returns a status code Ok(200).
		// For every consumption mentioned in the request the api returns if the consumption was accepted
		// and the amount of remaining items.
		if (response.getStatusLine().getStatusCode() == 200) {

    		ConsumptionDto[] consumptions = mapper.readValue(response.getEntity().getContent(), ConsumptionDto[].class);
			ConsumptionInfo consumptionInfo = new ConsumptionInfo();
			consumptionInfo.setConsumptions(consumptions);
			return consumptionInfo;
		}
    	
        // If generating a consumption heartbeat was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
			WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
			ConsumptionInfo consumptionInfo = new ConsumptionInfo();
    		consumptionInfo.setWarningInfo(warnInfo);
    		return consumptionInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }    
    
    /// <summary>
    /// Get the consumption status
    /// </summary>
    /// <returns>Remaining consumptions</returns>
    public String GetConsumptionStatus(ValidateConsumptionStatusDto validateConsumptionStatusDto) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/validate/consumption").build();
    	   	    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(validateConsumptionStatusDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.get().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);
    	String responseBody = EntityUtils.toString(response.getEntity()); 
    	
    	if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
    	if(response.getStatusLine().getStatusCode() == 200) {
    		return responseBody;
    	}
    	    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
	
    /// <summary>
    /// Unassign a activated license.
    /// </summary>
    /// <param name="deviceLicenseKey">Is the key of the license assignment which you want to unassign.</param>
    /// <returns>"Successfully deactivated License." or a WarningInfoDto</returns>
	public StringResultInfo UnassignLicense(UnassignDto unassignDto) throws Exception {

		URI uri = new URIBuilder(this.ApiBaseUrl)
				.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/unassign").build();

		Gson gson = new Gson();
		String jsonActivateBody = gson.toJson(unassignDto);
		StringEntity requestEntity = new StringEntity(
				jsonActivateBody,
				ContentType.APPLICATION_JSON);

		HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
		HttpResponse response = this.client.execute(request);

		if (!IsSignatureValid(response)) {
			// throw new Exception("Signature is not valid!");
		}

		ObjectMapper mapper = new ObjectMapper();

		// If unassign was successful, the api returns a status code Ok(200) with the
		// message "Successfully created analytical heartbeat.".
		if (response.getStatusLine().getStatusCode() == 200) {
			StringResultInfo resInfo = new StringResultInfo();
			HttpEntity entity = response.getEntity();
			resInfo.setSuccessInfo(EntityUtils.toString(entity, "UTF-8"));
			return resInfo;
		}

		// If unassign was unsuccessful, the api returns a status code Conflict(409)
		// with the information of a warning.
		if (response.getStatusLine().getStatusCode() == 409) {
			WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
			StringResultInfo resInfo = new StringResultInfo();
			resInfo.setWarningInfo(warnInfo);
			return resInfo;
		}

		throw new Exception("Unexpected HttpClient Error.");
	}
    
    /// <summary>
    /// Opens a session
    /// </summary>
    /// <returns>SessionInfo where SessionViolationInfo or WarningInfoDto is set.</returns>
    public SessionInfo OpenSession(SessionDto sessionDto) throws Exception {
        
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/session/open").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(sessionDto);
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
    		OpenSessionInfo sesVioInfo = mapper.readValue(response.getEntity().getContent(), OpenSessionInfo.class);
    		SessionInfo sesInfo = new SessionInfo();
    		sesInfo.setSessionViolationInfo(sesVioInfo);
    		
    		return sesInfo;
    	}
    	
        // If activation was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		SessionInfo sesInfo = new SessionInfo();
    		sesInfo.setWarningInfo(warnInfo);
    		return sesInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }
    
    /// <summary>
    /// Closes a session
    /// </summary>
    /// <param name="consumptionHeartbeat">Is the object which contains all consumption Heartbeat Information.</param>
    /// <returns>"Success." or a WarningInfoDto</returns>
    public StringResultInfo CloseSession(SessionDto sessionDto) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/session/close").build();
    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(sessionDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = RequestBuilder.post().setEntity(requestEntity).setUri(uri).build();
    	HttpResponse response = this.client.execute(request);     	
    	ObjectMapper mapper = new ObjectMapper();

		if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
        // If closing the session was successful, the api returns a status code Ok(200) with the message "Success.".
    	if(response.getStatusLine().getStatusCode() == 200) {  	
			StringResultInfo resInfo = new StringResultInfo();
			HttpEntity entity = response.getEntity();
			resInfo.setSuccessInfo(EntityUtils.toString(entity, "UTF-8"));
    		return resInfo;
    	}
    	
        // If closing the session was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
			WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		StringResultInfo resInfo = new StringResultInfo();
    		resInfo.setWarningInfo(warnInfo);
    		return resInfo;
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
    /// Validates the authority by signature
    /// </summary>
    /// <returns>True if Signature is valid. False if Signature is invalid.</returns>
	private Boolean IsSignatureValid(HttpResponse response)
			throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException,
			SignatureException {

		if (SignatureValidationMode == 0)
			return true;

		HttpEntity entity = response.getEntity();
		byte[] responseBytes = EntityUtils.toByteArray(entity);
		if (!entity.isRepeatable()) {
			response.setEntity(new ByteArrayEntity(responseBytes));
		}

		String signatureHeaderString = response.getFirstHeader("x-slascone-signature").getValue();

		if (SignatureValidationMode == 1) {
			return Helper.IsSignatureValidSymmetricKey(responseBytes, signatureHeaderString);
		} else if (SignatureValidationMode == 2) {
			return Helper.IsSignatureValidAsymmetricKey(responseBytes, signatureHeaderString);
		}

		return true;
	}   
}
