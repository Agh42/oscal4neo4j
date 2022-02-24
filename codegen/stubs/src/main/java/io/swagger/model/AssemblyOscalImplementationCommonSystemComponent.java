package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalImplementationCommonProtocol1;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalMetadataResponsibleRole1;
import io.swagger.model.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A defined component that can be part of an implemented system.
 */
@Schema(description = "A defined component that can be part of an implemented system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonSystemComponent   {
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
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("responsible-roles")
  @Valid
  private List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles = null;

  @JsonProperty("protocols")
  @Valid
  private List<AssemblyOscalImplementationCommonProtocol1> protocols = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalImplementationCommonSystemComponent uuid(String uuid) {
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

  public AssemblyOscalImplementationCommonSystemComponent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A category describing the purpose of the component.
   * @return type
   **/
  @Schema(required = true, description = "A category describing the purpose of the component.")
      @NotNull

  @Pattern(regexp="^\\S(.*\\S)?$")   public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AssemblyOscalImplementationCommonSystemComponent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human readable name for the system component.
   * @return title
   **/
  @Schema(required = true, description = "A human readable name for the system component.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalImplementationCommonSystemComponent description(String description) {
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

  public AssemblyOscalImplementationCommonSystemComponent purpose(String purpose) {
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

  public AssemblyOscalImplementationCommonSystemComponent props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemComponent addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalImplementationCommonSystemComponent links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemComponent addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalImplementationCommonSystemComponent status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public AssemblyOscalImplementationCommonSystemComponent responsibleRoles(List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemComponent addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole1 responsibleRolesItem) {
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

  public AssemblyOscalImplementationCommonSystemComponent protocols(List<AssemblyOscalImplementationCommonProtocol1> protocols) {
    this.protocols = protocols;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemComponent addProtocolsItem(AssemblyOscalImplementationCommonProtocol1 protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<AssemblyOscalImplementationCommonProtocol1>();
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
  @Size(min=1)   public List<AssemblyOscalImplementationCommonProtocol1> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<AssemblyOscalImplementationCommonProtocol1> protocols) {
    this.protocols = protocols;
  }

  public AssemblyOscalImplementationCommonSystemComponent remarks(String remarks) {
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
    AssemblyOscalImplementationCommonSystemComponent assemblyOscalImplementationCommonSystemComponent = (AssemblyOscalImplementationCommonSystemComponent) o;
    return Objects.equals(this.uuid, assemblyOscalImplementationCommonSystemComponent.uuid) &&
        Objects.equals(this.type, assemblyOscalImplementationCommonSystemComponent.type) &&
        Objects.equals(this.title, assemblyOscalImplementationCommonSystemComponent.title) &&
        Objects.equals(this.description, assemblyOscalImplementationCommonSystemComponent.description) &&
        Objects.equals(this.purpose, assemblyOscalImplementationCommonSystemComponent.purpose) &&
        Objects.equals(this.props, assemblyOscalImplementationCommonSystemComponent.props) &&
        Objects.equals(this.links, assemblyOscalImplementationCommonSystemComponent.links) &&
        Objects.equals(this.status, assemblyOscalImplementationCommonSystemComponent.status) &&
        Objects.equals(this.responsibleRoles, assemblyOscalImplementationCommonSystemComponent.responsibleRoles) &&
        Objects.equals(this.protocols, assemblyOscalImplementationCommonSystemComponent.protocols) &&
        Objects.equals(this.remarks, assemblyOscalImplementationCommonSystemComponent.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, title, description, purpose, props, links, status, responsibleRoles, protocols, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonSystemComponent {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    responsibleRoles: ").append(toIndentedString(responsibleRoles)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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
