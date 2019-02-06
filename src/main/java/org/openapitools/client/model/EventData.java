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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.List;
import org.openapitools.client.model.Associate;
import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.DefaultSanctionsResultDetails;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.EventDataAdverseMediaFlag;
import org.openapitools.client.model.EventDataPepFlag;
import org.openapitools.client.model.EventDataReferFlag;
import org.openapitools.client.model.EventDataSanctionFlag;
import org.openapitools.client.model.Identification;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.MediaArticle;
import org.openapitools.client.model.PEP;
import org.openapitools.client.model.Sanction;
import org.openapitools.client.model.Source;

/**
 * Additional information specific to the event type
 */
@ApiModel(description = "Additional information specific to the event type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "event_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = EventDataPepFlag.class, name = "PEP_FLAG"),
  @JsonSubTypes.Type(value = EventDataSanctionFlag.class, name = "SANCTION_FLAG"),
  @JsonSubTypes.Type(value = EventDataAdverseMediaFlag.class, name = "ADVERSE_MEDIA_FLAG"),
  @JsonSubTypes.Type(value = EventDataReferFlag.class, name = "REFER_FLAG"),
})

public class EventData {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventData {\n");
    
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

