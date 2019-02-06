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
 * Structured fields indicating the kind of liability its members are exposed to, the ownership structure, and whether it is publically traded
 */
@ApiModel(description = "Structured fields indicating the kind of liability its members are exposed to, the ownership structure, and whether it is publically traded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class CompanyMetadataStructuredCompanyType {
  @JsonProperty("is_public")
  private Boolean isPublic;

  @JsonProperty("is_limited")
  private Boolean isLimited;

  /**
   * Which ownership structure is employed by the company
   */
  public enum OwnershipTypeEnum {
    PARTNERSHIP("PARTNERSHIP"),
    
    COMPANY("COMPANY"),
    
    SOLE_PROPRIETORSHIP("SOLE_PROPRIETORSHIP"),
    
    ASSOCIATION("ASSOCIATION"),
    
    TRUST("TRUST"),
    
    OTHER("OTHER");

    private String value;

    OwnershipTypeEnum(String value) {
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
    public static OwnershipTypeEnum fromValue(String text) {
      for (OwnershipTypeEnum b : OwnershipTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ownership_type")
  private OwnershipTypeEnum ownershipType;

  public CompanyMetadataStructuredCompanyType isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Whether the company is publically or privately traded
   * @return isPublic
  **/
  @ApiModelProperty(value = "Whether the company is publically or privately traded")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public CompanyMetadataStructuredCompanyType isLimited(Boolean isLimited) {
    this.isLimited = isLimited;
    return this;
  }

   /**
   * What kind of liability the company&#39;s members are exposed to
   * @return isLimited
  **/
  @ApiModelProperty(value = "What kind of liability the company's members are exposed to")
  public Boolean getIsLimited() {
    return isLimited;
  }

  public void setIsLimited(Boolean isLimited) {
    this.isLimited = isLimited;
  }

  public CompanyMetadataStructuredCompanyType ownershipType(OwnershipTypeEnum ownershipType) {
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Which ownership structure is employed by the company
   * @return ownershipType
  **/
  @ApiModelProperty(value = "Which ownership structure is employed by the company")
  public OwnershipTypeEnum getOwnershipType() {
    return ownershipType;
  }

  public void setOwnershipType(OwnershipTypeEnum ownershipType) {
    this.ownershipType = ownershipType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyMetadataStructuredCompanyType companyMetadataStructuredCompanyType = (CompanyMetadataStructuredCompanyType) o;
    return Objects.equals(this.isPublic, companyMetadataStructuredCompanyType.isPublic) &&
        Objects.equals(this.isLimited, companyMetadataStructuredCompanyType.isLimited) &&
        Objects.equals(this.ownershipType, companyMetadataStructuredCompanyType.ownershipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPublic, isLimited, ownershipType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyMetadataStructuredCompanyType {\n");
    
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isLimited: ").append(toIndentedString(isLimited)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
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

