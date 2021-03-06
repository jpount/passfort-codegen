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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.ErrorSource;

/**
 * Details of an error
 */
@ApiModel(description = "Details of an error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class Error {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("source")
  private ErrorSource source = null;

  @JsonProperty("info")
  private Object info = null;

  public Error code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 1xx: Normal errors | Code | Meaning | |---|---| | 101 | MISSING_REQUIRED_FIELDS | | 102 | ENTITY_ALREADY_APPROVED | | 103 | ENTITY_ALREADY_REJECTED | | 104 | CHARGEABLE_LIMIT_REACHED | | 105 | CONSTRAINTS_NOT_SATISFIED | | 106 | COUNTRY_NOT_SUPPORTED | | 107 | CHECK_LIMIT_REACHED |  2xx: Caller errors, caused by incorrect use of the system | Code | Meaning | |---|---| | 201 | INVALID_INPUT_DATA | | 202 | DATA_PRESENT | | 203 | MISSING_API_KEY | | 204 | INVALID_API_KEY |  3xx: Transient errors, caused by temporary problems with the system | Code | Meaning | |---|---| | 301 | USER_MIGRATION_ERROR | | 302 | PROVIDER_CONNECTION_ERROR | | 303 | PROVIDER_UNKNOWN_ERROR |  4xx: Internal errors | Code | Meaning | |---|---| | 401 | UNKNOWN_INTERNAL_ERROR | | 402 | TRANSITION_ERROR |  5xx: Miscellaneous errors | Code | Meaning | |---|---| | 501 | LEGACY_ERROR | | 502 | PROCESS_NOT_SETUP |
   * @return code
  **/
  @ApiModelProperty(value = "1xx: Normal errors | Code | Meaning | |---|---| | 101 | MISSING_REQUIRED_FIELDS | | 102 | ENTITY_ALREADY_APPROVED | | 103 | ENTITY_ALREADY_REJECTED | | 104 | CHARGEABLE_LIMIT_REACHED | | 105 | CONSTRAINTS_NOT_SATISFIED | | 106 | COUNTRY_NOT_SUPPORTED | | 107 | CHECK_LIMIT_REACHED |  2xx: Caller errors, caused by incorrect use of the system | Code | Meaning | |---|---| | 201 | INVALID_INPUT_DATA | | 202 | DATA_PRESENT | | 203 | MISSING_API_KEY | | 204 | INVALID_API_KEY |  3xx: Transient errors, caused by temporary problems with the system | Code | Meaning | |---|---| | 301 | USER_MIGRATION_ERROR | | 302 | PROVIDER_CONNECTION_ERROR | | 303 | PROVIDER_UNKNOWN_ERROR |  4xx: Internal errors | Code | Meaning | |---|---| | 401 | UNKNOWN_INTERNAL_ERROR | | 402 | TRANSITION_ERROR |  5xx: Miscellaneous errors | Code | Meaning | |---|---| | 501 | LEGACY_ERROR | | 502 | PROCESS_NOT_SETUP |")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable description of the error message
   * @return message
  **/
  @ApiModelProperty(value = "A human readable description of the error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error source(ErrorSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public ErrorSource getSource() {
    return source;
  }

  public void setSource(ErrorSource source) {
    this.source = source;
  }

  public Error info(Object info) {
    this.info = info;
    return this;
  }

   /**
   * Additional metadata about the error
   * @return info
  **/
  @ApiModelProperty(value = "Additional metadata about the error")
  public Object getInfo() {
    return info;
  }

  public void setInfo(Object info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.source, error.source) &&
        Objects.equals(this.info, error.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, source, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

