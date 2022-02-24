package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalSspDiagram;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A description of the logical flow of information within the system and across its boundaries, optionally supplemented by diagrams that illustrate these flows.
 */
@Schema(description = "A description of the logical flow of information within the system and across its boundaries, optionally supplemented by diagrams that illustrate these flows.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspDataFlow   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("diagrams")
  @Valid
  private List<AssemblyOscalSspDiagram> diagrams = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalSspDataFlow description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the system's data flow.
   * @return description
   **/
  @Schema(required = true, description = "A summary of the system's data flow.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalSspDataFlow props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalSspDataFlow addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalSspDataFlow links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalSspDataFlow addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalSspDataFlow diagrams(List<AssemblyOscalSspDiagram> diagrams) {
    this.diagrams = diagrams;
    return this;
  }

  public AssemblyOscalSspDataFlow addDiagramsItem(AssemblyOscalSspDiagram diagramsItem) {
    if (this.diagrams == null) {
      this.diagrams = new ArrayList<AssemblyOscalSspDiagram>();
    }
    this.diagrams.add(diagramsItem);
    return this;
  }

  /**
   * Get diagrams
   * @return diagrams
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalSspDiagram> getDiagrams() {
    return diagrams;
  }

  public void setDiagrams(List<AssemblyOscalSspDiagram> diagrams) {
    this.diagrams = diagrams;
  }

  public AssemblyOscalSspDataFlow remarks(String remarks) {
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
    AssemblyOscalSspDataFlow assemblyOscalSspDataFlow = (AssemblyOscalSspDataFlow) o;
    return Objects.equals(this.description, assemblyOscalSspDataFlow.description) &&
        Objects.equals(this.props, assemblyOscalSspDataFlow.props) &&
        Objects.equals(this.links, assemblyOscalSspDataFlow.links) &&
        Objects.equals(this.diagrams, assemblyOscalSspDataFlow.diagrams) &&
        Objects.equals(this.remarks, assemblyOscalSspDataFlow.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, props, links, diagrams, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspDataFlow {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    diagrams: ").append(toIndentedString(diagrams)).append("\n");
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
