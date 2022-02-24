package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A document identifier qualified by an identifier scheme. A document identifier provides a globally unique identifier for a group of documents that are to be treated as different versions of the same document. If this element does not appear, or if the value of this element is empty, the value of \&quot;document-id\&quot; is equal to the value of the \&quot;uuid\&quot; flag of the top-level root element.
 */
@Schema(description = "A document identifier qualified by an identifier scheme. A document identifier provides a globally unique identifier for a group of documents that are to be treated as different versions of the same document. If this element does not appear, or if the value of this element is empty, the value of \"document-id\" is equal to the value of the \"uuid\" flag of the top-level root element.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class FieldOscalMetadataDocumentId   {
  @JsonProperty("scheme")
  private String scheme = null;

  @JsonProperty("identifier")
  private String identifier = null;

  public FieldOscalMetadataDocumentId scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Qualifies the kind of document identifier using a URI. If the scheme is not provided the value of the element will be interpreted as a string of characters.
   * @return scheme
   **/
  @Schema(description = "Qualifies the kind of document identifier using a URI. If the scheme is not provided the value of the element will be interpreted as a string of characters.")
  
    public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public FieldOscalMetadataDocumentId identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldOscalMetadataDocumentId fieldOscalMetadataDocumentId = (FieldOscalMetadataDocumentId) o;
    return Objects.equals(this.scheme, fieldOscalMetadataDocumentId.scheme) &&
        Objects.equals(this.identifier, fieldOscalMetadataDocumentId.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldOscalMetadataDocumentId {\n");
    
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
