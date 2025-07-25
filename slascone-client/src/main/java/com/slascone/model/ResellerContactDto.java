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
 * ResellerContactDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class ResellerContactDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  @javax.annotation.Nullable
  private String surname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  @javax.annotation.Nullable
  private String mobile;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private UUID userId;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  @javax.annotation.Nullable
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_RESELLER_PORTAL_USER = "is_reseller_portal_user";
  @SerializedName(SERIALIZED_NAME_IS_RESELLER_PORTAL_USER)
  @javax.annotation.Nullable
  private Boolean isResellerPortalUser;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  @javax.annotation.Nullable
  private String language;

  public static final String SERIALIZED_NAME_RESELLER_ID = "reseller_id";
  @SerializedName(SERIALIZED_NAME_RESELLER_ID)
  @javax.annotation.Nullable
  private UUID resellerId;

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

  public ResellerContactDto() {
  }

  public ResellerContactDto id(@javax.annotation.Nullable UUID id) {
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


  public ResellerContactDto name(@javax.annotation.Nullable String name) {
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


  public ResellerContactDto surname(@javax.annotation.Nullable String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
   */
  @javax.annotation.Nullable
  public String getSurname() {
    return surname;
  }

  public void setSurname(@javax.annotation.Nullable String surname) {
    this.surname = surname;
  }


  public ResellerContactDto email(@javax.annotation.Nullable String email) {
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


  public ResellerContactDto phone(@javax.annotation.Nullable String phone) {
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


  public ResellerContactDto mobile(@javax.annotation.Nullable String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
   */
  @javax.annotation.Nullable
  public String getMobile() {
    return mobile;
  }

  public void setMobile(@javax.annotation.Nullable String mobile) {
    this.mobile = mobile;
  }


  public ResellerContactDto userId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
  }


  public ResellerContactDto isActive(@javax.annotation.Nullable Boolean isActive) {
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


  public ResellerContactDto isResellerPortalUser(@javax.annotation.Nullable Boolean isResellerPortalUser) {
    this.isResellerPortalUser = isResellerPortalUser;
    return this;
  }

  /**
   * Get isResellerPortalUser
   * @return isResellerPortalUser
   */
  @javax.annotation.Nullable
  public Boolean getIsResellerPortalUser() {
    return isResellerPortalUser;
  }

  public void setIsResellerPortalUser(@javax.annotation.Nullable Boolean isResellerPortalUser) {
    this.isResellerPortalUser = isResellerPortalUser;
  }


  public ResellerContactDto language(@javax.annotation.Nullable String language) {
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


  public ResellerContactDto resellerId(@javax.annotation.Nullable UUID resellerId) {
    this.resellerId = resellerId;
    return this;
  }

  /**
   * Get resellerId
   * @return resellerId
   */
  @javax.annotation.Nullable
  public UUID getResellerId() {
    return resellerId;
  }

  public void setResellerId(@javax.annotation.Nullable UUID resellerId) {
    this.resellerId = resellerId;
  }


  public ResellerContactDto createdDateUtc(@javax.annotation.Nullable OffsetDateTime createdDateUtc) {
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


  public ResellerContactDto modifiedDateUtc(@javax.annotation.Nullable OffsetDateTime modifiedDateUtc) {
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


  public ResellerContactDto lastModifiedBy(@javax.annotation.Nullable String lastModifiedBy) {
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
    ResellerContactDto resellerContactDto = (ResellerContactDto) o;
    return Objects.equals(this.id, resellerContactDto.id) &&
        Objects.equals(this.name, resellerContactDto.name) &&
        Objects.equals(this.surname, resellerContactDto.surname) &&
        Objects.equals(this.email, resellerContactDto.email) &&
        Objects.equals(this.phone, resellerContactDto.phone) &&
        Objects.equals(this.mobile, resellerContactDto.mobile) &&
        Objects.equals(this.userId, resellerContactDto.userId) &&
        Objects.equals(this.isActive, resellerContactDto.isActive) &&
        Objects.equals(this.isResellerPortalUser, resellerContactDto.isResellerPortalUser) &&
        Objects.equals(this.language, resellerContactDto.language) &&
        Objects.equals(this.resellerId, resellerContactDto.resellerId) &&
        Objects.equals(this.createdDateUtc, resellerContactDto.createdDateUtc) &&
        Objects.equals(this.modifiedDateUtc, resellerContactDto.modifiedDateUtc) &&
        Objects.equals(this.lastModifiedBy, resellerContactDto.lastModifiedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, email, phone, mobile, userId, isActive, isResellerPortalUser, language, resellerId, createdDateUtc, modifiedDateUtc, lastModifiedBy);
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
    sb.append("class ResellerContactDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isResellerPortalUser: ").append(toIndentedString(isResellerPortalUser)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    resellerId: ").append(toIndentedString(resellerId)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("id", "name", "surname", "email", "phone", "mobile", "user_id", "is_active", "is_reseller_portal_user", "language", "reseller_id", "created_date_utc", "modified_date_utc", "last_modified_by"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResellerContactDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResellerContactDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResellerContactDto is not found in the empty JSON string", ResellerContactDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResellerContactDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResellerContactDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("surname") != null && !jsonObj.get("surname").isJsonNull()) && !jsonObj.get("surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonNull()) && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("reseller_id") != null && !jsonObj.get("reseller_id").isJsonNull()) && !jsonObj.get("reseller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reseller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reseller_id").toString()));
      }
      if ((jsonObj.get("last_modified_by") != null && !jsonObj.get("last_modified_by").isJsonNull()) && !jsonObj.get("last_modified_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResellerContactDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResellerContactDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResellerContactDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResellerContactDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ResellerContactDto>() {
           @Override
           public void write(JsonWriter out, ResellerContactDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResellerContactDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResellerContactDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResellerContactDto
   * @throws IOException if the JSON string is invalid with respect to ResellerContactDto
   */
  public static ResellerContactDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResellerContactDto.class);
  }

  /**
   * Convert an instance of ResellerContactDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

