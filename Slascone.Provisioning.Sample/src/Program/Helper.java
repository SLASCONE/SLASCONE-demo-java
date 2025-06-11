package Program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.Base64;

import Model.CustomerAccountXml;
import Model.LicenseXml;
import Model.ProvisioningFeatureXml;
import Model.ProvisioningLimitationXml;
import Model.ProvisioningVariableXml;
import Model.LicenseInfo;
import Model.LicenseFeature;
import Model.LicenseLimitation;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;

public class Helper {

    private static String SignatureKey = "NfEpJ2DFfgczdYqOjvmlgP2O/4VlqmRHXNE9xDXbqZcOwXTbH3TFeBAKKbEzga7D42bmxuQPK5gGEseNNpFRekd/Kf059rff/N4phalkP25zVqH3VZIOlmot4jEeNr0m";

	// This is the public key as it can be downloaded from the slascone portal as PEM file
	public static String SignaturePublicKey =

"""
-----BEGIN PUBLIC KEY-----
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwpigzm+cZIyw6x253YRD
mroGQyo0rO9qpOdbNAkE/FMSX+At5CQT/Cyr0eZTo2h+MO5gn5a6dwg2SYB/K1Yt
yuiKqnaEUfoPnG51KLrj8hi9LoZyIenfsQnxPz+r8XGCUPeS9MhBEVvT4ba0x9Ew
R+krU87VqfI3KNpFQVdLPaZxN4STTEZaet7nReeNtnnZFYaUt5XeNPB0b0rGfrps
y7drmZz81dlWoRcLrBRpkf6XrOTX4yFxe/3HJ8mpukuvdweUBFoQ0xOHmG9pNQ31
AHGtgLYGjbKcW4xYmpDGl0txfcipAr1zMj7X3oCO9lHcFRnXdzx+TTeJYxQX2XVb
hQIDAQAB
-----END PUBLIC KEY-----""";

	/**
     * Gets a unique device ID that can be used to identify this machine.
     * The ID is generated differently depending on the operating system.
     *
     * @return A string containing a unique device identifier
     * @throws IOException If there's an error reading system information
     */
	public static String GetUniqueDeviceId() throws IOException {
		// Check OS type to determine how to get device ID
		String osName = System.getProperty("os.name").toLowerCase();
		
		if (osName.contains("win")) {
			// Windows approach using wmic
			String command = "wmic csproduct get UUID";
			List<String> output = new LinkedList<String>();

			Process SerNumProcess = Runtime.getRuntime().exec(command);
			BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

			// Read the "wmic" command output line by line (omit blank lines)
			String line = "";
			while ((line = sNumReader.readLine()) != null) {
				if (0 < line.length()) {
					output.add(line.trim());
				}
			}

			// First line is a header; the data we need is in the second line
			if (output.size() >= 2) {
				return output.get(1);
			}
		} else if (osName.contains("linux") || osName.contains("unix")) {
			// Linux approach - use /etc/machine-id if it exists
			try {
				File machineIdFile = new File("/etc/machine-id");
				if (machineIdFile.exists()) {
					BufferedReader reader = new BufferedReader(new FileReader(machineIdFile));
					String machineId = reader.readLine();
					reader.close();
					if (machineId != null && !machineId.isEmpty()) {
						return machineId.trim();
					}
				}
			} catch (Exception e) {
				// Fall through to default approach
			}
			
			// Alternative Linux approach - use hostname and hardcode format
			try {
				Process process = Runtime.getRuntime().exec("hostname");
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String hostname = reader.readLine();
				reader.close();
				if (hostname != null && !hostname.isEmpty()) {
					// Create a consistent UUID from the hostname
					return UUID.nameUUIDFromBytes(hostname.getBytes()).toString();
				}
			} catch (Exception e) {
				// Fall through to default approach
			}
		} else if (osName.contains("mac")) {
			// macOS approach
			try {
				Process process = Runtime.getRuntime().exec(new String[]{"sh", "-c", "ioreg -rd1 -c IOPlatformExpertDevice | grep -E '(UUID)' | awk '{print $3}' | sed 's/\"//g'"});
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String uuid = reader.readLine();
				reader.close();
				if (uuid != null && !uuid.isEmpty()) {
					return uuid.trim();
				}
			} catch (Exception e) {
				// Fall through to default approach
			}		}
		
		// Default approach - generate a random UUID if we couldn't get the hardware ID
		// Note: This will be different each time the application runs
		return UUID.randomUUID().toString();
	}

