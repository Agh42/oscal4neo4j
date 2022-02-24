package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalComponentDefinitionComponentDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OSCALComponentDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALComponentDefinition   {
  @JsonProperty("component-definition")
  private AssemblyOscalComponentDefinitionComponentDefinition componentDefinition = null;

  public OSCALComponentDefinition componentDefinition(AssemblyOscalComponentDefinitionComponentDefinition componentDefinition) {
    this.componentDefinition = componentDefinition;
    return this;
  }

  /**
   * Get componentDefinition
   * @return componentDefinition
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalComponentDefinitionComponentDefinition getComponentDefinition() {
    return componentDefinition;
  }

  public void setComponentDefinition(AssemblyOscalComponentDefinitionComponentDefinition componentDefinition) {
    this.componentDefinition = componentDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALComponentDefinition osCALComponentDefinition = (OSCALComponentDefinition) o;
    return Objects.equals(this.componentDefinition, osCALComponentDefinition.componentDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALComponentDefinition {\n");
    
    sb.append("    componentDefinition: ").append(toIndentedString(componentDefinition)).append("\n");
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
