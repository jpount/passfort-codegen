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
 * Provides root profile name and id
 */
@ApiModel(description = "Provides root profile name and id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class InheritedRisk {
  @JsonProperty("top_parent_name")
  private String topParentName;

  @JsonProperty("top_parent_id")
  private String topParentId;

  public InheritedRisk topParentName(String topParentName) {
    this.topParentName = topParentName;
    return this;
  }

   /**
   * Name of root parent providing the risk
   * @return topParentName
  **/
  @ApiModelProperty(value = "Name of root parent providing the risk")
  public String getTopParentName() {
    return topParentName;
  }

  public void setTopParentName(String topParentName) {
    this.topParentName = topParentName;
  }

  public InheritedRisk topParentId(String topParentId) {
    this.topParentId = topParentId;
    return this;
  }

   /**
   * [Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * @return topParentId
  **/
  @ApiModelProperty(required = true, value = "[Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)")
  public String getTopParentId() {
    return topParentId;
  }

  public void setTopParentId(String topParentId) {
    this.topParentId = topParentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritedRisk inheritedRisk = (InheritedRisk) o;
    return Objects.equals(this.topParentName, inheritedRisk.topParentName) &&
        Objects.equals(this.topParentId, inheritedRisk.topParentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topParentName, topParentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritedRisk {\n");
    
    sb.append("    topParentName: ").append(toIndentedString(topParentName)).append("\n");
    sb.append("    topParentId: ").append(toIndentedString(topParentId)).append("\n");
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

