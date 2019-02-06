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
 * Details of a PEPRole
 */
@ApiModel(description = "Details of a PEPRole")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class PEPRole {
  @JsonProperty("name")
  private String name;

  @JsonProperty("tier")
  private Integer tier;

  @JsonProperty("from_date")
  private String fromDate;

  @JsonProperty("to_date")
  private String toDate;

  @JsonProperty("is_current")
  private Boolean isCurrent;

  public PEPRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the role e.g. Head of State
   * @return name
  **/
  @ApiModelProperty(value = "The name of the role e.g. Head of State")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PEPRole tier(Integer tier) {
    this.tier = tier;
    return this;
  }

   /**
   * The PEP Tier
   * @return tier
  **/
  @ApiModelProperty(value = "The PEP Tier")
  public Integer getTier() {
    return tier;
  }

  public void setTier(Integer tier) {
    this.tier = tier;
  }

  public PEPRole fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Partial date, recording a year and possibly month and day. The date will be in one of three formats &#x60;YYYY&#x60;, &#x60;YYYY-MM&#x60;, &#x60;YYYY-MM-DD&#x60;
   * @return fromDate
  **/
  @ApiModelProperty(example = "1992", value = "Partial date, recording a year and possibly month and day. The date will be in one of three formats `YYYY`, `YYYY-MM`, `YYYY-MM-DD`")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public PEPRole toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Partial date, recording a year and possibly month and day. The date will be in one of three formats &#x60;YYYY&#x60;, &#x60;YYYY-MM&#x60;, &#x60;YYYY-MM-DD&#x60;
   * @return toDate
  **/
  @ApiModelProperty(example = "1992", value = "Partial date, recording a year and possibly month and day. The date will be in one of three formats `YYYY`, `YYYY-MM`, `YYYY-MM-DD`")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public PEPRole isCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
    return this;
  }

   /**
   * If this is a currently held role
   * @return isCurrent
  **/
  @ApiModelProperty(value = "If this is a currently held role")
  public Boolean getIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PEPRole pePRole = (PEPRole) o;
    return Objects.equals(this.name, pePRole.name) &&
        Objects.equals(this.tier, pePRole.tier) &&
        Objects.equals(this.fromDate, pePRole.fromDate) &&
        Objects.equals(this.toDate, pePRole.toDate) &&
        Objects.equals(this.isCurrent, pePRole.isCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tier, fromDate, toDate, isCurrent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PEPRole {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
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

