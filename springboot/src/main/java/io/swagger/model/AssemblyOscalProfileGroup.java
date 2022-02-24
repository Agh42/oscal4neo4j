package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalCatalogCommonParameter1;
import io.swagger.model.AssemblyOscalCatalogCommonPart1;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty1;
import io.swagger.model.AssemblyOscalProfileGroup;
import io.swagger.model.AssemblyOscalProfileInsertControls;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A group of (selected) controls or of groups of controls
 */
@Schema(description = "A group of (selected) controls or of groups of controls")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileGroup   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("params")
  @Valid
  private List<AssemblyOscalCatalogCommonParameter1> params = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty1> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("parts")
  @Valid
  private List<AssemblyOscalCatalogCommonPart1> parts = null;

  @JsonProperty("groups")
  @Valid
  private List<AssemblyOscalProfileGroup> groups = null;

  @JsonProperty("insert-controls")
  @Valid
  private List<AssemblyOscalProfileInsertControls> insertControls = null;

  public AssemblyOscalProfileGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for a specific group instance that can be used to reference the group within this and in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same group across minor revisions of the document.
   * @return id
   **/
  @Schema(description = "A unique identifier for a specific group instance that can be used to reference the group within this and in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same group across minor revisions of the document.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssemblyOscalProfileGroup propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * A textual label that provides a sub-type or characterization of the group.
   * @return propertyClass
   **/
  @Schema(description = "A textual label that provides a sub-type or characterization of the group.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public AssemblyOscalProfileGroup title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the group, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(required = true, description = "A name given to the group, which may be used by a tool for display and navigation.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalProfileGroup params(List<AssemblyOscalCatalogCommonParameter1> params) {
    this.params = params;
    return this;
  }

  public AssemblyOscalProfileGroup addParamsItem(AssemblyOscalCatalogCommonParameter1 paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<AssemblyOscalCatalogCommonParameter1>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogCommonParameter1> getParams() {
    return params;
  }

  public void setParams(List<AssemblyOscalCatalogCommonParameter1> params) {
    this.params = params;
  }

  public AssemblyOscalProfileGroup props(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalProfileGroup addPropsItem(AssemblyOscalMetadataProperty1 propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty1>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataProperty1> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
  }

  public AssemblyOscalProfileGroup links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalProfileGroup addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalProfileGroup parts(List<AssemblyOscalCatalogCommonPart1> parts) {
    this.parts = parts;
    return this;
  }

  public AssemblyOscalProfileGroup addPartsItem(AssemblyOscalCatalogCommonPart1 partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<AssemblyOscalCatalogCommonPart1>();
    }
    this.parts.add(partsItem);
    return this;
  }

  /**
   * Get parts
   * @return parts
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogCommonPart1> getParts() {
    return parts;
  }

  public void setParts(List<AssemblyOscalCatalogCommonPart1> parts) {
    this.parts = parts;
  }

  public AssemblyOscalProfileGroup groups(List<AssemblyOscalProfileGroup> groups) {
    this.groups = groups;
    return this;
  }

  public AssemblyOscalProfileGroup addGroupsItem(AssemblyOscalProfileGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<AssemblyOscalProfileGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<AssemblyOscalProfileGroup> groups) {
    this.groups = groups;
  }

  public AssemblyOscalProfileGroup insertControls(List<AssemblyOscalProfileInsertControls> insertControls) {
    this.insertControls = insertControls;
    return this;
  }

  public AssemblyOscalProfileGroup addInsertControlsItem(AssemblyOscalProfileInsertControls insertControlsItem) {
    if (this.insertControls == null) {
      this.insertControls = new ArrayList<AssemblyOscalProfileInsertControls>();
    }
    this.insertControls.add(insertControlsItem);
    return this;
  }

  /**
   * Get insertControls
   * @return insertControls
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileInsertControls> getInsertControls() {
    return insertControls;
  }

  public void setInsertControls(List<AssemblyOscalProfileInsertControls> insertControls) {
    this.insertControls = insertControls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileGroup assemblyOscalProfileGroup = (AssemblyOscalProfileGroup) o;
    return Objects.equals(this.id, assemblyOscalProfileGroup.id) &&
        Objects.equals(this.propertyClass, assemblyOscalProfileGroup.propertyClass) &&
        Objects.equals(this.title, assemblyOscalProfileGroup.title) &&
        Objects.equals(this.params, assemblyOscalProfileGroup.params) &&
        Objects.equals(this.props, assemblyOscalProfileGroup.props) &&
        Objects.equals(this.links, assemblyOscalProfileGroup.links) &&
        Objects.equals(this.parts, assemblyOscalProfileGroup.parts) &&
        Objects.equals(this.groups, assemblyOscalProfileGroup.groups) &&
        Objects.equals(this.insertControls, assemblyOscalProfileGroup.insertControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propertyClass, title, params, props, links, parts, groups, insertControls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    insertControls: ").append(toIndentedString(insertControls)).append("\n");
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
