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
import java.math.BigDecimal;

/**
 * For shareholders, a detailed break-down of their ownership by share class
 */
@ApiModel(description = "For shareholders, a detailed break-down of their ownership by share class")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class Shareholding {
  @JsonProperty("provider_name")
  private String providerName;

  @JsonProperty("share_class")
  private String shareClass;

  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("percentage")
  private BigDecimal percentage;

  @JsonProperty("currency")
  private String currency;

  public Shareholding providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the provider of the shareholding information
   * @return providerName
  **/
  @ApiModelProperty(value = "The name of the provider of the shareholding information")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public Shareholding shareClass(String shareClass) {
    this.shareClass = shareClass;
    return this;
  }

   /**
   * Name of the share class. Should match one of the entries in the company&#39;s share class list
   * @return shareClass
  **/
  @ApiModelProperty(value = "Name of the share class. Should match one of the entries in the company's share class list")
  public String getShareClass() {
    return shareClass;
  }

  public void setShareClass(String shareClass) {
    this.shareClass = shareClass;
  }

  public Shareholding amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Number of shares owned by this entity
   * @return amount
  **/
  @ApiModelProperty(value = "Number of shares owned by this entity")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Shareholding percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage ownership of the company corresponding to this number of shares
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage ownership of the company corresponding to this number of shares")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public Shareholding currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency in which the shares are valued
   * @return currency
  **/
  @ApiModelProperty(value = "Currency in which the shares are valued")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shareholding shareholding = (Shareholding) o;
    return Objects.equals(this.providerName, shareholding.providerName) &&
        Objects.equals(this.shareClass, shareholding.shareClass) &&
        Objects.equals(this.amount, shareholding.amount) &&
        Objects.equals(this.percentage, shareholding.percentage) &&
        Objects.equals(this.currency, shareholding.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, shareClass, amount, percentage, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shareholding {\n");
    
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    shareClass: ").append(toIndentedString(shareClass)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

