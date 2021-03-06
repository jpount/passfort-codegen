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
import org.openapitools.client.model.ApiKey;
import org.openapitools.client.model.User;

/**
 * An audit item
 */
@ApiModel(description = "An audit item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class AuditItem {
  @JsonProperty("id")
  private String id;

  @JsonProperty("profileID")
  private String profileID;

  /**
   * Action that took place
   */
  public enum ActionEnum {
    ADDED_A_TAG("added-a-tag"),
    
    ADDED_A_TASK("added-a-task"),
    
    ADDED_PRODUCT("added-product"),
    
    ATTACH_FILE("attach-file"),
    
    AUTO_DECISION("auto-decision"),
    
    RISK_AUTO_REJECT_APPLICATION("risk-auto-reject-application"),
    
    COMMENT("comment"),
    
    COMPLETED_A_TASK("completed-a-task"),
    
    COMPLETED_STAGE("completed-stage"),
    
    CREATED_PROFILE("created-profile"),
    
    DOWNLOAD_AUDIT_FILE("download-audit-file"),
    
    DOWNLOAD_AUDIT_REPORT("download-audit-report"),
    
    DOWNLOADED_A_DOCUMENT("downloaded-a-document"),
    
    EVENT_RESOLUTION("event-resolution"),
    
    INSTRUCTED_CHECK("instructed-check"),
    
    LINKED_PROFILE("linked-profile"),
    
    MANUAL_DECISION("manual-decision"),
    
    PROFILE_APPLICATION_STATUS_CHANGED("profile-application-status-changed"),
    
    REMOVED_A_TAG("removed-a-tag"),
    
    REPLACE_COLLECTED_DATA("replace-collected-data"),
    
    REQUESTED_DATA("requested-data"),
    
    REVERT_DECISION("revert-decision"),
    
    SANCTIONS_FALSE_POSITIVE("sanctions-false-positive"),
    
    SUBMITTED_DATA("submitted-data"),
    
    UNCOMPLETED_A_TASK("uncompleted-a-task"),
    
    UNLINKED_PROFILE("unlinked-profile"),
    
    UPDATED_CHECK("updated-check"),
    
    UPLOADED_A_DOCUMENT("uploaded-a-document"),
    
    VIEW("view"),
    
    VIEWED_PROFILE("viewed-profile"),
    
    EVENT_BULK_RESOLUTION("event-bulk-resolution"),
    
    ADDED_A_TASK_NOTE("added-a-task-note"),
    
    DELETED_A_TASK_NOTE("deleted-a-task-note"),
    
    ADDED_A_FILE("added-a-file"),
    
    APPLICATION_ASSIGNMENT_CREATED("application-assignment-created"),
    
    APPLICATION_ASSIGNMENT_DELETED("application-assignment-deleted"),
    
    APPLICATION_ASSIGNMENT_REASSIGNED("application-assignment-reassigned"),
    
    COMMENT_DELETED("comment-deleted"),
    
    ADDED_EVENT("added-event"),
    
    PROFILE_STATUS_CHANGED("profile-status-changed"),
    
    SANCTIONS_WHITELIST("sanctions-whitelist"),
    
    ORIGIN_PROFILE_CHANGED("origin-profile-changed"),
    
    AFFILIATE_ADDED("affiliate-added"),
    
    AFFILIATE_REMOVED("affiliate-removed");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("action")
  private ActionEnum action;

  @JsonProperty("user")
  private User user = null;

  @JsonProperty("apikey")
  private ApiKey apikey = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp;

  @JsonProperty("message")
  private String message;

  @JsonProperty("ref_data")
  private Object refData = null;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("filehash")
  private String filehash;

  @JsonProperty("signature")
  private String signature;

  public AuditItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * [Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "[Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditItem profileID(String profileID) {
    this.profileID = profileID;
    return this;
  }

   /**
   * [Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * @return profileID
  **/
  @ApiModelProperty(required = true, value = "[Universally unique identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)")
  public String getProfileID() {
    return profileID;
  }

  public void setProfileID(String profileID) {
    this.profileID = profileID;
  }

  public AuditItem action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Action that took place
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action that took place")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AuditItem user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public AuditItem apikey(ApiKey apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Get apikey
   * @return apikey
  **/
  @ApiModelProperty(value = "")
  public ApiKey getApikey() {
    return apikey;
  }

  public void setApikey(ApiKey apikey) {
    this.apikey = apikey;
  }

  public AuditItem timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * A Unix Timestamp of when then action took place
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "A Unix Timestamp of when then action took place")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public AuditItem message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message giving more details about the action
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A message giving more details about the action")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AuditItem refData(Object refData) {
    this.refData = refData;
    return this;
  }

   /**
   * Miscellaneous data associated with action
   * @return refData
  **/
  @ApiModelProperty(required = true, value = "Miscellaneous data associated with action")
  public Object getRefData() {
    return refData;
  }

  public void setRefData(Object refData) {
    this.refData = refData;
  }

  public AuditItem filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * name of associated file
   * @return filename
  **/
  @ApiModelProperty(required = true, value = "name of associated file")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AuditItem filehash(String filehash) {
    this.filehash = filehash;
    return this;
  }

   /**
   * Hash of associated file
   * @return filehash
  **/
  @ApiModelProperty(value = "Hash of associated file")
  public String getFilehash() {
    return filehash;
  }

  public void setFilehash(String filehash) {
    this.filehash = filehash;
  }

  public AuditItem signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Signature of encrypted file
   * @return signature
  **/
  @ApiModelProperty(required = true, value = "Signature of encrypted file")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditItem auditItem = (AuditItem) o;
    return Objects.equals(this.id, auditItem.id) &&
        Objects.equals(this.profileID, auditItem.profileID) &&
        Objects.equals(this.action, auditItem.action) &&
        Objects.equals(this.user, auditItem.user) &&
        Objects.equals(this.apikey, auditItem.apikey) &&
        Objects.equals(this.timestamp, auditItem.timestamp) &&
        Objects.equals(this.message, auditItem.message) &&
        Objects.equals(this.refData, auditItem.refData) &&
        Objects.equals(this.filename, auditItem.filename) &&
        Objects.equals(this.filehash, auditItem.filehash) &&
        Objects.equals(this.signature, auditItem.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profileID, action, user, apikey, timestamp, message, refData, filename, filehash, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profileID: ").append(toIndentedString(profileID)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    refData: ").append(toIndentedString(refData)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    filehash: ").append(toIndentedString(filehash)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

