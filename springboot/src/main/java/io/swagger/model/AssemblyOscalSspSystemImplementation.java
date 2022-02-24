package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalImplementationCommonInventoryItem;
import io.swagger.model.AssemblyOscalImplementationCommonSystemComponent;
import io.swagger.model.AssemblyOscalImplementationCommonSystemUser;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.LeveragedAuthorization;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides information as to how the system is implemented.
 */
@Schema(description = "Provides information as to how the system is implemented.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspSystemImplementation   {
  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("leveraged-authorizations")
  @Valid
  private List<LeveragedAuthorization> leveragedAuthorizations = null;

  @JsonProperty("users")
  @Valid
  private List<AssemblyOscalImplementationCommonSystemUser> users = new ArrayList<AssemblyOscalImplementationCommonSystemUser>();

  @JsonProperty("components")
  @Valid
  private List<AssemblyOscalImplementationCommonSystemComponent> components = new ArrayList<AssemblyOscalImplementationCommonSystemComponent>();

  @JsonProperty("inventory-items")
  @Valid
  private List<AssemblyOscalImplementationCommonInventoryItem> inventoryItems = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalSspSystemImplementation props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalSspSystemImplementation addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalSspSystemImplementation links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalSspSystemImplementation addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalSspSystemImplementation leveragedAuthorizations(List<LeveragedAuthorization> leveragedAuthorizations) {
    this.leveragedAuthorizations = leveragedAuthorizations;
    return this;
  }

  public AssemblyOscalSspSystemImplementation addLeveragedAuthorizationsItem(LeveragedAuthorization leveragedAuthorizationsItem) {
    if (this.leveragedAuthorizations == null) {
      this.leveragedAuthorizations = new ArrayList<LeveragedAuthorization>();
    }
    this.leveragedAuthorizations.add(leveragedAuthorizationsItem);
    return this;
  }

  /**
   * Get leveragedAuthorizations
   * @return leveragedAuthorizations
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<LeveragedAuthorization> getLeveragedAuthorizations() {
    return leveragedAuthorizations;
  }

  public void setLeveragedAuthorizations(List<LeveragedAuthorization> leveragedAuthorizations) {
    this.leveragedAuthorizations = leveragedAuthorizations;
  }

  public AssemblyOscalSspSystemImplementation users(List<AssemblyOscalImplementationCommonSystemUser> users) {
    this.users = users;
    return this;
  }

  public AssemblyOscalSspSystemImplementation addUsersItem(AssemblyOscalImplementationCommonSystemUser usersItem) {
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonSystemUser> getUsers() {
    return users;
  }

  public void setUsers(List<AssemblyOscalImplementationCommonSystemUser> users) {
    this.users = users;
  }

  public AssemblyOscalSspSystemImplementation components(List<AssemblyOscalImplementationCommonSystemComponent> components) {
    this.components = components;
    return this;
  }

  public AssemblyOscalSspSystemImplementation addComponentsItem(AssemblyOscalImplementationCommonSystemComponent componentsItem) {
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Get components
   * @return components
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonSystemComponent> getComponents() {
    return components;
  }

  public void setComponents(List<AssemblyOscalImplementationCommonSystemComponent> components) {
    this.components = components;
  }

  public AssemblyOscalSspSystemImplementation inventoryItems(List<AssemblyOscalImplementationCommonInventoryItem> inventoryItems) {
    this.inventoryItems = inventoryItems;
    return this;
  }

  public AssemblyOscalSspSystemImplementation addInventoryItemsItem(AssemblyOscalImplementationCommonInventoryItem inventoryItemsItem) {
    if (this.inventoryItems == null) {
      this.inventoryItems = new ArrayList<AssemblyOscalImplementationCommonInventoryItem>();
    }
    this.inventoryItems.add(inventoryItemsItem);
    return this;
  }

  /**
   * Get inventoryItems
   * @return inventoryItems
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonInventoryItem> getInventoryItems() {
    return inventoryItems;
  }

  public void setInventoryItems(List<AssemblyOscalImplementationCommonInventoryItem> inventoryItems) {
    this.inventoryItems = inventoryItems;
  }

  public AssemblyOscalSspSystemImplementation remarks(String remarks) {
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
    AssemblyOscalSspSystemImplementation assemblyOscalSspSystemImplementation = (AssemblyOscalSspSystemImplementation) o;
    return Objects.equals(this.props, assemblyOscalSspSystemImplementation.props) &&
        Objects.equals(this.links, assemblyOscalSspSystemImplementation.links) &&
        Objects.equals(this.leveragedAuthorizations, assemblyOscalSspSystemImplementation.leveragedAuthorizations) &&
        Objects.equals(this.users, assemblyOscalSspSystemImplementation.users) &&
        Objects.equals(this.components, assemblyOscalSspSystemImplementation.components) &&
        Objects.equals(this.inventoryItems, assemblyOscalSspSystemImplementation.inventoryItems) &&
        Objects.equals(this.remarks, assemblyOscalSspSystemImplementation.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(props, links, leveragedAuthorizations, users, components, inventoryItems, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspSystemImplementation {\n");
    
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    leveragedAuthorizations: ").append(toIndentedString(leveragedAuthorizations)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    inventoryItems: ").append(toIndentedString(inventoryItems)).append("\n");
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
