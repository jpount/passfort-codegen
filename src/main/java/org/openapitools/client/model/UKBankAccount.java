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
 * UK bank account with sort code and account number
 */
@ApiModel(description = "UK bank account with sort code and account number")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class UKBankAccount {
  @JsonProperty("country")
  private CountryCode country = null;

  /**
   * Bank account type
   */
  public enum TypeEnum {
    UK_ACCOUNT("UK_ACCOUNT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("sort_code")
  private String sortCode;

  @JsonProperty("account_number")
  private String accountNumber;

  public UKBankAccount country(CountryCode country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  public UKBankAccount type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Bank account type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Bank account type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UKBankAccount sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

   /**
   * UK bank account sort code
   * @return sortCode
  **/
  @ApiModelProperty(required = true, value = "UK bank account sort code")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public UKBankAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * UK bank account number
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "UK bank account number")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UKBankAccount ukBankAccount = (UKBankAccount) o;
    return Objects.equals(this.country, ukBankAccount.country) &&
        Objects.equals(this.type, ukBankAccount.type) &&
        Objects.equals(this.sortCode, ukBankAccount.sortCode) &&
        Objects.equals(this.accountNumber, ukBankAccount.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, type, sortCode, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UKBankAccount {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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
