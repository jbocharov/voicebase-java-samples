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
import com.voicebase.sample.v3client.model.VbTranscriptFormat;
import com.voicebase.sample.v3client.model.VbWord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbTranscript
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbTranscript {
  @JsonProperty("confidence")
  private Double confidence = null;

  @JsonProperty("words")
  private java.util.List<VbWord> words = new java.util.ArrayList<VbWord>();

  @JsonProperty("alternateFormats")
  private java.util.List<VbTranscriptFormat> alternateFormats = new java.util.ArrayList<VbTranscriptFormat>();

  public VbTranscript confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public VbTranscript words(java.util.List<VbWord> words) {
    this.words = words;
    return this;
  }

  public VbTranscript addWordsItem(VbWord wordsItem) {
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Get words
   * @return words
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbWord> getWords() {
    return words;
  }

  public void setWords(java.util.List<VbWord> words) {
    this.words = words;
  }

  public VbTranscript alternateFormats(java.util.List<VbTranscriptFormat> alternateFormats) {
    this.alternateFormats = alternateFormats;
    return this;
  }

  public VbTranscript addAlternateFormatsItem(VbTranscriptFormat alternateFormatsItem) {
    this.alternateFormats.add(alternateFormatsItem);
    return this;
  }

   /**
   * Get alternateFormats
   * @return alternateFormats
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbTranscriptFormat> getAlternateFormats() {
    return alternateFormats;
  }

  public void setAlternateFormats(java.util.List<VbTranscriptFormat> alternateFormats) {
    this.alternateFormats = alternateFormats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbTranscript vbTranscript = (VbTranscript) o;
    return Objects.equals(this.confidence, vbTranscript.confidence) &&
        Objects.equals(this.words, vbTranscript.words) &&
        Objects.equals(this.alternateFormats, vbTranscript.alternateFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, words, alternateFormats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbTranscript {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
    sb.append("    alternateFormats: ").append(toIndentedString(alternateFormats)).append("\n");
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