	/**
     * Gets the name and version of the operating system.
     *
     * @return A string containing the OS name and version
     * @throws IOException If there's an error reading system properties
     */
    public static String GetOperatingSystem() throws IOException {
    	String os = System.getProperty("os.name") + " - " + System.getProperty("os.version");
        return os;
    } 

    /**
     * Validates a signature using a symmetric key (HMAC-SHA256).
     *
     * @param responseBytes The response data to validate
     * @param signatureHeader The signature value from the header
     * @return True if the signature is valid, false otherwise
     * @throws IOException If there's an error processing the bytes
     * @throws NoSuchAlgorithmException If the HMAC-SHA256 algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     */
    public static Boolean IsSignatureValidSymmetricKey(byte[] responseBytes, String signatureHeader)
			throws IOException, NoSuchAlgorithmException, InvalidKeyException {

		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(SignatureKey.getBytes("UTF-8"), "HmacSHA256");
		sha256_HMAC.init(secret_key);

		String hashString = Hex.encodeHexString(sha256_HMAC.doFinal(responseBytes));

		return (signatureHeader == hashString);
	}

	/**
     * Validates a signature using an asymmetric key (SHA256withRSA).
     *
     * @param responseBytes The response data to validate
     * @param signatureHeader The signature value from the header (Base64 encoded)
     * @return True if the signature is valid, false otherwise
     * @throws NoSuchAlgorithmException If the SHA256withRSA algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     * @throws InvalidKeySpecException If the key specification is invalid
     * @throws SignatureException If there's an error processing the signature
     */
	public static Boolean IsSignatureValidAsymmetricKey(byte[] responseBytes, String signatureHeader)
			throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, SignatureException {

		Signature signature = Signature.getInstance("SHA256withRSA");
		signature.initVerify(PublicKeyFromPemString(SignaturePublicKey));
		signature.update(responseBytes);
		byte[] signatureHeaderBytes = Base64.decodeBase64(signatureHeader);
		boolean signtureValid = signature.verify(signatureHeaderBytes);

		return signtureValid;
	}

