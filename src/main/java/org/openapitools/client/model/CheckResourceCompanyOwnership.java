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
import java.util.List;
import org.openapitools.client.model.CheckResourceBase;
import org.openapitools.client.model.CheckResourceBaseProviders;
import org.openapitools.client.model.CheckState;
import org.openapitools.client.model.CheckVariant;
import org.openapitools.client.model.CompanyData;
import org.openapitools.client.model.Error;

/**
 * For details refer to [Check Reference](/reference/checks/companies/ownership-check)
 */
@ApiModel(description = "For details refer to [Check Reference](/reference/checks/companies/ownership-check)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public class CheckResourceCompanyOwnership extends CheckResourceBase {
  /**
   * The type of check being ran
   */
  public enum CheckTypeEnum {
    COMPANY_OWNERSHIP("COMPANY_OWNERSHIP");

    private String value;

    CheckTypeEnum(String value) {
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
    public static CheckTypeEnum fromValue(String text) {
      for (CheckTypeEnum b : CheckTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("check_type")
  private CheckTypeEnum checkType;

  @JsonProperty("input_data")
  private CompanyData inputData = null;

  @JsonProperty("output_data")
  private CompanyData outputData = null;

  /**
   * The meaning of the result will depend on your provider and settings
   */
  public enum ResultEnum {
    PASS("Pass"),
    
    FAIL("Fail"),
    
    ERROR("Error"),
    
    PARTIAL("Partial");

    private String value;

    ResultEnum(String value) {
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
    public static ResultEnum fromValue(String text) {
      for (ResultEnum b : ResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("result")
  private ResultEnum result;

  public CheckResourceCompanyOwnership checkType(CheckTypeEnum checkType) {
    this.checkType = checkType;
    return this;
  }

   /**
   * The type of check being ran
   * @return checkType
  **/
  @ApiModelProperty(value = "The type of check being ran")
  public CheckTypeEnum getCheckType() {
    return checkType;
  }

  public void setCheckType(CheckTypeEnum checkType) {
    this.checkType = checkType;
  }

  public CheckResourceCompanyOwnership inputData(CompanyData inputData) {
    this.inputData = inputData;
    return this;
  }

   /**
   * Get inputData
   * @return inputData
  **/
  @ApiModelProperty(value = "")
  public CompanyData getInputData() {
    return inputData;
  }

  public void setInputData(CompanyData inputData) {
    this.inputData = inputData;
  }

  public CheckResourceCompanyOwnership outputData(CompanyData outputData) {
    this.outputData = outputData;
    return this;
  }

   /**
   * Get outputData
   * @return outputData
  **/
  @ApiModelProperty(value = "")
  public CompanyData getOutputData() {
    return outputData;
  }

  public void setOutputData(CompanyData outputData) {
    this.outputData = outputData;
  }

  public CheckResourceCompanyOwnership result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * The meaning of the result will depend on your provider and settings
   * @return result
  **/
  @ApiModelProperty(value = "The meaning of the result will depend on your provider and settings")
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckResourceCompanyOwnership checkResourceCompanyOwnership = (CheckResourceCompanyOwnership) o;
    return Objects.equals(this.checkType, checkResourceCompanyOwnership.checkType) &&
        Objects.equals(this.inputData, checkResourceCompanyOwnership.inputData) &&
        Objects.equals(this.outputData, checkResourceCompanyOwnership.outputData) &&
        Objects.equals(this.result, checkResourceCompanyOwnership.result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkType, inputData, outputData, result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResourceCompanyOwnership {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    outputData: ").append(toIndentedString(outputData)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

