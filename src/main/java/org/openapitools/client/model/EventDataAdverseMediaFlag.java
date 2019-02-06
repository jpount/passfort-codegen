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
import org.openapitools.client.model.Associate;
import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.DefaultSanctionsResultDetails;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.Identification;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.MediaArticle;
import org.openapitools.client.model.Source;

/**
 * Information related to an adverse media flag event
 */
@ApiModel(description = "Information related to an adverse media flag event")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class EventDataAdverseMediaFlag {
  /**
   * Profile event type
   */
  public enum EventTypeEnum {
    ADVERSE_MEDIA_FLAG("ADVERSE_MEDIA_FLAG");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("event_type")
  private EventTypeEnum eventType;

  @JsonProperty("match_id")
  private String matchId;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("deceased_dates")
  private List<String> deceasedDates = null;

  @JsonProperty("modified_date")
  private String modifiedDate;

  @JsonProperty("provider_name")
  private String providerName;

  @JsonProperty("match_name")
  private String matchName;

  @JsonProperty("match_dates")
  private List<String> matchDates = null;

  @JsonProperty("match_countries")
  private List<CountryCode> matchCountries = null;

  @JsonProperty("score")
  private BigDecimal score;

  @JsonProperty("aliases")
  private List<String> aliases = null;

  @JsonProperty("previous_names")
  private List<String> previousNames = null;

  @JsonProperty("associates")
  private List<Associate> associates = null;

  @JsonProperty("profile_notes")
  private String profileNotes;

  @JsonProperty("details")
  private List<DefaultSanctionsResultDetails> details = null;

  @JsonProperty("media")
  private List<MediaArticle> media = null;

  @JsonProperty("documents")
  private List<Document> documents = null;

  @JsonProperty("riskography")
  private String riskography;

  @JsonProperty("sources")
  private List<Source> sources = null;

  @JsonProperty("remarks")
  private List<String> remarks = null;

  @JsonProperty("identifications")
  private List<Identification> identifications = null;

  @JsonProperty("locations")
  private List<Location> locations = null;

  public EventDataAdverseMediaFlag eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Profile event type
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Profile event type")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public EventDataAdverseMediaFlag matchId(String matchId) {
    this.matchId = matchId;
    return this;
  }

   /**
   * The related match identifier
   * @return matchId
  **/
  @ApiModelProperty(value = "The related match identifier")
  public String getMatchId() {
    return matchId;
  }

  public void setMatchId(String matchId) {
    this.matchId = matchId;
  }

  public EventDataAdverseMediaFlag gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * gender of match
   * @return gender
  **/
  @ApiModelProperty(value = "gender of match")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public EventDataAdverseMediaFlag deceasedDates(List<String> deceasedDates) {
    this.deceasedDates = deceasedDates;
    return this;
  }

  public EventDataAdverseMediaFlag addDeceasedDatesItem(String deceasedDatesItem) {
    if (this.deceasedDates == null) {
      this.deceasedDates = new ArrayList<String>();
    }
    this.deceasedDates.add(deceasedDatesItem);
    return this;
  }

   /**
   * Reported death dates
   * @return deceasedDates
  **/
  @ApiModelProperty(value = "Reported death dates")
  public List<String> getDeceasedDates() {
    return deceasedDates;
  }

  public void setDeceasedDates(List<String> deceasedDates) {
    this.deceasedDates = deceasedDates;
  }

  public EventDataAdverseMediaFlag modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Exact date and time in &#x60;YYYY-MM-DD hh:mm:ss&#x60; format
   * @return modifiedDate
  **/
  @ApiModelProperty(example = "2017-02-08 15:16:01", value = "Exact date and time in `YYYY-MM-DD hh:mm:ss` format")
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public EventDataAdverseMediaFlag providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Name of the verification provider
   * @return providerName
  **/
  @ApiModelProperty(value = "Name of the verification provider")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public EventDataAdverseMediaFlag matchName(String matchName) {
    this.matchName = matchName;
    return this;
  }

   /**
   * The name that was matched against
   * @return matchName
  **/
  @ApiModelProperty(value = "The name that was matched against")
  public String getMatchName() {
    return matchName;
  }

  public void setMatchName(String matchName) {
    this.matchName = matchName;
  }

  public EventDataAdverseMediaFlag matchDates(List<String> matchDates) {
    this.matchDates = matchDates;
    return this;
  }

  public EventDataAdverseMediaFlag addMatchDatesItem(String matchDatesItem) {
    if (this.matchDates == null) {
      this.matchDates = new ArrayList<String>();
    }
    this.matchDates.add(matchDatesItem);
    return this;
  }

   /**
   * Dates of the matched results
   * @return matchDates
  **/
  @ApiModelProperty(value = "Dates of the matched results")
  public List<String> getMatchDates() {
    return matchDates;
  }

  public void setMatchDates(List<String> matchDates) {
    this.matchDates = matchDates;
  }

  public EventDataAdverseMediaFlag matchCountries(List<CountryCode> matchCountries) {
    this.matchCountries = matchCountries;
    return this;
  }

  public EventDataAdverseMediaFlag addMatchCountriesItem(CountryCode matchCountriesItem) {
    if (this.matchCountries == null) {
      this.matchCountries = new ArrayList<CountryCode>();
    }
    this.matchCountries.add(matchCountriesItem);
    return this;
  }

   /**
   * Dates of the matched sanctions
   * @return matchCountries
  **/
  @ApiModelProperty(value = "Dates of the matched sanctions")
  public List<CountryCode> getMatchCountries() {
    return matchCountries;
  }

  public void setMatchCountries(List<CountryCode> matchCountries) {
    this.matchCountries = matchCountries;
  }

  public EventDataAdverseMediaFlag score(BigDecimal score) {
    this.score = score;
    return this;
  }

   /**
   * The score of the match
   * minimum: 0.0
   * maximum: 1.0
   * @return score
  **/
  @ApiModelProperty(value = "The score of the match")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public EventDataAdverseMediaFlag aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public EventDataAdverseMediaFlag addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Aliases used by the matched
   * @return aliases
  **/
  @ApiModelProperty(value = "Aliases used by the matched")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public EventDataAdverseMediaFlag previousNames(List<String> previousNames) {
    this.previousNames = previousNames;
    return this;
  }

  public EventDataAdverseMediaFlag addPreviousNamesItem(String previousNamesItem) {
    if (this.previousNames == null) {
      this.previousNames = new ArrayList<String>();
    }
    this.previousNames.add(previousNamesItem);
    return this;
  }

   /**
   * Previous names used by the matched
   * @return previousNames
  **/
  @ApiModelProperty(value = "Previous names used by the matched")
  public List<String> getPreviousNames() {
    return previousNames;
  }

  public void setPreviousNames(List<String> previousNames) {
    this.previousNames = previousNames;
  }

  public EventDataAdverseMediaFlag associates(List<Associate> associates) {
    this.associates = associates;
    return this;
  }

  public EventDataAdverseMediaFlag addAssociatesItem(Associate associatesItem) {
    if (this.associates == null) {
      this.associates = new ArrayList<Associate>();
    }
    this.associates.add(associatesItem);
    return this;
  }

   /**
   * Associated to the returned PEPs and Sanctions
   * @return associates
  **/
  @ApiModelProperty(value = "Associated to the returned PEPs and Sanctions")
  public List<Associate> getAssociates() {
    return associates;
  }

  public void setAssociates(List<Associate> associates) {
    this.associates = associates;
  }

  public EventDataAdverseMediaFlag profileNotes(String profileNotes) {
    this.profileNotes = profileNotes;
    return this;
  }

   /**
   * Profile notes returned by check
   * @return profileNotes
  **/
  @ApiModelProperty(value = "Profile notes returned by check")
  public String getProfileNotes() {
    return profileNotes;
  }

  public void setProfileNotes(String profileNotes) {
    this.profileNotes = profileNotes;
  }

  public EventDataAdverseMediaFlag details(List<DefaultSanctionsResultDetails> details) {
    this.details = details;
    return this;
  }

  public EventDataAdverseMediaFlag addDetailsItem(DefaultSanctionsResultDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<DefaultSanctionsResultDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * More information about the match
   * @return details
  **/
  @ApiModelProperty(value = "More information about the match")
  public List<DefaultSanctionsResultDetails> getDetails() {
    return details;
  }

  public void setDetails(List<DefaultSanctionsResultDetails> details) {
    this.details = details;
  }

  public EventDataAdverseMediaFlag media(List<MediaArticle> media) {
    this.media = media;
    return this;
  }

  public EventDataAdverseMediaFlag addMediaItem(MediaArticle mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<MediaArticle>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Related media
   * @return media
  **/
  @ApiModelProperty(value = "Related media")
  public List<MediaArticle> getMedia() {
    return media;
  }

  public void setMedia(List<MediaArticle> media) {
    this.media = media;
  }

  public EventDataAdverseMediaFlag documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public EventDataAdverseMediaFlag addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Documents related to the PEP match
   * @return documents
  **/
  @ApiModelProperty(value = "Documents related to the PEP match")
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public EventDataAdverseMediaFlag riskography(String riskography) {
    this.riskography = riskography;
    return this;
  }

   /**
   * Description of PEP or sanctioned persons background
   * @return riskography
  **/
  @ApiModelProperty(value = "Description of PEP or sanctioned persons background")
  public String getRiskography() {
    return riskography;
  }

  public void setRiskography(String riskography) {
    this.riskography = riskography;
  }

  public EventDataAdverseMediaFlag sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public EventDataAdverseMediaFlag addSourcesItem(Source sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<Source>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Sources used to derive sanctions and PEP information
   * @return sources
  **/
  @ApiModelProperty(value = "Sources used to derive sanctions and PEP information")
  public List<Source> getSources() {
    return sources;
  }

  public void setSources(List<Source> sources) {
    this.sources = sources;
  }

  public EventDataAdverseMediaFlag remarks(List<String> remarks) {
    this.remarks = remarks;
    return this;
  }

  public EventDataAdverseMediaFlag addRemarksItem(String remarksItem) {
    if (this.remarks == null) {
      this.remarks = new ArrayList<String>();
    }
    this.remarks.add(remarksItem);
    return this;
  }

   /**
   * Remarks about a sanctioned person
   * @return remarks
  **/
  @ApiModelProperty(value = "Remarks about a sanctioned person")
  public List<String> getRemarks() {
    return remarks;
  }

  public void setRemarks(List<String> remarks) {
    this.remarks = remarks;
  }

  public EventDataAdverseMediaFlag identifications(List<Identification> identifications) {
    this.identifications = identifications;
    return this;
  }

  public EventDataAdverseMediaFlag addIdentificationsItem(Identification identificationsItem) {
    if (this.identifications == null) {
      this.identifications = new ArrayList<Identification>();
    }
    this.identifications.add(identificationsItem);
    return this;
  }

   /**
   * Identifications such as a passport
   * @return identifications
  **/
  @ApiModelProperty(value = "Identifications such as a passport")
  public List<Identification> getIdentifications() {
    return identifications;
  }

  public void setIdentifications(List<Identification> identifications) {
    this.identifications = identifications;
  }

  public EventDataAdverseMediaFlag locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }

  public EventDataAdverseMediaFlag addLocationsItem(Location locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<Location>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Locations related to a PEP or sanctioned entity, such as birth place
   * @return locations
  **/
  @ApiModelProperty(value = "Locations related to a PEP or sanctioned entity, such as birth place")
  public List<Location> getLocations() {
    return locations;
  }

  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDataAdverseMediaFlag eventDataAdverseMediaFlag = (EventDataAdverseMediaFlag) o;
    return Objects.equals(this.eventType, eventDataAdverseMediaFlag.eventType) &&
        Objects.equals(this.matchId, eventDataAdverseMediaFlag.matchId) &&
        Objects.equals(this.gender, eventDataAdverseMediaFlag.gender) &&
        Objects.equals(this.deceasedDates, eventDataAdverseMediaFlag.deceasedDates) &&
        Objects.equals(this.modifiedDate, eventDataAdverseMediaFlag.modifiedDate) &&
        Objects.equals(this.providerName, eventDataAdverseMediaFlag.providerName) &&
        Objects.equals(this.matchName, eventDataAdverseMediaFlag.matchName) &&
        Objects.equals(this.matchDates, eventDataAdverseMediaFlag.matchDates) &&
        Objects.equals(this.matchCountries, eventDataAdverseMediaFlag.matchCountries) &&
        Objects.equals(this.score, eventDataAdverseMediaFlag.score) &&
        Objects.equals(this.aliases, eventDataAdverseMediaFlag.aliases) &&
        Objects.equals(this.previousNames, eventDataAdverseMediaFlag.previousNames) &&
        Objects.equals(this.associates, eventDataAdverseMediaFlag.associates) &&
        Objects.equals(this.profileNotes, eventDataAdverseMediaFlag.profileNotes) &&
        Objects.equals(this.details, eventDataAdverseMediaFlag.details) &&
        Objects.equals(this.media, eventDataAdverseMediaFlag.media) &&
        Objects.equals(this.documents, eventDataAdverseMediaFlag.documents) &&
        Objects.equals(this.riskography, eventDataAdverseMediaFlag.riskography) &&
        Objects.equals(this.sources, eventDataAdverseMediaFlag.sources) &&
        Objects.equals(this.remarks, eventDataAdverseMediaFlag.remarks) &&
        Objects.equals(this.identifications, eventDataAdverseMediaFlag.identifications) &&
        Objects.equals(this.locations, eventDataAdverseMediaFlag.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, matchId, gender, deceasedDates, modifiedDate, providerName, matchName, matchDates, matchCountries, score, aliases, previousNames, associates, profileNotes, details, media, documents, riskography, sources, remarks, identifications, locations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDataAdverseMediaFlag {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    deceasedDates: ").append(toIndentedString(deceasedDates)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    matchName: ").append(toIndentedString(matchName)).append("\n");
    sb.append("    matchDates: ").append(toIndentedString(matchDates)).append("\n");
    sb.append("    matchCountries: ").append(toIndentedString(matchCountries)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    previousNames: ").append(toIndentedString(previousNames)).append("\n");
    sb.append("    associates: ").append(toIndentedString(associates)).append("\n");
    sb.append("    profileNotes: ").append(toIndentedString(profileNotes)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    riskography: ").append(toIndentedString(riskography)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    identifications: ").append(toIndentedString(identifications)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

