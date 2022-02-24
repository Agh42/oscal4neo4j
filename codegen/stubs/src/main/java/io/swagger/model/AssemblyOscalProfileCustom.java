package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalProfileGroup;
import io.swagger.model.AssemblyOscalProfileInsertControls;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Custom element frames a structure for embedding represented controls in resolution.
 */
@Schema(description = "A Custom element frames a structure for embedding represented controls in resolution.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileCustom   {
  @JsonProperty("groups")
  @Valid
  private List<AssemblyOscalProfileGroup> groups = null;

  @JsonProperty("insert-controls")
  @Valid
  private List<AssemblyOscalProfileInsertControls> insertControls = null;

  public AssemblyOscalProfileCustom groups(List<AssemblyOscalProfileGroup> groups) {
    this.groups = groups;
    return this;
  }

  public AssemblyOscalProfileCustom addGroupsItem(AssemblyOscalProfileGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<AssemblyOscalProfileGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<AssemblyOscalProfileGroup> groups) {
    this.groups = groups;
  }

  public AssemblyOscalProfileCustom insertControls(List<AssemblyOscalProfileInsertControls> insertControls) {
    this.insertControls = insertControls;
    return this;
  }

  public AssemblyOscalProfileCustom addInsertControlsItem(AssemblyOscalProfileInsertControls insertControlsItem) {
    if (this.insertControls == null) {
      this.insertControls = new ArrayList<AssemblyOscalProfileInsertControls>();
    }
    this.insertControls.add(insertControlsItem);
    return this;
  }

  /**
   * Get insertControls
   * @return insertControls
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileInsertControls> getInsertControls() {
    return insertControls;
  }

  public void setInsertControls(List<AssemblyOscalProfileInsertControls> insertControls) {
    this.insertControls = insertControls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileCustom assemblyOscalProfileCustom = (AssemblyOscalProfileCustom) o;
    return Objects.equals(this.groups, assemblyOscalProfileCustom.groups) &&
        Objects.equals(this.insertControls, assemblyOscalProfileCustom.insertControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, insertControls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileCustom {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    insertControls: ").append(toIndentedString(insertControls)).append("\n");
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
