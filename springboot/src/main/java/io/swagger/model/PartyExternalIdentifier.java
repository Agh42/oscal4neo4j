package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An identifier for a person or organization using a designated scheme. e.g. an Open Researcher and Contributor ID (ORCID)
 */
@Schema(description = "An identifier for a person or organization using a designated scheme. e.g. an Open Researcher and Contributor ID (ORCID)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class PartyExternalIdentifier   {
  @JsonProperty("scheme")
  private String scheme = null;

  @JsonProperty("id")
  private String id = null;

  public PartyExternalIdentifier scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Indicates the type of external identifier.
   * @return scheme
   **/
  @Schema(required = true, description = "Indicates the type of external identifier.")
      @NotNull

    public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public PartyExternalIdentifier id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyExternalIdentifier partyExternalIdentifier = (PartyExternalIdentifier) o;
    return Objects.equals(this.scheme, partyExternalIdentifier.scheme) &&
        Objects.equals(this.id, partyExternalIdentifier.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyExternalIdentifier {\n");
    
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
