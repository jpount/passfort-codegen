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
import org.openapitools.client.model.ProductApplicationStatus;
import org.openapitools.client.model.User;

/**
 * Represent a change in a product application status
 */
@ApiModel(description = "Represent a change in a product application status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class ProductApplicationStatusChange {
  @JsonProperty("status")
  private ProductApplicationStatus status = null;

  @JsonProperty("date")
  private String date;

  @JsonProperty("decisioner")
  private User decisioner = null;

  @JsonProperty("comment")
  private String comment;

  public ProductApplicationStatusChange status(ProductApplicationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ProductApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(ProductApplicationStatus status) {
    this.status = status;
  }

  public ProductApplicationStatusChange date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Exact date and time in &#x60;YYYY-MM-DD hh:mm:ss&#x60; format
   * @return date
  **/
  @ApiModelProperty(example = "2017-02-08 15:16:01", value = "Exact date and time in `YYYY-MM-DD hh:mm:ss` format")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ProductApplicationStatusChange decisioner(User decisioner) {
    this.decisioner = decisioner;
    return this;
  }

   /**
   * Get decisioner
   * @return decisioner
  **/
  @ApiModelProperty(value = "")
  public User getDecisioner() {
    return decisioner;
  }

  public void setDecisioner(User decisioner) {
    this.decisioner = decisioner;
  }

  public ProductApplicationStatusChange comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * A comment about the change
   * @return comment
  **/
  @ApiModelProperty(value = "A comment about the change")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductApplicationStatusChange productApplicationStatusChange = (ProductApplicationStatusChange) o;
    return Objects.equals(this.status, productApplicationStatusChange.status) &&
        Objects.equals(this.date, productApplicationStatusChange.date) &&
        Objects.equals(this.decisioner, productApplicationStatusChange.decisioner) &&
        Objects.equals(this.comment, productApplicationStatusChange.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, date, decisioner, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductApplicationStatusChange {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    decisioner: ").append(toIndentedString(decisioner)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

