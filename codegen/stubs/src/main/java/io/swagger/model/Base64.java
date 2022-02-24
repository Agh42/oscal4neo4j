package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Base64 alphabet in RFC 2045 - aligned with XSD.
 */
@Schema(description = "The Base64 alphabet in RFC 2045 - aligned with XSD.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class Base64   {
  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("media-type")
  private String mediaType = null;

  @JsonProperty("value")
  private String value = null;

  public Base64 filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Name of the file before it was encoded as Base64 to be embedded in a resource. This is the name that will be assigned to the file when the file is decoded.
   * @return filename
   **/
  @Schema(description = "Name of the file before it was encoded as Base64 to be embedded in a resource. This is the name that will be assigned to the file when the file is decoded.")
  
    public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Base64 mediaType(String mediaType) {
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

  public Base64 value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64 base64 = (Base64) o;
    return Objects.equals(this.filename, base64.filename) &&
        Objects.equals(this.mediaType, base64.mediaType) &&
        Objects.equals(this.value, base64.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, mediaType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64 {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
