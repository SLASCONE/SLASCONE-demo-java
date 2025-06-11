package Proxy;

import java.io.File;
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

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
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

/**
 * SampleProxy is a class that provides methods to interact with the Slascone API for license provisioning and management.
 * It includes methods for activating licenses, adding heartbeats, managing sessions, and handling consumption data.
 */
public class SampleProxy {

	private String ApiBaseUrl = "https://api.slascone.com";
    private String ProvisioningKey = "NfEpJ2DFfgczdYqOjvmlgP2O/4VlqmRHXNE9xDXbqZcOwXTbH3TFeBAKKbEzga7D7ashHxFtZOR142LYgKWdNocibDgN75/P58YNvUZafLdaie7eGwI/2gX/XuDPtqDW";
    private String IsvId = "2af5fe02-6207-4214-946e-b00ac5309f53";

	private int SignatureValidationMode = 2;
    private HttpClient client;
    
    /**
     * The folder where application data files will be stored.
     * This folder is used for license files, session data, and other application data.
     */
    private String AppDataFolder;
    
    /**
     * Gets the current AppDataFolder where files are stored.
     * 
     * @return The current application data folder path
     */
    public String getAppDataFolder() {
        return AppDataFolder;
    }
    
    /**
     * Sets the AppDataFolder to a new location.
     * Creates the directory if it doesn't exist.
     * 
     * @param folder The new folder path to use for application data
     * @return true if the folder was set successfully, false otherwise
     */
    public boolean setAppDataFolder(String folder) {
        try {
            File dir = new File(folder);
            if (!dir.exists()) {
                boolean created = dir.mkdirs();
                if (!created) {
                    System.err.println("Failed to create directory: " + folder);
                    return false;
                }
            } else if (!dir.isDirectory()) {
                System.err.println("Path exists but is not a directory: " + folder);
                return false;
            }
            
            // Check if the directory is writable
            if (!dir.canWrite()) {
                System.err.println("Directory is not writable: " + folder);
                return false;
            }
            
            AppDataFolder = folder;
            return true;
        } catch (Exception e) {
            System.err.println("Error setting AppDataFolder: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
      /**
     * Constructor that initializes the HTTP client with the appropriate headers for API communication.
     */
    public SampleProxy() {
		Header acceptHeader = new BasicHeader("Accept", "application/json");
		Header acceptEncodingHeader = new BasicHeader("Accept-Encoding", "utf-8");
		Header contentTypeHeader = new BasicHeader("Content-type", "application/json");
		Header provisioningHeader = new BasicHeader("ProvisioningKey", this.ProvisioningKey);
		Header lastModifiedByHeader = new BasicHeader("LastModifiedBy", "Slascone-demo-java");
		List<Header> headers = new ArrayList<Header>();
		headers.add(acceptHeader);
		headers.add(acceptEncodingHeader);
		headers.add(contentTypeHeader);
		headers.add(provisioningHeader);
		headers.add(lastModifiedByHeader);
		
		this.client = HttpClients.custom().setDefaultHeaders(headers).build();
        
        // Set default app data folder
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            // On Windows, use ProgramData folder
            this.AppDataFolder = System.getenv("ProgramData") + File.separator + "Slascone";
        } else {
            // On Linux/macOS, use user's home directory
            this.AppDataFolder = System.getProperty("user.home") + File.separator + ".slascone";
        }
        
        // Create the folder if it doesn't exist
        this.setAppDataFolder(this.AppDataFolder);
    }
    
    /**
     * Activates a License with the SLASCONE service.
     *
     * @param activateDto The activation information required to activate the license
     * @return ProvisioningInfo containing either LicenseInfo on success or WarningInfo on failure
     * @throws Exception If signature validation fails or other errors occur
     */
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

    	ObjectMapper mapper = CreateObjectMapper();
    	
    	// If activation was successful, the api returns a status code Ok(200) with the information of the license.
    	if(response.getStatusLine().getStatusCode() == 200) {

			StoreToLocalFiles(response, "license");
    	
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
    
    /**
     * Creates a heartbeat to verify license status with the SLASCONE server.
     * Stores license information locally for offline use.
     *
     * @param heartbeatDto The heartbeat information to send to the server
     * @return ProvisioningInfo containing either LicenseInfo on success or WarningInfo on failure
     * @throws Exception If signature validation fails or other errors occur
     */
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

    	ObjectMapper mapper = CreateObjectMapper();
		
        // If generating a heartbeat was successful, the api returns a status code Ok(200) with the information of the license.
    	if(response.getStatusLine().getStatusCode() == 200) {

			StoreToLocalFiles(response, "license");
    	
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

	/**
	 * Retrieves license information from local cache for offline use.
	 * Validates the signature of the cached license data.
	 *
	 * @return ProvisioningInfo containing the license information, or null if validation fails
	 * @throws IOException If an I/O error occurs reading the cache files
	 */
	public ProvisioningInfo GetOfflineLicense() throws IOException {
		try {
			// Read body of response and signature header from local files
			byte[] licenseBytes = Helper.ReadFromFile("license.txt", this.AppDataFolder);
			byte[] signatureBytes = Helper.ReadFromFile("license_signature.txt", this.AppDataFolder);

			if (signatureBytes != null) {
				String signatureHeaderString = new String(signatureBytes);

				boolean isValid = true;
				if (SignatureValidationMode == 1) {
					try {
						isValid = Helper.IsSignatureValidSymmetricKey(licenseBytes, signatureHeaderString);
						if (!isValid) {
							System.err.println("Signature validation failed: Symmetric key validation error");
						}
					} catch (Exception e) {
						System.err.println("Error checking signature with symmetric key: " + e.getMessage());
						isValid = false;
					}
				} else if (SignatureValidationMode == 2) {
					try {
						isValid = Helper.IsSignatureValidAsymmetricKey(licenseBytes, signatureHeaderString);
						if (!isValid) {
							System.err.println("Signature validation failed: Asymmetric key validation error");
						}
					} catch (Exception e) {
						System.err.println("Error checking signature with asymmetric key: " + e.getMessage());
						isValid = false;
					}
				}

				if (!isValid) {
					return null;
				}
			} else {
				System.err.println("Signature file not found or empty.");
				return null;
			}

			ObjectMapper mapper = CreateObjectMapper();

			LicenseInfo licInfo = mapper.readValue(new ByteArrayEntity(licenseBytes).getContent(), LicenseInfo.class);
			ProvisioningInfo provInfo = new ProvisioningInfo();
			provInfo.setLicenseInfo(licInfo);
			
			return provInfo;
		} catch (Exception e) {
			System.err.println("Error retrieving offline license: " + e.getMessage());
			return null;
		}
	}
    
    /**
     * Creates an analytical heartbeat for data gathering purposes.
     *
     * @param analyticalHeartbeat The object containing analytical heartbeat information
     * @return StringResultInfo containing either success message or warning information
     * @throws Exception If signature validation fails or other errors occur
     */
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
    	ObjectMapper mapper = CreateObjectMapper();
    	
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
    
    /**
     * Creates a usage heartbeat for tracking feature usage.
     *
     * @param usageHeartbeat The object containing usage heartbeat information
     * @return StringResultInfo containing either success message or warning information
     * @throws Exception If signature validation fails or other errors occur
     */
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
    	ObjectMapper mapper = CreateObjectMapper();
    	
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
    
    /**
     * Creates a consumption heartbeat for tracking license consumption metrics.
     *
     * @param consumptionHeartbeat The object containing consumption heartbeat information
     * @return ConsumptionInfo containing consumption status or warning information
     * @throws Exception If signature validation fails or other errors occur
     */
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

		ObjectMapper mapper = CreateObjectMapper();

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
    
    /**
     * Gets the consumption status for a license.
     *
     * @param validateConsumptionStatusDto The DTO containing information needed to validate consumption
     * @return String containing the remaining consumption information
     * @throws Exception If signature validation fails or other errors occur
     */
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
	
    /**
     * Unassigns an activated license from a device.
     *
     * @param unassignDto The DTO containing license key and device information
     * @return StringResultInfo containing either success message or warning information
     * @throws Exception If signature validation fails or other errors occur
     */
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

		ObjectMapper mapper = CreateObjectMapper();

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
    
    /**
     * Opens a floating license session.
     * Stores session information locally for offline use.
     *
     * @param sessionDto The DTO containing session information
     * @return SessionInfo containing either OpenSessionInfo on success or WarningInfo on failure
     * @throws Exception If signature validation fails or other errors occur
     */
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

		StoreToLocalFiles(response, "session");

		ObjectMapper mapper = CreateObjectMapper();
    	
    	 // If activation was successful, the api returns a status code Ok(200) with the information of the license.
    	if(response.getStatusLine().getStatusCode() == 200) {
    		OpenSessionInfo openSessionInfo = mapper.readValue(response.getEntity().getContent(), OpenSessionInfo.class);
    		SessionInfo sessionInfo = new SessionInfo();
    		sessionInfo.setOpenSessionInfo(openSessionInfo);
    		
    		return sessionInfo;
    	}
    	
        // If activation was unsuccessful, the api returns a status code Conflict(409) with the information of a warning.
    	if(response.getStatusLine().getStatusCode() == 409) {
    		WarningInfo warnInfo = mapper.readValue(response.getEntity().getContent(), WarningInfo.class);
    		SessionInfo sesInfo = new SessionInfo();
    		sesInfo.setWarningInfo(warnInfo);
    		return sesInfo;
    	}
    	
    	throw new Exception("Unexpected HttpClient Error.");
    }    /**
     * Attempts to find an open session in the local cache for offline use.
     * Validates the session signature and checks if it's still valid.
     *
     * @param sesInfo SessionInfo object to populate with session data if found
     * @return boolean true if a valid session was found, false otherwise
     */
	public boolean TryFindOpenSessionOffline(SessionInfo sesInfo) {

		try {
			// Read body of response and signature header from local files
			byte[] sessionBytes = Helper.ReadFromFile("session.txt", this.AppDataFolder);
			String signatureHeaderString = new String(Helper.ReadFromFile("session_signature.txt", this.AppDataFolder));

			if (SignatureValidationMode == 1 && !Helper.IsSignatureValidSymmetricKey(sessionBytes, signatureHeaderString)) {
				throw new Exception("Signature is not valid!");
			} else if (SignatureValidationMode == 2 && !Helper.IsSignatureValidAsymmetricKey(sessionBytes, signatureHeaderString)) {
				throw new Exception("Signature is not valid!");
			}

			ObjectMapper mapper = CreateObjectMapper();

			OpenSessionInfo openSessionInfo = mapper.readValue(new ByteArrayEntity(sessionBytes).getContent(), OpenSessionInfo.class);

			// Check session valid date/time against current date/time
			if (openSessionInfo.getSession_valid_until().compareTo(new java.util.Date()) < 0) {
				return false;
			} 
			
			sesInfo.setOpenSessionInfo(openSessionInfo);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
    
    /**
     * Closes an open floating license session.
     * Removes local session cache files.
     *
     * @param sessionDto The DTO containing session information
     * @return StringResultInfo containing either success message or warning information
     * @throws Exception If signature validation fails or other errors occur
     */
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
    	ObjectMapper mapper = CreateObjectMapper();

		if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
        // If closing the session was successful, the api returns a status code Ok(200) with the message "Success.".
    	if(response.getStatusLine().getStatusCode() == 200) {  	
			StringResultInfo resInfo = new StringResultInfo();
			HttpEntity entity = response.getEntity();
			resInfo.setSuccessInfo(EntityUtils.toString(entity, "UTF-8"));

			// Remove session info files if any exists
			RemoveLocalFiles("session");

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
    
    /**
     * Gets the license information for a specific license key.
     *
     * @param validateLicenseDto The DTO containing license key information
     * @return LicenseInfo containing detailed license information
     * @throws Exception If signature validation fails or other errors occur
     */
    public LicenseInfo GetLicenseInfo(ValidateLicenseDto validateLicenseDto) throws Exception {
    	
    	URI uri = new URIBuilder(this.ApiBaseUrl)
    			.setPath("/api/v2/isv/" + this.IsvId + "/provisioning/validate").build();
    	   	    	
    	Gson gson = new Gson();
    	String jsonActivateBody = gson.toJson(validateLicenseDto);
    	StringEntity requestEntity = new StringEntity(
    			jsonActivateBody,
    		    ContentType.APPLICATION_JSON);
		    	    	
    	HttpUriRequest request = 
			RequestBuilder.get()
			.setEntity(requestEntity)
			.setHeader("LastModifiedBy", "")
			.setUri(uri)
			.build();
    	HttpResponse response = this.client.execute(request);  
    	ObjectMapper mapper = CreateObjectMapper();

		if(!IsSignatureValid(response)) {
    		throw new Exception("Signature is not valid!");
    	}
    	
    	if(response.getStatusLine().getStatusCode() == 200) {
    		LicenseInfo licInfo = mapper.readValue(response.getEntity().getContent(), LicenseInfo.class);
    		return licInfo;
    	}
    	    	
    	throw new Exception("Unexpected HttpClient Error.");
    }

    /**
     * Creates an ObjectMapper configured to ignore unknown properties.
     *
     * @return ObjectMapper instance configured for JSON deserialization
     */
	private ObjectMapper CreateObjectMapper() {
		return JsonMapper.builder().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).build();
		// return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
     
    /**
     * Validates the authority of a response by checking its signature.
     *
     * @param response The HTTP response to validate
     * @return True if signature is valid, false otherwise
     * @throws IOException If an I/O error occurs
     * @throws NoSuchAlgorithmException If the encryption algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     * @throws InvalidKeySpecException If the key specification is invalid
     * @throws SignatureException If the signature operation fails
     */
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
	}    /**
     * Stores response body and signature to local files for offline use.
     *
     * @param response The HTTP response to store
     * @param entityFileName Base name for the files to create
     * @throws IOException If an I/O error occurs
     */
	private void StoreToLocalFiles(HttpResponse response, String entityFileName) throws IOException {

		HttpEntity entity = response.getEntity();
		byte[] responseBytes = EntityUtils.toByteArray(entity);
		if (!entity.isRepeatable()) {
			response.setEntity(new ByteArrayEntity(responseBytes));
		}

		String signatureHeaderString = response.getFirstHeader("x-slascone-signature").getValue();

		// Store body of response and signature header to local files
		Helper.StoreToFile(entityFileName + ".txt", responseBytes, this.AppDataFolder);
		Helper.StoreToFile(entityFileName + "_signature.txt", signatureHeaderString.getBytes(), this.AppDataFolder);
	}

    /**
     * Removes local cache files for a given entity.
     *
     * @param entityFileName Base name of the files to remove
     * @throws IOException If an I/O error occurs
     */
	private void RemoveLocalFiles(String entityFileName) throws IOException {
		Helper.RemoveFile(entityFileName + ".txt", this.AppDataFolder);
		Helper.RemoveFile(entityFileName + "_signature.txt", this.AppDataFolder);
	}
}
