package Program;

import java.security.PublicKey;
import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import Model.ActivateInfo;
import Model.AddHeartbeatDto;
import Model.AnalyticalHeartbeat;
import Model.AnalyticalFieldValue;
import Model.ConsumptionHeartbeatDto;
import Model.ConsumptionHeartbeatValueDto;
import Model.LicenseFeature;
import Model.LicenseInfo;
import Model.LicenseLimitation;
import Model.SessionDto;
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

public class Program {
	
	// ToDo: Insert the parameter for the respective function
    private static String ProductId = "b18657cc-1f7c-43fa-e3a4-08da6fa41ad3";
    private static String LicenseKey = "27180460-29df-4a5a-a0a1-78c85ab6cee0";

    private SampleProxy slasconeProxy = new SampleProxy();

    private String token;
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
			System.out.println("1: Activate license (can be done only once per device)");
			System.out.println("2: Add license heartbeat");
			System.out.println("3: Add analytical heartbeat");
			System.out.println("4: Add usage heart beat");
			System.out.println("5: Add consumption heartbeat");
			System.out.println("6: Unassign license from device (has to be activated again then)");
			System.out.println("7: Open session");
			System.out.println("8: Close session");
			System.out.println("9: Check offline license integrity");
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
                    program.AnalyticalHeartbeatExample();
                    break;

                case "4":
                    program.UsageHeartbeatExample();
                    break;

                case "5":
                    program.ConsumptionHeartbeatExample();
                    break;

                case "6":
                    program.UnassignExample();
                    break;

                case "7":
                    program.OpenSessionExample();
                    break;

                case "8":
                    program.CloseSessionExample();
                    break;

                case "9":
                    program.CheckOfflineLicenseExample();
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
            }
        } else if (result.LicenseInfo != null) {
            System.out.println("Successfully created heartbeat.");
            token = result.LicenseInfo.token_key.toString();
            PrintLicenseInfo(result.LicenseInfo);
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
        consumptionHeartbeatValue1.setLimitation_id(UUID.fromString("00cf2984-d71a-4c66-9f49-08da833189e3"));
        // consumptionHeartbeatValue1.setTimestamp_utc(null);
        consumptionHeartbeatValue1.setValue(5);

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

        } else if (result.SuccessInfo != null) {
            System.out.println("Successfully created consumption heartbeat.");
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
            result.OpenSessionInfo.getSession_valid_until();
        } else {
            System.out.println("Unknown Error");
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
    }

    private void CheckOfflineLicenseExample() throws Exception {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = builder.parse("assets/OfflineLicenseFile.xml");
        NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");

        if (nl.getLength() == 0) {
            throw new Exception("No XML Digital Signature Found, document is discarded");
        }

        PublicKey publicKey = Helper.PublicKeyFromPemString(Helper.SignaturePublicKey);
        DOMValidateContext validateContext = new DOMValidateContext(publicKey, nl.item(0));
        XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
        XMLSignature signature = factory.unmarshalXMLSignature(validateContext);

        boolean isValid = signature.validate(validateContext);

        if (isValid) {
            System.out.println("Offline license integrity successfully checked!");
        } else {
            System.out.println("Offline license invalid!");
        }
    }

    private void PrintLicenseInfo(LicenseInfo licenseInfo) {
	    System.out.println(MessageFormat.format("License infos (Retrieved {0}):", licenseInfo.created_date_utc));
	    System.out.println("   Company name: " + licenseInfo.customer.getCompany_name());

	    // Handle license info
	    //  o Active and expired state (i.e. valid state)
	    //  o Active features and limitations
	    System.out.println(MessageFormat.format("   License is {0} (IsActive: {1}; IsExpired: {2})",
        licenseInfo.is_license_valid ? "valid" : "not valid",
        licenseInfo.is_license_active,
        licenseInfo.is_license_expired));

        if (licenseInfo.is_license_expired) {
            long expiration = Duration.between(licenseInfo.expiration_date_utc.toInstant(), Instant.now()).toDays();
            System.out.println(MessageFormat.format("   License is expired since {0} day(s).", expiration));

            // Check freeride
            if (expiration < licenseInfo.freeride) {
                System.out.println(MessageFormat.format("   Freeride granted for {0} day(s).", licenseInfo.freeride - expiration));
            }
        }
        else {
            long valid = Duration.between(Instant.now(), licenseInfo.expiration_date_utc.toInstant()).toDays();
            System.out.println(MessageFormat.format("   License is valid for another {0} day(s).", valid));
        }

        StringBuilder features = new StringBuilder();
        for (LicenseFeature feature : licenseInfo.features) {
            if (feature.is_active) {
                if (0 < features.length())
                    features.append(", ");
                features.append(feature.name);
            }
        }

        System.out.println("   Active features: " + features);

        StringBuilder limitations = new StringBuilder();
        limitationMap = new HashMap<>();
        for (LicenseLimitation limitation : licenseInfo.limitations) {
            if (0 < limitations.length())
                limitations.append(", ");
            limitations.append(limitation.name + " = " + limitation.value);
            limitationMap.put(limitation.name, limitation.value);
        }

        System.out.println("   Limitations: " + limitations);
    }
}
