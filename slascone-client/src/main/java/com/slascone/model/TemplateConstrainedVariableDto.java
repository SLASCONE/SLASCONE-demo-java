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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * TemplateConstrainedVariableDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class TemplateConstrainedVariableDto {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  @javax.annotation.Nullable
  private UUID templateId;

  public static final String SERIALIZED_NAME_VARIABLE_ID = "variable_id";
  @SerializedName(SERIALIZED_NAME_VARIABLE_ID)
  @javax.annotation.Nonnull
  private UUID variableId;

  public static final String SERIALIZED_NAME_VARIABLE_NAME = "variable_name";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAME)
  @javax.annotation.Nullable
  private String variableName;

  public static final String SERIALIZED_NAME_IS_ADJUSTABLE = "is_adjustable";
  @SerializedName(SERIALIZED_NAME_IS_ADJUSTABLE)
  @javax.annotation.Nullable
  private Boolean isAdjustable;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @javax.annotation.Nullable
  private List<String> values;

  public TemplateConstrainedVariableDto() {
  }

  public TemplateConstrainedVariableDto templateId(@javax.annotation.Nullable UUID templateId) {
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


  public TemplateConstrainedVariableDto variableId(@javax.annotation.Nonnull UUID variableId) {
    this.variableId = variableId;
    return this;
  }

  /**
   * Get variableId
   * @return variableId
   */
  @javax.annotation.Nonnull
  public UUID getVariableId() {
    return variableId;
  }

  public void setVariableId(@javax.annotation.Nonnull UUID variableId) {
    this.variableId = variableId;
  }


  public TemplateConstrainedVariableDto variableName(@javax.annotation.Nullable String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Get variableName
   * @return variableName
   */
  @javax.annotation.Nullable
  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(@javax.annotation.Nullable String variableName) {
    this.variableName = variableName;
  }


  public TemplateConstrainedVariableDto isAdjustable(@javax.annotation.Nullable Boolean isAdjustable) {
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


  public TemplateConstrainedVariableDto values(@javax.annotation.Nullable List<String> values) {
    this.values = values;
    return this;
  }

  public TemplateConstrainedVariableDto addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  public List<String> getValues() {
    return values;
  }

  public void setValues(@javax.annotation.Nullable List<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateConstrainedVariableDto templateConstrainedVariableDto = (TemplateConstrainedVariableDto) o;
    return Objects.equals(this.templateId, templateConstrainedVariableDto.templateId) &&
        Objects.equals(this.variableId, templateConstrainedVariableDto.variableId) &&
        Objects.equals(this.variableName, templateConstrainedVariableDto.variableName) &&
        Objects.equals(this.isAdjustable, templateConstrainedVariableDto.isAdjustable) &&
        Objects.equals(this.values, templateConstrainedVariableDto.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, variableId, variableName, isAdjustable, values);
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
    sb.append("class TemplateConstrainedVariableDto {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    isAdjustable: ").append(toIndentedString(isAdjustable)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("template_id", "variable_id", "variable_name", "is_adjustable", "values"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("variable_id"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateConstrainedVariableDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateConstrainedVariableDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateConstrainedVariableDto is not found in the empty JSON string", TemplateConstrainedVariableDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateConstrainedVariableDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateConstrainedVariableDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateConstrainedVariableDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (!jsonObj.get("variable_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_id").toString()));
      }
      if ((jsonObj.get("variable_name") != null && !jsonObj.get("variable_name").isJsonNull()) && !jsonObj.get("variable_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateConstrainedVariableDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateConstrainedVariableDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateConstrainedVariableDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateConstrainedVariableDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateConstrainedVariableDto>() {
           @Override
           public void write(JsonWriter out, TemplateConstrainedVariableDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateConstrainedVariableDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateConstrainedVariableDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateConstrainedVariableDto
   * @throws IOException if the JSON string is invalid with respect to TemplateConstrainedVariableDto
   */
  public static TemplateConstrainedVariableDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateConstrainedVariableDto.class);
  }

  /**
   * Convert an instance of TemplateConstrainedVariableDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

