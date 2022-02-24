package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalImplementationCommonImplementationStatus;
import io.swagger.model.AssemblyOscalImplementationCommonSetParameter1;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalMetadataResponsibleRole1;
import io.swagger.model.Export;
import io.swagger.model.InheritedControlImplementation;
import io.swagger.model.SatisfiedControlImplementationResponsibility;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines how the referenced component implements a set of controls.
 */
@Schema(description = "Defines how the referenced component implements a set of controls.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspByComponent   {
  @JsonProperty("component-uuid")
  private String componentUuid = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("set-parameters")
  @Valid
  private List<AssemblyOscalImplementationCommonSetParameter1> setParameters = null;

  @JsonProperty("implementation-status")
  private AssemblyOscalImplementationCommonImplementationStatus implementationStatus = null;

  @JsonProperty("export")
  private Export export = null;

  @JsonProperty("inherited")
  @Valid
  private List<InheritedControlImplementation> inherited = null;

  @JsonProperty("satisfied")
  @Valid
  private List<SatisfiedControlImplementationResponsibility> satisfied = null;

  @JsonProperty("responsible-roles")
  @Valid
  private List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalSspByComponent componentUuid(String componentUuid) {
    this.componentUuid = componentUuid;
    return this;
  }

  /**
   * A reference to the component that is implementing a given control or control statement.
   * @return componentUuid
   **/
  @Schema(required = true, description = "A reference to the component that is implementing a given control or control statement.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getComponentUuid() {
    return componentUuid;
  }

  public void setComponentUuid(String componentUuid) {
    this.componentUuid = componentUuid;
  }

  public AssemblyOscalSspByComponent uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this by-component entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this by-component entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalSspByComponent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An implementation statement that describes how a control or a control statement is implemented within the referenced system component.
   * @return description
   **/
  @Schema(required = true, description = "An implementation statement that describes how a control or a control statement is implemented within the referenced system component.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalSspByComponent props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalSspByComponent addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalSspByComponent links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalSspByComponent addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalSspByComponent setParameters(List<AssemblyOscalImplementationCommonSetParameter1> setParameters) {
    this.setParameters = setParameters;
    return this;
  }

  public AssemblyOscalSspByComponent addSetParametersItem(AssemblyOscalImplementationCommonSetParameter1 setParametersItem) {
    if (this.setParameters == null) {
      this.setParameters = new ArrayList<AssemblyOscalImplementationCommonSetParameter1>();
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
  @Size(min=1)   public List<AssemblyOscalImplementationCommonSetParameter1> getSetParameters() {
    return setParameters;
  }

  public void setSetParameters(List<AssemblyOscalImplementationCommonSetParameter1> setParameters) {
    this.setParameters = setParameters;
  }

  public AssemblyOscalSspByComponent implementationStatus(AssemblyOscalImplementationCommonImplementationStatus implementationStatus) {
    this.implementationStatus = implementationStatus;
    return this;
  }

  /**
   * Get implementationStatus
   * @return implementationStatus
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalImplementationCommonImplementationStatus getImplementationStatus() {
    return implementationStatus;
  }

  public void setImplementationStatus(AssemblyOscalImplementationCommonImplementationStatus implementationStatus) {
    this.implementationStatus = implementationStatus;
  }

  public AssemblyOscalSspByComponent export(Export export) {
    this.export = export;
    return this;
  }

  /**
   * Get export
   * @return export
   **/
  @Schema(description = "")
  
    @Valid
    public Export getExport() {
    return export;
  }

  public void setExport(Export export) {
    this.export = export;
  }

  public AssemblyOscalSspByComponent inherited(List<InheritedControlImplementation> inherited) {
    this.inherited = inherited;
    return this;
  }

  public AssemblyOscalSspByComponent addInheritedItem(InheritedControlImplementation inheritedItem) {
    if (this.inherited == null) {
      this.inherited = new ArrayList<InheritedControlImplementation>();
    }
    this.inherited.add(inheritedItem);
    return this;
  }

  /**
   * Get inherited
   * @return inherited
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<InheritedControlImplementation> getInherited() {
    return inherited;
  }

  public void setInherited(List<InheritedControlImplementation> inherited) {
    this.inherited = inherited;
  }

  public AssemblyOscalSspByComponent satisfied(List<SatisfiedControlImplementationResponsibility> satisfied) {
    this.satisfied = satisfied;
    return this;
  }

  public AssemblyOscalSspByComponent addSatisfiedItem(SatisfiedControlImplementationResponsibility satisfiedItem) {
    if (this.satisfied == null) {
      this.satisfied = new ArrayList<SatisfiedControlImplementationResponsibility>();
    }
    this.satisfied.add(satisfiedItem);
    return this;
  }

  /**
   * Get satisfied
   * @return satisfied
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<SatisfiedControlImplementationResponsibility> getSatisfied() {
    return satisfied;
  }

  public void setSatisfied(List<SatisfiedControlImplementationResponsibility> satisfied) {
    this.satisfied = satisfied;
  }

  public AssemblyOscalSspByComponent responsibleRoles(List<AssemblyOscalMetadataResponsibleRole1> responsibleRoles) {
    this.responsibleRoles = responsibleRoles;
    return this;
  }

  public AssemblyOscalSspByComponent addResponsibleRolesItem(AssemblyOscalMetadataResponsibleRole1 responsibleRolesItem) {
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

  public AssemblyOscalSspByComponent remarks(String remarks) {
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
    AssemblyOscalSspByComponent assemblyOscalSspByComponent = (AssemblyOscalSspByComponent) o;
    return Objects.equals(this.componentUuid, assemblyOscalSspByComponent.componentUuid) &&
        Objects.equals(this.uuid, assemblyOscalSspByComponent.uuid) &&
        Objects.equals(this.description, assemblyOscalSspByComponent.description) &&
        Objects.equals(this.props, assemblyOscalSspByComponent.props) &&
        Objects.equals(this.links, assemblyOscalSspByComponent.links) &&
        Objects.equals(this.setParameters, assemblyOscalSspByComponent.setParameters) &&
        Objects.equals(this.implementationStatus, assemblyOscalSspByComponent.implementationStatus) &&
        Objects.equals(this.export, assemblyOscalSspByComponent.export) &&
        Objects.equals(this.inherited, assemblyOscalSspByComponent.inherited) &&
        Objects.equals(this.satisfied, assemblyOscalSspByComponent.satisfied) &&
        Objects.equals(this.responsibleRoles, assemblyOscalSspByComponent.responsibleRoles) &&
        Objects.equals(this.remarks, assemblyOscalSspByComponent.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentUuid, uuid, description, props, links, setParameters, implementationStatus, export, inherited, satisfied, responsibleRoles, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspByComponent {\n");
    
    sb.append("    componentUuid: ").append(toIndentedString(componentUuid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    setParameters: ").append(toIndentedString(setParameters)).append("\n");
    sb.append("    implementationStatus: ").append(toIndentedString(implementationStatus)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    satisfied: ").append(toIndentedString(satisfied)).append("\n");
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
