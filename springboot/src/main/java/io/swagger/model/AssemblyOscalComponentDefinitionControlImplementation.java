package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalComponentDefinitionImplementedRequirement;
import io.swagger.model.AssemblyOscalImplementationCommonSetParameter;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines how the component or capability supports a set of controls.
 */
@Schema(description = "Defines how the component or capability supports a set of controls.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalComponentDefinitionControlImplementation   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty2> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("set-parameters")
  @Valid
  private List<AssemblyOscalImplementationCommonSetParameter> setParameters = null;

  @JsonProperty("implemented-requirements")
  @Valid
  private List<AssemblyOscalComponentDefinitionImplementedRequirement> implementedRequirements = new ArrayList<AssemblyOscalComponentDefinitionImplementedRequirement>();

  public AssemblyOscalComponentDefinitionControlImplementation uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A unique identifier for the set of implemented controls.
   * @return uuid
   **/
  @Schema(required = true, description = "A unique identifier for the set of implemented controls.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalComponentDefinitionControlImplementation source(String source) {
    this.source = source;
    return this;
  }

  /**
   * A reference to an OSCAL catalog or profile providing the referenced control or subcontrol definition.
   * @return source
   **/
  @Schema(required = true, description = "A reference to an OSCAL catalog or profile providing the referenced control or subcontrol definition.")
      @NotNull

    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AssemblyOscalComponentDefinitionControlImplementation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of how the specified set of controls are implemented for the containing component or capability.
   * @return description
   **/
  @Schema(required = true, description = "A description of how the specified set of controls are implemented for the containing component or capability.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalComponentDefinitionControlImplementation props(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalComponentDefinitionControlImplementation addPropsItem(AssemblyOscalMetadataProperty2 propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty2>();
    }
    this.props.add(propsItem);
    return this;
  }

  /**
   * Get props
   * @return props
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataProperty2> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
  }

  public AssemblyOscalComponentDefinitionControlImplementation links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalComponentDefinitionControlImplementation addLinksItem(AssemblyOscalMetadataLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<AssemblyOscalMetadataLink>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataLink> getLinks() {
    return links;
  }

  public void setLinks(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
  }

  public AssemblyOscalComponentDefinitionControlImplementation setParameters(List<AssemblyOscalImplementationCommonSetParameter> setParameters) {
    this.setParameters = setParameters;
    return this;
  }

  public AssemblyOscalComponentDefinitionControlImplementation addSetParametersItem(AssemblyOscalImplementationCommonSetParameter setParametersItem) {
    if (this.setParameters == null) {
      this.setParameters = new ArrayList<AssemblyOscalImplementationCommonSetParameter>();
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
  @Size(min=1)   public List<AssemblyOscalImplementationCommonSetParameter> getSetParameters() {
    return setParameters;
  }

  public void setSetParameters(List<AssemblyOscalImplementationCommonSetParameter> setParameters) {
    this.setParameters = setParameters;
  }

  public AssemblyOscalComponentDefinitionControlImplementation implementedRequirements(List<AssemblyOscalComponentDefinitionImplementedRequirement> implementedRequirements) {
    this.implementedRequirements = implementedRequirements;
    return this;
  }

  public AssemblyOscalComponentDefinitionControlImplementation addImplementedRequirementsItem(AssemblyOscalComponentDefinitionImplementedRequirement implementedRequirementsItem) {
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
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionImplementedRequirement> getImplementedRequirements() {
    return implementedRequirements;
  }

  public void setImplementedRequirements(List<AssemblyOscalComponentDefinitionImplementedRequirement> implementedRequirements) {
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
    AssemblyOscalComponentDefinitionControlImplementation assemblyOscalComponentDefinitionControlImplementation = (AssemblyOscalComponentDefinitionControlImplementation) o;
    return Objects.equals(this.uuid, assemblyOscalComponentDefinitionControlImplementation.uuid) &&
        Objects.equals(this.source, assemblyOscalComponentDefinitionControlImplementation.source) &&
        Objects.equals(this.description, assemblyOscalComponentDefinitionControlImplementation.description) &&
        Objects.equals(this.props, assemblyOscalComponentDefinitionControlImplementation.props) &&
        Objects.equals(this.links, assemblyOscalComponentDefinitionControlImplementation.links) &&
        Objects.equals(this.setParameters, assemblyOscalComponentDefinitionControlImplementation.setParameters) &&
        Objects.equals(this.implementedRequirements, assemblyOscalComponentDefinitionControlImplementation.implementedRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, source, description, props, links, setParameters, implementedRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionControlImplementation {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
