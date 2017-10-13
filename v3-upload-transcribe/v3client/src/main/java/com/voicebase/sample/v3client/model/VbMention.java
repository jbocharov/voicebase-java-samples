/*
 * Voicebase V3 API
 * APIs for speech recognition and speech analytics, powering insights every business needs.
 *
 * OpenAPI spec version: 3.0.1
 * Contact: support@voicebase.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.voicebase.sample.v3client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.voicebase.sample.v3client.model.ArrayList;
import com.voicebase.sample.v3client.model.VbOccurrence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbMention
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbMention {
  @JsonProperty("speakerName")
  private String speakerName = null;

  @JsonProperty("occurrences")
  private java.util.List<VbOccurrence> occurrences = new java.util.ArrayList<VbOccurrence>();

  public VbMention speakerName(String speakerName) {
    this.speakerName = speakerName;
    return this;
  }

   /**
   * Get speakerName
   * @return speakerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSpeakerName() {
    return speakerName;
  }

  public void setSpeakerName(String speakerName) {
    this.speakerName = speakerName;
  }

  public VbMention occurrences(java.util.List<VbOccurrence> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  public VbMention addOccurrencesItem(VbOccurrence occurrencesItem) {
    this.occurrences.add(occurrencesItem);
    return this;
  }

   /**
   * Get occurrences
   * @return occurrences
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbOccurrence> getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(java.util.List<VbOccurrence> occurrences) {
    this.occurrences = occurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbMention vbMention = (VbMention) o;
    return Objects.equals(this.speakerName, vbMention.speakerName) &&
        Objects.equals(this.occurrences, vbMention.occurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakerName, occurrences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbMention {\n");
    
    sb.append("    speakerName: ").append(toIndentedString(speakerName)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
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
