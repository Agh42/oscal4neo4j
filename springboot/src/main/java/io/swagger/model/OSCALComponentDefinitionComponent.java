package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalComponentDefinitionDefinedComponent;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OSCALComponentDefinitionComponent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALComponentDefinitionComponent   {
  @JsonProperty("component")
  private AssemblyOscalComponentDefinitionDefinedComponent component = null;

  public OSCALComponentDefinitionComponent component(AssemblyOscalComponentDefinitionDefinedComponent component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalComponentDefinitionDefinedComponent getComponent() {
    return component;
  }

  public void setComponent(AssemblyOscalComponentDefinitionDefinedComponent component) {
    this.component = component;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALComponentDefinitionComponent osCALComponentDefinitionComponent = (OSCALComponentDefinitionComponent) o;
    return Objects.equals(this.component, osCALComponentDefinitionComponent.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALComponentDefinitionComponent {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
