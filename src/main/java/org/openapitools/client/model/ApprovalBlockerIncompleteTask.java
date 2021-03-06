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
import org.openapitools.client.model.TaskType;
import org.openapitools.client.model.TaskVariant;

/**
 * Incomplete Task preventing the profile application being approved
 */
@ApiModel(description = "Incomplete Task preventing the profile application being approved")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class ApprovalBlockerIncompleteTask {
  /**
   * The nature of the blocker
   */
  public enum BlockerTypeEnum {
    INCOMPLETE_TASK("INCOMPLETE_TASK");

    private String value;

    BlockerTypeEnum(String value) {
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
    public static BlockerTypeEnum fromValue(String text) {
      for (BlockerTypeEnum b : BlockerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("blocker_type")
  private BlockerTypeEnum blockerType;

  @JsonProperty("task_type")
  private TaskType taskType = null;

  @JsonProperty("task_variant")
  private TaskVariant taskVariant = null;

  public ApprovalBlockerIncompleteTask blockerType(BlockerTypeEnum blockerType) {
    this.blockerType = blockerType;
    return this;
  }

   /**
   * The nature of the blocker
   * @return blockerType
  **/
  @ApiModelProperty(value = "The nature of the blocker")
  public BlockerTypeEnum getBlockerType() {
    return blockerType;
  }

  public void setBlockerType(BlockerTypeEnum blockerType) {
    this.blockerType = blockerType;
  }

  public ApprovalBlockerIncompleteTask taskType(TaskType taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @ApiModelProperty(value = "")
  public TaskType getTaskType() {
    return taskType;
  }

  public void setTaskType(TaskType taskType) {
    this.taskType = taskType;
  }

  public ApprovalBlockerIncompleteTask taskVariant(TaskVariant taskVariant) {
    this.taskVariant = taskVariant;
    return this;
  }

   /**
   * Get taskVariant
   * @return taskVariant
  **/
  @ApiModelProperty(value = "")
  public TaskVariant getTaskVariant() {
    return taskVariant;
  }

  public void setTaskVariant(TaskVariant taskVariant) {
    this.taskVariant = taskVariant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalBlockerIncompleteTask approvalBlockerIncompleteTask = (ApprovalBlockerIncompleteTask) o;
    return Objects.equals(this.blockerType, approvalBlockerIncompleteTask.blockerType) &&
        Objects.equals(this.taskType, approvalBlockerIncompleteTask.taskType) &&
        Objects.equals(this.taskVariant, approvalBlockerIncompleteTask.taskVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockerType, taskType, taskVariant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalBlockerIncompleteTask {\n");
    
    sb.append("    blockerType: ").append(toIndentedString(blockerType)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    taskVariant: ").append(toIndentedString(taskVariant)).append("\n");
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