	/**
     * Creates a PublicKey object from a PEM-formatted string.
     * 
     * @param pemString The PEM-formatted public key string
     * @return The PublicKey object
     * @throws NoSuchAlgorithmException If the RSA algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     * @throws InvalidKeySpecException If the key specification is invalid
     * @throws SignatureException If there's an error processing the key
     */
	public static PublicKey PublicKeyFromPemString(String pemString)
			throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, SignatureException {

		String pemData = pemString
				.replace("-----BEGIN PUBLIC KEY-----", "")
				.replace("-----END PUBLIC KEY-----", "")
				.replace(System.lineSeparator(), "")
				.trim();
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.decodeBase64(pemData));
		return keyFactory.generatePublic(keySpec);
	}	/**
     * Stores binary content to a file in the specified folder.
     *
     * @param fileName The name of the file to store the data in
     * @param binaryContent The binary data to store
     * @param folder The folder where the file should be stored
     */
	public static void StoreToFile(String fileName, byte[] binaryContent, String folder) {
		// Write binary data to file
		try {
			File dir = new File(folder);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			
			File file = new File(folder, fileName);
			java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
			fos.write(binaryContent);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * Reads binary data from a file in the specified folder.
     *
     * @param fileName The name of the file to read
     * @param folder The folder where the file is located
     * @return The binary content of the file
     */
	public static byte[] ReadFromFile(String fileName, String folder) {
		// Read binary data from file
		try {
			File file = new File(folder, fileName);
			java.io.FileInputStream fis = new java.io.FileInputStream(file);
			byte[] binaryContent = new byte[(int) file.length()];
			fis.read(binaryContent);
			fis.close();
			return binaryContent;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}    
    
    /**
     * Deletes a file from the specified folder.
     *
     * @param fileName The name of the file to remove
     * @param folder The folder where the file is located
     * @return true if the file was successfully deleted, false otherwise
     */
    public static boolean RemoveFile(String fileName, String folder) {
		File file = new File(folder, fileName);
		return file.delete();
	}

	/**
     * Prints the details of a LicenseXml object to the console.
     * Displays license information, customer details, features, limitations, and variables.
     *
     * @param licenseXml The license XML object to print
     */
    public static void PrintLicenseXmlDetails(LicenseXml licenseXml) {
        if (licenseXml == null) {
            System.out.println("No license information available.");
            return;
        }

        // Display the main properties of the license
        System.out.println("\nLicense Information:");
        System.out.println("-------------------");
        System.out.println("License Name: " + licenseXml.getLicenseName());
        System.out.println("License Key: " + licenseXml.getLicenseKey());
        System.out.println("Legacy License Key: " + licenseXml.getLegacyLicenseKey());
        
        // Customer information
        CustomerAccountXml customer = licenseXml.getCustomer();
        if (customer != null) {
            System.out.println("\nCustomer Information:");
            System.out.println("---------------------");
            System.out.println("Customer ID: " + customer.getCustomerId());
            if (customer.getCompanyName() != null) {
                System.out.println("Company Name: " + customer.getCompanyName());
            }
            if (customer.getCustomerName() != null) {
                System.out.println("Customer Name: " + customer.getCustomerName());
            }
            if (customer.getCustomerNumber() != null) {
                System.out.println("Customer Number: " + customer.getCustomerNumber());
            }
            if (customer.getEmail() != null) {
                System.out.println("Email: " + customer.getEmail());
            }
        }
        
        // Product information
        System.out.println("\nProduct Information:");
        System.out.println("--------------------");
        System.out.println("Product Name: " + licenseXml.getProductName());
        System.out.println("Product ID: " + licenseXml.getProductId());
        System.out.println("Template Name: " + licenseXml.getTemplateName());
          // License details
        System.out.println("\nLicense Details:");
        System.out.println("----------------");
        System.out.println("Provisioning Mode: " + licenseXml.getProvisioningMode());
        System.out.println("Is Temporary: " + licenseXml.isTemporary());
        
        // Date information and license validity
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("\nLicense Validity:");
        System.out.println("-------------------");
        if (licenseXml.getModifiedDateUtc() != null) {
            System.out.println("Modified Date: " + dateFormat.format(licenseXml.getModifiedDateUtc()));
        }
        
        boolean isExpired = false;
        long daysRemaining = 0;
        
        if (licenseXml.getExpirationDateUtc() != null
            && licenseXml.getExpirationDateUtc().toInstant().atZone(java.time.ZoneId.systemDefault()).getYear() < 9999) {

            System.out.println("Expiration Date: " + dateFormat.format(licenseXml.getExpirationDateUtc()));
            
            // Calculate remaining days
            daysRemaining = Duration.between(
                Instant.now(), 
                licenseXml.getExpirationDateUtc().toInstant()
            ).toDays();
            
            isExpired = daysRemaining < 0;
            
            if (isExpired) {
                long expiredDays = Math.abs(daysRemaining);
                System.out.println(MessageFormat.format("License is expired since {0} day(s).", expiredDays));
                
                // Check freeride
                if (licenseXml.getFreeRide() != null) {
                    int freeRideDays = licenseXml.getFreeRide();
                    if (expiredDays < freeRideDays) {
                        System.out.println(MessageFormat.format("Freeride granted for {0} day(s).", 
                            freeRideDays - expiredDays));
                        System.out.println(MessageFormat.format("License is still usable during freeride period (expires in {0} day(s)).", 
                            freeRideDays - expiredDays));
                    } else {
                        System.out.println("Freeride period has expired. License is no longer valid.");
                    }
                }
            } else {
                System.out.println(MessageFormat.format("License is valid for another {0} day(s) until {1}.",
                        daysRemaining, dateFormat.format(licenseXml.getExpirationDateUtc())));
                
                // Show freeride information
                if (licenseXml.getFreeRide() != null) {
                    System.out.println(MessageFormat.format("Freeride Period: {0} day(s) after last heartbeat.", 
                        licenseXml.getFreeRide()));
                }
            }
        } else {
            System.out.println("License has no expiration date (perpetual license).");
        }
        
        // License Status
        System.out.println(MessageFormat.format("\nLicense Status: {0}", isExpired ? "Expired" : "Active"));
        
		// Features with formatted output
        if (licenseXml.getFeatures() != null && !licenseXml.getFeatures().isEmpty()) {
            
            System.out.println("\nFeatures:");
            for (ProvisioningFeatureXml feature : licenseXml.getFeatures()) {
                System.out.println("- " + feature.getName() + " (Active: " + feature.isActive() + ")");
            }
        } else {
            System.out.println("\nNo features available in this license.");
        }

		// Limitations
        if (licenseXml.getLimitations() != null && !licenseXml.getLimitations().isEmpty()) {
            
            System.out.println("\nLimitations:");
            for (ProvisioningLimitationXml limitation : licenseXml.getLimitations()) {
                System.out.println("- " + limitation.getName() + ": " + limitation.getValue());
            }
        } else {
            System.out.println("\nNo limitations available in this license.");
        }
			
		// Variables
        if (licenseXml.getVariables() != null && !licenseXml.getVariables().isEmpty()) {
            
            System.out.println("\nVariables:");
            for (ProvisioningVariableXml variable : licenseXml.getVariables()) {
                System.out.println("- " + variable.getName() + ": " + variable.getValue());
            }
        } else {
            System.out.println("\nNo variables available in this license.");
        }

        System.out.println("\nLicense file successfully read and validated!");
    }
	
	/**
     * Prints the details of a LicenseInfo object to the console.
     * Displays license status, features, limitations, and expiration information.
     * 
     * @param licenseInfo The LicenseInfo object to print
     * @return A map of limitations for further use in the application
     */    public static Map<String, Integer> PrintLicenseInfo(LicenseInfo licenseInfo) {
        System.out.println(MessageFormat.format("License infos (Retrieved {0}):", licenseInfo.created_date_utc));

        // Display the main properties of the license
        System.out.println("\nLicense Information:");
        System.out.println("-------------------");
        System.out.println("License Name: " + licenseInfo.license_name);
        System.out.println("License Key: " + licenseInfo.license_key);
        if (licenseInfo.legacy_license_key != null && !licenseInfo.legacy_license_key.isEmpty()) {
            System.out.println("Legacy License Key: " + licenseInfo.legacy_license_key);
        }
        if (licenseInfo.token_key != null) {
            System.out.println("Token Key: " + licenseInfo.token_key);
        }
        
        // Customer information
        if (licenseInfo.customer != null) {
            System.out.println("\nCustomer Information:");
            System.out.println("---------------------");
            System.out.println("Customer ID: " + licenseInfo.customer.getCustomer_id());
            System.out.println("Company Name: " + licenseInfo.customer.getCompany_name());
            if (licenseInfo.customer.getCustomer_number() != null && !licenseInfo.customer.getCustomer_number().isEmpty()) {
                System.out.println("Customer Number: " + licenseInfo.customer.getCustomer_number());
            }
        }
        
        // Product information
        System.out.println("\nProduct Information:");
        System.out.println("--------------------");
        System.out.println("Product Name: " + licenseInfo.product_name);
        System.out.println("Template Name: " + licenseInfo.template_name);
        
        // License details
        System.out.println("\nLicense Details:");
        System.out.println("----------------");
        System.out.println("Provisioning Mode: " + licenseInfo.provisioning_mode);
        System.out.println("Is Temporary: " + (licenseInfo.is_temporary != null ? licenseInfo.is_temporary : "N/A"));
        System.out.println("Heartbeat Period: " + licenseInfo.heartbeat_period + " days");
        if (licenseInfo.session_period > 0) {
            System.out.println("Session Period: " + licenseInfo.session_period + " days");
        }
        
        // License validity status
        System.out.println("\nLicense Validity Status:");
        System.out.println("-----------------------");
        System.out.println(MessageFormat.format("License is {0} (IsActive: {1}; IsExpired: {2})",
            licenseInfo.is_license_valid ? "valid" : "not valid",
            licenseInfo.is_license_active,
            licenseInfo.is_license_expired));

        // Date information and license validity
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (licenseInfo.created_date_utc != null) {
            System.out.println("Created Date: " + dateFormat.format(licenseInfo.created_date_utc));
        }
        
        if (licenseInfo.expiration_date_utc != null) {
            System.out.println("Expiration Date: " + dateFormat.format(licenseInfo.expiration_date_utc));
            
            // Check if it's a "9999" perpetual license
            if (licenseInfo.expiration_date_utc.toInstant().atZone(java.time.ZoneId.systemDefault()).getYear() >= 9999) {
                System.out.println("This is a perpetual license.");
            } else if (licenseInfo.is_license_expired) {
                long expiration = Duration.between(licenseInfo.expiration_date_utc.toInstant(), Instant.now()).toDays();
                System.out.println(MessageFormat.format("License is expired since {0} day(s).", expiration));
                
                // Check freeride
                if (licenseInfo.freeride > 0) {
                    if (expiration < licenseInfo.freeride) {
                        System.out.println(MessageFormat.format("Freeride granted for {0} day(s).", licenseInfo.freeride));
                        System.out.println(MessageFormat.format("License is still usable during freeride period (expires in {0} day(s)).", 
                            licenseInfo.freeride - expiration));
                    } else {
                        System.out.println("Freeride period has expired. License is no longer valid.");
                    }
                }
            } else {
                long valid = Duration.between(Instant.now(), licenseInfo.expiration_date_utc.toInstant()).toDays();
                System.out.println(MessageFormat.format("License is valid for another {0} day(s) until {1}.",
                        valid, dateFormat.format(licenseInfo.expiration_date_utc)));
                
                // Show freeride information
                if (licenseInfo.freeride > 0) {
                    System.out.println(MessageFormat.format("Freeride Period: {0} day(s) after expiration", 
                        licenseInfo.freeride));
                }
            }
        } else {
            System.out.println("License has no expiration date.");
        }
          // Software version information
        if (licenseInfo.software_release_limitation != null) {
            System.out.println("\nSoftware Version Information:");
            System.out.println("----------------------------");
            System.out.println("Is Software Version Valid: " + licenseInfo.is_software_version_valid);
            System.out.println("Enforce Software Upgrade: " + licenseInfo.enforce_software_version_upgrade);
            if (licenseInfo.software_release_limitation.getSoftwareRelease() != null) {
                System.out.println("Software Release: " + licenseInfo.software_release_limitation.getSoftwareRelease());
            }
            if (licenseInfo.software_release_limitation.getDescription() != null) {
                System.out.println("Description: " + licenseInfo.software_release_limitation.getDescription());
            }
        }

		// Enumerate features
        if (licenseInfo.features != null && licenseInfo.features.size() > 0) {
            System.out.println("\nFeatures:");
            for (LicenseFeature feature : licenseInfo.features) {
                System.out.println("- " + feature.name + " (Active: " + feature.is_active + ")");
                if (feature.expiration_date_utc != null) {
                    System.out.println("  Expires: " + dateFormat.format(feature.expiration_date_utc));
                }
            }
        } else {
            System.out.println("\nNo features available in this license.");
        }
		// Enumerate limitations
		if (licenseInfo.limitations != null && licenseInfo.limitations.size() > 0) {
			System.out.println("\nLimitations:");
			for (LicenseLimitation limitation : licenseInfo.limitations) {
				System.out.println("- " + limitation.name + ": " + limitation.value);
			}
		} else {
			System.out.println("\nNo limitations available in this license.");
		}

		// Enumerate variables if present
		if (licenseInfo.variables != null && licenseInfo.variables.size() > 0) {
			System.out.println("\nVariables:");
			for (var variable : licenseInfo.variables) {
				System.out.println("- " + variable.name + ": " + variable.value);
			}
		} else {
			System.out.println("\nNo variables available in this license.");
		}
				// User information if present
		if (licenseInfo.license_users != null && !licenseInfo.license_users.isEmpty()) {
			System.out.println("\nLicense Users:");
			System.out.println("Number of users: " + licenseInfo.license_users.size());
		}

        System.out.println("\nLicense information successfully validated!");

        Map<String, Integer> limitationMap = new HashMap<>();
        for (LicenseLimitation limitation : licenseInfo.limitations) {
            limitationMap.put(limitation.name, limitation.value);
        }

        return limitationMap;
    }
}
