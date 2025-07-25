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
@JsonAdapter(HeartBeatMode.Adapter.class)
public enum HeartBeatMode {
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  HeartBeatMode(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HeartBeatMode fromValue(Integer value) {
    for (HeartBeatMode b : HeartBeatMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<HeartBeatMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final HeartBeatMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HeartBeatMode read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return HeartBeatMode.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    HeartBeatMode.fromValue(value);
  }
}

