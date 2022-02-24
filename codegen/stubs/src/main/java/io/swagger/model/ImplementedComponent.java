package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalMetadataResponsibleParty3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The set of components that are implemented in a given system inventory item.
 */
@Schema(description = "The set of components that are implemented in a given system inventory item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class ImplementedComponent   {
  @JsonProperty("component-uuid")
  private String componentUuid = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("responsible-parties")
  @Valid
  private List<AssemblyOscalMetadataResponsibleParty3> responsibleParties = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public ImplementedComponent componentUuid(String componentUuid) {
    this.componentUuid = componentUuid;
    return this;
  }

  /**
   * A reference to a component that is implemented as part of an inventory item.
   * @return componentUuid
   **/
  @Schema(required = true, description = "A reference to a component that is implemented as part of an inventory item.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getComponentUuid() {
    return componentUuid;
  }

  public void setComponentUuid(String componentUuid) {
    this.componentUuid = componentUuid;
  }

  public ImplementedComponent props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public ImplementedComponent addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public ImplementedComponent links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public ImplementedComponent addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public ImplementedComponent responsibleParties(List<AssemblyOscalMetadataResponsibleParty3> responsibleParties) {
    this.responsibleParties = responsibleParties;
    return this;
  }

  public ImplementedComponent addResponsiblePartiesItem(AssemblyOscalMetadataResponsibleParty3 responsiblePartiesItem) {
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

  public ImplementedComponent remarks(String remarks) {
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
    ImplementedComponent implementedComponent = (ImplementedComponent) o;
    return Objects.equals(this.componentUuid, implementedComponent.componentUuid) &&
        Objects.equals(this.props, implementedComponent.props) &&
        Objects.equals(this.links, implementedComponent.links) &&
        Objects.equals(this.responsibleParties, implementedComponent.responsibleParties) &&
        Objects.equals(this.remarks, implementedComponent.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentUuid, props, links, responsibleParties, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImplementedComponent {\n");
    
    sb.append("    componentUuid: ").append(toIndentedString(componentUuid)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    responsibleParties: ").append(toIndentedString(responsibleParties)).append("\n");
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
