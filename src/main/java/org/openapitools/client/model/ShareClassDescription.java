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
 * Details of the share classes that can be owned by company shareholders
 */
@ApiModel(description = "Details of the share classes that can be owned by company shareholders")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class ShareClassDescription {
  @JsonProperty("name")
  private String name;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("votes")
  private BigDecimal votes;

  public ShareClassDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Share class name, for example &#x60;Ordinary&#x60;
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Share class name, for example `Ordinary`")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShareClassDescription currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency for share value
   * @return currency
  **/
  @ApiModelProperty(value = "Currency for share value")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ShareClassDescription value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of a single share of this class in &#x60;currency&#x60;
   * @return value
  **/
  @ApiModelProperty(value = "Value of a single share of this class in `currency`")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public ShareClassDescription votes(BigDecimal votes) {
    this.votes = votes;
    return this;
  }

   /**
   * When the share class has a vote weighting a share may have more than one vote. A share class may also provide no vote
   * @return votes
  **/
  @ApiModelProperty(value = "When the share class has a vote weighting a share may have more than one vote. A share class may also provide no vote")
  public BigDecimal getVotes() {
    return votes;
  }

  public void setVotes(BigDecimal votes) {
    this.votes = votes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareClassDescription shareClassDescription = (ShareClassDescription) o;
    return Objects.equals(this.name, shareClassDescription.name) &&
        Objects.equals(this.currency, shareClassDescription.currency) &&
        Objects.equals(this.value, shareClassDescription.value) &&
        Objects.equals(this.votes, shareClassDescription.votes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currency, value, votes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareClassDescription {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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

