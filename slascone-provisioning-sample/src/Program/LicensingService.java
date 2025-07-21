package Program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.slascone.ApiClient;
import com.slascone.api.DataGatheringApi;
import com.slascone.api.ProvisioningApi;
import com.slascone.auth.ApiKeyAuth;
import com.slascone.model.ActivateClientDto;
import com.slascone.model.AddHeartbeatDto;
import com.slascone.model.AnalyticalFieldValueDto;
import com.slascone.model.AnalyticalHeartbeatDto;
import com.slascone.model.FullUsageHeartbeatDto;
import com.slascone.model.LicenseInfoDto;
import com.slascone.model.SessionRequestDto;
import com.slascone.model.SessionStatusDto;
import com.slascone.model.UnassignDto;
import com.slascone.model.UsageHeartbeatValueDto;
import com.slascone.model.ConsumptionHeartbeatValueDto;
import com.slascone.model.FullConsumptionHeartbeatDto;
import com.slascone.model.ConsumptionDto;

/**
 * Service class that handles all interactions with the SLASCONE licensing platform.
 * This includes license activation, heartbeats, analytics tracking, and session management.
 */
public class LicensingService {
    
    // API client instance for communication with SLASCONE services
    private ApiClient apiClient;
    // API for license provisioning operations (activation, heartbeat, etc.)
    private ProvisioningApi provisioningApi;
    // API for data collection operations (usage, analytics, consumption)
    private DataGatheringApi dataGatheringApi;

    // Current license key for the activated license
    private String licenseKey;
    // Token key returned by the SLASCONE server
    private UUID tokenKey;
    
    // Map to store limitation values from license for potential usage in the application
    // Key: Limitation UUID, Value: String containing name and max value
    private Map<UUID, String> limitationMap;	

    /**
     * Constructor that initializes the API client and sets up the authentication.
     * Configures the client with the base URL and provisioning key from Settings.
     */
    public LicensingService(FileService fileService) {

        apiClient = new CustomApiClient(fileService);

        // Initialize the API client with the base path
        apiClient.setBasePath(Settings.API_BASE_URL);
        
        // Set the provisioning key for authentication
        ApiKeyAuth provisioningKey = (ApiKeyAuth) apiClient.getAuthentication("ProvisioningKey");
        provisioningKey.setApiKey(Settings.PROVISIONING_KEY);
        
        // Initialize the Provisioning and DataGathering APIs with the custom client
        provisioningApi = new ProvisioningApi(apiClient);
        dataGatheringApi = new DataGatheringApi(apiClient);
   }

    /**
     * Activates a license
     * This method associates the current device with the provided license key.
     *
     * @param licenseKey The license key to activate
     * @param clientName The name to identify this client/device
     * @param clientDescription Additional description for this client/device
     * @throws IOException If there's an issue with the API call
     */
    public void activateLicense(String licenseKey, String clientName, String clientDescription) throws IOException {

        ActivateClientDto activateInfo = new ActivateClientDto()
                .productId(UUID.fromString(Settings.PRODUCT_ID))
                .licenseKey(licenseKey)
                .clientId(DeviceInfoService.getUniqueDeviceId())
                .clientName(clientName)
                .clientDescription(clientDescription);

        try {

            var result = ErrorHandlingHelper.execute(
                provisioningApi::activateLicenseWithHttpInfo,
                activateInfo,
                "activateLicense");
    
            LicenseInfoDto licenseInfo = result.getResult();

            if (result.hasError()) {
                System.out.println("Activation failed: " + result.getErrorMessage());
                return;
            }

            System.out.println("Successfully activated license.");
            // Store license key and token if available
            Object licenseKeyObj = licenseInfo.getLicenseKey();
            if (licenseKeyObj != null) {
                this.licenseKey = licenseKeyObj.toString();
            }
            
            // Store token for future authentication
            Object tokenKeyObj = licenseInfo.getTokenKey();
            if (tokenKeyObj != null) {
                this.tokenKey = UUID.fromString(tokenKeyObj.toString());
            }
            limitationMap = LicensePrettyPrinter.PrintLicenseInfo(licenseInfo);

        } catch (Exception e) {
            System.out.println("Unknown Error: " + e.getMessage());
        }
    }

