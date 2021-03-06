/*
 * PassFort API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 4.0.0
 * Contact: support@passfort.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Which field(s) were being checked
 */
public enum CheckedDocumentField {
  
  GIVEN_NAMES("FIELD_GIVEN_NAMES"),
  
  FAMILY_NAME("FIELD_FAMILY_NAME"),
  
  DOB("FIELD_DOB"),
  
  NATIONALITY("FIELD_NATIONALITY"),
  
  EXPIRY("FIELD_EXPIRY"),
  
  NUMBER("FIELD_NUMBER"),
  
  GENDER("FIELD_GENDER"),
  
  ISSUED("FIELD_ISSUED"),
  
  ADDRESS("FIELD_ADDRESS"),
  
  ISSUING_COUNTRY("FIELD_ISSUING_COUNTRY"),
  
  MRZ("FIELD_MRZ");

  private String value;

  CheckedDocumentField(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CheckedDocumentField fromValue(String text) {
    for (CheckedDocumentField b : CheckedDocumentField.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

