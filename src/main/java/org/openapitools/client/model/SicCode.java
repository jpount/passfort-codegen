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

/**
 * Standard industrial classification of economic activities, [SIC](https://www.gov.uk/government/publications/standard-industrial-classification-of-economic-activities-sic)
 */
@ApiModel(description = "Standard industrial classification of economic activities, [SIC](https://www.gov.uk/government/publications/standard-industrial-classification-of-economic-activities-sic)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class SicCode {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SicCode code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The [SIC](https://www.gov.uk/government/publications/standard-industrial-classification-of-economic-activities-sic) code for example &#x60;62012&#x60;
   * @return code
  **/
  @ApiModelProperty(value = "The [SIC](https://www.gov.uk/government/publications/standard-industrial-classification-of-economic-activities-sic) code for example `62012`")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SicCode description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Detail of SIC code, for example &#x60;Business and domestic software development&#x60;
   * @return description
  **/
  @ApiModelProperty(value = "Detail of SIC code, for example `Business and domestic software development`")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SicCode sicCode = (SicCode) o;
    return Objects.equals(this.code, sicCode.code) &&
        Objects.equals(this.description, sicCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SicCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

