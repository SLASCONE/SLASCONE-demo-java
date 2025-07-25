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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(LicenseFilterSortType.Adapter.class)
public enum LicenseFilterSortType {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_8(8);

  private Integer value;

  LicenseFilterSortType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LicenseFilterSortType fromValue(Integer value) {
    for (LicenseFilterSortType b : LicenseFilterSortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LicenseFilterSortType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LicenseFilterSortType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LicenseFilterSortType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return LicenseFilterSortType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    LicenseFilterSortType.fromValue(value);
  }
}

