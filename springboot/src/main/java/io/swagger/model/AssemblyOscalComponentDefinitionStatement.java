package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty2;
import io.swagger.model.AssemblyOscalMetadataResponsibleRole;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies which statements within a control are addressed.
 */
@Schema(description = "Identifies which statements within a control are addressed.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalComponentDefinitionStatement   {
  @JsonProperty("statement-id")
  private String statementId = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty2> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("responsible-roles")
  @Valid
  private List<AssemblyOscalMetadataResponsibleRole> responsibleRoles = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalComponentDefinitionStatement statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * A reference to a control statement by its identifier
   * @return statementId
   **/
  @Schema(required = true, description = "A reference to a control statement by its identifier")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public AssemblyOscalComponentDefinitionStatement uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this control statement entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this control statement entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalComponentDefinitionStatement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of how the containing control statement is implemented by the component or capability.
   * @return description
   **/
  @Schema(required = true, description = "A summary of how the containing control statement is implemented by the component or capability.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalComponentDefinitionStatement props(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalComponentDefinitionStatement addPropsItem(AssemblyOscalMetadataProperty2 propsItem) {
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

  public AssemblyOscalComponentDefinitionStatement links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalComponentDefinitionStatement addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalComponentDefinitionStatement responsibleRoles(List<AssemblyOscalMetadataResponsibleRole> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public AssemblyOscalComponentDefinitionStatement addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole responsibleRolesItem) {
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

  public AssemblyOscalComponentDefinitionStatement remarks(String remarks) {
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
    AssemblyOscalComponentDefinitionStatement assemblyOscalComponentDefinitionStatement = (AssemblyOscalComponentDefinitionStatement) o;
    return Objects.equals(this.statementId, assemblyOscalComponentDefinitionStatement.statementId) &&
        Objects.equals(this.uuid, assemblyOscalComponentDefinitionStatement.uuid) &&
        Objects.equals(this.description, assemblyOscalComponentDefinitionStatement.description) &&
        Objects.equals(this.props, assemblyOscalComponentDefinitionStatement.props) &&
        Objects.equals(this.links, assemblyOscalComponentDefinitionStatement.links) &&
        Objects.equals(this.responsibleRoles, assemblyOscalComponentDefinitionStatement.responsibleRoles) &&
        Objects.equals(this.remarks, assemblyOscalComponentDefinitionStatement.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, uuid, description, props, links, responsibleRoles, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionStatement {\n");
    
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
