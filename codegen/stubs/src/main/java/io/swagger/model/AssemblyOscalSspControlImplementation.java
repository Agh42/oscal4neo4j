package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalImplementationCommonSetParameter1;
import io.swagger.model.AssemblyOscalSspImplementedRequirement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes how the system satisfies a set of controls.
 */
@Schema(description = "Describes how the system satisfies a set of controls.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspControlImplementation   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("set-parameters")
  @Valid
  private List<AssemblyOscalImplementationCommonSetParameter1> setParameters = null;

  @JsonProperty("implemented-requirements")
  @Valid
  private List<AssemblyOscalSspImplementedRequirement> implementedRequirements = new ArrayList<AssemblyOscalSspImplementedRequirement>();

  public AssemblyOscalSspControlImplementation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A statement describing important things to know about how this set of control satisfaction documentation is approached.
   * @return description
   **/
  @Schema(required = true, description = "A statement describing important things to know about how this set of control satisfaction documentation is approached.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalSspControlImplementation setParameters(List<AssemblyOscalImplementationCommonSetParameter1> setParameters) {
    this.setParameters = setParameters;
    return this;
  }

  public AssemblyOscalSspControlImplementation addSetParametersItem(AssemblyOscalImplementationCommonSetParameter1 setParametersItem) {
    if (this.setParameters == null) {
      this.setParameters = new ArrayList<AssemblyOscalImplementationCommonSetParameter1>();
    }
    this.setParameters.add(setParametersItem);
    return this;
  }

  /**
   * Get setParameters
   * @return setParameters
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonSetParameter1> getSetParameters() {
    return setParameters;
  }

  public void setSetParameters(List<AssemblyOscalImplementationCommonSetParameter1> setParameters) {
    this.setParameters = setParameters;
  }

  public AssemblyOscalSspControlImplementation implementedRequirements(List<AssemblyOscalSspImplementedRequirement> implementedRequirements) {
    this.implementedRequirements = implementedRequirements;
    return this;
  }

  public AssemblyOscalSspControlImplementation addImplementedRequirementsItem(AssemblyOscalSspImplementedRequirement implementedRequirementsItem) {
    this.implementedRequirements.add(implementedRequirementsItem);
    return this;
  }

  /**
   * Get implementedRequirements
   * @return implementedRequirements
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<AssemblyOscalSspImplementedRequirement> getImplementedRequirements() {
    return implementedRequirements;
  }

  public void setImplementedRequirements(List<AssemblyOscalSspImplementedRequirement> implementedRequirements) {
    this.implementedRequirements = implementedRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalSspControlImplementation assemblyOscalSspControlImplementation = (AssemblyOscalSspControlImplementation) o;
    return Objects.equals(this.description, assemblyOscalSspControlImplementation.description) &&
        Objects.equals(this.setParameters, assemblyOscalSspControlImplementation.setParameters) &&
        Objects.equals(this.implementedRequirements, assemblyOscalSspControlImplementation.implementedRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, setParameters, implementedRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspControlImplementation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    setParameters: ").append(toIndentedString(setParameters)).append("\n");
    sb.append("    implementedRequirements: ").append(toIndentedString(implementedRequirements)).append("\n");
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
