package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalCatalogCommonParameter;
import io.swagger.model.AssemblyOscalCatalogControl;
import io.swagger.model.AssemblyOscalCatalogGroup;
import io.swagger.model.AssemblyOscalMetadataBackMatter;
import io.swagger.model.AssemblyOscalMetadataMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collection of controls.
 */
@Schema(description = "A collection of controls.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogCatalog   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("metadata")
  private AssemblyOscalMetadataMetadata metadata = null;

  @JsonProperty("params")
  @Valid
  private List<AssemblyOscalCatalogCommonParameter> params = null;

  @JsonProperty("controls")
  @Valid
  private List<AssemblyOscalCatalogControl> controls = null;

  @JsonProperty("groups")
  @Valid
  private List<AssemblyOscalCatalogGroup> groups = null;

  @JsonProperty("back-matter")
  private AssemblyOscalMetadataBackMatter backMatter = null;

  public AssemblyOscalCatalogCatalog uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier for this catalog instance. This UUID should be changed when this document is revised.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier for this catalog instance. This UUID should be changed when this document is revised.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalCatalogCatalog metadata(AssemblyOscalMetadataMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalMetadataMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(AssemblyOscalMetadataMetadata metadata) {
    this.metadata = metadata;
  }

  public AssemblyOscalCatalogCatalog params(List<AssemblyOscalCatalogCommonParameter> params) {
    this.params = params;
    return this;
  }

  public AssemblyOscalCatalogCatalog addParamsItem(AssemblyOscalCatalogCommonParameter paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<AssemblyOscalCatalogCommonParameter>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogCommonParameter> getParams() {
    return params;
  }

  public void setParams(List<AssemblyOscalCatalogCommonParameter> params) {
    this.params = params;
  }

  public AssemblyOscalCatalogCatalog controls(List<AssemblyOscalCatalogControl> controls) {
    this.controls = controls;
    return this;
  }

  public AssemblyOscalCatalogCatalog addControlsItem(AssemblyOscalCatalogControl controlsItem) {
    if (this.controls == null) {
      this.controls = new ArrayList<AssemblyOscalCatalogControl>();
    }
    this.controls.add(controlsItem);
    return this;
  }

  /**
   * Get controls
   * @return controls
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogControl> getControls() {
    return controls;
  }

  public void setControls(List<AssemblyOscalCatalogControl> controls) {
    this.controls = controls;
  }

  public AssemblyOscalCatalogCatalog groups(List<AssemblyOscalCatalogGroup> groups) {
    this.groups = groups;
    return this;
  }

  public AssemblyOscalCatalogCatalog addGroupsItem(AssemblyOscalCatalogGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<AssemblyOscalCatalogGroup>();
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
  @Size(min=1)   public List<AssemblyOscalCatalogGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<AssemblyOscalCatalogGroup> groups) {
    this.groups = groups;
  }

  public AssemblyOscalCatalogCatalog backMatter(AssemblyOscalMetadataBackMatter backMatter) {
    this.backMatter = backMatter;
    return this;
  }

  /**
   * Get backMatter
   * @return backMatter
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalMetadataBackMatter getBackMatter() {
    return backMatter;
  }

  public void setBackMatter(AssemblyOscalMetadataBackMatter backMatter) {
    this.backMatter = backMatter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalCatalogCatalog assemblyOscalCatalogCatalog = (AssemblyOscalCatalogCatalog) o;
    return Objects.equals(this.uuid, assemblyOscalCatalogCatalog.uuid) &&
        Objects.equals(this.metadata, assemblyOscalCatalogCatalog.metadata) &&
        Objects.equals(this.params, assemblyOscalCatalogCatalog.params) &&
        Objects.equals(this.controls, assemblyOscalCatalogCatalog.controls) &&
        Objects.equals(this.groups, assemblyOscalCatalogCatalog.groups) &&
        Objects.equals(this.backMatter, assemblyOscalCatalogCatalog.backMatter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, metadata, params, controls, groups, backMatter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogCatalog {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    backMatter: ").append(toIndentedString(backMatter)).append("\n");
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
