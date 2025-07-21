package Program;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.slascone.ApiClient;
import com.slascone.auth.ApiKeyAuth;
import com.slascone.model.LicenseInfoDto;
import com.slascone.model.SessionStatusDto;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import Model.LicenseXml; // For offline license XML parsing

/**
 * Main program class for the SLASCONE licensing demo application.
 * This class demonstrates various licensing operations such as activation,
 * heartbeats, analytics, and consumption tracking.
 */
public class Program {
    
    private LicensingService licensingService;
    private FileService fileService;

    /**
     * Default constructor initializes the API client and sets the base path.
     */
    public Program() {

        // Initialize the file service
		// Set default app data folder
        fileService = new FileService(FileService.standardAppDataFolder());

        // Initialize the licensing service with the app data folder
        licensingService = new LicensingService(fileService);

        System.out.println("Using app data folder: " + fileService.getAppDataFolder());
    }

    /**
     * Main entry point for the Slascone client application.
     * Initializes the API client and starts the interactive console.
     */
    public static void main(String [] args) throws Exception {

        Program program = new Program();

        System.out.println("Slascone client app example");
        System.out.println("===========================");
        System.out.println();
        System.out.println("Unique Client-Id for this device: " + DeviceInfoService.getUniqueDeviceId());
        System.out.println("Operating system: " + System.getProperty("os.name"));
        System.out.println("App data folder: " + program.fileService.getAppDataFolder());

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println();
            System.out.println("-- MAIN");
            System.out.println("    1: Activate license (can be done only once per device)");
            System.out.println("    2: Add license heartbeat");
            System.out.println("    3: Temporary disconnection: Read local license file (only available after at least one license heartbeat)");
            System.out.println("    4: Unassign license from device (has to be activated again then)");
            System.out.println("-- ANALYTICS");
            System.out.println("    5: Add analytical heartbeat");
            System.out.println("    6: Add usage heart beat");
            System.out.println("    7: Add consumption heartbeat");
            System.out.println("-- FLOATING");
            System.out.println("    8: Open session");
            System.out.println("    9: Find open session (temporary disconnection)");			
            System.out.println("    10: Close session");			System.out.println("-- OFFLINE LICENSE");
            System.out.println("    11: Check and read offline license file");

            System.out.println("x: Exit program");

            System.out.print("> ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    program.activateExample();
                    break;

                case "2":
                    program.heartbeatExample();
                    break;
                    
                case "3":
                    program.offlineLicenseInfoExample();
                    break;
                    
                case "4":
                    program.unassignExample();
                    break;

                case "5":
                    program.analyticalHeartbeatExample();
                    break;

                case "6":
                    program.usageHeartbeatExample();
                    break;

                case "7":
                    program.consumptionHeartbeatExample(scanner);
                    break;

                case "8":
                    program.openSessionExample();
                    break;
                    
                case "9":
                    program.findOpenSessionOffline();
                    break;

                case "10":
                    program.closeSessionExample();
                    break; 
                case "11":
                    program.checkAndReadOfflineLicenseExample();
                    break;

                case "x":
                    System.out.println("Exiting program...");
                    break;

                default:
                    break;
            }

        } while (!input.equals("x"));

