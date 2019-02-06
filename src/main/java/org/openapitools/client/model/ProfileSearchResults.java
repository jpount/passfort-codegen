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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CapabilityType;
import org.openapitools.client.model.ProfileResource;

/**
 * Search results for a profile search
 */
@ApiModel(description = "Search results for a profile search")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class ProfileSearchResults {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("limit")
  private Integer limit;

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("hidden")
  private Integer hidden;

  @JsonProperty("capabilities")
  private Map<String, List<CapabilityType>> capabilities = null;

  @JsonProperty("results")
  private List<ProfileResource> results = new ArrayList<ProfileResource>();

  public ProfileSearchResults count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The total number of matching profiles
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The total number of matching profiles")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ProfileSearchResults limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of profiles returned in the response
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "The maximum number of profiles returned in the response")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ProfileSearchResults offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The number of profiles skipped in the response
   * @return offset
  **/
  @ApiModelProperty(required = true, value = "The number of profiles skipped in the response")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ProfileSearchResults hidden(Integer hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * The number of profiles hidden due to a lack of permissions.
   * @return hidden
  **/
  @ApiModelProperty(value = "The number of profiles hidden due to a lack of permissions.")
  public Integer getHidden() {
    return hidden;
  }

  public void setHidden(Integer hidden) {
    this.hidden = hidden;
  }

  public ProfileSearchResults capabilities(Map<String, List<CapabilityType>> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public ProfileSearchResults putCapabilitiesItem(String key, List<CapabilityType> capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<String, List<CapabilityType>>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * A mapping of profiles to the capabilties a user has over them
   * @return capabilities
  **/
  @ApiModelProperty(value = "A mapping of profiles to the capabilties a user has over them")
  public Map<String, List<CapabilityType>> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Map<String, List<CapabilityType>> capabilities) {
    this.capabilities = capabilities;
  }

  public ProfileSearchResults results(List<ProfileResource> results) {
    this.results = results;
    return this;
  }

  public ProfileSearchResults addResultsItem(ProfileResource resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The returned profiles
   * @return results
  **/
  @ApiModelProperty(required = true, value = "The returned profiles")
  public List<ProfileResource> getResults() {
    return results;
  }

  public void setResults(List<ProfileResource> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileSearchResults profileSearchResults = (ProfileSearchResults) o;
    return Objects.equals(this.count, profileSearchResults.count) &&
        Objects.equals(this.limit, profileSearchResults.limit) &&
        Objects.equals(this.offset, profileSearchResults.offset) &&
        Objects.equals(this.hidden, profileSearchResults.hidden) &&
        Objects.equals(this.capabilities, profileSearchResults.capabilities) &&
        Objects.equals(this.results, profileSearchResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, limit, offset, hidden, capabilities, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileSearchResults {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

