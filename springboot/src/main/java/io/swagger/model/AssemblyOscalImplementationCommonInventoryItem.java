package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalMetadataResponsibleParty3;
import io.swagger.model.ImplementedComponent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single managed inventory item within the system.
 */
@Schema(description = "A single managed inventory item within the system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonInventoryItem   {
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

  @JsonProperty("responsible-parties")
  @Valid
  private List<AssemblyOscalMetadataResponsibleParty3> responsibleParties = null;

  @JsonProperty("implemented-components")
  @Valid
  private List<ImplementedComponent> implementedComponents = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalImplementationCommonInventoryItem uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this inventory item entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this inventory item entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalImplementationCommonInventoryItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the inventory item stating its purpose within the system.
   * @return description
   **/
  @Schema(required = true, description = "A summary of the inventory item stating its purpose within the system.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalImplementationCommonInventoryItem props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalImplementationCommonInventoryItem addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalImplementationCommonInventoryItem links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalImplementationCommonInventoryItem addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalImplementationCommonInventoryItem responsibleParties(List<AssemblyOscalMetadataResponsibleParty3> responsibleParties) {
    this.responsibleParties = responsibleParties;
    return this;
  }

  public AssemblyOscalImplementationCommonInventoryItem addResponsiblePartiesItem(AssemblyOscalMetadataResponsibleParty3 responsiblePartiesItem) {
    if (this.responsibleParties == null) {
      this.responsibleParties = new ArrayList<AssemblyOscalMetadataResponsibleParty3>();
    }
    this.responsibleParties.add(responsiblePartiesItem);
    return this;
  }

  /**
   * Get responsibleParties
   * @return responsibleParties
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataResponsibleParty3> getResponsibleParties() {
    return responsibleParties;
  }

  public void setResponsibleParties(List<AssemblyOscalMetadataResponsibleParty3> responsibleParties) {
    this.responsibleParties = responsibleParties;
  }

  public AssemblyOscalImplementationCommonInventoryItem implementedComponents(List<ImplementedComponent> implementedComponents) {
    this.implementedComponents = implementedComponents;
    return this;
  }

  public AssemblyOscalImplementationCommonInventoryItem addImplementedComponentsItem(ImplementedComponent implementedComponentsItem) {
    if (this.implementedComponents == null) {
      this.implementedComponents = new ArrayList<ImplementedComponent>();
    }
    this.implementedComponents.add(implementedComponentsItem);
    return this;
  }

  /**
   * Get implementedComponents
   * @return implementedComponents
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<ImplementedComponent> getImplementedComponents() {
    return implementedComponents;
  }

  public void setImplementedComponents(List<ImplementedComponent> implementedComponents) {
    this.implementedComponents = implementedComponents;
  }

  public AssemblyOscalImplementationCommonInventoryItem remarks(String remarks) {
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
    AssemblyOscalImplementationCommonInventoryItem assemblyOscalImplementationCommonInventoryItem = (AssemblyOscalImplementationCommonInventoryItem) o;
    return Objects.equals(this.uuid, assemblyOscalImplementationCommonInventoryItem.uuid) &&
        Objects.equals(this.description, assemblyOscalImplementationCommonInventoryItem.description) &&
        Objects.equals(this.props, assemblyOscalImplementationCommonInventoryItem.props) &&
        Objects.equals(this.links, assemblyOscalImplementationCommonInventoryItem.links) &&
        Objects.equals(this.responsibleParties, assemblyOscalImplementationCommonInventoryItem.responsibleParties) &&
        Objects.equals(this.implementedComponents, assemblyOscalImplementationCommonInventoryItem.implementedComponents) &&
        Objects.equals(this.remarks, assemblyOscalImplementationCommonInventoryItem.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, description, props, links, responsibleParties, implementedComponents, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonInventoryItem {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    responsibleParties: ").append(toIndentedString(responsibleParties)).append("\n");
    sb.append("    implementedComponents: ").append(toIndentedString(implementedComponents)).append("\n");
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
