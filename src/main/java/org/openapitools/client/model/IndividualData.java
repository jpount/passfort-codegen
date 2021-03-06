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
import org.openapitools.client.model.Document;
import org.openapitools.client.model.EntityDataBase;
import org.openapitools.client.model.IPLocation;
import org.openapitools.client.model.PersonalDetails;

/**
 * Top-level data field for individuals
 */
@ApiModel(description = "Top-level data field for individuals")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class IndividualData extends EntityDataBase {
  /**
   * You must include set the entity_type as &#x60;INDIVIDUAL&#x60; to distinguish IndividualData from other types of EntityData
   */
  public enum EntityTypeEnum {
    INDIVIDUAL("INDIVIDUAL");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("entity_type")
  private EntityTypeEnum entityType;

  @JsonProperty("personal_details")
  private PersonalDetails personalDetails = null;

  @JsonProperty("address_history")
  private List<Object> addressHistory = null;

  @JsonProperty("contact_details")
  private Object contactDetails = null;

  @JsonProperty("ip_location")
  private IPLocation ipLocation = null;

  public IndividualData entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * You must include set the entity_type as &#x60;INDIVIDUAL&#x60; to distinguish IndividualData from other types of EntityData
   * @return entityType
  **/
  @ApiModelProperty(value = "You must include set the entity_type as `INDIVIDUAL` to distinguish IndividualData from other types of EntityData")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public IndividualData personalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Get personalDetails
   * @return personalDetails
  **/
  @ApiModelProperty(value = "")
  public PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  public void setPersonalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
  }

  public IndividualData addressHistory(List<Object> addressHistory) {
    this.addressHistory = addressHistory;
    return this;
  }

  public IndividualData addAddressHistoryItem(Object addressHistoryItem) {
    if (this.addressHistory == null) {
      this.addressHistory = new ArrayList<Object>();
    }
    this.addressHistory.add(addressHistoryItem);
    return this;
  }

   /**
   * A list of addresses in which the individual has lived. Each of these can have an approximate start and end date.  Addresses are ordered by &#x60;start_date&#x60;. If two addresses have the same &#x60;start_date&#x60;, &#x60;end_date&#x60; will order them. An address with no &#x60;start_date&#x60; and &#x60;end_date&#x60; will be assumed to be current. If multiple addresses have no &#x60;start_date&#x60; and &#x60;end_date&#x60; then their order will be random.
   * @return addressHistory
  **/
  @ApiModelProperty(value = "A list of addresses in which the individual has lived. Each of these can have an approximate start and end date.  Addresses are ordered by `start_date`. If two addresses have the same `start_date`, `end_date` will order them. An address with no `start_date` and `end_date` will be assumed to be current. If multiple addresses have no `start_date` and `end_date` then their order will be random.")
  public List<Object> getAddressHistory() {
    return addressHistory;
  }

  public void setAddressHistory(List<Object> addressHistory) {
    this.addressHistory = addressHistory;
  }

  public IndividualData contactDetails(Object contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Phone number and email address
   * @return contactDetails
  **/
  @ApiModelProperty(value = "Phone number and email address")
  public Object getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(Object contactDetails) {
    this.contactDetails = contactDetails;
  }

  public IndividualData ipLocation(IPLocation ipLocation) {
    this.ipLocation = ipLocation;
    return this;
  }

   /**
   * Get ipLocation
   * @return ipLocation
  **/
  @ApiModelProperty(value = "")
  public IPLocation getIpLocation() {
    return ipLocation;
  }

  public void setIpLocation(IPLocation ipLocation) {
    this.ipLocation = ipLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualData individualData = (IndividualData) o;
    return Objects.equals(this.entityType, individualData.entityType) &&
        Objects.equals(this.personalDetails, individualData.personalDetails) &&
        Objects.equals(this.addressHistory, individualData.addressHistory) &&
        Objects.equals(this.contactDetails, individualData.contactDetails) &&
        Objects.equals(this.ipLocation, individualData.ipLocation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, personalDetails, addressHistory, contactDetails, ipLocation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
    sb.append("    addressHistory: ").append(toIndentedString(addressHistory)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    ipLocation: ").append(toIndentedString(ipLocation)).append("\n");
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

