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
 * DataExchangeAddOrUpdateCustomerContactDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class DataExchangeAddOrUpdateCustomerContactDto {
  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customer_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  @javax.annotation.Nonnull
  private String customerNumber;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  @javax.annotation.Nonnull
  private String contactName;

  public static final String SERIALIZED_NAME_CONTACT_SURNAME = "contact_surname";
  @SerializedName(SERIALIZED_NAME_CONTACT_SURNAME)
  @javax.annotation.Nonnull
  private String contactSurname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nonnull
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_MOBIL = "mobil";
  @SerializedName(SERIALIZED_NAME_MOBIL)
  @javax.annotation.Nullable
  private String mobil;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  @javax.annotation.Nullable
  private String language;

  public static final String SERIALIZED_NAME_IS_CUSTOMER_PORTAL_USER = "is_customer_portal_user";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOMER_PORTAL_USER)
  @javax.annotation.Nullable
  private Boolean isCustomerPortalUser;

  public DataExchangeAddOrUpdateCustomerContactDto() {
  }

  public DataExchangeAddOrUpdateCustomerContactDto customerNumber(@javax.annotation.Nonnull String customerNumber) {
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


  public DataExchangeAddOrUpdateCustomerContactDto contactName(@javax.annotation.Nonnull String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   * @return contactName
   */
  @javax.annotation.Nonnull
  public String getContactName() {
    return contactName;
  }

  public void setContactName(@javax.annotation.Nonnull String contactName) {
    this.contactName = contactName;
  }


  public DataExchangeAddOrUpdateCustomerContactDto contactSurname(@javax.annotation.Nonnull String contactSurname) {
    this.contactSurname = contactSurname;
    return this;
  }

  /**
   * Get contactSurname
   * @return contactSurname
   */
  @javax.annotation.Nonnull
  public String getContactSurname() {
    return contactSurname;
  }

  public void setContactSurname(@javax.annotation.Nonnull String contactSurname) {
    this.contactSurname = contactSurname;
  }


  public DataExchangeAddOrUpdateCustomerContactDto email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public DataExchangeAddOrUpdateCustomerContactDto phone(@javax.annotation.Nullable String phone) {
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


  public DataExchangeAddOrUpdateCustomerContactDto mobil(@javax.annotation.Nullable String mobil) {
    this.mobil = mobil;
    return this;
  }

  /**
   * Get mobil
   * @return mobil
   */
  @javax.annotation.Nullable
  public String getMobil() {
    return mobil;
  }

  public void setMobil(@javax.annotation.Nullable String mobil) {
    this.mobil = mobil;
  }


  public DataExchangeAddOrUpdateCustomerContactDto language(@javax.annotation.Nullable String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }


  public DataExchangeAddOrUpdateCustomerContactDto isCustomerPortalUser(@javax.annotation.Nullable Boolean isCustomerPortalUser) {
    this.isCustomerPortalUser = isCustomerPortalUser;
    return this;
  }

  /**
   * Get isCustomerPortalUser
   * @return isCustomerPortalUser
   */
  @javax.annotation.Nullable
  public Boolean getIsCustomerPortalUser() {
    return isCustomerPortalUser;
  }

  public void setIsCustomerPortalUser(@javax.annotation.Nullable Boolean isCustomerPortalUser) {
    this.isCustomerPortalUser = isCustomerPortalUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExchangeAddOrUpdateCustomerContactDto dataExchangeAddOrUpdateCustomerContactDto = (DataExchangeAddOrUpdateCustomerContactDto) o;
    return Objects.equals(this.customerNumber, dataExchangeAddOrUpdateCustomerContactDto.customerNumber) &&
        Objects.equals(this.contactName, dataExchangeAddOrUpdateCustomerContactDto.contactName) &&
        Objects.equals(this.contactSurname, dataExchangeAddOrUpdateCustomerContactDto.contactSurname) &&
        Objects.equals(this.email, dataExchangeAddOrUpdateCustomerContactDto.email) &&
        Objects.equals(this.phone, dataExchangeAddOrUpdateCustomerContactDto.phone) &&
        Objects.equals(this.mobil, dataExchangeAddOrUpdateCustomerContactDto.mobil) &&
        Objects.equals(this.language, dataExchangeAddOrUpdateCustomerContactDto.language) &&
        Objects.equals(this.isCustomerPortalUser, dataExchangeAddOrUpdateCustomerContactDto.isCustomerPortalUser);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, contactName, contactSurname, email, phone, mobil, language, isCustomerPortalUser);
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
    sb.append("class DataExchangeAddOrUpdateCustomerContactDto {\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactSurname: ").append(toIndentedString(contactSurname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobil: ").append(toIndentedString(mobil)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    isCustomerPortalUser: ").append(toIndentedString(isCustomerPortalUser)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("customer_number", "contact_name", "contact_surname", "email", "phone", "mobil", "language", "is_customer_portal_user"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("customer_number", "contact_name", "contact_surname", "email"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataExchangeAddOrUpdateCustomerContactDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataExchangeAddOrUpdateCustomerContactDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataExchangeAddOrUpdateCustomerContactDto is not found in the empty JSON string", DataExchangeAddOrUpdateCustomerContactDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataExchangeAddOrUpdateCustomerContactDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataExchangeAddOrUpdateCustomerContactDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataExchangeAddOrUpdateCustomerContactDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_number").toString()));
      }
      if (!jsonObj.get("contact_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_name").toString()));
      }
      if (!jsonObj.get("contact_surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_surname").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("mobil") != null && !jsonObj.get("mobil").isJsonNull()) && !jsonObj.get("mobil").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobil` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobil").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataExchangeAddOrUpdateCustomerContactDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataExchangeAddOrUpdateCustomerContactDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataExchangeAddOrUpdateCustomerContactDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataExchangeAddOrUpdateCustomerContactDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DataExchangeAddOrUpdateCustomerContactDto>() {
           @Override
           public void write(JsonWriter out, DataExchangeAddOrUpdateCustomerContactDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataExchangeAddOrUpdateCustomerContactDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DataExchangeAddOrUpdateCustomerContactDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataExchangeAddOrUpdateCustomerContactDto
   * @throws IOException if the JSON string is invalid with respect to DataExchangeAddOrUpdateCustomerContactDto
   */
  public static DataExchangeAddOrUpdateCustomerContactDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataExchangeAddOrUpdateCustomerContactDto.class);
  }

  /**
   * Convert an instance of DataExchangeAddOrUpdateCustomerContactDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

