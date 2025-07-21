package Program;

import java.io.File;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.slascone.model.LicenseInfoDto;
import com.slascone.model.SessionStatusDto;

public class FileService {

	/**
	 * The folder where application data files will be stored.
	 * This folder is used for license files, session data, and other application data.
	 */
	private String AppDataFolder;

	/**
	 * Default constructor initializes the AppDataFolder to a standard location based on the OS.
	 */
	public FileService() {
		this(standardAppDataFolder());
	}

	/**
	 * Constructor initializes the AppDataFolder to a specific location.
	 */
	public FileService(String folder) {
		setAppDataFolder(folder);		
	}

	/**
	 * Gets the standard application data folder based on the operating system.
	 * This is used as a default location for storing application data files.
	 * @return The standard application data folder path
	 */
	public static String standardAppDataFolder() {

		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("win")) {
			// On Windows, use ProgramData folder
            return (System.getenv("ProgramData") + File.separator + "Slascone");
		} else {
			// On Linux/macOS, use user's home directory
            return (System.getProperty("user.home") + File.separator + ".slascone");
		}
	}

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
	 * Retrieves license information from local cache for offline use.
	 * Validates the signature of the cached license data.
	 *
	 * @return LicenseInfoDto containing the license information, or null if validation fails
	 * @throws IOException If an I/O error occurs reading the cache files
	 */
	public LicenseInfoDto GetOfflineLicense() throws IOException {
		try {
			// Read body of response and signature header from local files
			byte[] licenseBytes = ReadFromFile("license.txt");
			byte[] signatureBytes = ReadFromFile("license_signature.txt");

			if (signatureBytes != null) {
				String signatureHeaderString = new String(signatureBytes);

				boolean isValid = true;
				if (Settings.SIGNATURE_VALIDATION_MODE == 1) {
					try {
						isValid = CryptographyService.IsSignatureValidSymmetricKey(licenseBytes, signatureHeaderString);
						if (!isValid) {
							System.err.println("Signature validation failed: Symmetric key validation error");
						}
					} catch (Exception e) {
						System.err.println("Error checking signature with symmetric key: " + e.getMessage());
						isValid = false;
					}
				} else if (Settings.SIGNATURE_VALIDATION_MODE == 2) {
					try {
						isValid = CryptographyService.IsSignatureValidAsymmetricKey(licenseBytes, signatureHeaderString);
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

			String licenseJson = new String(licenseBytes, java.nio.charset.StandardCharsets.UTF_8);
			return LicenseInfoDto.fromJson(licenseJson);			

		} catch (Exception e) {
			System.err.println("Error retrieving offline license: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Attempts to find an open session in the local cache for offline use.
	 * Validates the session signature and checks if it's still valid.
	 *
	 * @param sessionStatus SessionStatusDto object to populate with session data if found
	 * @return boolean true if a valid session was found, false otherwise
	 */
	public boolean TryFindOpenSessionOffline(SessionStatusDto sessionStatus) {

		try {
			// Read body of response and signature header from local files
			byte[] sessionBytes = ReadFromFile("session.txt");
			String signatureHeaderString = new String(ReadFromFile("session_signature.txt"));

			if (Settings.SIGNATURE_VALIDATION_MODE == 1 && !CryptographyService.IsSignatureValidSymmetricKey(sessionBytes, signatureHeaderString)) {
				throw new Exception("Signature is not valid!");
			} else if (Settings.SIGNATURE_VALIDATION_MODE == 2 && !CryptographyService.IsSignatureValidAsymmetricKey(sessionBytes, signatureHeaderString)) {
				throw new Exception("Signature is not valid!");
			}

			String sessionJson = new String(sessionBytes, java.nio.charset.StandardCharsets.UTF_8);
			SessionStatusDto status = SessionStatusDto.fromJson(sessionJson);

			// Check session valid date/time against current date/time
			if (status.getSessionValidUntil().compareTo(OffsetDateTime.now()) < 0) {
				return false;
			}

			// Copy all properties from status to sessionStatus
			sessionStatus.setIsSessionValid(status.getIsSessionValid());
			sessionStatus.setSessionValidUntil(status.getSessionValidUntil());
			sessionStatus.setSessionCreatedDate(status.getSessionCreatedDate());
			sessionStatus.setSessionModifiedDate(status.getSessionModifiedDate());
			sessionStatus.setMaxOpenSessionCount(status.getMaxOpenSessionCount());
			sessionStatus.setMaxActiveClientCount(status.getMaxActiveClientCount());

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
    /**
     * Stores binary content to a file in the specified folder.
     *
     * @param fileName The name of the file to store the data in
     * @param binaryContent The binary data to store
     * @param folder The folder where the file should be stored
     */
    public void StoreToFile(String fileName, byte[] binaryContent) {
        // Write binary data to file
        try {
            File dir = new File(AppDataFolder);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File file = new File(AppDataFolder, fileName);
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
    public byte[] ReadFromFile(String fileName) {
        // Read binary data from file
        try {
            File file = new File(AppDataFolder, fileName);
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
}
