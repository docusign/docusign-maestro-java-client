package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWebFormsStepConfig.
 *
 */

public class DSWebFormsStepConfig {
  @JsonProperty("pageUrl")
  private String pageUrl = null;


  /**
   * pageUrl.
   *
   * @return DSWebFormsStepConfig
   **/
  public DSWebFormsStepConfig pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl.
   * @return pageUrl
   **/
  @Schema(required = true, description = "")
  public String getPageUrl() {
    return pageUrl;
  }

  /**
   * setPageUrl.
   **/
  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
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
    DSWebFormsStepConfig dsWebFormsStepConfig = (DSWebFormsStepConfig) o;
    return Objects.equals(this.pageUrl, dsWebFormsStepConfig.pageUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(pageUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWebFormsStepConfig {\n");
    
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
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

