package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TBD
 */
@Schema(description = "TBD")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalComponentDefinitionIncorporatesComponent   {
  @JsonProperty("component-uuid")
  private String componentUuid = null;

  @JsonProperty("description")
  private String description = null;

  public AssemblyOscalComponentDefinitionIncorporatesComponent componentUuid(String componentUuid) {
    this.componentUuid = componentUuid;
    return this;
  }

  /**
   * A reference to a component by its identifier
   * @return componentUuid
   **/
  @Schema(required = true, description = "A reference to a component by its identifier")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getComponentUuid() {
    return componentUuid;
  }

  public void setComponentUuid(String componentUuid) {
    this.componentUuid = componentUuid;
  }

  public AssemblyOscalComponentDefinitionIncorporatesComponent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the component, including information about its function.
   * @return description
   **/
  @Schema(required = true, description = "A description of the component, including information about its function.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalComponentDefinitionIncorporatesComponent assemblyOscalComponentDefinitionIncorporatesComponent = (AssemblyOscalComponentDefinitionIncorporatesComponent) o;
    return Objects.equals(this.componentUuid, assemblyOscalComponentDefinitionIncorporatesComponent.componentUuid) &&
        Objects.equals(this.description, assemblyOscalComponentDefinitionIncorporatesComponent.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentUuid, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionIncorporatesComponent {\n");
    
    sb.append("    componentUuid: ").append(toIndentedString(componentUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
