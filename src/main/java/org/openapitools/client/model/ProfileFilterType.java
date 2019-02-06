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
 * Profile filter type
 */
public enum ProfileFilterType {
  
  ENTITY_TYPE("ENTITY_TYPE"),
  
  PROFILE_ROOT_ID("PROFILE_ROOT_ID"),
  
  ADDRESS("ADDRESS"),
  
  EVENTS("EVENTS"),
  
  RISK_LABELS("RISK_LABELS"),
  
  PROFILE_ORIGIN_ID("PROFILE_ORIGIN_ID"),
  
  TAGS("TAGS");

  private String value;

  ProfileFilterType(String value) {
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
  public static ProfileFilterType fromValue(String text) {
    for (ProfileFilterType b : ProfileFilterType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

