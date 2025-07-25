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
import java.time.OffsetDateTime;
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
 * SoftwareShipmentPropertyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class SoftwareShipmentPropertyDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public static final String SERIALIZED_NAME_SOFTWARE_SHIPMENT_ID = "software_shipment_id";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_SHIPMENT_ID)
  @javax.annotation.Nullable
  private UUID softwareShipmentId;

  public static final String SERIALIZED_NAME_PRODUCT_SOFTWARE_SHIPMENT_PROPERTY_ID = "product_software_shipment_property_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SOFTWARE_SHIPMENT_PROPERTY_ID)
  @javax.annotation.Nullable
  private UUID productSoftwareShipmentPropertyId;

  public static final String SERIALIZED_NAME_PRODUCT_SOFTWARE_SHIPMENT_PROPERTY_NAME = "product_software_shipment_property_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SOFTWARE_SHIPMENT_PROPERTY_NAME)
  @javax.annotation.Nullable
  private String productSoftwareShipmentPropertyName;

  public static final String SERIALIZED_NAME_CREATED_DATE_UTC = "created_date_utc";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE_UTC)
  @javax.annotation.Nullable
  private OffsetDateTime createdDateUtc;

  public static final String SERIALIZED_NAME_MODIFIED_DATE_UTC = "modified_date_utc";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE_UTC)
  @javax.annotation.Nullable
  private OffsetDateTime modifiedDateUtc;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "last_modified_by";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  @javax.annotation.Nullable
  private String lastModifiedBy;

  public SoftwareShipmentPropertyDto() {
  }

  public SoftwareShipmentPropertyDto id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public SoftwareShipmentPropertyDto value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }


  public SoftwareShipmentPropertyDto softwareShipmentId(@javax.annotation.Nullable UUID softwareShipmentId) {
    this.softwareShipmentId = softwareShipmentId;
    return this;
  }

  /**
   * Get softwareShipmentId
   * @return softwareShipmentId
   */
  @javax.annotation.Nullable
  public UUID getSoftwareShipmentId() {
    return softwareShipmentId;
  }

  public void setSoftwareShipmentId(@javax.annotation.Nullable UUID softwareShipmentId) {
    this.softwareShipmentId = softwareShipmentId;
  }


  public SoftwareShipmentPropertyDto productSoftwareShipmentPropertyId(@javax.annotation.Nullable UUID productSoftwareShipmentPropertyId) {
    this.productSoftwareShipmentPropertyId = productSoftwareShipmentPropertyId;
    return this;
  }

  /**
   * Get productSoftwareShipmentPropertyId
   * @return productSoftwareShipmentPropertyId
   */
  @javax.annotation.Nullable
  public UUID getProductSoftwareShipmentPropertyId() {
    return productSoftwareShipmentPropertyId;
  }

  public void setProductSoftwareShipmentPropertyId(@javax.annotation.Nullable UUID productSoftwareShipmentPropertyId) {
    this.productSoftwareShipmentPropertyId = productSoftwareShipmentPropertyId;
  }


  public SoftwareShipmentPropertyDto productSoftwareShipmentPropertyName(@javax.annotation.Nullable String productSoftwareShipmentPropertyName) {
    this.productSoftwareShipmentPropertyName = productSoftwareShipmentPropertyName;
    return this;
  }

  /**
   * Get productSoftwareShipmentPropertyName
   * @return productSoftwareShipmentPropertyName
   */
  @javax.annotation.Nullable
  public String getProductSoftwareShipmentPropertyName() {
    return productSoftwareShipmentPropertyName;
  }

  public void setProductSoftwareShipmentPropertyName(@javax.annotation.Nullable String productSoftwareShipmentPropertyName) {
    this.productSoftwareShipmentPropertyName = productSoftwareShipmentPropertyName;
  }


  public SoftwareShipmentPropertyDto createdDateUtc(@javax.annotation.Nullable OffsetDateTime createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
    return this;
  }

  /**
   * Get createdDateUtc
   * @return createdDateUtc
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDateUtc() {
    return createdDateUtc;
  }

  public void setCreatedDateUtc(@javax.annotation.Nullable OffsetDateTime createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
  }


  public SoftwareShipmentPropertyDto modifiedDateUtc(@javax.annotation.Nullable OffsetDateTime modifiedDateUtc) {
    this.modifiedDateUtc = modifiedDateUtc;
    return this;
  }

  /**
   * Get modifiedDateUtc
   * @return modifiedDateUtc
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDateUtc() {
    return modifiedDateUtc;
  }

  public void setModifiedDateUtc(@javax.annotation.Nullable OffsetDateTime modifiedDateUtc) {
    this.modifiedDateUtc = modifiedDateUtc;
  }


  public SoftwareShipmentPropertyDto lastModifiedBy(@javax.annotation.Nullable String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   */
  @javax.annotation.Nullable
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(@javax.annotation.Nullable String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareShipmentPropertyDto softwareShipmentPropertyDto = (SoftwareShipmentPropertyDto) o;
    return Objects.equals(this.id, softwareShipmentPropertyDto.id) &&
        Objects.equals(this.value, softwareShipmentPropertyDto.value) &&
        Objects.equals(this.softwareShipmentId, softwareShipmentPropertyDto.softwareShipmentId) &&
        Objects.equals(this.productSoftwareShipmentPropertyId, softwareShipmentPropertyDto.productSoftwareShipmentPropertyId) &&
        Objects.equals(this.productSoftwareShipmentPropertyName, softwareShipmentPropertyDto.productSoftwareShipmentPropertyName) &&
        Objects.equals(this.createdDateUtc, softwareShipmentPropertyDto.createdDateUtc) &&
        Objects.equals(this.modifiedDateUtc, softwareShipmentPropertyDto.modifiedDateUtc) &&
        Objects.equals(this.lastModifiedBy, softwareShipmentPropertyDto.lastModifiedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, softwareShipmentId, productSoftwareShipmentPropertyId, productSoftwareShipmentPropertyName, createdDateUtc, modifiedDateUtc, lastModifiedBy);
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
    sb.append("class SoftwareShipmentPropertyDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    softwareShipmentId: ").append(toIndentedString(softwareShipmentId)).append("\n");
    sb.append("    productSoftwareShipmentPropertyId: ").append(toIndentedString(productSoftwareShipmentPropertyId)).append("\n");
    sb.append("    productSoftwareShipmentPropertyName: ").append(toIndentedString(productSoftwareShipmentPropertyName)).append("\n");
    sb.append("    createdDateUtc: ").append(toIndentedString(createdDateUtc)).append("\n");
    sb.append("    modifiedDateUtc: ").append(toIndentedString(modifiedDateUtc)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id", "value", "software_shipment_id", "product_software_shipment_property_id", "product_software_shipment_property_name", "created_date_utc", "modified_date_utc", "last_modified_by"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SoftwareShipmentPropertyDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SoftwareShipmentPropertyDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoftwareShipmentPropertyDto is not found in the empty JSON string", SoftwareShipmentPropertyDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SoftwareShipmentPropertyDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoftwareShipmentPropertyDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("software_shipment_id") != null && !jsonObj.get("software_shipment_id").isJsonNull()) && !jsonObj.get("software_shipment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `software_shipment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("software_shipment_id").toString()));
      }
      if ((jsonObj.get("product_software_shipment_property_id") != null && !jsonObj.get("product_software_shipment_property_id").isJsonNull()) && !jsonObj.get("product_software_shipment_property_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_software_shipment_property_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_software_shipment_property_id").toString()));
      }
      if ((jsonObj.get("product_software_shipment_property_name") != null && !jsonObj.get("product_software_shipment_property_name").isJsonNull()) && !jsonObj.get("product_software_shipment_property_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_software_shipment_property_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_software_shipment_property_name").toString()));
      }
      if ((jsonObj.get("last_modified_by") != null && !jsonObj.get("last_modified_by").isJsonNull()) && !jsonObj.get("last_modified_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoftwareShipmentPropertyDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoftwareShipmentPropertyDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoftwareShipmentPropertyDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoftwareShipmentPropertyDto.class));

       return (TypeAdapter<T>) new TypeAdapter<SoftwareShipmentPropertyDto>() {
           @Override
           public void write(JsonWriter out, SoftwareShipmentPropertyDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoftwareShipmentPropertyDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SoftwareShipmentPropertyDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SoftwareShipmentPropertyDto
   * @throws IOException if the JSON string is invalid with respect to SoftwareShipmentPropertyDto
   */
  public static SoftwareShipmentPropertyDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoftwareShipmentPropertyDto.class);
  }

  /**
   * Convert an instance of SoftwareShipmentPropertyDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

