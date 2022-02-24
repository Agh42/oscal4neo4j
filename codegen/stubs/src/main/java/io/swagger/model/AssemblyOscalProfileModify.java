package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalProfileAlter;
import io.swagger.model.ParameterSetting;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set parameters or amend controls in resolution
 */
@Schema(description = "Set parameters or amend controls in resolution")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileModify   {
  @JsonProperty("set-parameters")
  @Valid
  private List<ParameterSetting> setParameters = null;

  @JsonProperty("alters")
  @Valid
  private List<AssemblyOscalProfileAlter> alters = null;

  public AssemblyOscalProfileModify setParameters(List<ParameterSetting> setParameters) {
    this.setParameters = setParameters;
    return this;
  }

  public AssemblyOscalProfileModify addSetParametersItem(ParameterSetting setParametersItem) {
    if (this.setParameters == null) {
      this.setParameters = new ArrayList<ParameterSetting>();
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
  @Size(min=1)   public List<ParameterSetting> getSetParameters() {
    return setParameters;
  }

  public void setSetParameters(List<ParameterSetting> setParameters) {
    this.setParameters = setParameters;
  }

  public AssemblyOscalProfileModify alters(List<AssemblyOscalProfileAlter> alters) {
    this.alters = alters;
    return this;
  }

  public AssemblyOscalProfileModify addAltersItem(AssemblyOscalProfileAlter altersItem) {
    if (this.alters == null) {
      this.alters = new ArrayList<AssemblyOscalProfileAlter>();
    }
    this.alters.add(altersItem);
    return this;
  }

  /**
   * Get alters
   * @return alters
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileAlter> getAlters() {
    return alters;
  }

  public void setAlters(List<AssemblyOscalProfileAlter> alters) {
    this.alters = alters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileModify assemblyOscalProfileModify = (AssemblyOscalProfileModify) o;
    return Objects.equals(this.setParameters, assemblyOscalProfileModify.setParameters) &&
        Objects.equals(this.alters, assemblyOscalProfileModify.alters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setParameters, alters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileModify {\n");
    
    sb.append("    setParameters: ").append(toIndentedString(setParameters)).append("\n");
    sb.append("    alters: ").append(toIndentedString(alters)).append("\n");
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
