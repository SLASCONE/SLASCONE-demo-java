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
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

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
 * ValidateConsumptionStatusDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class ValidateConsumptionStatusDto {
  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  @javax.annotation.Nonnull
  private UUID licenseId;

  public static final String SERIALIZED_NAME_LIMITATION_ID = "limitation_id";
  @SerializedName(SERIALIZED_NAME_LIMITATION_ID)
  @javax.annotation.Nonnull
  private UUID limitationId;

  public ValidateConsumptionStatusDto() {
  }

  public ValidateConsumptionStatusDto licenseId(@javax.annotation.Nonnull UUID licenseId) {
    this.licenseId = licenseId;
    return this;
  }

  /**
   * Get licenseId
   * @return licenseId
   */
  @javax.annotation.Nonnull
  public UUID getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(@javax.annotation.Nonnull UUID licenseId) {
    this.licenseId = licenseId;
  }


  public ValidateConsumptionStatusDto limitationId(@javax.annotation.Nonnull UUID limitationId) {
    this.limitationId = limitationId;
    return this;
  }

  /**
   * Get limitationId
   * @return limitationId
   */
  @javax.annotation.Nonnull
  public UUID getLimitationId() {
    return limitationId;
  }

  public void setLimitationId(@javax.annotation.Nonnull UUID limitationId) {
    this.limitationId = limitationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateConsumptionStatusDto validateConsumptionStatusDto = (ValidateConsumptionStatusDto) o;
    return Objects.equals(this.licenseId, validateConsumptionStatusDto.licenseId) &&
        Objects.equals(this.limitationId, validateConsumptionStatusDto.limitationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseId, limitationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateConsumptionStatusDto {\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    limitationId: ").append(toIndentedString(limitationId)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("license_id", "limitation_id"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("license_id", "limitation_id"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValidateConsumptionStatusDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidateConsumptionStatusDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateConsumptionStatusDto is not found in the empty JSON string", ValidateConsumptionStatusDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidateConsumptionStatusDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidateConsumptionStatusDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValidateConsumptionStatusDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if (!jsonObj.get("limitation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limitation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limitation_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateConsumptionStatusDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateConsumptionStatusDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateConsumptionStatusDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateConsumptionStatusDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateConsumptionStatusDto>() {
           @Override
           public void write(JsonWriter out, ValidateConsumptionStatusDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidateConsumptionStatusDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValidateConsumptionStatusDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValidateConsumptionStatusDto
   * @throws IOException if the JSON string is invalid with respect to ValidateConsumptionStatusDto
   */
  public static ValidateConsumptionStatusDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateConsumptionStatusDto.class);
  }

  /**
   * Convert an instance of ValidateConsumptionStatusDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

