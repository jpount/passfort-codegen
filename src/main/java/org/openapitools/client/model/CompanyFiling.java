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
import org.openapitools.client.model.CompanyDocument;
import org.openapitools.client.model.Error;

/**
 * Details of a company filing
 */
@ApiModel(description = "Details of a company filing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class CompanyFiling extends CompanyDocument {
  @JsonProperty("source_id")
  private String sourceId;

  @JsonProperty("date_of_filing")
  private String dateOfFiling;

  @JsonProperty("description")
  private String description;

  @JsonProperty("resolution_descriptions")
  private List<String> resolutionDescriptions = null;

  @JsonProperty("source")
  private String source;

  @JsonProperty("error")
  private Error error = null;

  @JsonProperty("price")
  private Integer price;

  public CompanyFiling sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Document identifier provided by &#x60;source&#x60;
   * @return sourceId
  **/
  @ApiModelProperty(required = true, value = "Document identifier provided by `source`")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public CompanyFiling dateOfFiling(String dateOfFiling) {
    this.dateOfFiling = dateOfFiling;
    return this;
  }

   /**
   * Exact date in &#x60;YYYY-MM-DD&#x60; format
   * @return dateOfFiling
  **/
  @ApiModelProperty(example = "1992-11-24", value = "Exact date in `YYYY-MM-DD` format")
  public String getDateOfFiling() {
    return dateOfFiling;
  }

  public void setDateOfFiling(String dateOfFiling) {
    this.dateOfFiling = dateOfFiling;
  }

  public CompanyFiling description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of company filing
   * @return description
  **/
  @ApiModelProperty(value = "Description of company filing")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CompanyFiling resolutionDescriptions(List<String> resolutionDescriptions) {
    this.resolutionDescriptions = resolutionDescriptions;
    return this;
  }

  public CompanyFiling addResolutionDescriptionsItem(String resolutionDescriptionsItem) {
    if (this.resolutionDescriptions == null) {
      this.resolutionDescriptions = new ArrayList<String>();
    }
    this.resolutionDescriptions.add(resolutionDescriptionsItem);
    return this;
  }

   /**
   * Descriptions for company resolutions, this will only be available if the document filing type is &#x60;RESOLUTION&#x60;
   * @return resolutionDescriptions
  **/
  @ApiModelProperty(value = "Descriptions for company resolutions, this will only be available if the document filing type is `RESOLUTION`")
  public List<String> getResolutionDescriptions() {
    return resolutionDescriptions;
  }

  public void setResolutionDescriptions(List<String> resolutionDescriptions) {
    this.resolutionDescriptions = resolutionDescriptions;
  }

  public CompanyFiling source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source of company filing, for example &#x60;Companies House (UK)&#x60;
   * @return source
  **/
  @ApiModelProperty(value = "Source of company filing, for example `Companies House (UK)`")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CompanyFiling error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public CompanyFiling price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * If the document is not free it can be purchased for this price using a &#x60;COMPANY_FILING_PURCHASE&#x60; check
   * @return price
  **/
  @ApiModelProperty(value = "If the document is not free it can be purchased for this price using a `COMPANY_FILING_PURCHASE` check")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyFiling companyFiling = (CompanyFiling) o;
    return Objects.equals(this.sourceId, companyFiling.sourceId) &&
        Objects.equals(this.dateOfFiling, companyFiling.dateOfFiling) &&
        Objects.equals(this.description, companyFiling.description) &&
        Objects.equals(this.resolutionDescriptions, companyFiling.resolutionDescriptions) &&
        Objects.equals(this.source, companyFiling.source) &&
        Objects.equals(this.error, companyFiling.error) &&
        Objects.equals(this.price, companyFiling.price) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, dateOfFiling, description, resolutionDescriptions, source, error, price, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFiling {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    dateOfFiling: ").append(toIndentedString(dateOfFiling)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resolutionDescriptions: ").append(toIndentedString(resolutionDescriptions)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

