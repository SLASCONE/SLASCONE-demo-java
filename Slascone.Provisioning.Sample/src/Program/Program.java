package Program;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import Model.ActivateInfo;
import Model.AddHeartbeatDto;
import Model.AnalyticalHeartbeat;
import Model.ConsumptionDto;
import Model.AnalyticalFieldValue;
import Model.ConsumptionHeartbeatDto;
import Model.ConsumptionHeartbeatValueDto;
import Model.SessionDto;
import Model.SessionInfo;
import Model.UnassignDto;
import Model.UsageFeatureValueDto;
import Model.UsageHeartbeatDto;
import Proxy.SampleProxy;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import Model.LicenseXml;

public class Program {
	
	// ToDo: Insert the parameter for the respective function
    private static String ProductId = "b18657cc-1f7c-43fa-e3a4-08da6fa41ad3";
    private static String LicenseKey = "27180460-29df-4a5a-a0a1-78c85ab6cee0";    private SampleProxy slasconeProxy = new SampleProxy();

    private String token;
    // Map to store limitation values from license for potential usage in the application
    private Map<String, Integer> limitationMap;

	public static void main(String [] args) throws Exception {

        Program program = new Program();

		System.out.println("Slascone client app example");
		System.out.println("===========================");
		System.out.println();
		System.out.println("Unique Client-Id for this device: " + Helper.GetUniqueDeviceId());
		System.out.println("Operating system: " + System.getProperty("os.name"));

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
			System.out.println("    9: Find open session (temporary disconnection)");			System.out.println("    10: Close session");
			System.out.println("-- OFFLINE LICENSE");
            System.out.println("    11: Check and read offline license file");

			System.out.println("x: Exit program");

			System.out.print("> ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    program.ActivateExample();
                    break;

                case "2":
                    program.HeartbeatExample();
                    break;
                    
                case "3":
                    program.OfflineLicenseInfoExample();
                    break;
                    
                case "4":
                    program.UnassignExample();
                    break;

                case "5":
                    program.AnalyticalHeartbeatExample();
                    break;

                case "6":
                    program.UsageHeartbeatExample();
                    break;

                case "7":
                    program.ConsumptionHeartbeatExample();
                    break;

                case "8":
                    program.OpenSessionExample();
                    break;
                    
                case "9":
                    program.FindOpenSessionOffline();
                    break;

                case "10":
                    program.CloseSessionExample();
                    break;                case "11":
                    program.CheckAndReadOfflineLicenseExample();
                    break;

                default:
                    break;
            }

        } while (!input.equals("x"));

