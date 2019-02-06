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
 * A product definition
 */
@ApiModel(description = "A product definition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class ProductResource {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("automatically_apply")
  private Boolean automaticallyApply;

  @JsonProperty("automatically_approve")
  private Boolean automaticallyApprove;

  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  public ProductResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * [Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * @return id
  **/
  @ApiModelProperty(value = "[Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product
   * @return name
  **/
  @ApiModelProperty(value = "The name of the product")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductResource automaticallyApply(Boolean automaticallyApply) {
    this.automaticallyApply = automaticallyApply;
    return this;
  }

   /**
   * Whether new profiles should automatically apply for this product
   * @return automaticallyApply
  **/
  @ApiModelProperty(value = "Whether new profiles should automatically apply for this product")
  public Boolean getAutomaticallyApply() {
    return automaticallyApply;
  }

  public void setAutomaticallyApply(Boolean automaticallyApply) {
    this.automaticallyApply = automaticallyApply;
  }

  public ProductResource automaticallyApprove(Boolean automaticallyApprove) {
    this.automaticallyApprove = automaticallyApprove;
    return this;
  }

   /**
   * Whether applications for this product are automatically approved when all tasks are completed
   * @return automaticallyApprove
  **/
  @ApiModelProperty(value = "Whether applications for this product are automatically approved when all tasks are completed")
  public Boolean getAutomaticallyApprove() {
    return automaticallyApprove;
  }

  public void setAutomaticallyApprove(Boolean automaticallyApprove) {
    this.automaticallyApprove = automaticallyApprove;
  }

  public ProductResource isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Whether this product application has been deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Whether this product application has been deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductResource productResource = (ProductResource) o;
    return Objects.equals(this.id, productResource.id) &&
        Objects.equals(this.name, productResource.name) &&
        Objects.equals(this.automaticallyApply, productResource.automaticallyApply) &&
        Objects.equals(this.automaticallyApprove, productResource.automaticallyApprove) &&
        Objects.equals(this.isDeleted, productResource.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, automaticallyApply, automaticallyApprove, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    automaticallyApply: ").append(toIndentedString(automaticallyApply)).append("\n");
    sb.append("    automaticallyApprove: ").append(toIndentedString(automaticallyApprove)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

