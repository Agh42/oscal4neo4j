package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.AssemblyOscalCatalogCommonParameter1;
import io.swagger.model.AssemblyOscalCatalogCommonPart1;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specifies contents to be added into controls, in resolution
 */
@Schema(description = "Specifies contents to be added into controls, in resolution")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileAdd   {
  /**
   * Where to add the new content with respect to the targeted element (beside it or inside it)
   */
  public enum PositionEnum {
    BEFORE("before"),
    
    AFTER("after"),
    
    STARTING("starting"),
    
    ENDING("ending");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("position")
  private PositionEnum position = null;

  @JsonProperty("by-id")
  private String byId = null;

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

  public AssemblyOscalProfileAdd position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * Where to add the new content with respect to the targeted element (beside it or inside it)
   * @return position
   **/
  @Schema(description = "Where to add the new content with respect to the targeted element (beside it or inside it)")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public AssemblyOscalProfileAdd byId(String byId) {
    this.byId = byId;
    return this;
  }

  /**
   * Target location of the addition.
   * @return byId
   **/
  @Schema(description = "Target location of the addition.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getById() {
    return byId;
  }

  public void setById(String byId) {
    this.byId = byId;
  }

  public AssemblyOscalProfileAdd title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the control, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(description = "A name given to the control, which may be used by a tool for display and navigation.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalProfileAdd params(List<AssemblyOscalCatalogCommonParameter1> params) {
    this.params = params;
    return this;
  }

  public AssemblyOscalProfileAdd addParamsItem(AssemblyOscalCatalogCommonParameter1 paramsItem) {
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

  public AssemblyOscalProfileAdd props(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalProfileAdd addPropsItem(AssemblyOscalMetadataProperty1 propsItem) {
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

  public AssemblyOscalProfileAdd links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalProfileAdd addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalProfileAdd parts(List<AssemblyOscalCatalogCommonPart1> parts) {
    this.parts = parts;
    return this;
  }

  public AssemblyOscalProfileAdd addPartsItem(AssemblyOscalCatalogCommonPart1 partsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileAdd assemblyOscalProfileAdd = (AssemblyOscalProfileAdd) o;
    return Objects.equals(this.position, assemblyOscalProfileAdd.position) &&
        Objects.equals(this.byId, assemblyOscalProfileAdd.byId) &&
        Objects.equals(this.title, assemblyOscalProfileAdd.title) &&
        Objects.equals(this.params, assemblyOscalProfileAdd.params) &&
        Objects.equals(this.props, assemblyOscalProfileAdd.props) &&
        Objects.equals(this.links, assemblyOscalProfileAdd.links) &&
        Objects.equals(this.parts, assemblyOscalProfileAdd.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, byId, title, params, props, links, parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileAdd {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    byId: ").append(toIndentedString(byId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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
