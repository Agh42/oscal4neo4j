package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FieldOscalMetadataHash;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A pointer to an external resource with an optional hash for verification and change detection.
 */
@Schema(description = "A pointer to an external resource with an optional hash for verification and change detection.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class ResourceLink   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("media-type")
  private String mediaType = null;

  @JsonProperty("hashes")
  @Valid
  private List<FieldOscalMetadataHash> hashes = null;

  public ResourceLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A resolvable URI reference to a resource.
   * @return href
   **/
  @Schema(required = true, description = "A resolvable URI reference to a resource.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ResourceLink mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA) Media Types Registry.
   * @return mediaType
   **/
  @Schema(description = "Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA) Media Types Registry.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public ResourceLink hashes(List<FieldOscalMetadataHash> hashes) {
    this.hashes = hashes;
    return this;
  }

  public ResourceLink addHashesItem(FieldOscalMetadataHash hashesItem) {
    if (this.hashes == null) {
      this.hashes = new ArrayList<FieldOscalMetadataHash>();
    }
    this.hashes.add(hashesItem);
    return this;
  }

  /**
   * Get hashes
   * @return hashes
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<FieldOscalMetadataHash> getHashes() {
    return hashes;
  }

  public void setHashes(List<FieldOscalMetadataHash> hashes) {
    this.hashes = hashes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceLink resourceLink = (ResourceLink) o;
    return Objects.equals(this.href, resourceLink.href) &&
        Objects.equals(this.mediaType, resourceLink.mediaType) &&
        Objects.equals(this.hashes, resourceLink.hashes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, mediaType, hashes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLink {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    hashes: ").append(toIndentedString(hashes)).append("\n");
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
