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
 * A tag attached to a customer&#39;s profile
 */
@ApiModel(description = "A tag attached to a customer's profile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class TagResource {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("is_automatic")
  private Boolean isAutomatic;

  public TagResource id(String id) {
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

  public TagResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tag name
   * @return name
  **/
  @ApiModelProperty(value = "Tag name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagResource isAutomatic(Boolean isAutomatic) {
    this.isAutomatic = isAutomatic;
    return this;
  }

   /**
   * If the tag was automatically applied
   * @return isAutomatic
  **/
  @ApiModelProperty(value = "If the tag was automatically applied")
  public Boolean getIsAutomatic() {
    return isAutomatic;
  }

  public void setIsAutomatic(Boolean isAutomatic) {
    this.isAutomatic = isAutomatic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResource tagResource = (TagResource) o;
    return Objects.equals(this.id, tagResource.id) &&
        Objects.equals(this.name, tagResource.name) &&
        Objects.equals(this.isAutomatic, tagResource.isAutomatic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isAutomatic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isAutomatic: ").append(toIndentedString(isAutomatic)).append("\n");
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

