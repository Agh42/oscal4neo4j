package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalProfileCombine;
import io.swagger.model.AssemblyOscalProfileCustom;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Merge element merges controls in resolution.
 */
@Schema(description = "A Merge element merges controls in resolution.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileMerge   {
  @JsonProperty("combine")
  private AssemblyOscalProfileCombine combine = null;

  @JsonProperty("as-is")
  private Boolean asIs = null;

  @JsonProperty("custom")
  private AssemblyOscalProfileCustom custom = null;

  public AssemblyOscalProfileMerge combine(AssemblyOscalProfileCombine combine) {
    this.combine = combine;
    return this;
  }

  /**
   * Get combine
   * @return combine
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalProfileCombine getCombine() {
    return combine;
  }

  public void setCombine(AssemblyOscalProfileCombine combine) {
    this.combine = combine;
  }

  public AssemblyOscalProfileMerge asIs(Boolean asIs) {
    this.asIs = asIs;
    return this;
  }

  /**
   * An As-is element indicates that the controls should be structured in resolution as they are structured in their source catalogs. It does not contain any elements or attributes.
   * @return asIs
   **/
  @Schema(description = "An As-is element indicates that the controls should be structured in resolution as they are structured in their source catalogs. It does not contain any elements or attributes.")
  
    public Boolean isAsIs() {
    return asIs;
  }

  public void setAsIs(Boolean asIs) {
    this.asIs = asIs;
  }

  public AssemblyOscalProfileMerge custom(AssemblyOscalProfileCustom custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalProfileCustom getCustom() {
    return custom;
  }

  public void setCustom(AssemblyOscalProfileCustom custom) {
    this.custom = custom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileMerge assemblyOscalProfileMerge = (AssemblyOscalProfileMerge) o;
    return Objects.equals(this.combine, assemblyOscalProfileMerge.combine) &&
        Objects.equals(this.asIs, assemblyOscalProfileMerge.asIs) &&
        Objects.equals(this.custom, assemblyOscalProfileMerge.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combine, asIs, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileMerge {\n");
    
    sb.append("    combine: ").append(toIndentedString(combine)).append("\n");
    sb.append("    asIs: ").append(toIndentedString(asIs)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
