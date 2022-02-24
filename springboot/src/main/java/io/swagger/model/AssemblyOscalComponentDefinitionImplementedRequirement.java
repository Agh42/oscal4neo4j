package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalComponentDefinitionStatement;
import io.swagger.model.AssemblyOscalImplementationCommonSetParameter;
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
 * Describes how the containing component or capability implements an individual control.
 */
@Schema(description = "Describes how the containing component or capability implements an individual control.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalComponentDefinitionImplementedRequirement   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("control-id")
  private String controlId = null;

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

  @JsonProperty("responsible-roles")
  @Valid
  private List<AssemblyOscalMetadataResponsibleRole> responsibleRoles = null;

  @JsonProperty("statements")
  @Valid
  private List<AssemblyOscalComponentDefinitionStatement> statements = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalComponentDefinitionImplementedRequirement uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A unique identifier for a specific control implementation.
   * @return uuid
   **/
  @Schema(required = true, description = "A unique identifier for a specific control implementation.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement controlId(String controlId) {
    this.controlId = controlId;
    return this;
  }

  /**
   * A reference to a control with a corresponding id value.
   * @return controlId
   **/
  @Schema(required = true, description = "A reference to a control with a corresponding id value.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getControlId() {
    return controlId;
  }

  public void setControlId(String controlId) {
    this.controlId = controlId;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of how the specified control is implemented for the containing component or capability.
   * @return description
   **/
  @Schema(required = true, description = "A description of how the specified control is implemented for the containing component or capability.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement props(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement addPropsItem(AssemblyOscalMetadataProperty2 propsItem) {
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

  public AssemblyOscalComponentDefinitionImplementedRequirement links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalComponentDefinitionImplementedRequirement setParameters(List<AssemblyOscalImplementationCommonSetParameter> setParameters) {
    this.setParameters = setParameters;
    return this;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement addSetParametersItem(AssemblyOscalImplementationCommonSetParameter setParametersItem) {
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

  public AssemblyOscalComponentDefinitionImplementedRequirement responsibleRoles(List<AssemblyOscalMetadataResponsibleRole> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole responsibleRolesItem) {
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

  public AssemblyOscalComponentDefinitionImplementedRequirement statements(List<AssemblyOscalComponentDefinitionStatement> statements) {
    this.statements = statements;
    return this;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement addStatementsItem(AssemblyOscalComponentDefinitionStatement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<AssemblyOscalComponentDefinitionStatement>();
    }
    this.statements.add(statementsItem);
    return this;
  }

  /**
   * Get statements
   * @return statements
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalComponentDefinitionStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<AssemblyOscalComponentDefinitionStatement> statements) {
    this.statements = statements;
  }

  public AssemblyOscalComponentDefinitionImplementedRequirement remarks(String remarks) {
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
    AssemblyOscalComponentDefinitionImplementedRequirement assemblyOscalComponentDefinitionImplementedRequirement = (AssemblyOscalComponentDefinitionImplementedRequirement) o;
    return Objects.equals(this.uuid, assemblyOscalComponentDefinitionImplementedRequirement.uuid) &&
        Objects.equals(this.controlId, assemblyOscalComponentDefinitionImplementedRequirement.controlId) &&
        Objects.equals(this.description, assemblyOscalComponentDefinitionImplementedRequirement.description) &&
        Objects.equals(this.props, assemblyOscalComponentDefinitionImplementedRequirement.props) &&
        Objects.equals(this.links, assemblyOscalComponentDefinitionImplementedRequirement.links) &&
        Objects.equals(this.setParameters, assemblyOscalComponentDefinitionImplementedRequirement.setParameters) &&
        Objects.equals(this.responsibleRoles, assemblyOscalComponentDefinitionImplementedRequirement.responsibleRoles) &&
        Objects.equals(this.statements, assemblyOscalComponentDefinitionImplementedRequirement.statements) &&
        Objects.equals(this.remarks, assemblyOscalComponentDefinitionImplementedRequirement.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, controlId, description, props, links, setParameters, responsibleRoles, statements, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionImplementedRequirement {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    setParameters: ").append(toIndentedString(setParameters)).append("\n");
    sb.append("    responsibleRoles: ").append(toIndentedString(responsibleRoles)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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
