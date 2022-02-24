package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalComponentDefinitionCapability;
import io.swagger.model.AssemblyOscalComponentDefinitionDefinedComponent;
import io.swagger.model.AssemblyOscalComponentDefinitionImportComponentDefinition;
import io.swagger.model.AssemblyOscalMetadataBackMatter2;
import io.swagger.model.AssemblyOscalMetadataMetadata2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collection of component descriptions, which may optionally be grouped by capability.
 */
@Schema(description = "A collection of component descriptions, which may optionally be grouped by capability.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalComponentDefinitionComponentDefinition   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("metadata")
  private AssemblyOscalMetadataMetadata2 metadata = null;

  @JsonProperty("import-component-definitions")
  @Valid
  private List<AssemblyOscalComponentDefinitionImportComponentDefinition> importComponentDefinitions = null;

  @JsonProperty("components")
  @Valid
  private List<AssemblyOscalComponentDefinitionDefinedComponent> components = null;

  @JsonProperty("capabilities")
  @Valid
  private List<AssemblyOscalComponentDefinitionCapability> capabilities = null;

  @JsonProperty("back-matter")
  private AssemblyOscalMetadataBackMatter2 backMatter = null;

  public AssemblyOscalComponentDefinitionComponentDefinition uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier for this component definition instance. This UUID should be changed when this document is revised.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier for this component definition instance. This UUID should be changed when this document is revised.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition metadata(AssemblyOscalMetadataMetadata2 metadata) {
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
    public AssemblyOscalMetadataMetadata2 getMetadata() {
    return metadata;
  }

  public void setMetadata(AssemblyOscalMetadataMetadata2 metadata) {
    this.metadata = metadata;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition importComponentDefinitions(List<AssemblyOscalComponentDefinitionImportComponentDefinition> importComponentDefinitions) {
    this.importComponentDefinitions = importComponentDefinitions;
    return this;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition addImportComponentDefinitionsItem(AssemblyOscalComponentDefinitionImportComponentDefinition importComponentDefinitionsItem) {
    if (this.importComponentDefinitions == null) {
      this.importComponentDefinitions = new ArrayList<AssemblyOscalComponentDefinitionImportComponentDefinition>();
    }
    this.importComponentDefinitions.add(importComponentDefinitionsItem);
    return this;
  }

  /**
   * Get importComponentDefinitions
   * @return importComponentDefinitions
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionImportComponentDefinition> getImportComponentDefinitions() {
    return importComponentDefinitions;
  }

  public void setImportComponentDefinitions(List<AssemblyOscalComponentDefinitionImportComponentDefinition> importComponentDefinitions) {
    this.importComponentDefinitions = importComponentDefinitions;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition components(List<AssemblyOscalComponentDefinitionDefinedComponent> components) {
    this.components = components;
    return this;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition addComponentsItem(AssemblyOscalComponentDefinitionDefinedComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<AssemblyOscalComponentDefinitionDefinedComponent>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Get components
   * @return components
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionDefinedComponent> getComponents() {
    return components;
  }

  public void setComponents(List<AssemblyOscalComponentDefinitionDefinedComponent> components) {
    this.components = components;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition capabilities(List<AssemblyOscalComponentDefinitionCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition addCapabilitiesItem(AssemblyOscalComponentDefinitionCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<AssemblyOscalComponentDefinitionCapability>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionCapability> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<AssemblyOscalComponentDefinitionCapability> capabilities) {
    this.capabilities = capabilities;
  }

  public AssemblyOscalComponentDefinitionComponentDefinition backMatter(AssemblyOscalMetadataBackMatter2 backMatter) {
    this.backMatter = backMatter;
    return this;
  }

  /**
   * Get backMatter
   * @return backMatter
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalMetadataBackMatter2 getBackMatter() {
    return backMatter;
  }

  public void setBackMatter(AssemblyOscalMetadataBackMatter2 backMatter) {
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
    AssemblyOscalComponentDefinitionComponentDefinition assemblyOscalComponentDefinitionComponentDefinition = (AssemblyOscalComponentDefinitionComponentDefinition) o;
    return Objects.equals(this.uuid, assemblyOscalComponentDefinitionComponentDefinition.uuid) &&
        Objects.equals(this.metadata, assemblyOscalComponentDefinitionComponentDefinition.metadata) &&
        Objects.equals(this.importComponentDefinitions, assemblyOscalComponentDefinitionComponentDefinition.importComponentDefinitions) &&
        Objects.equals(this.components, assemblyOscalComponentDefinitionComponentDefinition.components) &&
        Objects.equals(this.capabilities, assemblyOscalComponentDefinitionComponentDefinition.capabilities) &&
        Objects.equals(this.backMatter, assemblyOscalComponentDefinitionComponentDefinition.backMatter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, metadata, importComponentDefinitions, components, capabilities, backMatter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionComponentDefinition {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    importComponentDefinitions: ").append(toIndentedString(importComponentDefinitions)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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
