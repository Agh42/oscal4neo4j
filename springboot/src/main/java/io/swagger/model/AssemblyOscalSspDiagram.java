package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A graphic that provides a visual representation the system, or some aspect of it.
 */
@Schema(description = "A graphic that provides a visual representation the system, or some aspect of it.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspDiagram   {
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

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalSspDiagram uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The identifier for this diagram.
   * @return uuid
   **/
  @Schema(required = true, description = "The identifier for this diagram.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalSspDiagram description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the diagram.
   * @return description
   **/
  @Schema(description = "A summary of the diagram.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalSspDiagram props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalSspDiagram addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalSspDiagram links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalSspDiagram addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalSspDiagram caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * A brief caption to annotate the diagram.
   * @return caption
   **/
  @Schema(description = "A brief caption to annotate the diagram.")
  
    public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public AssemblyOscalSspDiagram remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Commentary about the diagram that enhances it.
   * @return remarks
   **/
  @Schema(description = "Commentary about the diagram that enhances it.")
  
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
    AssemblyOscalSspDiagram assemblyOscalSspDiagram = (AssemblyOscalSspDiagram) o;
    return Objects.equals(this.uuid, assemblyOscalSspDiagram.uuid) &&
        Objects.equals(this.description, assemblyOscalSspDiagram.description) &&
        Objects.equals(this.props, assemblyOscalSspDiagram.props) &&
        Objects.equals(this.links, assemblyOscalSspDiagram.links) &&
        Objects.equals(this.caption, assemblyOscalSspDiagram.caption) &&
        Objects.equals(this.remarks, assemblyOscalSspDiagram.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, description, props, links, caption, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspDiagram {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
