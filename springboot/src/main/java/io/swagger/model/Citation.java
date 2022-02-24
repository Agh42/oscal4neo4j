package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A citation consisting of end note text and optional structured bibliographic data.
 */
@Schema(description = "A citation consisting of end note text and optional structured bibliographic data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class Citation   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  public Citation text(String text) {
    this.text = text;
    return this;
  }

  /**
   * A line of citation text.
   * @return text
   **/
  @Schema(required = true, description = "A line of citation text.")
      @NotNull

    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Citation props(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
    return this;
  }

  public Citation addPropsItem(AssemblyOscalMetadataProperty propsItem) {
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

  public Citation links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public Citation addLinksItem(AssemblyOscalMetadataLink linksItem) {
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
    Citation citation = (Citation) o;
    return Objects.equals(this.text, citation.text) &&
        Objects.equals(this.props, citation.props) &&
        Objects.equals(this.links, citation.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, props, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Citation {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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
