/*
 * SLASCONE API
 * Please visit our official [Documentation](https://support.slascone.com/hc/en-us/sections/360004685737-API) and/or our [GitHub repository](https://github.com/slascone/) and/or our [NuGet package](https://www.nuget.org/packages/Slascone.Client/). Always use Version 2 of this API (Version 1.3 is deprecated).
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.slascone.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.slascone.model.AnalyticalFieldDto;
import com.slascone.model.ConstrainedVariableDto;
import com.slascone.model.EmailTemplateDto;
import com.slascone.model.FeatureDto;
import com.slascone.model.LimitationDto;
import com.slascone.model.ProductSoftwareShipmentPropertyDto;
import com.slascone.model.SoftwareReleaseLimitationDto;
import com.slascone.model.UsageFeatureDto;
import com.slascone.model.UsageModuleDto;
import com.slascone.model.VariableDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.slascone.JSON;

/**
 * ProductDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class ProductDetailsDto {
  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  @javax.annotation.Nullable
  private List<FeatureDto> features;

  public static final String SERIALIZED_NAME_LIMITATIONS = "limitations";
  @SerializedName(SERIALIZED_NAME_LIMITATIONS)
  @javax.annotation.Nullable
  private List<LimitationDto> limitations;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  @javax.annotation.Nullable
  private List<VariableDto> variables;

  public static final String SERIALIZED_NAME_CONSTRAINED_VARIABLES = "constrained_variables";
  @SerializedName(SERIALIZED_NAME_CONSTRAINED_VARIABLES)
  @javax.annotation.Nullable
  private List<ConstrainedVariableDto> constrainedVariables;

  public static final String SERIALIZED_NAME_ANALYTICAL_FIELDS = "analytical_fields";
  @SerializedName(SERIALIZED_NAME_ANALYTICAL_FIELDS)
  @javax.annotation.Nullable
  private List<AnalyticalFieldDto> analyticalFields;

  public static final String SERIALIZED_NAME_SOFTWARE_RELEASE_LIMITATIONS = "software_release_limitations";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_RELEASE_LIMITATIONS)
  @javax.annotation.Nullable
  private List<SoftwareReleaseLimitationDto> softwareReleaseLimitations;

  public static final String SERIALIZED_NAME_USAGE_FEATURES = "usage_features";
  @SerializedName(SERIALIZED_NAME_USAGE_FEATURES)
  @javax.annotation.Nullable
  private List<UsageFeatureDto> usageFeatures;

  public static final String SERIALIZED_NAME_USAGE_MODULES = "usage_modules";
  @SerializedName(SERIALIZED_NAME_USAGE_MODULES)
  @javax.annotation.Nullable
  private List<UsageModuleDto> usageModules;

  public static final String SERIALIZED_NAME_EMAIL_TEMPLATES = "email_templates";
  @SerializedName(SERIALIZED_NAME_EMAIL_TEMPLATES)
  @javax.annotation.Nullable
  private List<EmailTemplateDto> emailTemplates;

  public static final String SERIALIZED_NAME_SOFTWARE_SHIPMENT_PROPERTIES = "software_shipment_properties";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_SHIPMENT_PROPERTIES)
  @javax.annotation.Nullable
  private List<ProductSoftwareShipmentPropertyDto> softwareShipmentProperties;

  public ProductDetailsDto() {
  }

  public ProductDetailsDto features(@javax.annotation.Nullable List<FeatureDto> features) {
    this.features = features;
    return this;
  }

  public ProductDetailsDto addFeaturesItem(FeatureDto featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   */
  @javax.annotation.Nullable
  public List<FeatureDto> getFeatures() {
    return features;
  }

  public void setFeatures(@javax.annotation.Nullable List<FeatureDto> features) {
    this.features = features;
  }


  public ProductDetailsDto limitations(@javax.annotation.Nullable List<LimitationDto> limitations) {
    this.limitations = limitations;
    return this;
  }

  public ProductDetailsDto addLimitationsItem(LimitationDto limitationsItem) {
    if (this.limitations == null) {
      this.limitations = new ArrayList<>();
    }
    this.limitations.add(limitationsItem);
    return this;
  }

  /**
   * Get limitations
   * @return limitations
   */
  @javax.annotation.Nullable
  public List<LimitationDto> getLimitations() {
    return limitations;
  }

  public void setLimitations(@javax.annotation.Nullable List<LimitationDto> limitations) {
    this.limitations = limitations;
  }


  public ProductDetailsDto variables(@javax.annotation.Nullable List<VariableDto> variables) {
    this.variables = variables;
    return this;
  }

  public ProductDetailsDto addVariablesItem(VariableDto variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
   */
  @javax.annotation.Nullable
  public List<VariableDto> getVariables() {
    return variables;
  }

  public void setVariables(@javax.annotation.Nullable List<VariableDto> variables) {
    this.variables = variables;
  }


  public ProductDetailsDto constrainedVariables(@javax.annotation.Nullable List<ConstrainedVariableDto> constrainedVariables) {
    this.constrainedVariables = constrainedVariables;
    return this;
  }

  public ProductDetailsDto addConstrainedVariablesItem(ConstrainedVariableDto constrainedVariablesItem) {
    if (this.constrainedVariables == null) {
      this.constrainedVariables = new ArrayList<>();
    }
    this.constrainedVariables.add(constrainedVariablesItem);
    return this;
  }

  /**
   * Get constrainedVariables
   * @return constrainedVariables
   */
  @javax.annotation.Nullable
  public List<ConstrainedVariableDto> getConstrainedVariables() {
    return constrainedVariables;
  }

  public void setConstrainedVariables(@javax.annotation.Nullable List<ConstrainedVariableDto> constrainedVariables) {
    this.constrainedVariables = constrainedVariables;
  }


  public ProductDetailsDto analyticalFields(@javax.annotation.Nullable List<AnalyticalFieldDto> analyticalFields) {
    this.analyticalFields = analyticalFields;
    return this;
  }

  public ProductDetailsDto addAnalyticalFieldsItem(AnalyticalFieldDto analyticalFieldsItem) {
    if (this.analyticalFields == null) {
      this.analyticalFields = new ArrayList<>();
    }
    this.analyticalFields.add(analyticalFieldsItem);
    return this;
  }

  /**
   * Get analyticalFields
   * @return analyticalFields
   */
  @javax.annotation.Nullable
  public List<AnalyticalFieldDto> getAnalyticalFields() {
    return analyticalFields;
  }

  public void setAnalyticalFields(@javax.annotation.Nullable List<AnalyticalFieldDto> analyticalFields) {
    this.analyticalFields = analyticalFields;
  }


  public ProductDetailsDto softwareReleaseLimitations(@javax.annotation.Nullable List<SoftwareReleaseLimitationDto> softwareReleaseLimitations) {
    this.softwareReleaseLimitations = softwareReleaseLimitations;
    return this;
  }

  public ProductDetailsDto addSoftwareReleaseLimitationsItem(SoftwareReleaseLimitationDto softwareReleaseLimitationsItem) {
    if (this.softwareReleaseLimitations == null) {
      this.softwareReleaseLimitations = new ArrayList<>();
    }
    this.softwareReleaseLimitations.add(softwareReleaseLimitationsItem);
    return this;
  }

  /**
   * Get softwareReleaseLimitations
   * @return softwareReleaseLimitations
   */
  @javax.annotation.Nullable
  public List<SoftwareReleaseLimitationDto> getSoftwareReleaseLimitations() {
    return softwareReleaseLimitations;
  }

  public void setSoftwareReleaseLimitations(@javax.annotation.Nullable List<SoftwareReleaseLimitationDto> softwareReleaseLimitations) {
    this.softwareReleaseLimitations = softwareReleaseLimitations;
  }


  public ProductDetailsDto usageFeatures(@javax.annotation.Nullable List<UsageFeatureDto> usageFeatures) {
    this.usageFeatures = usageFeatures;
    return this;
  }

  public ProductDetailsDto addUsageFeaturesItem(UsageFeatureDto usageFeaturesItem) {
    if (this.usageFeatures == null) {
      this.usageFeatures = new ArrayList<>();
    }
    this.usageFeatures.add(usageFeaturesItem);
    return this;
  }

  /**
   * Get usageFeatures
   * @return usageFeatures
   */
  @javax.annotation.Nullable
  public List<UsageFeatureDto> getUsageFeatures() {
    return usageFeatures;
  }

  public void setUsageFeatures(@javax.annotation.Nullable List<UsageFeatureDto> usageFeatures) {
    this.usageFeatures = usageFeatures;
  }


  public ProductDetailsDto usageModules(@javax.annotation.Nullable List<UsageModuleDto> usageModules) {
    this.usageModules = usageModules;
    return this;
  }

  public ProductDetailsDto addUsageModulesItem(UsageModuleDto usageModulesItem) {
    if (this.usageModules == null) {
      this.usageModules = new ArrayList<>();
    }
    this.usageModules.add(usageModulesItem);
    return this;
  }

  /**
   * Get usageModules
   * @return usageModules
   */
  @javax.annotation.Nullable
  public List<UsageModuleDto> getUsageModules() {
    return usageModules;
  }

  public void setUsageModules(@javax.annotation.Nullable List<UsageModuleDto> usageModules) {
    this.usageModules = usageModules;
  }


  public ProductDetailsDto emailTemplates(@javax.annotation.Nullable List<EmailTemplateDto> emailTemplates) {
    this.emailTemplates = emailTemplates;
    return this;
  }

  public ProductDetailsDto addEmailTemplatesItem(EmailTemplateDto emailTemplatesItem) {
    if (this.emailTemplates == null) {
      this.emailTemplates = new ArrayList<>();
    }
    this.emailTemplates.add(emailTemplatesItem);
    return this;
  }

  /**
   * Get emailTemplates
   * @return emailTemplates
   */
  @javax.annotation.Nullable
  public List<EmailTemplateDto> getEmailTemplates() {
    return emailTemplates;
  }

  public void setEmailTemplates(@javax.annotation.Nullable List<EmailTemplateDto> emailTemplates) {
    this.emailTemplates = emailTemplates;
  }


  public ProductDetailsDto softwareShipmentProperties(@javax.annotation.Nullable List<ProductSoftwareShipmentPropertyDto> softwareShipmentProperties) {
    this.softwareShipmentProperties = softwareShipmentProperties;
    return this;
  }

  public ProductDetailsDto addSoftwareShipmentPropertiesItem(ProductSoftwareShipmentPropertyDto softwareShipmentPropertiesItem) {
    if (this.softwareShipmentProperties == null) {
      this.softwareShipmentProperties = new ArrayList<>();
    }
    this.softwareShipmentProperties.add(softwareShipmentPropertiesItem);
    return this;
  }

  /**
   * Get softwareShipmentProperties
   * @return softwareShipmentProperties
   */
  @javax.annotation.Nullable
  public List<ProductSoftwareShipmentPropertyDto> getSoftwareShipmentProperties() {
    return softwareShipmentProperties;
  }

  public void setSoftwareShipmentProperties(@javax.annotation.Nullable List<ProductSoftwareShipmentPropertyDto> softwareShipmentProperties) {
    this.softwareShipmentProperties = softwareShipmentProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailsDto productDetailsDto = (ProductDetailsDto) o;
    return Objects.equals(this.features, productDetailsDto.features) &&
        Objects.equals(this.limitations, productDetailsDto.limitations) &&
        Objects.equals(this.variables, productDetailsDto.variables) &&
        Objects.equals(this.constrainedVariables, productDetailsDto.constrainedVariables) &&
        Objects.equals(this.analyticalFields, productDetailsDto.analyticalFields) &&
        Objects.equals(this.softwareReleaseLimitations, productDetailsDto.softwareReleaseLimitations) &&
        Objects.equals(this.usageFeatures, productDetailsDto.usageFeatures) &&
        Objects.equals(this.usageModules, productDetailsDto.usageModules) &&
        Objects.equals(this.emailTemplates, productDetailsDto.emailTemplates) &&
        Objects.equals(this.softwareShipmentProperties, productDetailsDto.softwareShipmentProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, limitations, variables, constrainedVariables, analyticalFields, softwareReleaseLimitations, usageFeatures, usageModules, emailTemplates, softwareShipmentProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailsDto {\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    limitations: ").append(toIndentedString(limitations)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    constrainedVariables: ").append(toIndentedString(constrainedVariables)).append("\n");
    sb.append("    analyticalFields: ").append(toIndentedString(analyticalFields)).append("\n");
    sb.append("    softwareReleaseLimitations: ").append(toIndentedString(softwareReleaseLimitations)).append("\n");
    sb.append("    usageFeatures: ").append(toIndentedString(usageFeatures)).append("\n");
    sb.append("    usageModules: ").append(toIndentedString(usageModules)).append("\n");
    sb.append("    emailTemplates: ").append(toIndentedString(emailTemplates)).append("\n");
    sb.append("    softwareShipmentProperties: ").append(toIndentedString(softwareShipmentProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>(Arrays.asList("features", "limitations", "variables", "constrained_variables", "analytical_fields", "software_release_limitations", "usage_features", "usage_modules", "email_templates", "software_shipment_properties"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailsDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailsDto is not found in the empty JSON string", ProductDetailsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailsDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
        if (jsonArrayfeatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
          }

          // validate the optional field `features` (array)
          for (int i = 0; i < jsonArrayfeatures.size(); i++) {
            FeatureDto.validateJsonElement(jsonArrayfeatures.get(i));
          };
        }
      }
      if (jsonObj.get("limitations") != null && !jsonObj.get("limitations").isJsonNull()) {
        JsonArray jsonArraylimitations = jsonObj.getAsJsonArray("limitations");
        if (jsonArraylimitations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("limitations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `limitations` to be an array in the JSON string but got `%s`", jsonObj.get("limitations").toString()));
          }

          // validate the optional field `limitations` (array)
          for (int i = 0; i < jsonArraylimitations.size(); i++) {
            LimitationDto.validateJsonElement(jsonArraylimitations.get(i));
          };
        }
      }
      if (jsonObj.get("variables") != null && !jsonObj.get("variables").isJsonNull()) {
        JsonArray jsonArrayvariables = jsonObj.getAsJsonArray("variables");
        if (jsonArrayvariables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variables` to be an array in the JSON string but got `%s`", jsonObj.get("variables").toString()));
          }

          // validate the optional field `variables` (array)
          for (int i = 0; i < jsonArrayvariables.size(); i++) {
            VariableDto.validateJsonElement(jsonArrayvariables.get(i));
          };
        }
      }
      if (jsonObj.get("constrained_variables") != null && !jsonObj.get("constrained_variables").isJsonNull()) {
        JsonArray jsonArrayconstrainedVariables = jsonObj.getAsJsonArray("constrained_variables");
        if (jsonArrayconstrainedVariables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("constrained_variables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `constrained_variables` to be an array in the JSON string but got `%s`", jsonObj.get("constrained_variables").toString()));
          }

          // validate the optional field `constrained_variables` (array)
          for (int i = 0; i < jsonArrayconstrainedVariables.size(); i++) {
            ConstrainedVariableDto.validateJsonElement(jsonArrayconstrainedVariables.get(i));
          };
        }
      }
      if (jsonObj.get("analytical_fields") != null && !jsonObj.get("analytical_fields").isJsonNull()) {
        JsonArray jsonArrayanalyticalFields = jsonObj.getAsJsonArray("analytical_fields");
        if (jsonArrayanalyticalFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("analytical_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `analytical_fields` to be an array in the JSON string but got `%s`", jsonObj.get("analytical_fields").toString()));
          }

          // validate the optional field `analytical_fields` (array)
          for (int i = 0; i < jsonArrayanalyticalFields.size(); i++) {
            AnalyticalFieldDto.validateJsonElement(jsonArrayanalyticalFields.get(i));
          };
        }
      }
      if (jsonObj.get("software_release_limitations") != null && !jsonObj.get("software_release_limitations").isJsonNull()) {
        JsonArray jsonArraysoftwareReleaseLimitations = jsonObj.getAsJsonArray("software_release_limitations");
        if (jsonArraysoftwareReleaseLimitations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("software_release_limitations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `software_release_limitations` to be an array in the JSON string but got `%s`", jsonObj.get("software_release_limitations").toString()));
          }

          // validate the optional field `software_release_limitations` (array)
          for (int i = 0; i < jsonArraysoftwareReleaseLimitations.size(); i++) {
            SoftwareReleaseLimitationDto.validateJsonElement(jsonArraysoftwareReleaseLimitations.get(i));
          };
        }
      }
      if (jsonObj.get("usage_features") != null && !jsonObj.get("usage_features").isJsonNull()) {
        JsonArray jsonArrayusageFeatures = jsonObj.getAsJsonArray("usage_features");
        if (jsonArrayusageFeatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usage_features").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usage_features` to be an array in the JSON string but got `%s`", jsonObj.get("usage_features").toString()));
          }

          // validate the optional field `usage_features` (array)
          for (int i = 0; i < jsonArrayusageFeatures.size(); i++) {
            UsageFeatureDto.validateJsonElement(jsonArrayusageFeatures.get(i));
          };
        }
      }
      if (jsonObj.get("usage_modules") != null && !jsonObj.get("usage_modules").isJsonNull()) {
        JsonArray jsonArrayusageModules = jsonObj.getAsJsonArray("usage_modules");
        if (jsonArrayusageModules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usage_modules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usage_modules` to be an array in the JSON string but got `%s`", jsonObj.get("usage_modules").toString()));
          }

          // validate the optional field `usage_modules` (array)
          for (int i = 0; i < jsonArrayusageModules.size(); i++) {
            UsageModuleDto.validateJsonElement(jsonArrayusageModules.get(i));
          };
        }
      }
      if (jsonObj.get("email_templates") != null && !jsonObj.get("email_templates").isJsonNull()) {
        JsonArray jsonArrayemailTemplates = jsonObj.getAsJsonArray("email_templates");
        if (jsonArrayemailTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("email_templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `email_templates` to be an array in the JSON string but got `%s`", jsonObj.get("email_templates").toString()));
          }

          // validate the optional field `email_templates` (array)
          for (int i = 0; i < jsonArrayemailTemplates.size(); i++) {
            EmailTemplateDto.validateJsonElement(jsonArrayemailTemplates.get(i));
          };
        }
      }
      if (jsonObj.get("software_shipment_properties") != null && !jsonObj.get("software_shipment_properties").isJsonNull()) {
        JsonArray jsonArraysoftwareShipmentProperties = jsonObj.getAsJsonArray("software_shipment_properties");
        if (jsonArraysoftwareShipmentProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("software_shipment_properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `software_shipment_properties` to be an array in the JSON string but got `%s`", jsonObj.get("software_shipment_properties").toString()));
          }

          // validate the optional field `software_shipment_properties` (array)
          for (int i = 0; i < jsonArraysoftwareShipmentProperties.size(); i++) {
            ProductSoftwareShipmentPropertyDto.validateJsonElement(jsonArraysoftwareShipmentProperties.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailsDto>() {
           @Override
           public void write(JsonWriter out, ProductDetailsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailsDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailsDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailsDto
   * @throws IOException if the JSON string is invalid with respect to ProductDetailsDto
   */
  public static ProductDetailsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailsDto.class);
  }

  /**
   * Convert an instance of ProductDetailsDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

