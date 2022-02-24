package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalComponentDefinitionControlImplementation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OSCALComponentDefinitionComponentControlImplementation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALComponentDefinitionComponentControlImplementation   {
  @JsonProperty("control-implementation")
  private AssemblyOscalComponentDefinitionControlImplementation controlImplementation = null;

  public OSCALComponentDefinitionComponentControlImplementation controlImplementation(AssemblyOscalComponentDefinitionControlImplementation controlImplementation) {
    this.controlImplementation = controlImplementation;
    return this;
  }

  /**
   * Get controlImplementation
   * @return controlImplementation
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalComponentDefinitionControlImplementation getControlImplementation() {
    return controlImplementation;
  }

  public void setControlImplementation(AssemblyOscalComponentDefinitionControlImplementation controlImplementation) {
    this.controlImplementation = controlImplementation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALComponentDefinitionComponentControlImplementation osCALComponentDefinitionComponentControlImplementation = (OSCALComponentDefinitionComponentControlImplementation) o;
    return Objects.equals(this.controlImplementation, osCALComponentDefinitionComponentControlImplementation.controlImplementation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlImplementation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALComponentDefinitionComponentControlImplementation {\n");
    
    sb.append("    controlImplementation: ").append(toIndentedString(controlImplementation)).append("\n");
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