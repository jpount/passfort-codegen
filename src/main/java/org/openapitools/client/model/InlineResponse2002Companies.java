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
import org.openapitools.client.model.CountryCode;

/**
 * Detail of each company found
 */
@ApiModel(description = "Detail of each company found")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class InlineResponse2002Companies {
  @JsonProperty("name")
  private String name;

  @JsonProperty("number")
  private String number;

  @JsonProperty("country")
  private CountryCode country = null;

  @JsonProperty("state")
  private String state;

  public InlineResponse2002Companies name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the candidate company
   * @return name
  **/
  @ApiModelProperty(value = "The name of the candidate company")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2002Companies number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The company number of the candidate company
   * @return number
  **/
  @ApiModelProperty(value = "The company number of the candidate company")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public InlineResponse2002Companies country(CountryCode country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  public InlineResponse2002Companies state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the candidate company (returned for US companies)
   * @return state
  **/
  @ApiModelProperty(value = "The state of the candidate company (returned for US companies)")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Companies inlineResponse2002Companies = (InlineResponse2002Companies) o;
    return Objects.equals(this.name, inlineResponse2002Companies.name) &&
        Objects.equals(this.number, inlineResponse2002Companies.number) &&
        Objects.equals(this.country, inlineResponse2002Companies.country) &&
        Objects.equals(this.state, inlineResponse2002Companies.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number, country, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Companies {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

