package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A unique identifier for the system described by this system security plan.
 */
@Schema(description = "A unique identifier for the system described by this system security plan.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class FieldOscalImplementationCommonSystemId   {
  @JsonProperty("identifier-type")
  private String identifierType = null;

  @JsonProperty("id")
  private String id = null;

  public FieldOscalImplementationCommonSystemId identifierType(String identifierType) {
    this.identifierType = identifierType;
    return this;
  }

  /**
   * Identifies the identification system from which the provided identifier was assigned.
   * @return identifierType
   **/
  @Schema(description = "Identifies the identification system from which the provided identifier was assigned.")
  
    public String getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }

  public FieldOscalImplementationCommonSystemId id(String id) {
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
    FieldOscalImplementationCommonSystemId fieldOscalImplementationCommonSystemId = (FieldOscalImplementationCommonSystemId) o;
    return Objects.equals(this.identifierType, fieldOscalImplementationCommonSystemId.identifierType) &&
        Objects.equals(this.id, fieldOscalImplementationCommonSystemId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldOscalImplementationCommonSystemId {\n");
    
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
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
