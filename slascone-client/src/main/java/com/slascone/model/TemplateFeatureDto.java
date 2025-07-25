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
 * TemplateFeatureDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class TemplateFeatureDto {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  @javax.annotation.Nullable
  private UUID templateId;

  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  @javax.annotation.Nonnull
  private UUID featureId;

  public static final String SERIALIZED_NAME_FEATURE_NAME = "feature_name";
  @SerializedName(SERIALIZED_NAME_FEATURE_NAME)
  @javax.annotation.Nullable
  private String featureName;

  public static final String SERIALIZED_NAME_IS_ADJUSTABLE = "is_adjustable";
  @SerializedName(SERIALIZED_NAME_IS_ADJUSTABLE)
  @javax.annotation.Nullable
  private Boolean isAdjustable;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  @javax.annotation.Nullable
  private Boolean isActive;

  public TemplateFeatureDto() {
  }

  public TemplateFeatureDto templateId(@javax.annotation.Nullable UUID templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @javax.annotation.Nullable
  public UUID getTemplateId() {
    return templateId;
  }

  public void setTemplateId(@javax.annotation.Nullable UUID templateId) {
    this.templateId = templateId;
  }


  public TemplateFeatureDto featureId(@javax.annotation.Nonnull UUID featureId) {
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


  public TemplateFeatureDto featureName(@javax.annotation.Nullable String featureName) {
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


  public TemplateFeatureDto isAdjustable(@javax.annotation.Nullable Boolean isAdjustable) {
    this.isAdjustable = isAdjustable;
    return this;
  }

  /**
   * Get isAdjustable
   * @return isAdjustable
   */
  @javax.annotation.Nullable
  public Boolean getIsAdjustable() {
    return isAdjustable;
  }

  public void setIsAdjustable(@javax.annotation.Nullable Boolean isAdjustable) {
    this.isAdjustable = isAdjustable;
  }


  public TemplateFeatureDto isActive(@javax.annotation.Nullable Boolean isActive) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateFeatureDto templateFeatureDto = (TemplateFeatureDto) o;
    return Objects.equals(this.templateId, templateFeatureDto.templateId) &&
        Objects.equals(this.featureId, templateFeatureDto.featureId) &&
        Objects.equals(this.featureName, templateFeatureDto.featureName) &&
        Objects.equals(this.isAdjustable, templateFeatureDto.isAdjustable) &&
        Objects.equals(this.isActive, templateFeatureDto.isActive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, featureId, featureName, isAdjustable, isActive);
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
    sb.append("class TemplateFeatureDto {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    isAdjustable: ").append(toIndentedString(isAdjustable)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("template_id", "feature_id", "feature_name", "is_adjustable", "is_active"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("feature_id"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateFeatureDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateFeatureDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateFeatureDto is not found in the empty JSON string", TemplateFeatureDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateFeatureDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateFeatureDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateFeatureDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (!jsonObj.get("feature_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature_id").toString()));
      }
      if ((jsonObj.get("feature_name") != null && !jsonObj.get("feature_name").isJsonNull()) && !jsonObj.get("feature_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateFeatureDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateFeatureDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateFeatureDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateFeatureDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateFeatureDto>() {
           @Override
           public void write(JsonWriter out, TemplateFeatureDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateFeatureDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateFeatureDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateFeatureDto
   * @throws IOException if the JSON string is invalid with respect to TemplateFeatureDto
   */
  public static TemplateFeatureDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateFeatureDto.class);
  }

  /**
   * Convert an instance of TemplateFeatureDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

