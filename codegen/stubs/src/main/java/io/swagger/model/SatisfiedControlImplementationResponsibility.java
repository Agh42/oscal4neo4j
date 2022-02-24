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
 * Describes how this system satisfies a responsibility imposed by a leveraged system.
 */
@Schema(description = "Describes how this system satisfies a responsibility imposed by a leveraged system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class SatisfiedControlImplementationResponsibility   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("responsibility-uuid")
  private String responsibilityUuid = null;

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

  @JsonProperty("remarks")
  private String remarks = null;

  public SatisfiedControlImplementationResponsibility uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this satisfied entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this satisfied entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public SatisfiedControlImplementationResponsibility responsibilityUuid(String responsibilityUuid) {
    this.responsibilityUuid = responsibilityUuid;
    return this;
  }

  /**
   * Identifies a 'provided' assembly associated with this assembly.
   * @return responsibilityUuid
   **/
  @Schema(description = "Identifies a 'provided' assembly associated with this assembly.")
  
  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getResponsibilityUuid() {
    return responsibilityUuid;
  }

  public void setResponsibilityUuid(String responsibilityUuid) {
    this.responsibilityUuid = responsibilityUuid;
  }

  public SatisfiedControlImplementationResponsibility description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An implementation statement that describes the aspects of a control or control statement implementation that a leveraging system is implementing based on a requirement from a leveraged system.
   * @return description
   **/
  @Schema(required = true, description = "An implementation statement that describes the aspects of a control or control statement implementation that a leveraging system is implementing based on a requirement from a leveraged system.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SatisfiedControlImplementationResponsibility props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public SatisfiedControlImplementationResponsibility addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public SatisfiedControlImplementationResponsibility links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public SatisfiedControlImplementationResponsibility addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public SatisfiedControlImplementationResponsibility responsibleRoles(List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public SatisfiedControlImplementationResponsibility addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole1 responsibleRolesItem) {
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

  public SatisfiedControlImplementationResponsibility remarks(String remarks) {
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
    SatisfiedControlImplementationResponsibility satisfiedControlImplementationResponsibility = (SatisfiedControlImplementationResponsibility) o;
    return Objects.equals(this.uuid, satisfiedControlImplementationResponsibility.uuid) &&
        Objects.equals(this.responsibilityUuid, satisfiedControlImplementationResponsibility.responsibilityUuid) &&
        Objects.equals(this.description, satisfiedControlImplementationResponsibility.description) &&
        Objects.equals(this.props, satisfiedControlImplementationResponsibility.props) &&
        Objects.equals(this.links, satisfiedControlImplementationResponsibility.links) &&
        Objects.equals(this.responsibleRoles, satisfiedControlImplementationResponsibility.responsibleRoles) &&
        Objects.equals(this.remarks, satisfiedControlImplementationResponsibility.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, responsibilityUuid, description, props, links, responsibleRoles, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SatisfiedControlImplementationResponsibility {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    responsibilityUuid: ").append(toIndentedString(responsibilityUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    responsibleRoles: ").append(toIndentedString(responsibleRoles)).append("\n");
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
