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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * VbKeyConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbKeyConfiguration {
  @JsonProperty("ttlMillis")
  private Long ttlMillis = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("ephemeral")
  private Boolean ephemeral = null;

  @JsonProperty("scope")
  private String scope = null;

  public VbKeyConfiguration ttlMillis(Long ttlMillis) {
    this.ttlMillis = ttlMillis;
    return this;
  }

   /**
   * Number of milliseconds that the key must be valid for
   * @return ttlMillis
  **/
  @ApiModelProperty(example = "null", value = "Number of milliseconds that the key must be valid for")
  public Long getTtlMillis() {
    return ttlMillis;
  }

  public void setTtlMillis(Long ttlMillis) {
    this.ttlMillis = ttlMillis;
  }

  public VbKeyConfiguration expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date expressed in ISO-8601 format
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "Expiration date expressed in ISO-8601 format")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public VbKeyConfiguration ephemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Get ephemeral
   * @return ephemeral
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEphemeral() {
    return ephemeral;
  }

  public void setEphemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
  }

  public VbKeyConfiguration scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Restriction of the scope of the token in the form of media:get?extendedFilter=speakers:agent
   * @return scope
  **/
  @ApiModelProperty(example = "null", value = "Restriction of the scope of the token in the form of media:get?extendedFilter=speakers:agent")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbKeyConfiguration vbKeyConfiguration = (VbKeyConfiguration) o;
    return Objects.equals(this.ttlMillis, vbKeyConfiguration.ttlMillis) &&
        Objects.equals(this.expirationDate, vbKeyConfiguration.expirationDate) &&
        Objects.equals(this.ephemeral, vbKeyConfiguration.ephemeral) &&
        Objects.equals(this.scope, vbKeyConfiguration.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttlMillis, expirationDate, ephemeral, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbKeyConfiguration {\n");
    
    sb.append("    ttlMillis: ").append(toIndentedString(ttlMillis)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

