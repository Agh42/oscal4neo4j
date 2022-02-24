package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalCatalogCommonPart;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A partition of a control&#x27;s definition or a child of another part.
 */
@Schema(description = "A partition of a control's definition or a child of another part.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogCommonPart   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ns")
  private String ns = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty> props = null;

  @JsonProperty("prose")
  private String prose = null;

  @JsonProperty("parts")
  @Valid
  private List<AssemblyOscalCatalogCommonPart> parts = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  public AssemblyOscalCatalogCommonPart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for a specific part instance. This identifier's uniqueness is document scoped and is intended to be consistent for the same part across minor revisions of the document.
   * @return id
   **/
  @Schema(description = "A unique identifier for a specific part instance. This identifier's uniqueness is document scoped and is intended to be consistent for the same part across minor revisions of the document.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssemblyOscalCatalogCommonPart name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A textual label that uniquely identifies the part's semantic type.
   * @return name
   **/
  @Schema(required = true, description = "A textual label that uniquely identifies the part's semantic type.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssemblyOscalCatalogCommonPart ns(String ns) {
    this.ns = ns;
    return this;
  }

  /**
   * A namespace qualifying the part's name. This allows different organizations to associate distinct semantics with the same name.
   * @return ns
   **/
  @Schema(description = "A namespace qualifying the part's name. This allows different organizations to associate distinct semantics with the same name.")
  
    public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public AssemblyOscalCatalogCommonPart propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * A textual label that provides a sub-type or characterization of the part's name. This can be used to further distinguish or discriminate between the semantics of multiple parts of the same control with the same name and ns.
   * @return propertyClass
   **/
  @Schema(description = "A textual label that provides a sub-type or characterization of the part's name. This can be used to further distinguish or discriminate between the semantics of multiple parts of the same control with the same name and ns.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public AssemblyOscalCatalogCommonPart title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the part, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(description = "A name given to the part, which may be used by a tool for display and navigation.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalCatalogCommonPart props(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalCatalogCommonPart addPropsItem(AssemblyOscalMetadataProperty propsItem) {
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

  public AssemblyOscalCatalogCommonPart prose(String prose) {
    this.prose = prose;
    return this;
  }

  /**
   * Permits multiple paragraphs, lists, tables etc.
   * @return prose
   **/
  @Schema(description = "Permits multiple paragraphs, lists, tables etc.")
  
    public String getProse() {
    return prose;
  }

  public void setProse(String prose) {
    this.prose = prose;
  }

  public AssemblyOscalCatalogCommonPart parts(List<AssemblyOscalCatalogCommonPart> parts) {
    this.parts = parts;
    return this;
  }

  public AssemblyOscalCatalogCommonPart addPartsItem(AssemblyOscalCatalogCommonPart partsItem) {
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

  public AssemblyOscalCatalogCommonPart links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalCatalogCommonPart addLinksItem(AssemblyOscalMetadataLink linksItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalCatalogCommonPart assemblyOscalCatalogCommonPart = (AssemblyOscalCatalogCommonPart) o;
    return Objects.equals(this.id, assemblyOscalCatalogCommonPart.id) &&
        Objects.equals(this.name, assemblyOscalCatalogCommonPart.name) &&
        Objects.equals(this.ns, assemblyOscalCatalogCommonPart.ns) &&
        Objects.equals(this.propertyClass, assemblyOscalCatalogCommonPart.propertyClass) &&
        Objects.equals(this.title, assemblyOscalCatalogCommonPart.title) &&
        Objects.equals(this.props, assemblyOscalCatalogCommonPart.props) &&
        Objects.equals(this.prose, assemblyOscalCatalogCommonPart.prose) &&
        Objects.equals(this.parts, assemblyOscalCatalogCommonPart.parts) &&
        Objects.equals(this.links, assemblyOscalCatalogCommonPart.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ns, propertyClass, title, props, prose, parts, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogCommonPart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    prose: ").append(toIndentedString(prose)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
