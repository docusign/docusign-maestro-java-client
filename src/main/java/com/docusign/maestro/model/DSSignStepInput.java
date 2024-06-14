package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ESignSigner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSSignStepInput.
 *
 */

public class DSSignStepInput implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("documents")
  private java.util.List<Object> documents = new java.util.ArrayList<>();

  @JsonProperty("emailBlurb")
  private Object emailBlurb = null;

  @JsonProperty("emailSubject")
  private Object emailSubject = null;

  @JsonProperty("isEmbeddedSign")
  private Boolean isEmbeddedSign = null;

  @JsonProperty("signers")
  private java.util.List<ESignSigner> signers = new java.util.ArrayList<>();


  /**
   * documents.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput documents(java.util.List<Object> documents) {
    this.documents = documents;
    return this;
  }
  
  /**
   * addDocumentsItem.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput addDocumentsItem(Object documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * A list of #/definitions/ESignDocuments. Each element is: ESignDocument Object. This object should be any of the following object models: [#/definitions/ESignDocumentFromPreviousStep, #/definitions/ESignDocumentFromESignTemplate].
   * @return documents
   **/
  @Schema(required = true, description = "A list of #/definitions/ESignDocuments. Each element is: ESignDocument Object. This object should be any of the following object models: [#/definitions/ESignDocumentFromPreviousStep, #/definitions/ESignDocumentFromESignTemplate]")
  public java.util.List<Object> getDocuments() {
    return documents;
  }

  /**
   * setDocuments.
   **/
  public void setDocuments(java.util.List<Object> documents) {
    this.documents = documents;
  }


  /**
   * emailBlurb.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput emailBlurb(Object emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return emailBlurb
   **/
  @Schema(description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getEmailBlurb() {
    return emailBlurb;
  }

  /**
   * setEmailBlurb.
   **/
  public void setEmailBlurb(Object emailBlurb) {
    this.emailBlurb = emailBlurb;
  }


  /**
   * emailSubject.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput emailSubject(Object emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return emailSubject
   **/
  @Schema(description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getEmailSubject() {
    return emailSubject;
  }

  /**
   * setEmailSubject.
   **/
  public void setEmailSubject(Object emailSubject) {
    this.emailSubject = emailSubject;
  }


  /**
   * isEmbeddedSign.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput isEmbeddedSign(Boolean isEmbeddedSign) {
    this.isEmbeddedSign = isEmbeddedSign;
    return this;
  }

  /**
   * Get isEmbeddedSign.
   * @return isEmbeddedSign
   **/
  @Schema(required = true, description = "")
  public Boolean isIsEmbeddedSign() {
    return isEmbeddedSign;
  }

  /**
   * setIsEmbeddedSign.
   **/
  public void setIsEmbeddedSign(Boolean isEmbeddedSign) {
    this.isEmbeddedSign = isEmbeddedSign;
  }


  /**
   * signers.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput signers(java.util.List<ESignSigner> signers) {
    this.signers = signers;
    return this;
  }
  
  /**
   * addSignersItem.
   *
   * @return DSSignStepInput
   **/
  public DSSignStepInput addSignersItem(ESignSigner signersItem) {
    this.signers.add(signersItem);
    return this;
  }

  /**
   * Get signers.
   * @return signers
   **/
  @Schema(required = true, description = "")
  public java.util.List<ESignSigner> getSigners() {
    return signers;
  }

  /**
   * setSigners.
   **/
  public void setSigners(java.util.List<ESignSigner> signers) {
    this.signers = signers;
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
    DSSignStepInput dsSignStepInput = (DSSignStepInput) o;
    return Objects.equals(this.documents, dsSignStepInput.documents) &&
        Objects.equals(this.emailBlurb, dsSignStepInput.emailBlurb) &&
        Objects.equals(this.emailSubject, dsSignStepInput.emailSubject) &&
        Objects.equals(this.isEmbeddedSign, dsSignStepInput.isEmbeddedSign) &&
        Objects.equals(this.signers, dsSignStepInput.signers);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documents, emailBlurb, emailSubject, isEmbeddedSign, signers);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSSignStepInput {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    isEmbeddedSign: ").append(toIndentedString(isEmbeddedSign)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
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

