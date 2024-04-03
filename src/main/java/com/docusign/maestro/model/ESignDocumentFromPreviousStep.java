package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowDocGenDocOutputFormat;
import com.docusign.maestro.model.ESignDocumentTypesFromPreviousStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ESignDocumentFromPreviousStep.
 *
 */

public class ESignDocumentFromPreviousStep {
  @JsonProperty("documentFromPreviousStep")
  private Object documentFromPreviousStep = null;

  @JsonProperty("fileExtension")
  private DSWorkflowDocGenDocOutputFormat fileExtension = null;

  @JsonProperty("name")
  private Object name = null;

  @JsonProperty("type")
  private ESignDocumentTypesFromPreviousStep type = null;


  /**
   * documentFromPreviousStep.
   *
   * @return ESignDocumentFromPreviousStep
   **/
  public ESignDocumentFromPreviousStep documentFromPreviousStep(Object documentFromPreviousStep) {
    this.documentFromPreviousStep = documentFromPreviousStep;
    return this;
  }

  /**
   * Reference of #/definitions/DSWorkflowVariable. DS Workflow Variables.
   * @return documentFromPreviousStep
   **/
  @Schema(required = true, description = "Reference of #/definitions/DSWorkflowVariable. DS Workflow Variables")
  public Object getDocumentFromPreviousStep() {
    return documentFromPreviousStep;
  }

  /**
   * setDocumentFromPreviousStep.
   **/
  public void setDocumentFromPreviousStep(Object documentFromPreviousStep) {
    this.documentFromPreviousStep = documentFromPreviousStep;
  }


  /**
   * fileExtension.
   *
   * @return ESignDocumentFromPreviousStep
   **/
  public ESignDocumentFromPreviousStep fileExtension(DSWorkflowDocGenDocOutputFormat fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * Get fileExtension.
   * @return fileExtension
   **/
  @Schema(required = true, description = "")
  public DSWorkflowDocGenDocOutputFormat getFileExtension() {
    return fileExtension;
  }

  /**
   * setFileExtension.
   **/
  public void setFileExtension(DSWorkflowDocGenDocOutputFormat fileExtension) {
    this.fileExtension = fileExtension;
  }


  /**
   * name.
   *
   * @return ESignDocumentFromPreviousStep
   **/
  public ESignDocumentFromPreviousStep name(Object name) {
    this.name = name;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return name
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(Object name) {
    this.name = name;
  }


  /**
   * type.
   *
   * @return ESignDocumentFromPreviousStep
   **/
  public ESignDocumentFromPreviousStep type(ESignDocumentTypesFromPreviousStep type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public ESignDocumentTypesFromPreviousStep getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(ESignDocumentTypesFromPreviousStep type) {
    this.type = type;
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
    ESignDocumentFromPreviousStep esignDocumentFromPreviousStep = (ESignDocumentFromPreviousStep) o;
    return Objects.equals(this.documentFromPreviousStep, esignDocumentFromPreviousStep.documentFromPreviousStep) &&
        Objects.equals(this.fileExtension, esignDocumentFromPreviousStep.fileExtension) &&
        Objects.equals(this.name, esignDocumentFromPreviousStep.name) &&
        Objects.equals(this.type, esignDocumentFromPreviousStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentFromPreviousStep, fileExtension, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignDocumentFromPreviousStep {\n");
    
    sb.append("    documentFromPreviousStep: ").append(toIndentedString(documentFromPreviousStep)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

