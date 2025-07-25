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
 * CustomerAccountDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class CustomerAccountDto {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  @javax.annotation.Nullable
  private UUID customerId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  @javax.annotation.Nullable
  private String companyName;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customer_number";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  @javax.annotation.Nullable
  private String customerNumber;

  public CustomerAccountDto() {
  }

  public CustomerAccountDto customerId(@javax.annotation.Nullable UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(@javax.annotation.Nullable UUID customerId) {
    this.customerId = customerId;
  }


  public CustomerAccountDto companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }


  public CustomerAccountDto customerNumber(@javax.annotation.Nullable String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Get customerNumber
   * @return customerNumber
   */
  @javax.annotation.Nullable
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(@javax.annotation.Nullable String customerNumber) {
    this.customerNumber = customerNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccountDto customerAccountDto = (CustomerAccountDto) o;
    return Objects.equals(this.customerId, customerAccountDto.customerId) &&
        Objects.equals(this.companyName, customerAccountDto.companyName) &&
        Objects.equals(this.customerNumber, customerAccountDto.customerNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, companyName, customerNumber);
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
    sb.append("class CustomerAccountDto {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("customer_id", "company_name", "customer_number"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomerAccountDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerAccountDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerAccountDto is not found in the empty JSON string", CustomerAccountDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerAccountDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerAccountDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if ((jsonObj.get("customer_number") != null && !jsonObj.get("customer_number").isJsonNull()) && !jsonObj.get("customer_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerAccountDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerAccountDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerAccountDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerAccountDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerAccountDto>() {
           @Override
           public void write(JsonWriter out, CustomerAccountDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerAccountDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomerAccountDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomerAccountDto
   * @throws IOException if the JSON string is invalid with respect to CustomerAccountDto
   */
  public static CustomerAccountDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerAccountDto.class);
  }

  /**
   * Convert an instance of CustomerAccountDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

