package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ESignTabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ESignTabsRecord.
 *
 */

public class ESignTabsRecord {
  @JsonProperty("dateSignedTabs")
  private java.util.List<ESignTabs> dateSignedTabs = null;

  @JsonProperty("emailAddressTabs")
  private java.util.List<ESignTabs> emailAddressTabs = null;

  @JsonProperty("firstNameTabs")
  private java.util.List<ESignTabs> firstNameTabs = null;

  @JsonProperty("fullNameTabs")
  private java.util.List<ESignTabs> fullNameTabs = null;

  @JsonProperty("lastNameTabs")
  private java.util.List<ESignTabs> lastNameTabs = null;

  @JsonProperty("signHereTabs")
  private java.util.List<ESignTabs> signHereTabs = null;

  @JsonProperty("textTabs")
  private java.util.List<ESignTabs> textTabs = null;


  /**
   * dateSignedTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord dateSignedTabs(java.util.List<ESignTabs> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
    return this;
  }
  
  /**
   * addDateSignedTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addDateSignedTabsItem(ESignTabs dateSignedTabsItem) {
    if (this.dateSignedTabs == null) {
      this.dateSignedTabs = new java.util.ArrayList<>();
    }
    this.dateSignedTabs.add(dateSignedTabsItem);
    return this;
  }

  /**
   * Get dateSignedTabs.
   * @return dateSignedTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getDateSignedTabs() {
    return dateSignedTabs;
  }

  /**
   * setDateSignedTabs.
   **/
  public void setDateSignedTabs(java.util.List<ESignTabs> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
  }


  /**
   * emailAddressTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord emailAddressTabs(java.util.List<ESignTabs> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
    return this;
  }
  
  /**
   * addEmailAddressTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addEmailAddressTabsItem(ESignTabs emailAddressTabsItem) {
    if (this.emailAddressTabs == null) {
      this.emailAddressTabs = new java.util.ArrayList<>();
    }
    this.emailAddressTabs.add(emailAddressTabsItem);
    return this;
  }

  /**
   * Get emailAddressTabs.
   * @return emailAddressTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getEmailAddressTabs() {
    return emailAddressTabs;
  }

  /**
   * setEmailAddressTabs.
   **/
  public void setEmailAddressTabs(java.util.List<ESignTabs> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
  }


  /**
   * firstNameTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord firstNameTabs(java.util.List<ESignTabs> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
    return this;
  }
  
  /**
   * addFirstNameTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addFirstNameTabsItem(ESignTabs firstNameTabsItem) {
    if (this.firstNameTabs == null) {
      this.firstNameTabs = new java.util.ArrayList<>();
    }
    this.firstNameTabs.add(firstNameTabsItem);
    return this;
  }

  /**
   * Get firstNameTabs.
   * @return firstNameTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getFirstNameTabs() {
    return firstNameTabs;
  }

  /**
   * setFirstNameTabs.
   **/
  public void setFirstNameTabs(java.util.List<ESignTabs> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
  }


  /**
   * fullNameTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord fullNameTabs(java.util.List<ESignTabs> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
    return this;
  }
  
  /**
   * addFullNameTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addFullNameTabsItem(ESignTabs fullNameTabsItem) {
    if (this.fullNameTabs == null) {
      this.fullNameTabs = new java.util.ArrayList<>();
    }
    this.fullNameTabs.add(fullNameTabsItem);
    return this;
  }

  /**
   * Get fullNameTabs.
   * @return fullNameTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getFullNameTabs() {
    return fullNameTabs;
  }

  /**
   * setFullNameTabs.
   **/
  public void setFullNameTabs(java.util.List<ESignTabs> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
  }


  /**
   * lastNameTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord lastNameTabs(java.util.List<ESignTabs> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
    return this;
  }
  
  /**
   * addLastNameTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addLastNameTabsItem(ESignTabs lastNameTabsItem) {
    if (this.lastNameTabs == null) {
      this.lastNameTabs = new java.util.ArrayList<>();
    }
    this.lastNameTabs.add(lastNameTabsItem);
    return this;
  }

  /**
   * Get lastNameTabs.
   * @return lastNameTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getLastNameTabs() {
    return lastNameTabs;
  }

  /**
   * setLastNameTabs.
   **/
  public void setLastNameTabs(java.util.List<ESignTabs> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
  }


  /**
   * signHereTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord signHereTabs(java.util.List<ESignTabs> signHereTabs) {
    this.signHereTabs = signHereTabs;
    return this;
  }
  
  /**
   * addSignHereTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addSignHereTabsItem(ESignTabs signHereTabsItem) {
    if (this.signHereTabs == null) {
      this.signHereTabs = new java.util.ArrayList<>();
    }
    this.signHereTabs.add(signHereTabsItem);
    return this;
  }

  /**
   * Get signHereTabs.
   * @return signHereTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getSignHereTabs() {
    return signHereTabs;
  }

  /**
   * setSignHereTabs.
   **/
  public void setSignHereTabs(java.util.List<ESignTabs> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }


  /**
   * textTabs.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord textTabs(java.util.List<ESignTabs> textTabs) {
    this.textTabs = textTabs;
    return this;
  }
  
  /**
   * addTextTabsItem.
   *
   * @return ESignTabsRecord
   **/
  public ESignTabsRecord addTextTabsItem(ESignTabs textTabsItem) {
    if (this.textTabs == null) {
      this.textTabs = new java.util.ArrayList<>();
    }
    this.textTabs.add(textTabsItem);
    return this;
  }

  /**
   * Get textTabs.
   * @return textTabs
   **/
  @Schema(description = "")
  public java.util.List<ESignTabs> getTextTabs() {
    return textTabs;
  }

  /**
   * setTextTabs.
   **/
  public void setTextTabs(java.util.List<ESignTabs> textTabs) {
    this.textTabs = textTabs;
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
    ESignTabsRecord esignTabsRecord = (ESignTabsRecord) o;
    return Objects.equals(this.dateSignedTabs, esignTabsRecord.dateSignedTabs) &&
        Objects.equals(this.emailAddressTabs, esignTabsRecord.emailAddressTabs) &&
        Objects.equals(this.firstNameTabs, esignTabsRecord.firstNameTabs) &&
        Objects.equals(this.fullNameTabs, esignTabsRecord.fullNameTabs) &&
        Objects.equals(this.lastNameTabs, esignTabsRecord.lastNameTabs) &&
        Objects.equals(this.signHereTabs, esignTabsRecord.signHereTabs) &&
        Objects.equals(this.textTabs, esignTabsRecord.textTabs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dateSignedTabs, emailAddressTabs, firstNameTabs, fullNameTabs, lastNameTabs, signHereTabs, textTabs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignTabsRecord {\n");
    
    sb.append("    dateSignedTabs: ").append(toIndentedString(dateSignedTabs)).append("\n");
    sb.append("    emailAddressTabs: ").append(toIndentedString(emailAddressTabs)).append("\n");
    sb.append("    firstNameTabs: ").append(toIndentedString(firstNameTabs)).append("\n");
    sb.append("    fullNameTabs: ").append(toIndentedString(fullNameTabs)).append("\n");
    sb.append("    lastNameTabs: ").append(toIndentedString(lastNameTabs)).append("\n");
    sb.append("    signHereTabs: ").append(toIndentedString(signHereTabs)).append("\n");
    sb.append("    textTabs: ").append(toIndentedString(textTabs)).append("\n");
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

