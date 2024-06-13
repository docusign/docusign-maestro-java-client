package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowDocGenDocOutputFormat;
import com.docusign.maestro.model.RecordStringOrVariableOrTransformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSDocGenStepInput.
 *
 */

public class DSDocGenStepInput implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dataJson")
  private RecordStringOrVariableOrTransformation dataJson = null;

  @JsonProperty("outputFileName")
  private Object outputFileName = null;

  @JsonProperty("outputFileNameIsUnique")
  private Boolean outputFileNameIsUnique = null;

  @JsonProperty("outputFormat")
  private DSWorkflowDocGenDocOutputFormat outputFormat = null;

  @JsonProperty("templateId")
  private Object templateId = null;


  /**
   * dataJson.
   *
   * @return DSDocGenStepInput
   **/
  public DSDocGenStepInput dataJson(RecordStringOrVariableOrTransformation dataJson) {
    this.dataJson = dataJson;
    return this;
  }

  /**
   * Get dataJson.
   * @return dataJson
   **/
  @Schema(required = true, description = "")
  public RecordStringOrVariableOrTransformation getDataJson() {
    return dataJson;
  }

  /**
   * setDataJson.
   **/
  public void setDataJson(RecordStringOrVariableOrTransformation dataJson) {
    this.dataJson = dataJson;
  }


  /**
   * outputFileName.
   *
   * @return DSDocGenStepInput
   **/
  public DSDocGenStepInput outputFileName(Object outputFileName) {
    this.outputFileName = outputFileName;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return outputFileName
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getOutputFileName() {
    return outputFileName;
  }

  /**
   * setOutputFileName.
   **/
  public void setOutputFileName(Object outputFileName) {
    this.outputFileName = outputFileName;
  }


  /**
   * outputFileNameIsUnique.
   *
   * @return DSDocGenStepInput
   **/
  public DSDocGenStepInput outputFileNameIsUnique(Boolean outputFileNameIsUnique) {
    this.outputFileNameIsUnique = outputFileNameIsUnique;
    return this;
  }

  /**
   * Get outputFileNameIsUnique.
   * @return outputFileNameIsUnique
   **/
  @Schema(required = true, description = "")
  public Boolean isOutputFileNameIsUnique() {
    return outputFileNameIsUnique;
  }

  /**
   * setOutputFileNameIsUnique.
   **/
  public void setOutputFileNameIsUnique(Boolean outputFileNameIsUnique) {
    this.outputFileNameIsUnique = outputFileNameIsUnique;
  }


  /**
   * outputFormat.
   *
   * @return DSDocGenStepInput
   **/
  public DSDocGenStepInput outputFormat(DSWorkflowDocGenDocOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Get outputFormat.
   * @return outputFormat
   **/
  @Schema(required = true, description = "")
  public DSWorkflowDocGenDocOutputFormat getOutputFormat() {
    return outputFormat;
  }

  /**
   * setOutputFormat.
   **/
  public void setOutputFormat(DSWorkflowDocGenDocOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
  }


  /**
   * templateId.
   *
   * @return DSDocGenStepInput
   **/
  public DSDocGenStepInput templateId(Object templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return templateId
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(Object templateId) {
    this.templateId = templateId;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSDocGenStepInput dsDocGenStepInput = (DSDocGenStepInput) o;
    return Objects.equals(this.dataJson, dsDocGenStepInput.dataJson) &&
        Objects.equals(this.outputFileName, dsDocGenStepInput.outputFileName) &&
        Objects.equals(this.outputFileNameIsUnique, dsDocGenStepInput.outputFileNameIsUnique) &&
        Objects.equals(this.outputFormat, dsDocGenStepInput.outputFormat) &&
        Objects.equals(this.templateId, dsDocGenStepInput.templateId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dataJson, outputFileName, outputFileNameIsUnique, outputFormat, templateId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSDocGenStepInput {\n");
    
    sb.append("    dataJson: ").append(toIndentedString(dataJson)).append("\n");
    sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
    sb.append("    outputFileNameIsUnique: ").append(toIndentedString(outputFileNameIsUnique)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