        scanner.close();
	}

    private void ActivateExample() throws Exception {

        // ToDo: Fill the variables
        var result = slasconeProxy
                .Activate(new ActivateInfo(ProductId, LicenseKey, Helper.GetUniqueDeviceId(), "test", "test"));

        // If the activation failed, the api server responses with a specific error
        // message which describes the problem. Therefore the LicenseInfo object is
        // declared with null.
        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }
        } else if (result.LicenseInfo != null) {
            System.out.println("Successfull activation.");
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void HeartbeatExample() throws Exception {

        // ToDo: Fill the variables
        var heartBeatDto = new AddHeartbeatDto();
        heartBeatDto.setClient_id(Helper.GetUniqueDeviceId());
        // heartBeatDto.setGroup_id(null);
        // heartBeatDto.setHeartbeat_type_id(null);
        heartBeatDto.setOperating_system(Helper.GetOperatingSystem());
        heartBeatDto.setProduct_id(UUID.fromString(ProductId));
        heartBeatDto.setSoftware_version("22.2");
        // heartBeatDto.setToken_key(null);

        var result = slasconeProxy.AddHeartbeat(heartBeatDto);

        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }        } else if (result.LicenseInfo != null) {
            System.out.println("Successfully created heartbeat.");
            token = result.LicenseInfo.token_key.toString();
            limitationMap = Helper.PrintLicenseInfo(result.LicenseInfo);
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void OfflineLicenseInfoExample() throws Exception, IOException {

        var result = slasconeProxy.GetOfflineLicense();        if (result.LicenseInfo != null) {
            System.out.println("Successfully read temporary offline license.");
            token = result.LicenseInfo.token_key.toString();
            limitationMap = Helper.PrintLicenseInfo(result.LicenseInfo);
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void UnassignExample() throws Exception {

        if (null == token) {
            System.out.println("You have to add a license heartbeat first to get a token for this operation.");
            return;
        }

        var unassignDto = new UnassignDto(token);

        var result = slasconeProxy.UnassignLicense(unassignDto);
        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }

        } else if (result.SuccessInfo != null) {
            System.out.println("Successfully unaasigned device from license.");
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void AnalyticalHeartbeatExample() throws Exception {

        // ToDo: Fill the variables
        var analyticalHb = new AnalyticalHeartbeat();
        analyticalHb.setClient_id(Helper.GetUniqueDeviceId());
        var analyticalField = new AnalyticalFieldValue();
        analyticalField.setAnalytical_field_id(UUID.fromString("2754aca1-4d1a-4af3-9387-08da9ac54c6d"));
        analyticalField.setValue("SQL Server 2019");

        List<AnalyticalFieldValue> valueList = new ArrayList<AnalyticalFieldValue>();
        valueList.add(analyticalField);

        analyticalHb.setAnalytical_heartbeat(valueList);

        var result = slasconeProxy.AddAnalyticalHeartbeat(analyticalHb);
        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }
        } else if (result.SuccessInfo != null) {
            System.out.println("Successfully created analytical heartbeat.");
        } else {
            System.out.println("Unknown Error");
        }
    }
    
    private void UsageHeartbeatExample() throws Exception {

        // ToDo: Fill the variables
        var usageFeatureValue1 = new UsageFeatureValueDto();
        usageFeatureValue1.setUsage_feature_id(UUID.fromString("66099049-0472-467c-6ea6-08da9ac57d7c"));
        usageFeatureValue1.setUsage_module_id(null);
        usageFeatureValue1.setValue(3);

        var usageFeatureValue2 = new UsageFeatureValueDto();
        usageFeatureValue2.setUsage_feature_id(UUID.fromString("e82619b1-f403-4e0d-5389-08da9e17dd73"));
        usageFeatureValue2.setUsage_module_id(null);
        usageFeatureValue2.setValue(2);

        List<UsageFeatureValueDto> usageFeatureValueList = new ArrayList<UsageFeatureValueDto>();
        usageFeatureValueList.add(usageFeatureValue1);
        usageFeatureValueList.add(usageFeatureValue2);

        var usageHeartbeatDto = new UsageHeartbeatDto();
        usageHeartbeatDto.setClient_id(Helper.GetUniqueDeviceId());
        usageHeartbeatDto.setUsage_heartbeat(usageFeatureValueList);
        // usageHeartbeatDto.setToken_key(null);

        var result = slasconeProxy.AddUsageHeartbeat(usageHeartbeatDto);
        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }
        } else if (result.SuccessInfo != null) {
            System.out.println("Successfully created usage heartbeat.");
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void ConsumptionHeartbeatExample() throws Exception {

        // ToDo: Fill the variables
        var consumptionHeartbeatValue1 = new ConsumptionHeartbeatValueDto();
        consumptionHeartbeatValue1.setLimitation_id(UUID.fromString("00cf2984-d71a-4c66-9f49-08da833189e3"));        // Limitation: Cloud Backup functionality
        // consumptionHeartbeatValue1.setTimestamp_utc(null);
        consumptionHeartbeatValue1.setValue(1);

        List<ConsumptionHeartbeatValueDto> consumptionHeartbeatValueDtoList = new ArrayList<ConsumptionHeartbeatValueDto>();
        consumptionHeartbeatValueDtoList.add(consumptionHeartbeatValue1);

        var consumptionHeartbeat = new ConsumptionHeartbeatDto();
        consumptionHeartbeat.setClient_id(Helper.GetUniqueDeviceId());
        consumptionHeartbeat.setConsumption_heartbeat(consumptionHeartbeatValueDtoList);
        // consumptionHeartbeat.setToken_key(null);

        var result = slasconeProxy.AddConsumptionHeartbeat(consumptionHeartbeat);
        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }

        } else if (result.Consumptions != null) {
            for (ConsumptionDto consumption : result.Consumptions) {
                UUID transactionId = consumption.getTransaction_id();
                if (null != transactionId) {
                    System.out.println("Successfully created consumption heartbeat. Remaining: " + consumption.getRemaining());
                } else {
                    System.out.println("Consumption limit reached!");
                }
            }
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void OpenSessionExample() throws Exception {

        var sessionDto = new SessionDto();
        sessionDto.setClient_id(Helper.GetUniqueDeviceId());
        sessionDto.setLicense_id(UUID.fromString(LicenseKey));

        var result = slasconeProxy.OpenSession(sessionDto);

        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }
        } else if (result.OpenSessionInfo != null) {
            System.out.println("Successfully opened session.");
            System.out.println("Session valid until: " + result.OpenSessionInfo.getSession_valid_until());
        } else {
            System.out.println("Unknown Error");
        }
    }

    private void FindOpenSessionOffline() {

        var sessionInfo = new SessionInfo();

        if (slasconeProxy.TryFindOpenSessionOffline(sessionInfo)) {
            System.out.println("Found session info.");
            System.out.println("Session valid until: " + sessionInfo.OpenSessionInfo.getSession_valid_until());
        } else {
            System.out.println("No open session found.");
        }
    }

    private void CloseSessionExample() throws Exception {

        var sessionDto = new SessionDto();
        sessionDto.setClient_id(Helper.GetUniqueDeviceId());
        sessionDto.setLicense_id(UUID.fromString(LicenseKey));

        var result = slasconeProxy.CloseSession(sessionDto);
        if (result.WarningInfo != null) {
            System.out.println(result.WarningInfo.message);
            // Example Warning handling
            if (result.WarningInfo.id == 2006) {
            }
        } else if (result.SuccessInfo != null) {
            System.out.println("Successfully closed session.");
        } else {
            System.out.println("Unknown Error");
        }
    }    // Combined method to check signature and read license file contents

    private void CheckAndReadOfflineLicenseExample() throws Exception {
        String licenseFilePath = "Slascone.Provisioning.Sample/assets/OfflineLicenseFile.xml";
        
        System.out.println("Checking offline license file signature...");
        
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = builder.parse(licenseFilePath);
        NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");

        if (nl.getLength() == 0) {
            throw new Exception("No XML Digital Signature Found, document is discarded");
        }

        PublicKey publicKey = Helper.PublicKeyFromPemString(Helper.SignaturePublicKey);
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
                com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
                
                // Configure mapper to ignore unknown properties
                xmlMapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                
                // Read the license file
                java.io.File file = new java.io.File(licenseFilePath);
                
                // Parse the XML into our LicenseXml class
                LicenseXml licenseXml = xmlMapper.readValue(file, LicenseXml.class);
                
                // Display the main properties of the license
                Helper.PrintLicenseXmlDetails(licenseXml);
            } catch (Exception e) {
                System.out.println("Error reading offline license file: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("❌ Offline license signature is invalid! The license file may have been tampered with.");
        }
    }    // Combined method to check signature and read license file contents
}
