package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.model.AssemblyOscalComponentDefinitionControlImplementation;
import io.swagger.model.AssemblyOscalComponentDefinitionIncorporatesComponent;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A grouping of other components and/or capabilities.
 */
@Schema(description = "A grouping of other components and/or capabilities.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")

@Node
public class AssemblyOscalComponentDefinitionCapability   {

  @Id
  @GeneratedValue
  @JsonProperty
  private Long id;


  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty2> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("incorporates-components")
  @Valid
  private List<AssemblyOscalComponentDefinitionIncorporatesComponent> incorporatesComponents = null;

  @JsonProperty("control-implementations")
  @Valid
  private List<AssemblyOscalComponentDefinitionControlImplementation> controlImplementations = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalComponentDefinitionCapability uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A unique identifier for a capability.
   * @return uuid
   **/
  @Schema(required = true, description = "A unique identifier for a capability.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalComponentDefinitionCapability name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The capability's human-readable name.
   * @return name
   **/
  @Schema(required = true, description = "The capability's human-readable name.")
      @NotNull

  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssemblyOscalComponentDefinitionCapability description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the capability.
   * @return description
   **/
  @Schema(required = true, description = "A summary of the capability.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalComponentDefinitionCapability props(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalComponentDefinitionCapability addPropsItem(AssemblyOscalMetadataProperty2 propsItem) {
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

  public AssemblyOscalComponentDefinitionCapability links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalComponentDefinitionCapability addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalComponentDefinitionCapability incorporatesComponents(List<AssemblyOscalComponentDefinitionIncorporatesComponent> incorporatesComponents) {
    this.incorporatesComponents = incorporatesComponents;
    return this;
  }

  public AssemblyOscalComponentDefinitionCapability addIncorporatesComponentsItem(AssemblyOscalComponentDefinitionIncorporatesComponent incorporatesComponentsItem) {
    if (this.incorporatesComponents == null) {
      this.incorporatesComponents = new ArrayList<AssemblyOscalComponentDefinitionIncorporatesComponent>();
    }
    this.incorporatesComponents.add(incorporatesComponentsItem);
    return this;
  }

  /**
   * Get incorporatesComponents
   * @return incorporatesComponents
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionIncorporatesComponent> getIncorporatesComponents() {
    return incorporatesComponents;
  }

  public void setIncorporatesComponents(List<AssemblyOscalComponentDefinitionIncorporatesComponent> incorporatesComponents) {
    this.incorporatesComponents = incorporatesComponents;
  }

  public AssemblyOscalComponentDefinitionCapability controlImplementations(List<AssemblyOscalComponentDefinitionControlImplementation> controlImplementations) {
    this.controlImplementations = controlImplementations;
    return this;
  }

  public AssemblyOscalComponentDefinitionCapability addControlImplementationsItem(AssemblyOscalComponentDefinitionControlImplementation controlImplementationsItem) {
    if (this.controlImplementations == null) {
      this.controlImplementations = new ArrayList<AssemblyOscalComponentDefinitionControlImplementation>();
    }
    this.controlImplementations.add(controlImplementationsItem);
    return this;
  }

  /**
   * Get controlImplementations
   * @return controlImplementations
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionControlImplementation> getControlImplementations() {
    return controlImplementations;
  }

  public void setControlImplementations(List<AssemblyOscalComponentDefinitionControlImplementation> controlImplementations) {
    this.controlImplementations = controlImplementations;
  }

  public AssemblyOscalComponentDefinitionCapability remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Additional commentary on the containing object.
   * @return remarks
   **/
  @Schema(description = "Additional commentary on the containing object.")
  
    public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalComponentDefinitionCapability assemblyOscalComponentDefinitionCapability = (AssemblyOscalComponentDefinitionCapability) o;
    return Objects.equals(this.uuid, assemblyOscalComponentDefinitionCapability.uuid) &&
        Objects.equals(this.name, assemblyOscalComponentDefinitionCapability.name) &&
        Objects.equals(this.description, assemblyOscalComponentDefinitionCapability.description) &&
        Objects.equals(this.props, assemblyOscalComponentDefinitionCapability.props) &&
        Objects.equals(this.links, assemblyOscalComponentDefinitionCapability.links) &&
        Objects.equals(this.incorporatesComponents, assemblyOscalComponentDefinitionCapability.incorporatesComponents) &&
        Objects.equals(this.controlImplementations, assemblyOscalComponentDefinitionCapability.controlImplementations) &&
        Objects.equals(this.remarks, assemblyOscalComponentDefinitionCapability.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, description, props, links, incorporatesComponents, controlImplementations, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionCapability {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    incorporatesComponents: ").append(toIndentedString(incorporatesComponents)).append("\n");
    sb.append("    controlImplementations: ").append(toIndentedString(controlImplementations)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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