        scanner.close();
    }    
    
    /**
     * Demonstrates license activation using a demo license key.
     * In a real application, the license key would typically come from user input or configuration.
     *
     * @throws Exception If activation fails
     */
    private void activateExample() throws Exception {
        // Use a demo license key for activation
        String licenseKey = "27180460-29df-4a5a-a0a1-78c85ab6cee0";

        licensingService.activateLicense(licenseKey, "SLASCONE-demo-java", "SLASCONE Java demo with generated proxy");
    }

    /**
     * Demonstrates sending a license heartbeat to the SLASCONE licensing server.
     * Heartbeats are used to validate that the license is still active and to update local license information.
     *
     * @throws Exception If heartbeat fails
     */
    private void heartbeatExample() throws Exception {
        licensingService.addHeartbeat();
    }

    /**
     * Reads and processes the offline license information when the application 
     * is temporarily disconnected from the SLASCONE licensing server.
     * 
     * @throws Exception If there's an error processing the license
     * @throws IOException If there's an error reading the license file
     */
    private void offlineLicenseInfoExample() throws Exception, IOException {
        LicenseInfoDto licenseInfo = fileService.GetOfflineLicense();
        if (licenseInfo != null) {
            System.out.println("Successfully read temporary offline license.");

            Object licenseKeyObj = licenseInfo.getLicenseKey();
            if (licenseKeyObj != null) {
                licensingService.setLicenseKey(licenseKeyObj.toString());
            } else {
                licensingService.setLicenseKey(null);
            }

            Object tokenKeyObj = licenseInfo.getTokenKey();
            if (tokenKeyObj != null) {
                licensingService.setTokenKey(UUID.fromString(tokenKeyObj.toString()));
            }
            licensingService.setLimitationMap(LicensePrettyPrinter.PrintLicenseInfo(licenseInfo));

        } else {
            System.out.println("Unknown Error");
        }
    }

    /**
     * Demonstrates unassigning a license from the current device.
     * After unassignment, the license needs to be activated again to use.
     *
     * @throws Exception If unassignment fails
     */
    private void unassignExample() throws Exception {
        licensingService.unassignLicense();
    }

    /**
     * Demonstrates sending an analytical heartbeat with custom field data.
     * Analytical heartbeats are used to track custom metrics defined in the licensing server.
     *
     * @throws Exception If the heartbeat fails
     */
    private void analyticalHeartbeatExample() throws Exception {
        // Type of database analytical field ID (this would typically be configurable)
        UUID analyticalFieldId = UUID.fromString("2754aca1-4d1a-4af3-9387-08da9ac54c6d");
        String fieldValue = "SQL Server 2022";
        
        licensingService.addAnalyticalHeartbeat(analyticalFieldId, fieldValue);
    }
    
    /**
     * Demonstrates sending a usage heartbeat to track feature usage.
     * Usage heartbeats report how frequently features are being used.
     *
     * @throws Exception If the heartbeat fails
     */
    private void usageHeartbeatExample() throws Exception {
        // Create lists for the feature IDs, module IDs (null in this case), and values
        List<UUID> featureIds = new ArrayList<>();
        featureIds.add(UUID.fromString("66099049-0472-467c-6ea6-08da9ac57d7c"));
        featureIds.add(UUID.fromString("e82619b1-f403-4e0d-5389-08da9e17dd73"));
        
        List<Double> values = new ArrayList<>();
        values.add(3.0);
        values.add(2.0);
        
        // Call the licensing service method
        licensingService.addUsageHeartbeat(featureIds, null, values);
    }

    /**
     * Demonstrates sending a consumption heartbeat to track license resource usage.
     * This method interactively collects consumption values from the user for each limitation.
     *
     * @param scanner The scanner to read user input
     * @throws Exception If the heartbeat fails
     */
    private void consumptionHeartbeatExample(Scanner scanner) throws Exception {
        // Get the limitation map from the licensing service
        var limitationMap = licensingService.getLimitationMap();
        
        if (limitationMap == null || limitationMap.isEmpty()) {
            System.out.println("No limitations available. Please activate a license or perform a heartbeat first.");
            return;
        }
        
        List<UUID> limitationIds = new ArrayList<>();
        List<BigDecimal> values = new ArrayList<>();
        
        System.out.println("Enter consumption values for the following limitations:");
        
        // Iterate through the limitation map - key is the UUID, value is the formatted limitation info
        for (var entry : limitationMap.entrySet()) {
            UUID limitationId = entry.getKey();
            String limitationInfo = entry.getValue();
            
            System.out.print(limitationInfo + ": ");
            
            try {
                String input = scanner.nextLine().trim();
                
                // If input is empty, skip this limitation
                if (input.isEmpty()) {
                    continue;
                }
                
                // Parse the input value - we'll use all values including 0 and negative
                double inputValue = Double.parseDouble(input);
                
                // Add the limitation ID and value to our lists
                limitationIds.add(limitationId);
                values.add(BigDecimal.valueOf(inputValue));
                
                System.out.println("Added consumption value: " + inputValue + " for " + limitationInfo);
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number. Skipping this limitation.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". Skipping this limitation.");
            }
        }
        
        // Check if we have any values to send
        if (limitationIds.isEmpty()) {
            System.out.println("No consumption values were provided. Cancelling operation.");
            return;
        }
        
        // Call the licensing service method to add the consumption heartbeat
        licensingService.addConsumptionHeartbeat(limitationIds, values);
    }

    /**
     * Demonstrates opening a floating license session.
     * Floating licenses allow multiple devices to share a limited number of licenses.
     *
     * @throws Exception If session opening fails
     */
    private void openSessionExample() throws Exception {
        licensingService.openSession();
    }

    /**
     * Demonstrates finding an open session when the application is temporarily disconnected.
     * This uses locally cached session information to continue operation without server connectivity.
     */
    private void findOpenSessionOffline() {
        var sessionStatus = new SessionStatusDto();

        if (fileService.TryFindOpenSessionOffline(sessionStatus)) {
            System.out.println("Found session info.");
            System.out.println("Session valid until: " + sessionStatus.getSessionValidUntil());
        } else {
            System.out.println("No open session found.");
        }
    }

    /**
     * Demonstrates closing a floating license session.
     * This releases the license for use by other devices.
     *
     * @throws Exception If session closing fails
     */
    private void closeSessionExample() throws Exception {
        licensingService.closeSession();
    }

    /**
     * Demonstrates checking and reading an offline license file.
     * This validates the digital signature of the license file and displays its contents.
     *
     * @throws Exception If license validation or reading fails
     */
    private void checkAndReadOfflineLicenseExample() throws Exception {
        String licenseFilePath = "assets/OfflineLicenseFile.xml";
        
        System.out.println("Checking offline license file signature...");
        
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = builder.parse(licenseFilePath);
        NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");

        if (nl.getLength() == 0) {
            throw new Exception("No XML Digital Signature Found, document is discarded");
        }

        PublicKey publicKey = CryptographyService.PublicKeyFromPemString(Settings.SignaturePublicKey);
        DOMValidateContext validateContext = new DOMValidateContext(publicKey, nl.item(0));

        // This is only necessary For IDL signature (SHA1)
        validateContext.setProperty("org.jcp.xml.dsig.secureValidation", Boolean.FALSE);

        XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
        XMLSignature signature = factory.unmarshalXMLSignature(validateContext);

        boolean isValid = signature.validate(validateContext);

        if (isValid) {
            System.out.println("✓ Offline license signature is valid!");
            
            try {
                System.out.println("\nReading license file content...");
                
                // Create Jackson XmlMapper to deserialize XML to Java object
                XmlMapper xmlMapper = new XmlMapper();
                
                // Configure mapper to ignore unknown properties
                xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                
                // Read the license file
                File file = new File(licenseFilePath);

                // Parse the XML into our LicenseXml class
                LicenseXml licenseXml = xmlMapper.readValue(file, LicenseXml.class);
                
                // Display the main properties of the license
                LicensePrettyPrinter.PrintLicenseXmlDetails(licenseXml);
            } catch (Exception e) {
                System.out.println("Error reading offline license file: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("❌ Offline license signature is invalid! The license file may have been tampered with.");
        }
    }
}
