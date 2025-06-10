# LICENSING & ANALYTICS FOR SOFTWARE AND IoT VENDORS

This console application demonstrates the usage of the SLASCONE API for standard operations such as activation, license file validation, heartbeat and floating session management.

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
   - Releases the license allocation from the current device

5. **Offline License File Handling**
   - Validates the digital signature of license files to prevent tampering
   - Reads and displays comprehensive license information from XML files
   - Provides detailed analysis of license validity, features, and limitations

### Analytics Capabilities

1. **Analytical Heartbeat**
   - Collects and sends general usage statistics back to SLASCONE
   - Supports custom fields for gathering application-specific metrics
   - Enables vendors to understand how their software is being used

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

The application connects to the SLASCONE official demo environment. In order to connect to your SLASCONE environment, adjust the values of the file `SampleProxy.java`:

- `ApiBaseUrl`: Your SLASCONE API endpoint
- `ProvisioningKey`: Your provisioning key for authentication
- `IsvId`: Your ISV (Independent Software Vendor) identifier

## DEPENDENCY MANAGEMENT

This project uses Maven for dependency management. All required libraries are specified in the `pom.xml` file and will be automatically downloaded when you build the project using Maven:

```bash
mvn clean compile
```

To run the application after building:

```bash
mvn exec:java
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
Slascone.Provisioning.Sample/
├── src/
│   ├── Model/         # Data models for SLASCONE API
│   ├── Program/       # Main program and helper classes
│   └── Proxy/         # API communication proxy
├── assets/            # License file examples
└── lib/               # Legacy dependencies (now managed by Maven)
```

## GETTING STARTED

1. Clone this repository
2. Build the project using Maven
3. Run the application
4. Explore different licensing scenarios using the interactive menu
5. Review the code to understand how to implement these features in your own applications

For integration into your software product, focus on the relevant sections that match your licensing needs.
