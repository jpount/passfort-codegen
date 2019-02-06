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
 * Your user details
 */
@ApiModel(description = "Your user details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class InlineResponse2003User {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  @JsonProperty("email")
  private String email;

  public InlineResponse2003User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User Name
   * @return name
  **/
  @ApiModelProperty(value = "User Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2003User id(String id) {
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

  public InlineResponse2003User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User Email
   * @return email
  **/
  @ApiModelProperty(value = "User Email")
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
    InlineResponse2003User inlineResponse2003User = (InlineResponse2003User) o;
    return Objects.equals(this.name, inlineResponse2003User.name) &&
        Objects.equals(this.id, inlineResponse2003User.id) &&
        Objects.equals(this.email, inlineResponse2003User.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003User {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
