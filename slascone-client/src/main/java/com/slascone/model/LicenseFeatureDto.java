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
import com.slascone.model.LicenseFeatureExceptionsDto;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
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
 * LicenseFeatureDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class LicenseFeatureDto {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  @javax.annotation.Nonnull
  private UUID productId;

  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  @javax.annotation.Nonnull
  private UUID featureId;

  public static final String SERIALIZED_NAME_FEATURE_NAME = "feature_name";
  @SerializedName(SERIALIZED_NAME_FEATURE_NAME)
  @javax.annotation.Nullable
  private String featureName;

  public static final String SERIALIZED_NAME_FEATURE_DESCRIPTION = "feature_description";
  @SerializedName(SERIALIZED_NAME_FEATURE_DESCRIPTION)
  @javax.annotation.Nullable
  private String featureDescription;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  @javax.annotation.Nullable
  private Boolean isActive;

  public static final String SERIALIZED_NAME_FEATURE_EXCEPTIONS = "feature_exceptions";
  @SerializedName(SERIALIZED_NAME_FEATURE_EXCEPTIONS)
  @javax.annotation.Nullable
  private LicenseFeatureExceptionsDto featureExceptions;

  public LicenseFeatureDto() {
  }

  public LicenseFeatureDto productId(@javax.annotation.Nonnull UUID productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  @javax.annotation.Nonnull
  public UUID getProductId() {
    return productId;
  }

  public void setProductId(@javax.annotation.Nonnull UUID productId) {
    this.productId = productId;
  }


  public LicenseFeatureDto featureId(@javax.annotation.Nonnull UUID featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * Get featureId
   * @return featureId
   */
  @javax.annotation.Nonnull
  public UUID getFeatureId() {
    return featureId;
  }

  public void setFeatureId(@javax.annotation.Nonnull UUID featureId) {
    this.featureId = featureId;
  }


  public LicenseFeatureDto featureName(@javax.annotation.Nullable String featureName) {
    this.featureName = featureName;
    return this;
  }

  /**
   * Get featureName
   * @return featureName
   */
  @javax.annotation.Nullable
  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(@javax.annotation.Nullable String featureName) {
    this.featureName = featureName;
  }


  public LicenseFeatureDto featureDescription(@javax.annotation.Nullable String featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

  /**
   * Get featureDescription
   * @return featureDescription
   */
  @javax.annotation.Nullable
  public String getFeatureDescription() {
    return featureDescription;
  }

  public void setFeatureDescription(@javax.annotation.Nullable String featureDescription) {
    this.featureDescription = featureDescription;
  }


  public LicenseFeatureDto isActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
  }


  public LicenseFeatureDto featureExceptions(@javax.annotation.Nullable LicenseFeatureExceptionsDto featureExceptions) {
    this.featureExceptions = featureExceptions;
    return this;
  }

  /**
   * Get featureExceptions
   * @return featureExceptions
   */
  @javax.annotation.Nullable
  public LicenseFeatureExceptionsDto getFeatureExceptions() {
    return featureExceptions;
  }

  public void setFeatureExceptions(@javax.annotation.Nullable LicenseFeatureExceptionsDto featureExceptions) {
    this.featureExceptions = featureExceptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseFeatureDto licenseFeatureDto = (LicenseFeatureDto) o;
    return Objects.equals(this.productId, licenseFeatureDto.productId) &&
        Objects.equals(this.featureId, licenseFeatureDto.featureId) &&
        Objects.equals(this.featureName, licenseFeatureDto.featureName) &&
        Objects.equals(this.featureDescription, licenseFeatureDto.featureDescription) &&
        Objects.equals(this.isActive, licenseFeatureDto.isActive) &&
        Objects.equals(this.featureExceptions, licenseFeatureDto.featureExceptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, featureId, featureName, featureDescription, isActive, featureExceptions);
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
    sb.append("class LicenseFeatureDto {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    featureExceptions: ").append(toIndentedString(featureExceptions)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("product_id", "feature_id", "feature_name", "feature_description", "is_active", "feature_exceptions"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("product_id", "feature_id"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LicenseFeatureDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LicenseFeatureDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LicenseFeatureDto is not found in the empty JSON string", LicenseFeatureDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LicenseFeatureDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LicenseFeatureDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LicenseFeatureDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("product_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_id").toString()));
      }
      if (!jsonObj.get("feature_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature_id").toString()));
      }
      if ((jsonObj.get("feature_name") != null && !jsonObj.get("feature_name").isJsonNull()) && !jsonObj.get("feature_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature_name").toString()));
      }
      if ((jsonObj.get("feature_description") != null && !jsonObj.get("feature_description").isJsonNull()) && !jsonObj.get("feature_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature_description").toString()));
      }
      // validate the optional field `feature_exceptions`
      if (jsonObj.get("feature_exceptions") != null && !jsonObj.get("feature_exceptions").isJsonNull()) {
        LicenseFeatureExceptionsDto.validateJsonElement(jsonObj.get("feature_exceptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LicenseFeatureDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LicenseFeatureDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LicenseFeatureDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LicenseFeatureDto.class));

       return (TypeAdapter<T>) new TypeAdapter<LicenseFeatureDto>() {
           @Override
           public void write(JsonWriter out, LicenseFeatureDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LicenseFeatureDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LicenseFeatureDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LicenseFeatureDto
   * @throws IOException if the JSON string is invalid with respect to LicenseFeatureDto
   */
  public static LicenseFeatureDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LicenseFeatureDto.class);
  }

  /**
   * Convert an instance of LicenseFeatureDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

