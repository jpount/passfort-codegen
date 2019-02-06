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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Information on the company as a charitable entity
 */
@ApiModel(description = "Information on the company as a charitable entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class CompanyCharityData {
  @JsonProperty("activities")
  private List<String> activities = null;

  @JsonProperty("beneficiaries")
  private List<String> beneficiaries = null;

  @JsonProperty("purposes")
  private List<String> purposes = null;

  @JsonProperty("number_of_volunteers")
  private BigDecimal numberOfVolunteers;

  @JsonProperty("registration_date")
  private String registrationDate;

  public CompanyCharityData activities(List<String> activities) {
    this.activities = activities;
    return this;
  }

  public CompanyCharityData addActivitiesItem(String activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<String>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * How the charity works
   * @return activities
  **/
  @ApiModelProperty(value = "How the charity works")
  public List<String> getActivities() {
    return activities;
  }

  public void setActivities(List<String> activities) {
    this.activities = activities;
  }

  public CompanyCharityData beneficiaries(List<String> beneficiaries) {
    this.beneficiaries = beneficiaries;
    return this;
  }

  public CompanyCharityData addBeneficiariesItem(String beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<String>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

   /**
   * Who the charity helps
   * @return beneficiaries
  **/
  @ApiModelProperty(value = "Who the charity helps")
  public List<String> getBeneficiaries() {
    return beneficiaries;
  }

  public void setBeneficiaries(List<String> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }

  public CompanyCharityData purposes(List<String> purposes) {
    this.purposes = purposes;
    return this;
  }

  public CompanyCharityData addPurposesItem(String purposesItem) {
    if (this.purposes == null) {
      this.purposes = new ArrayList<String>();
    }
    this.purposes.add(purposesItem);
    return this;
  }

   /**
   * What the charity does
   * @return purposes
  **/
  @ApiModelProperty(value = "What the charity does")
  public List<String> getPurposes() {
    return purposes;
  }

  public void setPurposes(List<String> purposes) {
    this.purposes = purposes;
  }

  public CompanyCharityData numberOfVolunteers(BigDecimal numberOfVolunteers) {
    this.numberOfVolunteers = numberOfVolunteers;
    return this;
  }

   /**
   * The number of volunteers at the charity
   * @return numberOfVolunteers
  **/
  @ApiModelProperty(value = "The number of volunteers at the charity")
  public BigDecimal getNumberOfVolunteers() {
    return numberOfVolunteers;
  }

  public void setNumberOfVolunteers(BigDecimal numberOfVolunteers) {
    this.numberOfVolunteers = numberOfVolunteers;
  }

  public CompanyCharityData registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * Exact date in &#x60;YYYY-MM-DD&#x60; format
   * @return registrationDate
  **/
  @ApiModelProperty(example = "1992-11-24", value = "Exact date in `YYYY-MM-DD` format")
  public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyCharityData companyCharityData = (CompanyCharityData) o;
    return Objects.equals(this.activities, companyCharityData.activities) &&
        Objects.equals(this.beneficiaries, companyCharityData.beneficiaries) &&
        Objects.equals(this.purposes, companyCharityData.purposes) &&
        Objects.equals(this.numberOfVolunteers, companyCharityData.numberOfVolunteers) &&
        Objects.equals(this.registrationDate, companyCharityData.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, beneficiaries, purposes, numberOfVolunteers, registrationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyCharityData {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
    sb.append("    purposes: ").append(toIndentedString(purposes)).append("\n");
    sb.append("    numberOfVolunteers: ").append(toIndentedString(numberOfVolunteers)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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
