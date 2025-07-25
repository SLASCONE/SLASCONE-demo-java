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
import com.slascone.model.ResellerContactDto;
import com.slascone.model.ResellerTypeDto;
import com.slascone.model.ResourceDto;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ResellerDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class ResellerDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  @javax.annotation.Nullable
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_POSTALCODE = "postalcode";
  @SerializedName(SERIALIZED_NAME_POSTALCODE)
  @javax.annotation.Nullable
  private String postalcode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  @javax.annotation.Nullable
  private ResourceDto logo;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  @javax.annotation.Nullable
  private String number;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  @javax.annotation.Nullable
  private Double longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  @javax.annotation.Nullable
  private Double latitude;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_RESELLER_TYPE_ID = "reseller_type_id";
  @SerializedName(SERIALIZED_NAME_RESELLER_TYPE_ID)
  @javax.annotation.Nullable
  private UUID resellerTypeId;

  public static final String SERIALIZED_NAME_RESELLER_TYPE = "reseller_type";
  @SerializedName(SERIALIZED_NAME_RESELLER_TYPE)
  @javax.annotation.Nullable
  private ResellerTypeDto resellerType;

  public static final String SERIALIZED_NAME_RESELLER_CONTACTS = "reseller_contacts";
  @SerializedName(SERIALIZED_NAME_RESELLER_CONTACTS)
  @javax.annotation.Nullable
  private List<ResellerContactDto> resellerContacts;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "last_modified_by";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  @javax.annotation.Nullable
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE_UTC = "modified_date_utc";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE_UTC)
  @javax.annotation.Nullable
  private OffsetDateTime modifiedDateUtc;

  public static final String SERIALIZED_NAME_CREATED_DATE_UTC = "created_date_utc";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE_UTC)
  @javax.annotation.Nullable
  private OffsetDateTime createdDateUtc;

  public ResellerDto() {
  }

  public ResellerDto id(@javax.annotation.Nullable UUID id) {
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


  public ResellerDto name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ResellerDto street(@javax.annotation.Nullable String street) {
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


  public ResellerDto city(@javax.annotation.Nullable String city) {
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


  public ResellerDto postalcode(@javax.annotation.Nullable String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

  /**
   * Get postalcode
   * @return postalcode
   */
  @javax.annotation.Nullable
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(@javax.annotation.Nullable String postalcode) {
    this.postalcode = postalcode;
  }


  public ResellerDto country(@javax.annotation.Nullable String country) {
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


  public ResellerDto phone(@javax.annotation.Nullable String phone) {
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


  public ResellerDto logo(@javax.annotation.Nullable ResourceDto logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  public ResourceDto getLogo() {
    return logo;
  }

  public void setLogo(@javax.annotation.Nullable ResourceDto logo) {
    this.logo = logo;
  }


  public ResellerDto number(@javax.annotation.Nullable String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }

  public void setNumber(@javax.annotation.Nullable String number) {
    this.number = number;
  }


  public ResellerDto longitude(@javax.annotation.Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@javax.annotation.Nullable Double longitude) {
    this.longitude = longitude;
  }


  public ResellerDto latitude(@javax.annotation.Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@javax.annotation.Nullable Double latitude) {
    this.latitude = latitude;
  }


  public ResellerDto email(@javax.annotation.Nullable String email) {
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


  public ResellerDto resellerTypeId(@javax.annotation.Nullable UUID resellerTypeId) {
    this.resellerTypeId = resellerTypeId;
    return this;
  }

  /**
   * Get resellerTypeId
   * @return resellerTypeId
   */
  @javax.annotation.Nullable
  public UUID getResellerTypeId() {
    return resellerTypeId;
  }

  public void setResellerTypeId(@javax.annotation.Nullable UUID resellerTypeId) {
    this.resellerTypeId = resellerTypeId;
  }


  public ResellerDto resellerType(@javax.annotation.Nullable ResellerTypeDto resellerType) {
    this.resellerType = resellerType;
    return this;
  }

  /**
   * Get resellerType
   * @return resellerType
   */
  @javax.annotation.Nullable
  public ResellerTypeDto getResellerType() {
    return resellerType;
  }

  public void setResellerType(@javax.annotation.Nullable ResellerTypeDto resellerType) {
    this.resellerType = resellerType;
  }


  public ResellerDto resellerContacts(@javax.annotation.Nullable List<ResellerContactDto> resellerContacts) {
    this.resellerContacts = resellerContacts;
    return this;
  }

  public ResellerDto addResellerContactsItem(ResellerContactDto resellerContactsItem) {
    if (this.resellerContacts == null) {
      this.resellerContacts = new ArrayList<>();
    }
    this.resellerContacts.add(resellerContactsItem);
    return this;
  }

  /**
   * Get resellerContacts
   * @return resellerContacts
   */
  @javax.annotation.Nullable
  public List<ResellerContactDto> getResellerContacts() {
    return resellerContacts;
  }

  public void setResellerContacts(@javax.annotation.Nullable List<ResellerContactDto> resellerContacts) {
    this.resellerContacts = resellerContacts;
  }


  public ResellerDto lastModifiedBy(@javax.annotation.Nullable String lastModifiedBy) {
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


  public ResellerDto modifiedDateUtc(@javax.annotation.Nullable OffsetDateTime modifiedDateUtc) {
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


  public ResellerDto createdDateUtc(@javax.annotation.Nullable OffsetDateTime createdDateUtc) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResellerDto resellerDto = (ResellerDto) o;
    return Objects.equals(this.id, resellerDto.id) &&
        Objects.equals(this.name, resellerDto.name) &&
        Objects.equals(this.street, resellerDto.street) &&
        Objects.equals(this.city, resellerDto.city) &&
        Objects.equals(this.postalcode, resellerDto.postalcode) &&
        Objects.equals(this.country, resellerDto.country) &&
        Objects.equals(this.phone, resellerDto.phone) &&
        Objects.equals(this.logo, resellerDto.logo) &&
        Objects.equals(this.number, resellerDto.number) &&
        Objects.equals(this.longitude, resellerDto.longitude) &&
        Objects.equals(this.latitude, resellerDto.latitude) &&
        Objects.equals(this.email, resellerDto.email) &&
        Objects.equals(this.resellerTypeId, resellerDto.resellerTypeId) &&
        Objects.equals(this.resellerType, resellerDto.resellerType) &&
        Objects.equals(this.resellerContacts, resellerDto.resellerContacts) &&
        Objects.equals(this.lastModifiedBy, resellerDto.lastModifiedBy) &&
        Objects.equals(this.modifiedDateUtc, resellerDto.modifiedDateUtc) &&
        Objects.equals(this.createdDateUtc, resellerDto.createdDateUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, street, city, postalcode, country, phone, logo, number, longitude, latitude, email, resellerTypeId, resellerType, resellerContacts, lastModifiedBy, modifiedDateUtc, createdDateUtc);
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
    sb.append("class ResellerDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    resellerTypeId: ").append(toIndentedString(resellerTypeId)).append("\n");
    sb.append("    resellerType: ").append(toIndentedString(resellerType)).append("\n");
    sb.append("    resellerContacts: ").append(toIndentedString(resellerContacts)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    modifiedDateUtc: ").append(toIndentedString(modifiedDateUtc)).append("\n");
    sb.append("    createdDateUtc: ").append(toIndentedString(createdDateUtc)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id", "name", "street", "city", "postalcode", "country", "phone", "logo", "number", "longitude", "latitude", "email", "reseller_type_id", "reseller_type", "reseller_contacts", "last_modified_by", "modified_date_utc", "created_date_utc"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResellerDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResellerDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResellerDto is not found in the empty JSON string", ResellerDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResellerDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResellerDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("postalcode") != null && !jsonObj.get("postalcode").isJsonNull()) && !jsonObj.get("postalcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalcode").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `logo`
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) {
        ResourceDto.validateJsonElement(jsonObj.get("logo"));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("reseller_type_id") != null && !jsonObj.get("reseller_type_id").isJsonNull()) && !jsonObj.get("reseller_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reseller_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reseller_type_id").toString()));
      }
      // validate the optional field `reseller_type`
      if (jsonObj.get("reseller_type") != null && !jsonObj.get("reseller_type").isJsonNull()) {
        ResellerTypeDto.validateJsonElement(jsonObj.get("reseller_type"));
      }
      if (jsonObj.get("reseller_contacts") != null && !jsonObj.get("reseller_contacts").isJsonNull()) {
        JsonArray jsonArrayresellerContacts = jsonObj.getAsJsonArray("reseller_contacts");
        if (jsonArrayresellerContacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reseller_contacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reseller_contacts` to be an array in the JSON string but got `%s`", jsonObj.get("reseller_contacts").toString()));
          }

          // validate the optional field `reseller_contacts` (array)
          for (int i = 0; i < jsonArrayresellerContacts.size(); i++) {
            ResellerContactDto.validateJsonElement(jsonArrayresellerContacts.get(i));
          };
        }
      }
      if ((jsonObj.get("last_modified_by") != null && !jsonObj.get("last_modified_by").isJsonNull()) && !jsonObj.get("last_modified_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResellerDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResellerDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResellerDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResellerDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ResellerDto>() {
           @Override
           public void write(JsonWriter out, ResellerDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResellerDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResellerDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResellerDto
   * @throws IOException if the JSON string is invalid with respect to ResellerDto
   */
  public static ResellerDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResellerDto.class);
  }

  /**
   * Convert an instance of ResellerDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

