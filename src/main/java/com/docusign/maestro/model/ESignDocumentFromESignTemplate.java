package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowDocGenDocOutputFormat;
import com.docusign.maestro.model.ESignDocumentTypesFromDSTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ESignDocumentFromESignTemplate.
 *
 */

public class ESignDocumentFromESignTemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("eSignTemplateId")
  private String eSignTemplateId = null;

  @JsonProperty("fileExtension")
  private DSWorkflowDocGenDocOutputFormat fileExtension = null;

  @JsonProperty("name")
  private Object name = null;

  @JsonProperty("type")
  private ESignDocumentTypesFromDSTemplate type = null;


  /**
   * eSignTemplateId.
   *
   * @return ESignDocumentFromESignTemplate
   **/
  public ESignDocumentFromESignTemplate eSignTemplateId(String eSignTemplateId) {
    this.eSignTemplateId = eSignTemplateId;
    return this;
  }

  /**
   * Get eSignTemplateId.
   * @return eSignTemplateId
   **/
  @Schema(required = true, description = "")
  public String getESignTemplateId() {
    return eSignTemplateId;
  }

  /**
   * setESignTemplateId.
   **/
  public void setESignTemplateId(String eSignTemplateId) {
    this.eSignTemplateId = eSignTemplateId;
  }


  /**
   * fileExtension.
   *
   * @return ESignDocumentFromESignTemplate
   **/
  public ESignDocumentFromESignTemplate fileExtension(DSWorkflowDocGenDocOutputFormat fileExtension) {
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
   * @return ESignDocumentFromESignTemplate
   **/
  public ESignDocumentFromESignTemplate name(Object name) {
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
   * @return ESignDocumentFromESignTemplate
   **/
  public ESignDocumentFromESignTemplate type(ESignDocumentTypesFromDSTemplate type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public ESignDocumentTypesFromDSTemplate getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(ESignDocumentTypesFromDSTemplate type) {
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
    ESignDocumentFromESignTemplate esignDocumentFromESignTemplate = (ESignDocumentFromESignTemplate) o;
    return Objects.equals(this.eSignTemplateId, esignDocumentFromESignTemplate.eSignTemplateId) &&
        Objects.equals(this.fileExtension, esignDocumentFromESignTemplate.fileExtension) &&
        Objects.equals(this.name, esignDocumentFromESignTemplate.name) &&
        Objects.equals(this.type, esignDocumentFromESignTemplate.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(eSignTemplateId, fileExtension, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignDocumentFromESignTemplate {\n");
    
    sb.append("    eSignTemplateId: ").append(toIndentedString(eSignTemplateId)).append("\n");
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

