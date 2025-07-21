# LICENSING & ANALYTICS FOR SOFTWARE AND IoT VENDORS

This console application demonstrates the usage of the [SLASCONE API](https://api.slascone.com/swagger/index.html?urls.primaryName=V2) for standard operations such as license activation, file validation, heartbeat and floating session management.

For more information about this solution, visit
https://slascone.com/ and/or
https://support.slascone.com/

## SLASCONE FEATURES DEMONSTRATED IN THIS SAMPLE

This sample application showcases the following key features of the SLASCONE licensing service:

### License Management

1. **License Activation**
   - Activates a license for a specific device using its unique device ID
   - Demonstrates how to activate a license key for the first time on a specific machine
   - Handles activation responses and potential warnings or errors

2. **License Heartbeat**
   - Sends periodic license verification to the SLASCONE server
   - Retrieves up-to-date license information including features, limitations, and expiration details
   - Caches license information for offline use

3. **Offline License Support**
   - Reads license information when temporarily disconnected from the internet
   - Uses cached license data stored during the last successful heartbeat
   - Ensures software can function during temporary network outages

4. **License Unassignment**
   - Demonstrates how to unassign a license from a device
   - Allows licenses to be transferred to different machines

5. **License File Handling**
   - Validates the digital signature of license files to prevent tampering
   - Reads and displays comprehensive license information from XML files
   - Provides detailed analysis of license validity, features, and limitations

### Analytics Capabilities

1. **Analytical Heartbeat**
   - Gathers general troubleshooting statistics
   - Supports custom fields for gathering application-specific metrics

2. **Feature Usage Tracking**
   - Records which specific features are being used within the application
   - Tracks usage frequency and patterns for specific functionality
   - Provides insights for product development and pricing decisions

3. **Consumption Tracking**
   - Monitors consumption-based licensing metrics (API calls, processed documents, etc.)
   - Supports pay-per-use licensing models
   - Reports consumption against pre-defined limitations

### Floating License Management

1. **Session Management**
   - Opens licensing sessions for floating license scenarios
   - Supports concurrent user licensing models
   - Allows software to be installed on multiple machines but used by a limited number simultaneously

2. **Offline Session Handling**
   - Finds and validates sessions when temporarily disconnected
   - Ensures continuation of work during network interruptions
   - Maintains license compliance even in offline mode

3. **Session Closure**
   - Properly releases floating licenses back to the pool
   - Ensures efficient use of available licenses
   - Prevents license hoarding by inactive installations

### Security Features

1. **Digital Signature Validation**
   - Verifies the authenticity of license files and server responses
   - Prevents tampering with license data
   - Supports both symmetric and asymmetric cryptographic validation

2. **Device Identification**
   - Cross-platform device fingerprinting (Windows, Linux, macOS)
   - Secures licenses to specific hardware
   - Prevents unauthorized license transfers

## CONNECTING TO YOUR SLASCONE ENVIRONMENT

The application connects to the SLASCONE official demo environment. In order to connect to your SLASCONE environment, adjust the values of the file `Settings.java`:

- `API_BASE_URL`: Your SLASCONE API endpoint
- `PROVISIONING_KEY`: Your provisioning key for authentication
- `ISV_ID`: Your ISV (Independent Software Vendor) identifier

## DEPENDENCY MANAGEMENT

This project uses Maven for dependency management. All required libraries are specified in the `pom.xml` file and will be automatically downloaded when you build the project using Maven:

```bash
mvn clean compile
```

To run the application after building:

```bash
cd slascone-provisioning-sample && mvn exec:java
```

## TECHNICAL DETAILS

### Java Environment Requirements

- **Java Version**: Java 11 or newer is required (the project was developed and tested with OpenJDK 17)
- **Maven**: Apache Maven 3.6+ for dependency management and build automation
- **Memory**: Minimum 512MB of heap space allocated to the JVM
- **Disk Space**: Approximately 100MB for the application and its dependencies
- **Network**: Internet connection required for initial license activation and heartbeat operations

### Dependencies Overview

This application relies on several key libraries:
- **Apache HTTP Client**: For REST API communication with the SLASCONE server
- **Jackson & Gson**: For JSON/XML serialization and deserialization
- **Apache Commons Codec**: For encoding/decoding operations
- **XML Security**: For digital signature validation of license files

### Cross-Platform Compatibility

The application includes platform-specific code to obtain device IDs on:
- **Windows**: Uses WMI to query the system UUID
- **Linux**: Reads from `/etc/machine-id` or generates a UUID from hostname
- **macOS**: Uses ioreg to obtain the system's hardware UUID

### Development Container

This project includes a development container configuration for Visual Studio Code, which provides:
- Pre-configured Java development environment
- All necessary dependencies pre-installed
- Consistent development experience across different machines

For details on using the development container, refer to the [README-DEVCONTAINER.md](README-DEVCONTAINER.md) file.

### Security Considerations

- **API Keys**: The sample uses demo API keys. In production, keep your provisioning keys secure.
- **Signature Validation**: The sample demonstrates both symmetric and asymmetric signature validation.
- **Device Binding**: Licenses are bound to specific devices by their hardware IDs.

### Project Structure

```
slascone-demo-java/               # Root project
├── slascone-provisioning-sample/ # Main application module
│   ├── src/
│   │   ├── Model/                # Data models specific to the sample application
│   │   └── Program/              # Main program and helper classes
│   ├── assets/                   # License file examples
│   └── pom.xml                   # Maven configuration for the sample
├── slascone-client/              # Generated API client module
│   ├── src/main/java/            # Auto-generated API client code
│   ├── docs/                     # API documentation
│   └── pom.xml                   # Maven configuration for the client
├── pom.xml                       # Parent Maven configuration
├── run.sh                        # Convenience script to run the application
└── build-and-run.sh              # Script to build and run the application
```

## GETTING STARTED

1. Clone this repository
2. Build the project using Maven
3. Run the application
4. Explore different licensing scenarios using the interactive menu
5. Review the code to understand how to implement these features in your own applications

For integration into your software product, focus on the relevant sections that match your licensing needs.

## OFFLINE CAPABILITIES AND FREERIDE PERIOD

### Temporary Offline Scenarios

The SLASCONE licensing system provides robust support for temporary offline scenarios, which is essential for desktop applications that may not always have internet connectivity. This sample demonstrates how to implement this functionality:

1. **License Caching**: 
   - During a successful license heartbeat, the application saves the license data locally
   - This cached license information includes all features, limitations, and expiration details
   - The data is protected with digital signatures to prevent tampering

2. **Offline Validation**:
   - When the application cannot connect to the SLASCONE server, it falls back to the cached license data
   - The application verifies the digital signature of the cached data to ensure integrity
   - All license rules (features, limitations, expiration) continue to be enforced based on cached data

3. **Implementation**:
   - The sample stores license data in `license.txt` and its signature in `license_signature.txt`
   - For floating licenses, session information is stored in `session.txt` and `session_signature.txt`
   - The sample demonstrates how to read and validate this information in offline mode

### Freeride Period

Freeride period provide flexibility when heartbeats fail, allowing users to continue using the software for a specified grace period:

1. **Purpose**:
   - Prevents immediate software lockout when a heartbeat fails
   - Gives users time to resolve connectivity issues
   - Ensures a smoother user experience in environments with intermittent connectivity

2. **Functionality**:
   - If a heartbeat fails, the software continues to work normally during the freeride period
   - The application tracks the time since the last successful heartbeat
   - Once a successful heartbeat occurs, the freeride period is reset
   - If the freeride period expires without a successful heartbeat, license enforcement takes effect

3. **Configuration**:
   - Freeride periods are configured at the license edition level in the SLASCONE portal
   - The freeride duration is specified in days
   - This sample demonstrates how to implement and respect freeride periods
   - The `checkAndReadOfflineLicenseExample` method shows how to display freeride information

4. **Example Scenario**:
   - With a daily heartbeat requirement and a 7-day freeride period
   - If heartbeats fail, the application continues working for 7 days
   - During this time, the application should notify the user about the need to go online
   - If a heartbeat succeeds within those 7 days, normal operation resumes
   - After 7 days without a successful heartbeat, the license becomes invalid

This implementation ensures that temporary network issues or brief periods offline do not disrupt users' work while still maintaining proper license enforcement in the long term.

## Configuration and Storage

### Application Data Folder

The sample application now stores license and session files in a dedicated application data folder instead of the current working directory. This provides several benefits:

1. **Persistent Storage**: License and session files remain accessible across application restarts
2. **Centralized Location**: All application data is stored in a single, dedicated location
3. **Security**: Files are stored outside of the application directory, reducing the risk of accidental deletion

#### Default Location

By default, the application data is stored in:
- `~/.slascone` on Linux/macOS (user's home directory)
- `%ProgramData%\Slascone` on Windows

#### Custom Location

The application data folder is managed by the `FileService` class. To use a custom location for application data, you need to specify it when initializing the `FileService`:

```java
// Create a FileService with a custom app data folder
FileService fileService = new FileService("/path/to/custom/folder");

// Pass this FileService instance to other components that need it
CombinedInterceptor interceptor = new CombinedInterceptor(fileService);
// ... other service initializations
```

The `FileService` constructor accepts a custom folder path and handles:

1. Creating the directory if it doesn't exist
2. Validating that the directory is writable
3. Setting up the folder for storing license and session data

Alternatively, you can create a `FileService` with the default location and then change it:

```java
FileService fileService = new FileService(); // Uses the standard location
boolean success = fileService.setAppDataFolder("/path/to/custom/folder");
if (!success) {
    // Handle error case - folder couldn't be set
}
```

To ensure all components use the same application data folder, make sure to create the `FileService` early in your application startup and pass the same instance to all dependent services.

#### Stored Files

The following files are managed in the application data folder:

- `license.txt`: The cached license information from the last successful heartbeat
- `license_signature.txt`: The digital signature for verifying the license file
- `session.txt`: Information about the current floating license session (if applicable)
- `session_signature.txt`: The digital signature for verifying the session file

All files are automatically created, updated, and removed as needed during application operation.

## API client

This application uses a client generated by the [OpenAPI Generator](https://openapi-generator.tech/) using the generator [java](https://openapi-generator.tech/docs/generators/java).

### API client generation

You can provide a `config.json` file to configure the generator. To generate the client for this demo application the package name was set.

```JSON
{
  "apiPackage": "com.slascone.api",
  "modelPackage": "com.slascone.model",
  "groupId": "com.slascone",
  "artifactId": "slascone-client",
  "dateLibrary": "java8",
  "hideGenerationTimestamp": true
}
```

You can download the OpenAPI document from https://api365.slascone.com/swagger/v2/swagger.json.

An easy way to generate the client is running the OpenAPI Generator from a docker container. The command could look like this: (Don't forget to replace your local project path):

```bash
docker run --rm --name generate-java -v "<local folder>:/local" openapitools/openapi-generator-cli generate -i /local/in/swagger.json -c /local/in/config.json -g java -o /local/out/java
```

Please find further information about the generated client in the [README](SLASCONE-client/README.md).
