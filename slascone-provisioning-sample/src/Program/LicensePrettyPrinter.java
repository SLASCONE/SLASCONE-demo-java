package Program;

import com.slascone.model.LicenseInfoDto;

import Model.CustomerAccountXml;
import Model.LicenseXml;
import Model.ProvisioningFeatureXml;
import Model.ProvisioningLimitationXml;
import Model.ProvisioningVariableXml;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;

public class LicensePrettyPrinter {    

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
     */    
    public static Map<UUID, String> PrintLicenseInfo(LicenseInfoDto licenseInfo) {
        System.out.println(MessageFormat.format("License infos (Retrieved {0}):", licenseInfo.getCreatedDateUtc()));

        // Display the main properties of the license
        System.out.println("\nLicense Information:");
        System.out.println("-------------------");
        String licenseName = licenseInfo.getLicenseName();
        System.out.println("License Name: " + (licenseName != null ? licenseName : ""));
        String licenseKey = licenseInfo.getLicenseKey();
        System.out.println("License Key: " + (licenseKey != null ? licenseKey : ""));
        String legacyLicenseKey = licenseInfo.getLegacyLicenseKey();
        if (legacyLicenseKey != null && !legacyLicenseKey.isEmpty()) {
            System.out.println("Legacy License Key: " + legacyLicenseKey);
        }
        if (licenseInfo.getTokenKey() != null) {
            System.out.println("Token Key: " + licenseInfo.getTokenKey());
        }

        // Customer information
        var customer = licenseInfo.getCustomer();
        if (customer != null) {
            System.out.println("\nCustomer Information:");
            System.out.println("---------------------");
            var customerId = customer.getCustomerId();
            System.out.println("Customer ID: " + (customerId != null ? customerId.toString() : ""));
            String companyName = customer.getCompanyName();
            System.out.println("Company Name: " + (companyName != null ? companyName : ""));
            String customerNumber = customer.getCustomerNumber();
            if (customerNumber != null && !customerNumber.isEmpty()) {
                System.out.println("Customer Number: " + customerNumber);
            }
        }

        // Product information
        String productName = licenseInfo.getProductName();
        String templateName = licenseInfo.getTemplateName();
        System.out.println("\nProduct Information:");
        System.out.println("--------------------");
        System.out.println("Product Name: " + (productName != null ? productName : ""));
        System.out.println("Template Name: " + (templateName != null ? templateName : ""));

        // License details
        System.out.println("\nLicense Details:");
        System.out.println("----------------");
        var provisioningMode = licenseInfo.getProvisioningMode();
        System.out.println("Provisioning Mode: " + (provisioningMode != null ? provisioningMode : "N/A"));
        Boolean isTemporary = licenseInfo.getIsTemporary();
        System.out.println("Is Temporary: " + (isTemporary != null ? isTemporary : "N/A"));
        Integer heartbeatPeriod = licenseInfo.getHeartbeatPeriod();
        System.out.println("Heartbeat Period: " + (heartbeatPeriod != null ? heartbeatPeriod : "N/A") + " days");
        Integer sessionPeriod = licenseInfo.getSessionPeriod();
        if (sessionPeriod != null && sessionPeriod > 0) {
            System.out.println("Session Period: " + sessionPeriod + " days");
        }

        // License validity status
        System.out.println("\nLicense Validity Status:");
        System.out.println("-----------------------");
        Boolean isLicenseValid = licenseInfo.getIsLicenseValid();
        Boolean isLicenseActive = licenseInfo.getIsLicenseActive();
        Boolean isLicenseExpired = licenseInfo.getIsLicenseExpired();
        System.out.println(MessageFormat.format("License is {0} (IsActive: {1}; IsExpired: {2})",
            (isLicenseValid != null && isLicenseValid) ? "valid" : "not valid",
            isLicenseActive != null ? isLicenseActive : "N/A",
            isLicenseExpired != null ? isLicenseExpired : "N/A"));

        // Date information and license validity
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        var createdDateUtc = licenseInfo.getCreatedDateUtc();
        if (createdDateUtc != null) {
            System.out.println("Created Date: " + dateFormat.format(java.util.Date.from(createdDateUtc.toInstant())));
        }

        var expirationDateUtc = licenseInfo.getExpirationDateUtc();
        if (expirationDateUtc != null) {
            System.out.println("Expiration Date: " + dateFormat.format(java.util.Date.from(expirationDateUtc.toInstant())));

            // Check if it's a "9999" perpetual license
            if (expirationDateUtc.getYear() >= 9999) {
                System.out.println("This is a perpetual license.");
            } else if (isLicenseExpired != null && isLicenseExpired) {
                long expiration = Duration.between(expirationDateUtc.toInstant(), Instant.now()).toDays();
                System.out.println(MessageFormat.format("License is expired since {0} day(s).", expiration));

                // Check freeride
                Integer freeride = licenseInfo.getFreeride();
                if (freeride != null && freeride > 0) {
                    if (expiration < freeride) {
                        System.out.println(MessageFormat.format("Freeride granted for {0} day(s).", freeride));
                        System.out.println(MessageFormat.format("License is still usable during freeride period (expires in {0} day(s)).",
                            freeride - expiration));
                    } else {
                        System.out.println("Freeride period has expired. License is no longer valid.");
                    }
                }
            } else {
                long valid = Duration.between(Instant.now(), expirationDateUtc.toInstant()).toDays();
                System.out.println(MessageFormat.format("License is valid for another {0} day(s) until {1}.",
                        valid, dateFormat.format(java.util.Date.from(expirationDateUtc.toInstant()))));

                // Show freeride information
                Integer freeride = licenseInfo.getFreeride();
                if (freeride != null && freeride > 0) {
                    System.out.println(MessageFormat.format("Freeride Period: {0} day(s) after expiration",
                        freeride));
                }
            }
        } else {
            System.out.println("License has no expiration date.");
        }

        // Software version information
        var swLimitation = licenseInfo.getSoftwareReleaseLimitation();
        if (swLimitation != null) {
            System.out.println("\nSoftware Version Information:");
            System.out.println("----------------------------");
            Boolean isSoftwareVersionValid = licenseInfo.getIsSoftwareVersionValid();
            Boolean enforceSoftwareUpgrade = licenseInfo.getEnforceSoftwareVersionUpgrade();
            System.out.println("Is Software Version Valid: " + (isSoftwareVersionValid != null ? isSoftwareVersionValid : "N/A"));
            System.out.println("Enforce Software Upgrade: " + (enforceSoftwareUpgrade != null ? enforceSoftwareUpgrade : "N/A"));
            String swRelease = swLimitation.getSoftwareRelease();
            if (swRelease != null) {
                System.out.println("Software Release: " + swRelease);
            }
            String swDescription = swLimitation.getDescription();
            if (swDescription != null) {
                System.out.println("Description: " + swDescription);
            }
        }

        // Enumerate features
        var features = licenseInfo.getFeatures();
        if (features != null && features.size() > 0) {
            System.out.println("\nFeatures:");
            for (var feature : features) {
                String featureName = feature.getName();
                Boolean isActive = feature.getIsActive();
                System.out.println("- " + (featureName != null ? featureName : "") + " (Active: " + (isActive != null ? isActive : "N/A") + ")");
                var featureExp = feature.getExpirationDateUtc();
                if (featureExp != null) {
                    System.out.println("  Expires: " + dateFormat.format(java.util.Date.from(featureExp.toInstant())));
                }
            }
        } else {
            System.out.println("\nNo features available in this license.");
        }

        // Enumerate limitations
        var limitations = licenseInfo.getLimitations();
        if (limitations != null && limitations.size() > 0) {
            System.out.println("\nLimitations:");
            for (var limitation : limitations) {
                String limName = limitation.getName();
                Integer limValue = limitation.getValue();
                System.out.println("- " + (limName != null ? limName : "") + ": " + (limValue != null ? limValue : ""));
            }
        } else {
            System.out.println("\nNo limitations available in this license.");
        }

        // Enumerate variables if present
        var variables = licenseInfo.getVariables();
        if (variables != null && variables.size() > 0) {
            System.out.println("\nVariables:");
            for (var variable : variables) {
                String varName = variable.getName();
                String varValue = variable.getValue();
                System.out.println("- " + (varName != null ? varName : "") + ": " + (varValue != null ? varValue : ""));
            }
        } else {
            System.out.println("\nNo variables available in this license.");
        }

        // User information if present
        var licenseUsers = licenseInfo.getLicenseUsers();
        if (licenseUsers != null && !licenseUsers.isEmpty()) {
            System.out.println("\nLicense Users:");
            System.out.println("Number of users: " + licenseUsers.size());
        }

        System.out.println("\nLicense information successfully validated!");

        Map<UUID, String> limitationMap = new HashMap<>();
        if (limitations != null) {
            for (var limitation : limitations) {
                String limName = limitation.getName();
                Integer limValue = limitation.getValue();
                UUID limId = limitation.getId();
                
                if (limName != null && limValue != null && limId != null) {
                    // Create a formatted string with the limitation name and value
                    String limitationInfo = limName + " (max: " + limValue + ")";
                    limitationMap.put(limId, limitationInfo);
                }
            }
        }

        return limitationMap;
    }
}
