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
 * Phone number and email address
 */
@ApiModel(description = "Phone number and email address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class CompanyContactDetails {
  @JsonProperty("phone_number")
  private String phoneNumber;

  @JsonProperty("url")
  private String url;

  @JsonProperty("email")
  private String email;

  public CompanyContactDetails phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A contact phone number for the company
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "A contact phone number for the company")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CompanyContactDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The company&#39;s website
   * @return url
  **/
  @ApiModelProperty(value = "The company's website")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CompanyContactDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * A contact email address for the company
   * @return email
  **/
  @ApiModelProperty(value = "A contact email address for the company")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyContactDetails companyContactDetails = (CompanyContactDetails) o;
    return Objects.equals(this.phoneNumber, companyContactDetails.phoneNumber) &&
        Objects.equals(this.url, companyContactDetails.url) &&
        Objects.equals(this.email, companyContactDetails.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, url, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyContactDetails {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
