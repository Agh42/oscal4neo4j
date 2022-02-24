package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalCatalogCommonParameter;
import io.swagger.model.AssemblyOscalCatalogCommonPart;
import io.swagger.model.AssemblyOscalCatalogControl;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A structured information object representing a security or privacy control. Each security or privacy control within the Catalog is defined by a distinct control instance.
 */
@Schema(description = "A structured information object representing a security or privacy control. Each security or privacy control within the Catalog is defined by a distinct control instance.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogControl   {
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

  @JsonProperty("controls")
  @Valid
  private List<AssemblyOscalCatalogControl> controls = null;

  public AssemblyOscalCatalogControl id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for a specific control instance that can be used to reference the control in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same control across minor revisions of the document.
   * @return id
   **/
  @Schema(required = true, description = "A unique identifier for a specific control instance that can be used to reference the control in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same control across minor revisions of the document.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssemblyOscalCatalogControl propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * A textual label that provides a sub-type or characterization of the control.
   * @return propertyClass
   **/
  @Schema(description = "A textual label that provides a sub-type or characterization of the control.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public AssemblyOscalCatalogControl title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the control, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(required = true, description = "A name given to the control, which may be used by a tool for display and navigation.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalCatalogControl params(List<AssemblyOscalCatalogCommonParameter> params) {
    this.params = params;
    return this;
  }

  public AssemblyOscalCatalogControl addParamsItem(AssemblyOscalCatalogCommonParameter paramsItem) {
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

  public AssemblyOscalCatalogControl props(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalCatalogControl addPropsItem(AssemblyOscalMetadataProperty propsItem) {
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

  public AssemblyOscalCatalogControl links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalCatalogControl addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalCatalogControl parts(List<AssemblyOscalCatalogCommonPart> parts) {
    this.parts = parts;
    return this;
  }

  public AssemblyOscalCatalogControl addPartsItem(AssemblyOscalCatalogCommonPart partsItem) {
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

  public AssemblyOscalCatalogControl controls(List<AssemblyOscalCatalogControl> controls) {
    this.controls = controls;
    return this;
  }

  public AssemblyOscalCatalogControl addControlsItem(AssemblyOscalCatalogControl controlsItem) {
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
    AssemblyOscalCatalogControl assemblyOscalCatalogControl = (AssemblyOscalCatalogControl) o;
    return Objects.equals(this.id, assemblyOscalCatalogControl.id) &&
        Objects.equals(this.propertyClass, assemblyOscalCatalogControl.propertyClass) &&
        Objects.equals(this.title, assemblyOscalCatalogControl.title) &&
        Objects.equals(this.params, assemblyOscalCatalogControl.params) &&
        Objects.equals(this.props, assemblyOscalCatalogControl.props) &&
        Objects.equals(this.links, assemblyOscalCatalogControl.links) &&
        Objects.equals(this.parts, assemblyOscalCatalogControl.parts) &&
        Objects.equals(this.controls, assemblyOscalCatalogControl.controls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propertyClass, title, params, props, links, parts, controls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogControl {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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
