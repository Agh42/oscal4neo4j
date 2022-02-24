package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalCatalogCommonParameter;
import io.swagger.model.AssemblyOscalCatalogCommonPart;
import io.swagger.model.AssemblyOscalCatalogControl;
import io.swagger.model.AssemblyOscalCatalogGroup;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A group of controls, or of groups of controls.
 */
@Schema(description = "A group of controls, or of groups of controls.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogGroup   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("params")
  @Valid
  private List<AssemblyOscalCatalogCommonParameter> params = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("parts")
  @Valid
  private List<AssemblyOscalCatalogCommonPart> parts = null;

  @JsonProperty("groups")
  @Valid
  private List<AssemblyOscalCatalogGroup> groups = null;

  @JsonProperty("controls")
  @Valid
  private List<AssemblyOscalCatalogControl> controls = null;

  public AssemblyOscalCatalogGroup id(String id) {
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

  public AssemblyOscalCatalogGroup propertyClass(String propertyClass) {
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

  public AssemblyOscalCatalogGroup title(String title) {
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

  public AssemblyOscalCatalogGroup params(List<AssemblyOscalCatalogCommonParameter> params) {
    this.params = params;
    return this;
  }

  public AssemblyOscalCatalogGroup addParamsItem(AssemblyOscalCatalogCommonParameter paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<AssemblyOscalCatalogCommonParameter>();
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
  @Size(min=1)   public List<AssemblyOscalCatalogCommonParameter> getParams() {
    return params;
  }

  public void setParams(List<AssemblyOscalCatalogCommonParameter> params) {
    this.params = params;
  }

  public AssemblyOscalCatalogGroup props(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalCatalogGroup addPropsItem(AssemblyOscalMetadataProperty propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataProperty> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
  }

  public AssemblyOscalCatalogGroup links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalCatalogGroup addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalCatalogGroup parts(List<AssemblyOscalCatalogCommonPart> parts) {
    this.parts = parts;
    return this;
  }

  public AssemblyOscalCatalogGroup addPartsItem(AssemblyOscalCatalogCommonPart partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<AssemblyOscalCatalogCommonPart>();
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
  @Size(min=1)   public List<AssemblyOscalCatalogCommonPart> getParts() {
    return parts;
  }

  public void setParts(List<AssemblyOscalCatalogCommonPart> parts) {
    this.parts = parts;
  }

  public AssemblyOscalCatalogGroup groups(List<AssemblyOscalCatalogGroup> groups) {
    this.groups = groups;
    return this;
  }

  public AssemblyOscalCatalogGroup addGroupsItem(AssemblyOscalCatalogGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<AssemblyOscalCatalogGroup>();
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
  @Size(min=1)   public List<AssemblyOscalCatalogGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<AssemblyOscalCatalogGroup> groups) {
    this.groups = groups;
  }

  public AssemblyOscalCatalogGroup controls(List<AssemblyOscalCatalogControl> controls) {
    this.controls = controls;
    return this;
  }

  public AssemblyOscalCatalogGroup addControlsItem(AssemblyOscalCatalogControl controlsItem) {
    if (this.controls == null) {
      this.controls = new ArrayList<AssemblyOscalCatalogControl>();
    }
    this.controls.add(controlsItem);
    return this;
  }

  /**
   * Get controls
   * @return controls
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogControl> getControls() {
    return controls;
  }

  public void setControls(List<AssemblyOscalCatalogControl> controls) {
    this.controls = controls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalCatalogGroup assemblyOscalCatalogGroup = (AssemblyOscalCatalogGroup) o;
    return Objects.equals(this.id, assemblyOscalCatalogGroup.id) &&
        Objects.equals(this.propertyClass, assemblyOscalCatalogGroup.propertyClass) &&
        Objects.equals(this.title, assemblyOscalCatalogGroup.title) &&
        Objects.equals(this.params, assemblyOscalCatalogGroup.params) &&
        Objects.equals(this.props, assemblyOscalCatalogGroup.props) &&
        Objects.equals(this.links, assemblyOscalCatalogGroup.links) &&
        Objects.equals(this.parts, assemblyOscalCatalogGroup.parts) &&
        Objects.equals(this.groups, assemblyOscalCatalogGroup.groups) &&
        Objects.equals(this.controls, assemblyOscalCatalogGroup.controls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propertyClass, title, params, props, links, parts, groups, controls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
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
