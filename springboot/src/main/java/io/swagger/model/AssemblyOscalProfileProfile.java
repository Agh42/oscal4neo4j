package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataBackMatter1;
import io.swagger.model.AssemblyOscalMetadataMetadata1;
import io.swagger.model.AssemblyOscalProfileImport;
import io.swagger.model.AssemblyOscalProfileMerge;
import io.swagger.model.AssemblyOscalProfileModify;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Each OSCAL profile is defined by a Profile element
 */
@Schema(description = "Each OSCAL profile is defined by a Profile element")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileProfile   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("metadata")
  private AssemblyOscalMetadataMetadata1 metadata = null;

  @JsonProperty("imports")
  @Valid
  private List<AssemblyOscalProfileImport> imports = new ArrayList<AssemblyOscalProfileImport>();

  @JsonProperty("merge")
  private AssemblyOscalProfileMerge merge = null;

  @JsonProperty("modify")
  private AssemblyOscalProfileModify modify = null;

  @JsonProperty("back-matter")
  private AssemblyOscalMetadataBackMatter1 backMatter = null;

  public AssemblyOscalProfileProfile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier for this profile instance. This UUID should be changed when this document is revised.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier for this profile instance. This UUID should be changed when this document is revised.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalProfileProfile metadata(AssemblyOscalMetadataMetadata1 metadata) {
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
    public AssemblyOscalMetadataMetadata1 getMetadata() {
    return metadata;
  }

  public void setMetadata(AssemblyOscalMetadataMetadata1 metadata) {
    this.metadata = metadata;
  }

  public AssemblyOscalProfileProfile imports(List<AssemblyOscalProfileImport> imports) {
    this.imports = imports;
    return this;
  }

  public AssemblyOscalProfileProfile addImportsItem(AssemblyOscalProfileImport importsItem) {
    this.imports.add(importsItem);
    return this;
  }

  /**
   * Get imports
   * @return imports
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<AssemblyOscalProfileImport> getImports() {
    return imports;
  }

  public void setImports(List<AssemblyOscalProfileImport> imports) {
    this.imports = imports;
  }

  public AssemblyOscalProfileProfile merge(AssemblyOscalProfileMerge merge) {
    this.merge = merge;
    return this;
  }

  /**
   * Get merge
   * @return merge
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalProfileMerge getMerge() {
    return merge;
  }

  public void setMerge(AssemblyOscalProfileMerge merge) {
    this.merge = merge;
  }

  public AssemblyOscalProfileProfile modify(AssemblyOscalProfileModify modify) {
    this.modify = modify;
    return this;
  }

  /**
   * Get modify
   * @return modify
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalProfileModify getModify() {
    return modify;
  }

  public void setModify(AssemblyOscalProfileModify modify) {
    this.modify = modify;
  }

  public AssemblyOscalProfileProfile backMatter(AssemblyOscalMetadataBackMatter1 backMatter) {
    this.backMatter = backMatter;
    return this;
  }

  /**
   * Get backMatter
   * @return backMatter
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalMetadataBackMatter1 getBackMatter() {
    return backMatter;
  }

  public void setBackMatter(AssemblyOscalMetadataBackMatter1 backMatter) {
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
    AssemblyOscalProfileProfile assemblyOscalProfileProfile = (AssemblyOscalProfileProfile) o;
    return Objects.equals(this.uuid, assemblyOscalProfileProfile.uuid) &&
        Objects.equals(this.metadata, assemblyOscalProfileProfile.metadata) &&
        Objects.equals(this.imports, assemblyOscalProfileProfile.imports) &&
        Objects.equals(this.merge, assemblyOscalProfileProfile.merge) &&
        Objects.equals(this.modify, assemblyOscalProfileProfile.modify) &&
        Objects.equals(this.backMatter, assemblyOscalProfileProfile.backMatter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, metadata, imports, merge, modify, backMatter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileProfile {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    imports: ").append(toIndentedString(imports)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
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