    /**
     * Sends a heartbeat to the SLASCONE licensing server.
     * This validates the license, updates the local license information,
     * and provides up-to-date information about license status.
     *
     * @throws IOException If there's an issue with the API call
     */
    public void addHeartbeat() throws IOException {

        AddHeartbeatDto addHeartbeatDto =
            new AddHeartbeatDto()
                .clientId(DeviceInfoService.getUniqueDeviceId())
                .operatingSystem(DeviceInfoService.getOperatingSystem())
                .productId(UUID.fromString(Settings.PRODUCT_ID))
                .softwareVersion("25.1.0");

        try {

            var result =
            ErrorHandlingHelper.execute(
                provisioningApi::addHeartbeatWithHttpInfo,
                addHeartbeatDto,
                "addHeartbeat");

            if (result.hasError()) {
                System.out.println("Error during heartbeat: " + result.getErrorMessage());
                return;
            }

            LicenseInfoDto licenseInfoDto = result.getResult();
            
            // Convert the string licenseKey to UUID format
            Object licenseKeyObj = licenseInfoDto.getLicenseKey();
            if (licenseKeyObj != null) {
                this.licenseKey = licenseKeyObj.toString();            
            }
            
            // Store the token for future authentication
            Object tokenKeyObj = licenseInfoDto.getTokenKey();
            if (tokenKeyObj != null) {
                this.tokenKey = UUID.fromString(tokenKeyObj.toString()); 
            }
            limitationMap = LicensePrettyPrinter.PrintLicenseInfo(licenseInfoDto);

        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    /**
     * Unassigns the current device from its license.
     * This frees up the license seat for use on another device.
     * Requires a valid token obtained from a previous activation or heartbeat.
     *
     * @throws IOException If there's an issue with the API call
     */
    public void unassignLicense() throws IOException {
        if (tokenKey == null) {
            System.out.println("You have to add a license heartbeat first to get a token for this operation.");
            return;
        }

        // Create the unassign DTO
        UnassignDto unassignDto = new UnassignDto();
        unassignDto.setTokenKey(tokenKey);

        try {
            var result = ErrorHandlingHelper.execute(
                provisioningApi::unassignLicenseWithHttpInfo,
                unassignDto,
                "unassignLicense");

            if (result.hasError()) {
                System.out.println("Unassign failed: " + result.getErrorMessage());
                return;
            }

            // The API returns a String message on success
            String responseMessage = result.getResult();
            if (responseMessage != null && !responseMessage.isEmpty()) {
                // Clear the token since the license is unassigned
                tokenKey = null;
                licenseKey = null;
                limitationMap = null;
                System.out.println("Successfully unassigned device from license.");
            } else {
                System.out.println("Unknown Error");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    /**
     * Adds an analytical heartbeat to track custom analytics data
     * 
     * @param analyticalFieldId The UUID of the analytical field to update
     * @param value The value to record for the analytical field
     * @throws IOException If there's an issue with the API call
     */
    public void addAnalyticalHeartbeat(UUID analyticalFieldId, String value) throws IOException {
        // Create the analytical field value
        AnalyticalFieldValueDto analyticalField = new AnalyticalFieldValueDto()
                .analyticalFieldId(analyticalFieldId)
                .value(value);
        
        List<AnalyticalFieldValueDto> valueList = new ArrayList<>();
        valueList.add(analyticalField);

        // Create the analytical heartbeat DTO
        AnalyticalHeartbeatDto analyticalHb = new AnalyticalHeartbeatDto()
                .clientId(DeviceInfoService.getUniqueDeviceId())
                .analyticalHeartbeat(valueList);

        try {
            var result = ErrorHandlingHelper.execute(
                dataGatheringApi::addAnalyticalHeartbeatWithHttpInfo,
                analyticalHb,
                "addAnalyticalHeartbeat");

            if (result.hasError()) {
                System.out.println("Error during analytical heartbeat: " + result.getErrorMessage());
                return;
            }

            String responseMessage = result.getResult();
            System.out.println("Successfully created analytical heartbeat: " + responseMessage);
            
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    /**
     * Adds a usage heartbeat to track feature usage
     * 
     * @param usageFeatureIds List of UUIDs for the usage features to track
     * @param usageModuleIds List of UUIDs for the usage modules to track (can be null)
     * @param values List of values for each feature/module
     * @throws IOException If there's an issue with the API call
     * @throws IllegalArgumentException If input parameters are invalid
     */
    public void addUsageHeartbeat(List<UUID> usageFeatureIds, List<UUID> usageModuleIds, List<Double> values) throws IOException {
        // Validate input parameters
        if (usageFeatureIds == null || values == null || usageFeatureIds.size() != values.size()) {
            throw new IllegalArgumentException("Feature IDs and values must be non-null and have the same length");
        }

        // Create list to hold usage heartbeat values
        List<UsageHeartbeatValueDto> usageHeartbeatValues = new ArrayList<>();
        
        // Create each usage heartbeat value
        for (int i = 0; i < usageFeatureIds.size(); i++) {
            var usageHeartbeatValue = new UsageHeartbeatValueDto();
            usageHeartbeatValue.setUsageFeatureId(usageFeatureIds.get(i));
            
            // Set module ID if available
            if (usageModuleIds != null && i < usageModuleIds.size()) {
                UUID moduleId = usageModuleIds.get(i);
                if (moduleId != null) {
                    usageHeartbeatValue.setUsageModuleId(moduleId.toString());
                } else {
                    usageHeartbeatValue.setUsageModuleId(null);
                }
            } else {
                usageHeartbeatValue.setUsageModuleId(null);
            }
            
            usageHeartbeatValue.setValue(values.get(i));
            usageHeartbeatValues.add(usageHeartbeatValue);
        }

        // Build FullUsageHeartbeatDto
        var fullUsageHeartbeatDto = new FullUsageHeartbeatDto()
            .clientId(DeviceInfoService.getUniqueDeviceId())
            .usageHeartbeat(usageHeartbeatValues);
        // Optionally set tokenKey if needed: .tokenKey(null)

        try {
            var result = ErrorHandlingHelper.execute(
                dataGatheringApi::addUsageHeartbeatWithHttpInfo,
                fullUsageHeartbeatDto,
                "addUsageHeartbeat");

            if (result.hasError()) {
                System.out.println("Error during usage heartbeat: " + result.getErrorMessage());
                return;
            }

            String responseMessage = result.getResult();
            System.out.println("Successfully created usage heartbeat: " + responseMessage);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    /**
     * Adds a consumption heartbeat to track resource consumption
     * 
     * @param limitationIds List of UUIDs for the limitations to track consumption for
     * @param values List of values for each limitation (as BigDecimal)
     * @throws IOException If there's an issue with the API call
     * @throws IllegalArgumentException If input parameters are invalid
     */
    public void addConsumptionHeartbeat(List<UUID> limitationIds, List<java.math.BigDecimal> values) throws IOException {
        // Validate input parameters
        if (limitationIds == null || values == null || limitationIds.size() != values.size()) {
            throw new IllegalArgumentException("Limitation IDs and values must be non-null and have the same length");
        }

        // Create list to hold consumption heartbeat values
        List<ConsumptionHeartbeatValueDto> consumptionHeartbeatValues = new ArrayList<>();
        
        // Create each consumption heartbeat value
        for (int i = 0; i < limitationIds.size(); i++) {
            var consumptionHeartbeatValue = new ConsumptionHeartbeatValueDto();
            consumptionHeartbeatValue.setLimitationId(limitationIds.get(i));
            consumptionHeartbeatValue.setValue(values.get(i));
            // Timestamp is optional, so we'll leave it as null
            consumptionHeartbeatValues.add(consumptionHeartbeatValue);
        }

        // Build FullConsumptionHeartbeatDto
        var fullConsumptionHeartbeatDto = new FullConsumptionHeartbeatDto()
            .clientId(DeviceInfoService.getUniqueDeviceId())
            .consumptionHeartbeat(consumptionHeartbeatValues);
        // Optionally set tokenKey if needed: .tokenKey(null)

        try {
            var result = ErrorHandlingHelper.execute(
                dataGatheringApi::addConsumptionHeartbeatWithHttpInfo,
                fullConsumptionHeartbeatDto,
                "addConsumptionHeartbeat");

            if (result.hasError()) {
                System.out.println("Error during consumption heartbeat: " + result.getErrorMessage());
                return;
            }

            List<ConsumptionDto> consumptionResults = result.getResult();
            if (consumptionResults != null && !consumptionResults.isEmpty()) {
                for (ConsumptionDto consumption : consumptionResults) {
                    UUID transactionId = consumption.getTransactionId();
                    if (transactionId != null) {
                        // A valid transaction ID indicates successful consumption
                        System.out.println("Successfully created consumption heartbeat. Remaining: " + consumption.getRemaining());
                    } else {
                        // No transaction ID typically means consumption limit reached
                        System.out.println("Consumption limit reached!");
                    }
                }
            } else {
                System.out.println("No consumption results received");
            }
            
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    /**
     * Opens a session with the SLASCONE license server.
     * Sessions are used to track concurrent usage of the software.
     * 
     * @throws IOException If there's an issue with the API call
     */
    public void openSession() throws IOException {
        if (licenseKey == null || licenseKey.isEmpty()) {
            System.out.println("No license key available. Please activate a license or perform a heartbeat first.");
            return;
        }

        // Create the session request DTO
        SessionRequestDto sessionRequestDto = new SessionRequestDto()
                .clientId(DeviceInfoService.getUniqueDeviceId())
                .licenseId(UUID.fromString(licenseKey));

        try {
            var result = ErrorHandlingHelper.execute(
                provisioningApi::openSessionWithHttpInfo,
                sessionRequestDto,
                "openSession");

            if (result.hasError()) {
                System.out.println("Opening session failed: " + result.getErrorMessage());
                return;
            }

            SessionStatusDto sessionStatus = result.getResult();
            System.out.println("Successfully opened session.");
            System.out.println("Session valid until: " + sessionStatus.getSessionValidUntil());
            
        } catch (InterruptedException e) {
            System.out.println("Session operation was interrupted: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    /**
     * Closes a session with the SLASCONE license server.
     * This should be called when the user stops using the software to free up
     * the concurrent usage seat for other users.
     * 
     * @throws IOException If there's an issue with the API call
     */
    public void closeSession() throws IOException {
        if (licenseKey == null || licenseKey.isEmpty()) {
            System.out.println("No license key available. Please activate a license or perform a heartbeat first.");
            return;
        }

        // Create the session request DTO
        SessionRequestDto sessionRequestDto = new SessionRequestDto()
                .clientId(DeviceInfoService.getUniqueDeviceId())
                .licenseId(UUID.fromString(licenseKey));

        try {
            var result = ErrorHandlingHelper.execute(
                provisioningApi::closeSessionWithHttpInfo,
                sessionRequestDto,
                "closeSession");

            if (result.hasError()) {
                System.out.println("Closing session failed: " + result.getErrorMessage());
                return;
            }

            String responseMessage = result.getResult();
            if (responseMessage != null && !responseMessage.isEmpty()) {
                System.out.println("Successfully closed session.");
            } else {
                System.out.println("Unknown Error");
            }
            
        } catch (InterruptedException e) {
            System.out.println("Session operation was interrupted: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    /**
     * Sets the license key
     * 
     * @param licenseKey The license key to set
     */
    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }
    
    /**
     * Sets the token key
     * 
     * @param tokenKey The token key to set
     */
    public void setTokenKey(UUID tokenKey) {
        this.tokenKey = tokenKey;
    }
    
    /**
     * Sets the limitation map
     * 
     * @param limitationMap The limitation map to set
     */
    public void setLimitationMap(Map<UUID, String> limitationMap) {
        this.limitationMap = limitationMap;
    }
    
    /**
     * Gets the license key
     * 
     * @return The current license key
     */
    public String getLicenseKey() {
        return licenseKey;
    }
    
    /**
     * Gets the token key
     * 
     * @return The current token key
     */
    public UUID getTokenKey() {
        return tokenKey;
    }
    
    /**
     * Gets the limitation map
     * 
     * @return The current limitation map
     */
    public Map<UUID, String> getLimitationMap() {
        return limitationMap;
    }
    
}
