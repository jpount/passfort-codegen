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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BankAccount;
import org.openapitools.client.model.BankAccountComment;

/**
 * Bank account verification
 */
@ApiModel(description = "Bank account verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class BankAccountVerification {
  @JsonProperty("performed_on")
  private String performedOn;

  @JsonProperty("match")
  private Boolean match;

  @JsonProperty("bank_account")
  private BankAccount bankAccount = null;

  @JsonProperty("comments")
  private List<BankAccountComment> comments = new ArrayList<BankAccountComment>();

  public BankAccountVerification performedOn(String performedOn) {
    this.performedOn = performedOn;
    return this;
  }

   /**
   * Exact date and time in &#x60;YYYY-MM-DD hh:mm:ss&#x60; format
   * @return performedOn
  **/
  @ApiModelProperty(example = "2017-02-08 15:16:01", required = true, value = "Exact date and time in `YYYY-MM-DD hh:mm:ss` format")
  public String getPerformedOn() {
    return performedOn;
  }

  public void setPerformedOn(String performedOn) {
    this.performedOn = performedOn;
  }

  public BankAccountVerification match(Boolean match) {
    this.match = match;
    return this;
  }

   /**
   * If the bank was verified and is a match
   * @return match
  **/
  @ApiModelProperty(required = true, value = "If the bank was verified and is a match")
  public Boolean getMatch() {
    return match;
  }

  public void setMatch(Boolean match) {
    this.match = match;
  }

  public BankAccountVerification bankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public BankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public BankAccountVerification comments(List<BankAccountComment> comments) {
    this.comments = comments;
    return this;
  }

  public BankAccountVerification addCommentsItem(BankAccountComment commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments
   * @return comments
  **/
  @ApiModelProperty(required = true, value = "Comments")
  public List<BankAccountComment> getComments() {
    return comments;
  }

  public void setComments(List<BankAccountComment> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountVerification bankAccountVerification = (BankAccountVerification) o;
    return Objects.equals(this.performedOn, bankAccountVerification.performedOn) &&
        Objects.equals(this.match, bankAccountVerification.match) &&
        Objects.equals(this.bankAccount, bankAccountVerification.bankAccount) &&
        Objects.equals(this.comments, bankAccountVerification.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performedOn, match, bankAccount, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountVerification {\n");
    
    sb.append("    performedOn: ").append(toIndentedString(performedOn)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

