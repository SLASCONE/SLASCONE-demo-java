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
 * DataExchangeUpdateCustomerDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class DataExchangeUpdateCustomerDto {
  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customer_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  @javax.annotation.Nonnull
  private String customerNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  @javax.annotation.Nullable
  private String customerName;

  public static final String SERIALIZED_NAME_CUSTOMER_TYPE = "customer_type";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TYPE)
  @javax.annotation.Nullable
  private String customerType;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  @javax.annotation.Nullable
  private String street;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  @javax.annotation.Nullable
  private String zip;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_PROSPECT_NUMBER = "prospect_number";
  @SerializedName(SERIALIZED_NAME_PROSPECT_NUMBER)
  @javax.annotation.Nullable
  private String prospectNumber;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags;

  public DataExchangeUpdateCustomerDto() {
  }

  public DataExchangeUpdateCustomerDto customerNumber(@javax.annotation.Nonnull String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Get customerNumber
   * @return customerNumber
   */
  @javax.annotation.Nonnull
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(@javax.annotation.Nonnull String customerNumber) {
    this.customerNumber = customerNumber;
  }


  public DataExchangeUpdateCustomerDto customerName(@javax.annotation.Nullable String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
   */
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(@javax.annotation.Nullable String customerName) {
    this.customerName = customerName;
  }


  public DataExchangeUpdateCustomerDto customerType(@javax.annotation.Nullable String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType
   * @return customerType
   */
  @javax.annotation.Nullable
  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(@javax.annotation.Nullable String customerType) {
    this.customerType = customerType;
  }


  public DataExchangeUpdateCustomerDto country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public DataExchangeUpdateCustomerDto street(@javax.annotation.Nullable String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
   */
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }

  public void setStreet(@javax.annotation.Nullable String street) {
    this.street = street;
  }


  public DataExchangeUpdateCustomerDto zip(@javax.annotation.Nullable String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(@javax.annotation.Nullable String zip) {
    this.zip = zip;
  }


  public DataExchangeUpdateCustomerDto city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public DataExchangeUpdateCustomerDto phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public DataExchangeUpdateCustomerDto email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public DataExchangeUpdateCustomerDto prospectNumber(@javax.annotation.Nullable String prospectNumber) {
    this.prospectNumber = prospectNumber;
    return this;
  }

  /**
   * Get prospectNumber
   * @return prospectNumber
   */
  @javax.annotation.Nullable
  public String getProspectNumber() {
    return prospectNumber;
  }

  public void setProspectNumber(@javax.annotation.Nullable String prospectNumber) {
    this.prospectNumber = prospectNumber;
  }


  public DataExchangeUpdateCustomerDto tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DataExchangeUpdateCustomerDto addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExchangeUpdateCustomerDto dataExchangeUpdateCustomerDto = (DataExchangeUpdateCustomerDto) o;
    return Objects.equals(this.customerNumber, dataExchangeUpdateCustomerDto.customerNumber) &&
        Objects.equals(this.customerName, dataExchangeUpdateCustomerDto.customerName) &&
        Objects.equals(this.customerType, dataExchangeUpdateCustomerDto.customerType) &&
        Objects.equals(this.country, dataExchangeUpdateCustomerDto.country) &&
        Objects.equals(this.street, dataExchangeUpdateCustomerDto.street) &&
        Objects.equals(this.zip, dataExchangeUpdateCustomerDto.zip) &&
        Objects.equals(this.city, dataExchangeUpdateCustomerDto.city) &&
        Objects.equals(this.phone, dataExchangeUpdateCustomerDto.phone) &&
        Objects.equals(this.email, dataExchangeUpdateCustomerDto.email) &&
        Objects.equals(this.prospectNumber, dataExchangeUpdateCustomerDto.prospectNumber) &&
        Objects.equals(this.tags, dataExchangeUpdateCustomerDto.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, customerName, customerType, country, street, zip, city, phone, email, prospectNumber, tags);
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
    sb.append("class DataExchangeUpdateCustomerDto {\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    prospectNumber: ").append(toIndentedString(prospectNumber)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("customer_number", "customer_name", "customer_type", "country", "street", "zip", "city", "phone", "email", "prospect_number", "tags"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("customer_number"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataExchangeUpdateCustomerDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataExchangeUpdateCustomerDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataExchangeUpdateCustomerDto is not found in the empty JSON string", DataExchangeUpdateCustomerDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataExchangeUpdateCustomerDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataExchangeUpdateCustomerDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataExchangeUpdateCustomerDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_number").toString()));
      }
      if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) && !jsonObj.get("customer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_name").toString()));
      }
      if ((jsonObj.get("customer_type") != null && !jsonObj.get("customer_type").isJsonNull()) && !jsonObj.get("customer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_type").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("prospect_number") != null && !jsonObj.get("prospect_number").isJsonNull()) && !jsonObj.get("prospect_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prospect_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prospect_number").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataExchangeUpdateCustomerDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataExchangeUpdateCustomerDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataExchangeUpdateCustomerDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataExchangeUpdateCustomerDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DataExchangeUpdateCustomerDto>() {
           @Override
           public void write(JsonWriter out, DataExchangeUpdateCustomerDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataExchangeUpdateCustomerDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DataExchangeUpdateCustomerDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataExchangeUpdateCustomerDto
   * @throws IOException if the JSON string is invalid with respect to DataExchangeUpdateCustomerDto
   */
  public static DataExchangeUpdateCustomerDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataExchangeUpdateCustomerDto.class);
  }

  /**
   * Convert an instance of DataExchangeUpdateCustomerDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

