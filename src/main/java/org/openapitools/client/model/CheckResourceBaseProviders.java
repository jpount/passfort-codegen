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
 * CheckResourceBaseProviders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class CheckResourceBaseProviders {
  @JsonProperty("provider_name")
  private String providerName;

  @JsonProperty("is_monitored")
  private Boolean isMonitored;

  public CheckResourceBaseProviders providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of a provider used to run this check
   * @return providerName
  **/
  @ApiModelProperty(value = "The name of a provider used to run this check")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public CheckResourceBaseProviders isMonitored(Boolean isMonitored) {
    this.isMonitored = isMonitored;
    return this;
  }

   /**
   * If present, this flag specifies if the result from this provider is monitored.
   * @return isMonitored
  **/
  @ApiModelProperty(value = "If present, this flag specifies if the result from this provider is monitored.")
  public Boolean getIsMonitored() {
    return isMonitored;
  }

  public void setIsMonitored(Boolean isMonitored) {
    this.isMonitored = isMonitored;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckResourceBaseProviders checkResourceBaseProviders = (CheckResourceBaseProviders) o;
    return Objects.equals(this.providerName, checkResourceBaseProviders.providerName) &&
        Objects.equals(this.isMonitored, checkResourceBaseProviders.isMonitored);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, isMonitored);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResourceBaseProviders {\n");
    
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    isMonitored: ").append(toIndentedString(isMonitored)).append("\n");
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

