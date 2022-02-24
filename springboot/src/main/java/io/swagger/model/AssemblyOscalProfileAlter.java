package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalProfileAdd;
import io.swagger.model.AssemblyOscalProfileRemove;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An Alter element specifies changes to be made to an included control when a profile is resolved.
 */
@Schema(description = "An Alter element specifies changes to be made to an included control when a profile is resolved.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileAlter   {
  @JsonProperty("control-id")
  private String controlId = null;

  @JsonProperty("removes")
  @Valid
  private List<AssemblyOscalProfileRemove> removes = null;

  @JsonProperty("adds")
  @Valid
  private List<AssemblyOscalProfileAdd> adds = null;

  public AssemblyOscalProfileAlter controlId(String controlId) {
    this.controlId = controlId;
    return this;
  }

  /**
   * A reference to a control with a corresponding id value.
   * @return controlId
   **/
  @Schema(description = "A reference to a control with a corresponding id value.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getControlId() {
    return controlId;
  }

  public void setControlId(String controlId) {
    this.controlId = controlId;
  }

  public AssemblyOscalProfileAlter removes(List<AssemblyOscalProfileRemove> removes) {
    this.removes = removes;
    return this;
  }

  public AssemblyOscalProfileAlter addRemovesItem(AssemblyOscalProfileRemove removesItem) {
    if (this.removes == null) {
      this.removes = new ArrayList<AssemblyOscalProfileRemove>();
    }
    this.removes.add(removesItem);
    return this;
  }

  /**
   * Get removes
   * @return removes
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileRemove> getRemoves() {
    return removes;
  }

  public void setRemoves(List<AssemblyOscalProfileRemove> removes) {
    this.removes = removes;
  }

  public AssemblyOscalProfileAlter adds(List<AssemblyOscalProfileAdd> adds) {
    this.adds = adds;
    return this;
  }

  public AssemblyOscalProfileAlter addAddsItem(AssemblyOscalProfileAdd addsItem) {
    if (this.adds == null) {
      this.adds = new ArrayList<AssemblyOscalProfileAdd>();
    }
    this.adds.add(addsItem);
    return this;
  }

  /**
   * Get adds
   * @return adds
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileAdd> getAdds() {
    return adds;
  }

  public void setAdds(List<AssemblyOscalProfileAdd> adds) {
    this.adds = adds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileAlter assemblyOscalProfileAlter = (AssemblyOscalProfileAlter) o;
    return Objects.equals(this.controlId, assemblyOscalProfileAlter.controlId) &&
        Objects.equals(this.removes, assemblyOscalProfileAlter.removes) &&
        Objects.equals(this.adds, assemblyOscalProfileAlter.adds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlId, removes, adds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileAlter {\n");
    
    sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
    sb.append("    removes: ").append(toIndentedString(removes)).append("\n");
    sb.append("    adds: ").append(toIndentedString(adds)).append("\n");
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
