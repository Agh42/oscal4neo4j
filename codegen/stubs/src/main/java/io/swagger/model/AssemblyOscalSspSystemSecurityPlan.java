package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataBackMatter3;
import io.swagger.model.AssemblyOscalMetadataMetadata3;
import io.swagger.model.AssemblyOscalSspControlImplementation;
import io.swagger.model.AssemblyOscalSspImportProfile;
import io.swagger.model.AssemblyOscalSspSystemCharacteristics;
import io.swagger.model.AssemblyOscalSspSystemImplementation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A system security plan, such as those described in NIST SP 800-18
 */
@Schema(description = "A system security plan, such as those described in NIST SP 800-18")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspSystemSecurityPlan   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("metadata")
  private AssemblyOscalMetadataMetadata3 metadata = null;

  @JsonProperty("import-profile")
  private AssemblyOscalSspImportProfile importProfile = null;

  @JsonProperty("system-characteristics")
  private AssemblyOscalSspSystemCharacteristics systemCharacteristics = null;

  @JsonProperty("system-implementation")
  private AssemblyOscalSspSystemImplementation systemImplementation = null;

  @JsonProperty("control-implementation")
  private AssemblyOscalSspControlImplementation controlImplementation = null;

  @JsonProperty("back-matter")
  private AssemblyOscalMetadataBackMatter3 backMatter = null;

  public AssemblyOscalSspSystemSecurityPlan uuid(String uuid) {
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

  public AssemblyOscalSspSystemSecurityPlan metadata(AssemblyOscalMetadataMetadata3 metadata) {
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
    public AssemblyOscalMetadataMetadata3 getMetadata() {
    return metadata;
  }

  public void setMetadata(AssemblyOscalMetadataMetadata3 metadata) {
    this.metadata = metadata;
  }

  public AssemblyOscalSspSystemSecurityPlan importProfile(AssemblyOscalSspImportProfile importProfile) {
    this.importProfile = importProfile;
    return this;
  }

  /**
   * Get importProfile
   * @return importProfile
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspImportProfile getImportProfile() {
    return importProfile;
  }

  public void setImportProfile(AssemblyOscalSspImportProfile importProfile) {
    this.importProfile = importProfile;
  }

  public AssemblyOscalSspSystemSecurityPlan systemCharacteristics(AssemblyOscalSspSystemCharacteristics systemCharacteristics) {
    this.systemCharacteristics = systemCharacteristics;
    return this;
  }

  /**
   * Get systemCharacteristics
   * @return systemCharacteristics
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspSystemCharacteristics getSystemCharacteristics() {
    return systemCharacteristics;
  }

  public void setSystemCharacteristics(AssemblyOscalSspSystemCharacteristics systemCharacteristics) {
    this.systemCharacteristics = systemCharacteristics;
  }

  public AssemblyOscalSspSystemSecurityPlan systemImplementation(AssemblyOscalSspSystemImplementation systemImplementation) {
    this.systemImplementation = systemImplementation;
    return this;
  }

  /**
   * Get systemImplementation
   * @return systemImplementation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspSystemImplementation getSystemImplementation() {
    return systemImplementation;
  }

  public void setSystemImplementation(AssemblyOscalSspSystemImplementation systemImplementation) {
    this.systemImplementation = systemImplementation;
  }

  public AssemblyOscalSspSystemSecurityPlan controlImplementation(AssemblyOscalSspControlImplementation controlImplementation) {
    this.controlImplementation = controlImplementation;
    return this;
  }

  /**
   * Get controlImplementation
   * @return controlImplementation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspControlImplementation getControlImplementation() {
    return controlImplementation;
  }

  public void setControlImplementation(AssemblyOscalSspControlImplementation controlImplementation) {
    this.controlImplementation = controlImplementation;
  }

  public AssemblyOscalSspSystemSecurityPlan backMatter(AssemblyOscalMetadataBackMatter3 backMatter) {
    this.backMatter = backMatter;
    return this;
  }

  /**
   * Get backMatter
   * @return backMatter
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalMetadataBackMatter3 getBackMatter() {
    return backMatter;
  }

  public void setBackMatter(AssemblyOscalMetadataBackMatter3 backMatter) {
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
    AssemblyOscalSspSystemSecurityPlan assemblyOscalSspSystemSecurityPlan = (AssemblyOscalSspSystemSecurityPlan) o;
    return Objects.equals(this.uuid, assemblyOscalSspSystemSecurityPlan.uuid) &&
        Objects.equals(this.metadata, assemblyOscalSspSystemSecurityPlan.metadata) &&
        Objects.equals(this.importProfile, assemblyOscalSspSystemSecurityPlan.importProfile) &&
        Objects.equals(this.systemCharacteristics, assemblyOscalSspSystemSecurityPlan.systemCharacteristics) &&
        Objects.equals(this.systemImplementation, assemblyOscalSspSystemSecurityPlan.systemImplementation) &&
        Objects.equals(this.controlImplementation, assemblyOscalSspSystemSecurityPlan.controlImplementation) &&
        Objects.equals(this.backMatter, assemblyOscalSspSystemSecurityPlan.backMatter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, metadata, importProfile, systemCharacteristics, systemImplementation, controlImplementation, backMatter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspSystemSecurityPlan {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    importProfile: ").append(toIndentedString(importProfile)).append("\n");
    sb.append("    systemCharacteristics: ").append(toIndentedString(systemCharacteristics)).append("\n");
    sb.append("    systemImplementation: ").append(toIndentedString(systemImplementation)).append("\n");
    sb.append("    controlImplementation: ").append(toIndentedString(controlImplementation)).append("\n");
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
