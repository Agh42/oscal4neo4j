package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalMetadataResponsibleRole1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a control implementation inherited by a leveraging system.
 */
@Schema(description = "Describes a control implementation inherited by a leveraging system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class InheritedControlImplementation   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("provided-uuid")
  private String providedUuid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("responsible-roles")
  @Valid
  private List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles = null;

  public InheritedControlImplementation uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this inherited entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this inherited entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public InheritedControlImplementation providedUuid(String providedUuid) {
    this.providedUuid = providedUuid;
    return this;
  }

  /**
   * Identifies a 'provided' assembly associated with this assembly.
   * @return providedUuid
   **/
  @Schema(description = "Identifies a 'provided' assembly associated with this assembly.")
  
  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getProvidedUuid() {
    return providedUuid;
  }

  public void setProvidedUuid(String providedUuid) {
    this.providedUuid = providedUuid;
  }

  public InheritedControlImplementation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An implementation statement that describes the aspects of a control or control statement implementation that a leveraging system is inheriting from a leveraged system.
   * @return description
   **/
  @Schema(required = true, description = "An implementation statement that describes the aspects of a control or control statement implementation that a leveraging system is inheriting from a leveraged system.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InheritedControlImplementation props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public InheritedControlImplementation addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty3>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataProperty3> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
  }

  public InheritedControlImplementation links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public InheritedControlImplementation addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public InheritedControlImplementation responsibleRoles(List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public InheritedControlImplementation addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole1 responsibleRolesItem) {
    if (this.responsibleRoles == null) {
      this.responsibleRoles = new ArrayList<AssemblyOscalMetadataResponsibleRole1>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataResponsibleRole1> getResponsibleRoles() {
    return responsibleRoles;
  }

  public void setResponsibleRoles(List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritedControlImplementation inheritedControlImplementation = (InheritedControlImplementation) o;
    return Objects.equals(this.uuid, inheritedControlImplementation.uuid) &&
        Objects.equals(this.providedUuid, inheritedControlImplementation.providedUuid) &&
        Objects.equals(this.description, inheritedControlImplementation.description) &&
        Objects.equals(this.props, inheritedControlImplementation.props) &&
        Objects.equals(this.links, inheritedControlImplementation.links) &&
        Objects.equals(this.responsibleRoles, inheritedControlImplementation.responsibleRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, providedUuid, description, props, links, responsibleRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritedControlImplementation {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    providedUuid: ").append(toIndentedString(providedUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    responsibleRoles: ").append(toIndentedString(responsibleRoles)).append("\n");
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
