package Program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Utility class for retrieving device-specific information.
 * Provides methods to get unique device identifiers and operating system details.
 */
public class DeviceInfoService {
    
    /**
     * Gets a unique device ID that can be used to identify this machine.
     * The ID is generated differently depending on the operating system.
     *
     * @return A string containing a unique device identifier
     * @throws IOException If there's an error reading system information
     */
    public static String getUniqueDeviceId() throws IOException {
        // Check OS type to determine how to get device ID
        String osName = System.getProperty("os.name").toLowerCase();
        
        if (osName.contains("win")) {
            // Windows approach using wmic command to retrieve hardware UUID
            String command = "wmic csproduct get UUID";
            List<String> output = new LinkedList<String>();

            Process serNumProcess = Runtime.getRuntime().exec(command.split(" "));
            BufferedReader sNumReader = new BufferedReader(new InputStreamReader(serNumProcess.getInputStream()));

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
            
            // Alternative Linux approach - use hostname and create UUID from it
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
            // macOS approach - get hardware UUID using ioreg command
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
    public static String getOperatingSystem() throws IOException {
        String os = System.getProperty("os.name") + " - " + System.getProperty("os.version");
        return os;
    }     
}
