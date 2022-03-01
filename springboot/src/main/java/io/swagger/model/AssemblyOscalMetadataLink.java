package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A reference to a local or remote resource
 */
@Schema(description = "A reference to a local or remote resource")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataLink   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("media-type")
  private String mediaType = null;

  @JsonProperty("text")
  private String text = null;

  public AssemblyOscalMetadataLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A resolvable URL reference to a resource.
   * @return href
   **/
  @Schema(required = true, description = "A resolvable URL reference to a resource.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AssemblyOscalMetadataLink rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Describes the type of relationship provided by the link. This can be an indicator of the link's purpose.
   * @return rel
   **/
  @Schema(description = "Describes the type of relationship provided by the link. This can be an indicator of the link's purpose.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public AssemblyOscalMetadataLink mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA) Media Types Registry.
   * @return mediaType
   **/
  @Schema(description = "Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA) Media Types Registry.")
  
  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AssemblyOscalMetadataLink text(String text) {
    this.text = text;
    return this;
  }

  /**
   * A textual label to associate with the link, which may be used for presentation in a tool.
   * @return text
   **/
  @Schema(description = "A textual label to associate with the link, which may be used for presentation in a tool.")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalMetadataLink assemblyOscalMetadataLink = (AssemblyOscalMetadataLink) o;
    return Objects.equals(this.href, assemblyOscalMetadataLink.href) &&
        Objects.equals(this.rel, assemblyOscalMetadataLink.rel) &&
        Objects.equals(this.mediaType, assemblyOscalMetadataLink.mediaType) &&
        Objects.equals(this.text, assemblyOscalMetadataLink.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, mediaType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataLink {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
