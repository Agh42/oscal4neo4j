package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.ControlImplementationResponsibility;
import io.swagger.model.ProvidedControlImplementation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies content intended for external consumption, such as with leveraged organizations.
 */
@Schema(description = "Identifies content intended for external consumption, such as with leveraged organizations.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class Export   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("provided")
  @Valid
  private List<ProvidedControlImplementation> provided = null;

  @JsonProperty("responsibilities")
  @Valid
  private List<ControlImplementationResponsibility> responsibilities = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public Export description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An implementation statement that describes the aspects of the control or control statement implementation that can be available to another system leveraging this system.
   * @return description
   **/
  @Schema(description = "An implementation statement that describes the aspects of the control or control statement implementation that can be available to another system leveraging this system.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Export props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public Export addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public Export links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public Export addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public Export provided(List<ProvidedControlImplementation> provided) {
    this.provided = provided;
    return this;
  }

  public Export addProvidedItem(ProvidedControlImplementation providedItem) {
    if (this.provided == null) {
      this.provided = new ArrayList<ProvidedControlImplementation>();
    }
    this.provided.add(providedItem);
    return this;
  }

  /**
   * Get provided
   * @return provided
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<ProvidedControlImplementation> getProvided() {
    return provided;
  }

  public void setProvided(List<ProvidedControlImplementation> provided) {
    this.provided = provided;
  }

  public Export responsibilities(List<ControlImplementationResponsibility> responsibilities) {
    this.responsibilities = responsibilities;
    return this;
  }

  public Export addResponsibilitiesItem(ControlImplementationResponsibility responsibilitiesItem) {
    if (this.responsibilities == null) {
      this.responsibilities = new ArrayList<ControlImplementationResponsibility>();
    }
    this.responsibilities.add(responsibilitiesItem);
    return this;
  }

  /**
   * Get responsibilities
   * @return responsibilities
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<ControlImplementationResponsibility> getResponsibilities() {
    return responsibilities;
  }

  public void setResponsibilities(List<ControlImplementationResponsibility> responsibilities) {
    this.responsibilities = responsibilities;
  }

  public Export remarks(String remarks) {
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
    Export export = (Export) o;
    return Objects.equals(this.description, export.description) &&
        Objects.equals(this.props, export.props) &&
        Objects.equals(this.links, export.links) &&
        Objects.equals(this.provided, export.provided) &&
        Objects.equals(this.responsibilities, export.responsibilities) &&
        Objects.equals(this.remarks, export.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, props, links, provided, responsibilities, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Export {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    provided: ").append(toIndentedString(provided)).append("\n");
    sb.append("    responsibilities: ").append(toIndentedString(responsibilities)).append("\n");
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
