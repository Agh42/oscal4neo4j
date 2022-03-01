package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The expected level of impact resulting from the unauthorized modification of the described information.
 */
@Schema(description = "The expected level of impact resulting from the unauthorized modification of the described information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class IntegrityImpactLevel   {
  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("base")
  private String base = null;

  @JsonProperty("selected")
  private String selected = null;

  @JsonProperty("adjustment-justification")
  private String adjustmentJustification = null;

  public IntegrityImpactLevel props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public IntegrityImpactLevel addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public IntegrityImpactLevel links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public IntegrityImpactLevel addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public IntegrityImpactLevel base(String base) {
    this.base = base;
    return this;
  }

  /**
   * The prescribed base (Confidentiality, Integrity, or Availability) security impact level.
   * @return base
   **/
  @Schema(required = true, description = "The prescribed base (Confidentiality, Integrity, or Availability) security impact level.")
      @NotNull

  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public IntegrityImpactLevel selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * The selected (Confidentiality, Integrity, or Availability) security impact level.
   * @return selected
   **/
  @Schema(description = "The selected (Confidentiality, Integrity, or Availability) security impact level.")
  
  @Pattern(regexp=ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getSelected() {
    return selected;
  }

  public void setSelected(String selected) {
    this.selected = selected;
  }

  public IntegrityImpactLevel adjustmentJustification(String adjustmentJustification) {
    this.adjustmentJustification = adjustmentJustification;
    return this;
  }

  /**
   * If the selected security level is different from the base security level, this contains the justification for the change.
   * @return adjustmentJustification
   **/
  @Schema(description = "If the selected security level is different from the base security level, this contains the justification for the change.")
  
    public String getAdjustmentJustification() {
    return adjustmentJustification;
  }

  public void setAdjustmentJustification(String adjustmentJustification) {
    this.adjustmentJustification = adjustmentJustification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrityImpactLevel integrityImpactLevel = (IntegrityImpactLevel) o;
    return Objects.equals(this.props, integrityImpactLevel.props) &&
        Objects.equals(this.links, integrityImpactLevel.links) &&
        Objects.equals(this.base, integrityImpactLevel.base) &&
        Objects.equals(this.selected, integrityImpactLevel.selected) &&
        Objects.equals(this.adjustmentJustification, integrityImpactLevel.adjustmentJustification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(props, links, base, selected, adjustmentJustification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrityImpactLevel {\n");
    
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    adjustmentJustification: ").append(toIndentedString(adjustmentJustification)).append("\n");
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
