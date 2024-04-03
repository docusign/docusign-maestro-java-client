package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ESignTabs.
 *
 */

public class ESignTabs {
  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("italic")
  private String italic = null;

  @JsonProperty("localePolicy")
  private java.util.Map<String, Object> localePolicy = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private String optional = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("scaleValue")
  private String scaleValue = null;

  @JsonProperty("stampType")
  private String stampType = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("tabType")
  private String tabType = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("underline")
  private String underline = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("yPosition")
  private String yPosition = null;


  /**
   * anchorString.
   *
   * @return ESignTabs
   **/
  public ESignTabs anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Get anchorString.
   * @return anchorString
   **/
  @Schema(description = "")
  public String getAnchorString() {
    return anchorString;
  }

  /**
   * setAnchorString.
   **/
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }


  /**
   * bold.
   *
   * @return ESignTabs
   **/
  public ESignTabs bold(String bold) {
    this.bold = bold;
    return this;
  }

  /**
   * Get bold.
   * @return bold
   **/
  @Schema(description = "")
  public String getBold() {
    return bold;
  }

  /**
   * setBold.
   **/
  public void setBold(String bold) {
    this.bold = bold;
  }


  /**
   * documentId.
   *
   * @return ESignTabs
   **/
  public ESignTabs documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId.
   * @return documentId
   **/
  @Schema(description = "")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * font.
   *
   * @return ESignTabs
   **/
  public ESignTabs font(String font) {
    this.font = font;
    return this;
  }

  /**
   * Get font.
   * @return font
   **/
  @Schema(description = "")
  public String getFont() {
    return font;
  }

  /**
   * setFont.
   **/
  public void setFont(String font) {
    this.font = font;
  }


  /**
   * fontColor.
   *
   * @return ESignTabs
   **/
  public ESignTabs fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * Get fontColor.
   * @return fontColor
   **/
  @Schema(description = "")
  public String getFontColor() {
    return fontColor;
  }

  /**
   * setFontColor.
   **/
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }


  /**
   * fontSize.
   *
   * @return ESignTabs
   **/
  public ESignTabs fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Get fontSize.
   * @return fontSize
   **/
  @Schema(description = "")
  public String getFontSize() {
    return fontSize;
  }

  /**
   * setFontSize.
   **/
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * height.
   *
   * @return ESignTabs
   **/
  public ESignTabs height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Get height.
   * @return height
   **/
  @Schema(description = "")
  public String getHeight() {
    return height;
  }

  /**
   * setHeight.
   **/
  public void setHeight(String height) {
    this.height = height;
  }


  /**
   * italic.
   *
   * @return ESignTabs
   **/
  public ESignTabs italic(String italic) {
    this.italic = italic;
    return this;
  }

  /**
   * Get italic.
   * @return italic
   **/
  @Schema(description = "")
  public String getItalic() {
    return italic;
  }

  /**
   * setItalic.
   **/
  public void setItalic(String italic) {
    this.italic = italic;
  }


  /**
   * localePolicy.
   *
   * @return ESignTabs
   **/
  public ESignTabs localePolicy(java.util.Map<String, Object> localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

  /**
   * putLocalePolicyItem.
   *
   * @return ESignTabs
   **/
  public ESignTabs putLocalePolicyItem(String key, Object localePolicyItem) {
    if (this.localePolicy == null) {
      this.localePolicy = new java.util.HashMap<>();
    }
    this.localePolicy.put(key, localePolicyItem);
    return this;
  }

  /**
   * Get localePolicy.
   * @return localePolicy
   **/
  @Schema(description = "")
  public java.util.Map<String, Object> getLocalePolicy() {
    return localePolicy;
  }

  /**
   * setLocalePolicy.
   **/
  public void setLocalePolicy(java.util.Map<String, Object> localePolicy) {
    this.localePolicy = localePolicy;
  }


  /**
   * name.
   *
   * @return ESignTabs
   **/
  public ESignTabs name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * optional.
   *
   * @return ESignTabs
   **/
  public ESignTabs optional(String optional) {
    this.optional = optional;
    return this;
  }

  /**
   * Get optional.
   * @return optional
   **/
  @Schema(description = "")
  public String getOptional() {
    return optional;
  }

  /**
   * setOptional.
   **/
  public void setOptional(String optional) {
    this.optional = optional;
  }


  /**
   * pageNumber.
   *
   * @return ESignTabs
   **/
  public ESignTabs pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber.
   * @return pageNumber
   **/
  @Schema(description = "")
  public String getPageNumber() {
    return pageNumber;
  }

  /**
   * setPageNumber.
   **/
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * recipientId.
   *
   * @return ESignTabs
   **/
  public ESignTabs recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Get recipientId.
   * @return recipientId
   **/
  @Schema(description = "")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * scaleValue.
   *
   * @return ESignTabs
   **/
  public ESignTabs scaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
    return this;
  }

  /**
   * Get scaleValue.
   * @return scaleValue
   **/
  @Schema(description = "")
  public String getScaleValue() {
    return scaleValue;
  }

  /**
   * setScaleValue.
   **/
  public void setScaleValue(String scaleValue) {
    this.scaleValue = scaleValue;
  }


  /**
   * stampType.
   *
   * @return ESignTabs
   **/
  public ESignTabs stampType(String stampType) {
    this.stampType = stampType;
    return this;
  }

  /**
   * Get stampType.
   * @return stampType
   **/
  @Schema(description = "")
  public String getStampType() {
    return stampType;
  }

  /**
   * setStampType.
   **/
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }


  /**
   * tabId.
   *
   * @return ESignTabs
   **/
  public ESignTabs tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * Get tabId.
   * @return tabId
   **/
  @Schema(required = true, description = "")
  public String getTabId() {
    return tabId;
  }

  /**
   * setTabId.
   **/
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }


  /**
   * tabLabel.
   *
   * @return ESignTabs
   **/
  public ESignTabs tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * Get tabLabel.
   * @return tabLabel
   **/
  @Schema(description = "")
  public String getTabLabel() {
    return tabLabel;
  }

  /**
   * setTabLabel.
   **/
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }


  /**
   * tabType.
   *
   * @return ESignTabs
   **/
  public ESignTabs tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * Get tabType.
   * @return tabType
   **/
  @Schema(description = "")
  public String getTabType() {
    return tabType;
  }

  /**
   * setTabType.
   **/
  public void setTabType(String tabType) {
    this.tabType = tabType;
  }


  /**
   * templateLocked.
   *
   * @return ESignTabs
   **/
  public ESignTabs templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * Get templateLocked.
   * @return templateLocked
   **/
  @Schema(description = "")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }


  /**
   * templateRequired.
   *
   * @return ESignTabs
   **/
  public ESignTabs templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * Get templateRequired.
   * @return templateRequired
   **/
  @Schema(description = "")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }


  /**
   * tooltip.
   *
   * @return ESignTabs
   **/
  public ESignTabs tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * Get tooltip.
   * @return tooltip
   **/
  @Schema(description = "")
  public String getTooltip() {
    return tooltip;
  }

  /**
   * setTooltip.
   **/
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }


  /**
   * underline.
   *
   * @return ESignTabs
   **/
  public ESignTabs underline(String underline) {
    this.underline = underline;
    return this;
  }

  /**
   * Get underline.
   * @return underline
   **/
  @Schema(description = "")
  public String getUnderline() {
    return underline;
  }

  /**
   * setUnderline.
   **/
  public void setUnderline(String underline) {
    this.underline = underline;
  }


  /**
   * value.
   *
   * @return ESignTabs
   **/
  public ESignTabs value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return value
   **/
  @Schema(description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * width.
   *
   * @return ESignTabs
   **/
  public ESignTabs width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Get width.
   * @return width
   **/
  @Schema(description = "")
  public String getWidth() {
    return width;
  }

  /**
   * setWidth.
   **/
  public void setWidth(String width) {
    this.width = width;
  }


  /**
   * xPosition.
   *
   * @return ESignTabs
   **/
  public ESignTabs xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * Get xPosition.
   * @return xPosition
   **/
  @Schema(description = "")
  public String getXPosition() {
    return xPosition;
  }

  /**
   * setXPosition.
   **/
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }


  /**
   * yPosition.
   *
   * @return ESignTabs
   **/
  public ESignTabs yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * Get yPosition.
   * @return yPosition
   **/
  @Schema(description = "")
  public String getYPosition() {
    return yPosition;
  }

  /**
   * setYPosition.
   **/
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
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
    ESignTabs esignTabs = (ESignTabs) o;
    return Objects.equals(this.anchorString, esignTabs.anchorString) &&
        Objects.equals(this.bold, esignTabs.bold) &&
        Objects.equals(this.documentId, esignTabs.documentId) &&
        Objects.equals(this.font, esignTabs.font) &&
        Objects.equals(this.fontColor, esignTabs.fontColor) &&
        Objects.equals(this.fontSize, esignTabs.fontSize) &&
        Objects.equals(this.height, esignTabs.height) &&
        Objects.equals(this.italic, esignTabs.italic) &&
        Objects.equals(this.localePolicy, esignTabs.localePolicy) &&
        Objects.equals(this.name, esignTabs.name) &&
        Objects.equals(this.optional, esignTabs.optional) &&
        Objects.equals(this.pageNumber, esignTabs.pageNumber) &&
        Objects.equals(this.recipientId, esignTabs.recipientId) &&
        Objects.equals(this.scaleValue, esignTabs.scaleValue) &&
        Objects.equals(this.stampType, esignTabs.stampType) &&
        Objects.equals(this.tabId, esignTabs.tabId) &&
        Objects.equals(this.tabLabel, esignTabs.tabLabel) &&
        Objects.equals(this.tabType, esignTabs.tabType) &&
        Objects.equals(this.templateLocked, esignTabs.templateLocked) &&
        Objects.equals(this.templateRequired, esignTabs.templateRequired) &&
        Objects.equals(this.tooltip, esignTabs.tooltip) &&
        Objects.equals(this.underline, esignTabs.underline) &&
        Objects.equals(this.value, esignTabs.value) &&
        Objects.equals(this.width, esignTabs.width) &&
        Objects.equals(this.xPosition, esignTabs.xPosition) &&
        Objects.equals(this.yPosition, esignTabs.yPosition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchorString, bold, documentId, font, fontColor, fontSize, height, italic, localePolicy, name, optional, pageNumber, recipientId, scaleValue, stampType, tabId, tabLabel, tabType, templateLocked, templateRequired, tooltip, underline, value, width, xPosition, yPosition);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignTabs {\n");
    
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    localePolicy: ").append(toIndentedString(localePolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    scaleValue: ").append(toIndentedString(scaleValue)).append("\n");
    sb.append("    stampType: ").append(toIndentedString(stampType)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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

