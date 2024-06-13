package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ESignTabsRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ESignSigner.
 *
 */

public class ESignSigner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("email")
  private Object email = null;

  @JsonProperty("note")
  private Object note = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("tabs")
  private ESignTabsRecord tabs = null;

  @JsonProperty("userName")
  private Object userName = null;


  /**
   * email.
   *
   * @return ESignSigner
   **/
  public ESignSigner email(Object email) {
    this.email = email;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return email
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(Object email) {
    this.email = email;
  }


  /**
   * note.
   *
   * @return ESignSigner
   **/
  public ESignSigner note(Object note) {
    this.note = note;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return note
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getNote() {
    return note;
  }

  /**
   * setNote.
   **/
  public void setNote(Object note) {
    this.note = note;
  }


  /**
   * routingOrder.
   *
   * @return ESignSigner
   **/
  public ESignSigner routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

  /**
   * Get routingOrder.
   * @return routingOrder
   **/
  @Schema(required = true, description = "")
  public String getRoutingOrder() {
    return routingOrder;
  }

  /**
   * setRoutingOrder.
   **/
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }


  /**
   * tabs.
   *
   * @return ESignSigner
   **/
  public ESignSigner tabs(ESignTabsRecord tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * Get tabs.
   * @return tabs
   **/
  @Schema(required = true, description = "")
  public ESignTabsRecord getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(ESignTabsRecord tabs) {
    this.tabs = tabs;
  }


  /**
   * userName.
   *
   * @return ESignSigner
   **/
  public ESignSigner userName(Object userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return userName
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(Object userName) {
    this.userName = userName;
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
    ESignSigner esignSigner = (ESignSigner) o;
    return Objects.equals(this.email, esignSigner.email) &&
        Objects.equals(this.note, esignSigner.note) &&
        Objects.equals(this.routingOrder, esignSigner.routingOrder) &&
        Objects.equals(this.tabs, esignSigner.tabs) &&
        Objects.equals(this.userName, esignSigner.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, note, routingOrder, tabs, userName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignSigner {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

