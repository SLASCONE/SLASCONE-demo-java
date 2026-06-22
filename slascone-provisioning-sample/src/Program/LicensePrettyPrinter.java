package Program;

import com.slascone.model.LicenseDto;
import com.slascone.model.LicenseInfoDto;

import Model.CustomerAccountXml;
import Model.LicenseXml;
import Model.ProvisioningFeatureXml;
import Model.ProvisioningLimitationXml;
import Model.ProvisioningVariableXml;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.List;

public class LicensePrettyPrinter {    

    /**
     * Prints the details of a LicenseXml object to the console.
     * Displays license information, customer details, features, limitations, and variables.
     *
     * @param licenseXml The license XML object to print
     */
    public static void PrintLicenseXmlDetails(LicenseXml licenseXml) {
        if (licenseXml == null) {
            return;
        }

        // Display the main properties of the license
        System.out.println("\nLicense Information:");
        System.out.println("-------------------");
        String licenseName = licenseXml.getLicenseName();
        System.out.println("License Name: " + (licenseName != null ? licenseName : ""));
        String licenseKey = licenseXml.getLicenseKey();
        System.out.println("License Key: " + (licenseKey != null ? licenseKey : ""));

        String legacyLicenseKey = licenseXml.getLegacyLicenseKey();
        if (legacyLicenseKey != null && !legacyLicenseKey.isEmpty()) {
            System.out.println("Legacy License Key: " + legacyLicenseKey);
        }

        String clientId = licenseXml.getClientId();
        if (clientId != null && !clientId.isEmpty()) {
            System.out.println("Client ID: " + clientId);
        }
        
        // Customer information
        CustomerAccountXml customer = licenseXml.getCustomer();
        if (customer != null) {
            System.out.println("\nCustomer Information:");
            System.out.println("---------------------");
            String customerId = customer.getCustomerId();
            if (customerId != null && !customerId.isEmpty()) {
                System.out.println("Customer ID: " + customerId);
            }
            String companyName = customer.getCompanyName();
            System.out.println("Company Name: " + (companyName != null ? companyName : ""));
            String customerNumber = customer.getCustomerNumber();
            System.out.println("Customer Number: " + (customerNumber != null ? customerNumber : ""));
        }
        
        // Product information
        System.out.println("\nProduct Information:");
        System.out.println("--------------------");
        String productId = licenseXml.getProductId();
        System.out.println("Product ID: " + (productId != null ? productId : ""));
        String productName = licenseXml.getProductName();
        System.out.println("Product Name: " + (productName != null ? productName : ""));
        String templateId = licenseXml.getTemplateId();
        System.out.println("Template ID: " + (templateId != null ? templateId : ""));
        String templateName = licenseXml.getTemplateName();
        if (templateName != null) {
            System.out.println("Template Name: " + templateName);
        }

        // License details
        System.out.println("\nLicense Details:");
        System.out.println("----------------");
        System.out.println("Is Temporary: " + licenseXml.isTemporary());

        String licenseTypeId = licenseXml.getLicenseTypeId();
        String licenseTypeName = licenseXml.getLicenseTypeName();
        if (licenseTypeId != null && !licenseTypeId.isEmpty() && licenseTypeName != null && !licenseTypeName.isEmpty()) {
            System.out.println("License Type ID: " + licenseTypeId);
            System.out.println("License Type: " + licenseTypeName);
        }
        
        // License dates
        if (licenseXml.getModifiedDateUtc() != null) {
            System.out.println("\nLicense Dates:");
            System.out.println("--------------");
            System.out.println("Modified Date: " + licenseXml.getModifiedDateUtc());
        }

        // Enumerate features
        var features = licenseXml.getFeatures();
        if (features != null && !features.isEmpty()) {
            
            System.out.println("\nFeatures:");
            for (ProvisioningFeatureXml feature : features) {
                if (feature == null) {
                    continue;
                }

                String featureName = feature.getFeatureName();
                System.out.print("- " + (featureName != null ? featureName : ""));
                if (!feature.isActive()) {
                    System.out.println(" (not active)");
                } else {
                    System.out.println();
                }

                String featureDescription = feature.getFeatureDescription();
                if (featureDescription != null && !featureDescription.isEmpty()) {
                    System.out.println("   Description: " + featureDescription);
                }
            }
        } else {
            System.out.println("\nNo features available in this license.");
        }

        // Enumerate limitations
        var limitations = licenseXml.getLimitations();
        if (limitations != null && !limitations.isEmpty()) {
            
            System.out.println("\nLimitations:");
            for (ProvisioningLimitationXml limitation : limitations) {
                if (limitation == null) {
                    continue;
                }

                String limitationName = limitation.getLimitationName();
                Integer limit = limitation.getLimitValue();
                System.out.print(" - " + (limitationName != null ? limitationName : ""));
                if (limit != null) {
                    System.out.println(" (Limit: " + limit + ")");
                } else {
                    System.out.println(" (unlimited)");
                }

                String limitationDescription = limitation.getLimitationDescription();
                System.out.println("   Description: " + (limitationDescription != null ? limitationDescription : ""));
            }
        } else {
            System.out.println("\nNo limitations available in this license.");
        }

        // Enumerate constrained variables
        var constrainedVariables = licenseXml.getConstrainedVariables();
        if (constrainedVariables != null && !constrainedVariables.isEmpty()) {
            System.out.println("\nConstrained Variables:");
            for (var constrainedVariable : constrainedVariables) {
                if (constrainedVariable == null) {
                    continue;
                }

                String variableName = constrainedVariable.getName();
                System.out.println(" - " + (variableName != null ? variableName : ""));

                String variableDescription = constrainedVariable.getDescription();
                if (variableDescription != null && !variableDescription.isEmpty()) {
                    System.out.println("   Description: " + variableDescription);
                }

                List<String> values = constrainedVariable.getValues();
                if (values != null && !values.isEmpty()) {
                    System.out.println("   Values: " + String.join(", ", values));
                } else {
                    System.out.println("   Values: None");
                }
            }
        } else {
            System.out.println("\nNo constrained variables available in this license.");
        }
            
        // Enumerate variables
        var variables = licenseXml.getVariables();
        if (variables != null && !variables.isEmpty()) {
            
            System.out.println("\nVariables:");
            for (ProvisioningVariableXml variable : variables) {
                if (variable == null) {
                    continue;
                }

                String variableName = variable.getName();
                System.out.println(" - " + (variableName != null ? variableName : ""));
                String description = variable.getDescription();
                System.out.println("   Description: " + (description != null ? description : ""));
                String value = variable.getValue();
                System.out.println("   Value: " + (value != null ? value : ""));
            }
        } else {
            System.out.println("\nNo variables available in this license.");
        }

        // User information if present
        var licenseUsers = licenseXml.getLicenseUsers();
        if (licenseUsers != null && !licenseUsers.isEmpty()) {
            System.out.println("\nLicense Users:");
            System.out.println("Number of users: " + licenseUsers.size());
        }
    }

        
    /**
     * Prints the details of a LicenseInfo object to the console.
     * Displays license status, features, limitations, and expiration information.
     * 
     * @param licenseInfo The LicenseInfo object to print
     * @return A map of limitations for further use in the application
     */    
    public static Map<UUID, String> PrintLicenseInfo(LicenseDto licenseInfo) {
        Map<UUID, String> limitationMap = new HashMap<>();
        if (licenseInfo == null) {
            return limitationMap;
        }

        // Display the main properties of the license
        System.out.println("\nLicense Information:");
        System.out.println("-------------------");
        String licenseName = licenseInfo.getName();
        System.out.println("License Name: " + (licenseName != null ? licenseName : ""));
        UUID licenseId = licenseInfo.getId();
        System.out.println("License Key: " + (licenseId != null ? licenseId.toString() : ""));

        String legacyLicenseKey = licenseInfo.getLegacyLicenseKey();
        if (legacyLicenseKey != null && !legacyLicenseKey.isEmpty()) {
            System.out.println("Legacy License Key: " + legacyLicenseKey);
        }

        String clientId = licenseInfo.getClientId();
        if (clientId != null && !clientId.isEmpty()) {
            System.out.println("Client ID: " + clientId);
        }

        // Customer information
        var customer = licenseInfo.getCustomer();
        if (customer != null) {
            System.out.println("\nCustomer Information:");
            System.out.println("---------------------");
            UUID customerId = licenseInfo.getCustomerId();
            if (customerId != null) {
                System.out.println("Customer ID: " + customerId);
            }
            String companyName = customer.getCompanyName();
            System.out.println("Company Name: " + (companyName != null ? companyName : ""));
            String customerNumber = customer.getCustomerNumber();
            System.out.println("Customer Number: " + (customerNumber != null ? customerNumber : ""));
        }

        // Product information
        System.out.println("\nProduct Information:");
        System.out.println("--------------------");
        UUID productId = licenseInfo.getProductId();
        System.out.println("Product ID: " + (productId != null ? productId : ""));
        var product = licenseInfo.getProduct();
        if (product != null) {
            String productName = product.getName();
            System.out.println("Product Name: " + (productName != null ? productName : ""));
        }
        UUID templateId = licenseInfo.getTemplateId();
        System.out.println("Template ID: " + (templateId != null ? templateId : ""));
        var template = licenseInfo.getTemplate();
        if (template != null) {
            String templateName = template.getName();
            System.out.println("Template Name: " + (templateName != null ? templateName : ""));
            if (template.getProvisioningMode() != null && template.getClientType() != null) {
                System.out.println("Provisioning mode / client type: "
                    + template.getProvisioningMode() + " / " + template.getClientType());
            }
        }

        // License details
        System.out.println("\nLicense Details:");
        System.out.println("----------------");
        System.out.println("Is Temporary: " + Boolean.TRUE.equals(licenseInfo.getIsTemporary()));

        UUID licenseTypeId = licenseInfo.getLicenseTypeId();
        var licenseType = licenseInfo.getLicenseType();
        if (licenseTypeId != null && licenseType != null) {
            System.out.println("License Type ID: " + licenseTypeId);
            String licenseTypeName = licenseType.getName();
            System.out.println("License Type: " + (licenseTypeName != null ? licenseTypeName : ""));
        }

        var createdDateUtc = licenseInfo.getCreatedDateUtc();
        var modifiedDateUtc = licenseInfo.getModifiedDateUtc();
        String lastModifiedBy = licenseInfo.getLastModifiedBy();
        if (createdDateUtc != null && modifiedDateUtc != null && lastModifiedBy != null) {
            System.out.println("\nLicense Dates:");
            System.out.println("--------------");
            System.out.println("Created Date: " + createdDateUtc);
            System.out.println("Modified Date: " + modifiedDateUtc);
            System.out.println("Last Modified By: " + lastModifiedBy);
        }

        // Enumerate features
        var features = licenseInfo.getLicenseFeatures();
        if (features != null && !features.isEmpty()) {
            System.out.println("\nFeatures:");
            for (var feature : features) {
                if (feature == null) {
                    continue;
                }

                String featureName = feature.getFeatureName();
                System.out.print("- " + (featureName != null ? featureName : ""));
                if (Boolean.FALSE.equals(feature.getIsActive())) {
                    System.out.println(" (not active)");
                } else {
                    System.out.println();
                }

                String featureDescription = feature.getFeatureDescription();
                if (featureDescription != null && !featureDescription.isEmpty()) {
                    System.out.println("   Description: " + featureDescription);
                }

                var featureExceptions = feature.getFeatureExceptions();
                if (featureExceptions != null) {
                    var exceptions = featureExceptions.getExceptions();
                    if (exceptions != null && !exceptions.isEmpty()) {
                        System.out.println("   Exceptions:");
                        for (var exception : exceptions) {
                            if (exception == null) {
                                continue;
                            }
                            System.out.println("     - From " + exception.getStartDateUtc()
                                + " to " + exception.getEndDateUtc()
                                + (Boolean.TRUE.equals(exception.getTemporaryIsActive()) ? " (temporary active)" : ""));
                        }
                    }
                }
            }
        } else {
            System.out.println("\nNo features available in this license.");
        }

        // Enumerate limitations
        var limitations = licenseInfo.getLicenseLimitations();
        if (limitations != null && !limitations.isEmpty()) {
            System.out.println("\nLimitations:");
            for (var limitation : limitations) {
                if (limitation == null) {
                    continue;
                }

                String limitationName = limitation.getLimitationName();
                Integer limit = limitation.getLimit();
                System.out.print(" - " + (limitationName != null ? limitationName : ""));
                if (limit != null) {
                    System.out.println(" (Limit: " + limit + ")");
                } else {
                    System.out.println(" (unlimited)");
                }

                String limitationDescription = limitation.getLimitationDescription();
                System.out.println("   Description: " + (limitationDescription != null ? limitationDescription : ""));

                UUID limitationId = limitation.getLimitationId();
                if (limitationName != null && limit != null && limitationId != null) {
                    limitationMap.put(limitationId, limitationName + " (max: " + limit + ")");
                }
            }
        } else {
            System.out.println("\nNo limitations available in this license.");
        }

        // Enumerate constrained variables
        var constrainedVariables = licenseInfo.getLicenseConstrainedVariables();
        if (constrainedVariables != null && !constrainedVariables.isEmpty()) {
            System.out.println("\nConstrained Variables:");
            for (var constrainedVariable : constrainedVariables) {
                if (constrainedVariable == null) {
                    continue;
                }

                String variableName = constrainedVariable.getVariableName();
                System.out.println(" - " + (variableName != null ? variableName : ""));

                String variableDescription = constrainedVariable.getVariableDescription();
                if (variableDescription != null && !variableDescription.isEmpty()) {
                    System.out.println("   Description: " + variableDescription);
                }

                System.out.print("   Value: ");
                List<String> values = constrainedVariable.getValues();
                if (values != null) {
                    for (String value : values) {
                        if (value != null) {
                            System.out.print(value);
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo constrained variables available in this license.");
        }

        // Enumerate variables
        var variables = licenseInfo.getLicenseVariables();
        if (variables != null && !variables.isEmpty()) {
            System.out.println("\nVariables:");
            for (var variable : variables) {
                if (variable == null) {
                    continue;
                }

                String variableName = variable.getVariableName();
                System.out.println(" - " + (variableName != null ? variableName : ""));
                String description = variable.getVariableDescription();
                System.out.println("   Description: " + (description != null ? description : ""));
                String value = variable.getValue();
                System.out.println("   Value: " + (value != null ? value : ""));
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

        return limitationMap;
    }

    /**
     * Prints the details of a LicenseInfo object to the console.
     * Displays license status, features, limitations, and expiration information.
     * 
     * @param licenseInfo The LicenseInfo object to print
     * @return A map of limitations for further use in the application
     */    
    public static Map<UUID, String> PrintLicenseInfo(LicenseInfoDto licenseInfo) {
        if (licenseInfo == null) {
            return new HashMap<>();
        }

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
        var provisioningMode = licenseInfo.getProvisioningMode();
        var clientType = licenseInfo.getClientType();
        System.out.println("Provisioning mode / client type: "
            + String.valueOf(provisioningMode) + " / " + String.valueOf(clientType));

        // License details
        System.out.println("\nLicense Details:");
        System.out.println("----------------");
        Boolean isTemporary = licenseInfo.getIsTemporary();
        System.out.println("Is Temporary: " + (isTemporary != null ? isTemporary : false));
        Integer heartbeatPeriod = licenseInfo.getHeartbeatPeriod();
        if (heartbeatPeriod != null) {
            System.out.println("Heartbeat Period: " + heartbeatPeriod + " days");
        }

        // Date information and license validity
        var createdDateUtc = licenseInfo.getCreatedDateUtc();
        if (createdDateUtc != null) {
            System.out.println("Created Date: " + createdDateUtc);
        }

        Integer sessionPeriod = licenseInfo.getSessionPeriod();
        if (sessionPeriod != null && sessionPeriod > 0) {
            System.out.println("Session Period: " + sessionPeriod + " days");
        }

        Integer freeride = licenseInfo.getFreeride();
        if (freeride != null && freeride > 0) {
            System.out.println("Freeride granted for " + freeride + " day(s).");
        }

        // Enumerate features
        var features = licenseInfo.getFeatures();
        if (features != null && features.size() > 0) {
            System.out.println("\nFeatures:");
            for (var feature : features) {
                String featureName = feature.getName();
                Boolean isActive = feature.getIsActive();
                System.out.print("- " + (featureName != null ? featureName : ""));
                if (Boolean.FALSE.equals(isActive)) {
                    System.out.println(" (not active)");
                } else {
                    System.out.println();
                }
                String description = feature.getDescription();
                if (description != null && !description.isEmpty()) {
                    System.out.println("   Description: " + description);
                }
                var featureExp = feature.getExpirationDateUtc();
                if (featureExp != null) {
                    System.out.println("   Expires: " + featureExp);
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
                System.out.print(" - " + (limName != null ? limName : ""));
                if (limValue != null) {
                    System.out.println(" (" + limValue + ")");
                } else {
                    System.out.println(" (Unlimited)");
                }

                String description = limitation.getDescription();
                if (description != null && !description.isEmpty()) {
                    System.out.println("   Description: " + description);
                }

                if (limitation.getRemaining() != null) {
                    System.out.println("   remaining: " + limitation.getRemaining());
                }

                if (limitation.getBalance() != null) {
                    System.out.println("   balance: " + limitation.getBalance());
                }
            }
        } else {
            System.out.println("\nNo limitations available in this license.");
        }

        var constrainedVariables = licenseInfo.getConstrainedVariables();
        if (constrainedVariables != null && !constrainedVariables.isEmpty()) {
            System.out.println("\nConstrained Variables:");
            for (var constrainedVariable : constrainedVariables) {
                String varName = constrainedVariable.getName();
                System.out.println(" - " + (varName != null ? varName : ""));
                String description = constrainedVariable.getDescription();
                if (description != null && !description.isEmpty()) {
                    System.out.println("   Description: " + description);
                }
                System.out.print("   Value: ");
                List<String> values = constrainedVariable.getValue();
                if (values != null) {
                    for (String value : values) {
                        if (value != null) {
                            System.out.print(value);
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo constrained variables available in this license.");
        }

        // Enumerate variables if present
        var variables = licenseInfo.getVariables();
        if (variables != null && variables.size() > 0) {
            System.out.println("\nVariables:");
            for (var variable : variables) {
                String varName = variable.getName();
                String varValue = variable.getValue();
                System.out.println(" - " + (varName != null ? varName : ""));
                String description = variable.getDescription();
                if (description != null && !description.isEmpty()) {
                    System.out.println("   Description: " + description);
                }
                System.out.println("   Value: " + (varValue != null ? varValue : ""));
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
