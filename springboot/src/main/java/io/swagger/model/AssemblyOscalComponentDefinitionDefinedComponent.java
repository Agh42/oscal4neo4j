package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.model.AssemblyOscalComponentDefinitionControlImplementation;
import io.swagger.model.AssemblyOscalImplementationCommonProtocol;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty2;
import io.swagger.model.AssemblyOscalMetadataResponsibleRole;
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
 * A defined component that can be part of an implemented system.
 */
@Schema(description = "A defined component that can be part of an implemented system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")

@Node
public class AssemblyOscalComponentDefinitionDefinedComponent   {

  @Id
  @GeneratedValue
  @JsonProperty
  private Long id;


  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("purpose")
  private String purpose = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty2> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("responsible-roles")
  @Valid
  private List<AssemblyOscalMetadataResponsibleRole> responsibleRoles = null;

  @JsonProperty("protocols")
  @Valid
  private List<AssemblyOscalImplementationCommonProtocol> protocols = null;

  @JsonProperty("control-implementations")
  @Valid
  private List<AssemblyOscalComponentDefinitionControlImplementation> controlImplementations = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalComponentDefinitionDefinedComponent uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The unique identifier for the component.
   * @return uuid
   **/
  @Schema(required = true, description = "The unique identifier for the component.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A category describing the purpose of the component.
   * @return type
   **/
  @Schema(required = true, description = "A category describing the purpose of the component.")
      @NotNull

  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human readable name for the component.
   * @return title
   **/
  @Schema(required = true, description = "A human readable name for the component.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the component, including information about its function.
   * @return description
   **/
  @Schema(required = true, description = "A description of the component, including information about its function.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * A summary of the technological or business purpose of the component.
   * @return purpose
   **/
  @Schema(description = "A summary of the technological or business purpose of the component.")
  
    public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent props(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent addPropsItem(AssemblyOscalMetadataProperty2 propsItem) {
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

  public AssemblyOscalComponentDefinitionDefinedComponent links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalComponentDefinitionDefinedComponent responsibleRoles(List<AssemblyOscalMetadataResponsibleRole> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole responsibleRolesItem) {
    if (this.responsibleRoles == null) {
      this.responsibleRoles = new ArrayList<AssemblyOscalMetadataResponsibleRole>();
    }
    this.responsibleRoles.add(responsibleRolesItem);
    return this;
  }

  /**
   * Get responsibleRoles
   * @return responsibleRoles
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataResponsibleRole> getResponsibleRoles() {
    return responsibleRoles;
  }

  public void setResponsibleRoles(List<AssemblyOscalMetadataResponsibleRole> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent protocols(List<AssemblyOscalImplementationCommonProtocol> protocols) {
    this.protocols = protocols;
    return this;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent addProtocolsItem(AssemblyOscalImplementationCommonProtocol protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<AssemblyOscalImplementationCommonProtocol>();
    }
    this.protocols.add(protocolsItem);
    return this;
  }

  /**
   * Get protocols
   * @return protocols
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonProtocol> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<AssemblyOscalImplementationCommonProtocol> protocols) {
    this.protocols = protocols;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent controlImplementations(List<AssemblyOscalComponentDefinitionControlImplementation> controlImplementations) {
    this.controlImplementations = controlImplementations;
    return this;
  }

  public AssemblyOscalComponentDefinitionDefinedComponent addControlImplementationsItem(AssemblyOscalComponentDefinitionControlImplementation controlImplementationsItem) {
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

  public AssemblyOscalComponentDefinitionDefinedComponent remarks(String remarks) {
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
    AssemblyOscalComponentDefinitionDefinedComponent assemblyOscalComponentDefinitionDefinedComponent = (AssemblyOscalComponentDefinitionDefinedComponent) o;
    return Objects.equals(this.uuid, assemblyOscalComponentDefinitionDefinedComponent.uuid) &&
        Objects.equals(this.type, assemblyOscalComponentDefinitionDefinedComponent.type) &&
        Objects.equals(this.title, assemblyOscalComponentDefinitionDefinedComponent.title) &&
        Objects.equals(this.description, assemblyOscalComponentDefinitionDefinedComponent.description) &&
        Objects.equals(this.purpose, assemblyOscalComponentDefinitionDefinedComponent.purpose) &&
        Objects.equals(this.props, assemblyOscalComponentDefinitionDefinedComponent.props) &&
        Objects.equals(this.links, assemblyOscalComponentDefinitionDefinedComponent.links) &&
        Objects.equals(this.responsibleRoles, assemblyOscalComponentDefinitionDefinedComponent.responsibleRoles) &&
        Objects.equals(this.protocols, assemblyOscalComponentDefinitionDefinedComponent.protocols) &&
        Objects.equals(this.controlImplementations, assemblyOscalComponentDefinitionDefinedComponent.controlImplementations) &&
        Objects.equals(this.remarks, assemblyOscalComponentDefinitionDefinedComponent.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, title, description, purpose, props, links, responsibleRoles, protocols, controlImplementations, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionDefinedComponent {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    responsibleRoles: ").append(toIndentedString(responsibleRoles)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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
