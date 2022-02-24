package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.InformationType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains details about all information types that are stored, processed, or transmitted by the system, such as privacy information, and those defined in NIST SP 800-60.
 */
@Schema(description = "Contains details about all information types that are stored, processed, or transmitted by the system, such as privacy information, and those defined in NIST SP 800-60.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspSystemInformation   {
  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("information-types")
  @Valid
  private List<InformationType> informationTypes = new ArrayList<InformationType>();

  public AssemblyOscalSspSystemInformation props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalSspSystemInformation addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalSspSystemInformation links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalSspSystemInformation addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalSspSystemInformation informationTypes(List<InformationType> informationTypes) {
    this.informationTypes = informationTypes;
    return this;
  }

  public AssemblyOscalSspSystemInformation addInformationTypesItem(InformationType informationTypesItem) {
    this.informationTypes.add(informationTypesItem);
    return this;
  }

  /**
   * Get informationTypes
   * @return informationTypes
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<InformationType> getInformationTypes() {
    return informationTypes;
  }

  public void setInformationTypes(List<InformationType> informationTypes) {
    this.informationTypes = informationTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalSspSystemInformation assemblyOscalSspSystemInformation = (AssemblyOscalSspSystemInformation) o;
    return Objects.equals(this.props, assemblyOscalSspSystemInformation.props) &&
        Objects.equals(this.links, assemblyOscalSspSystemInformation.links) &&
        Objects.equals(this.informationTypes, assemblyOscalSspSystemInformation.informationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(props, links, informationTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspSystemInformation {\n");
    
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    informationTypes: ").append(toIndentedString(informationTypes)).append("\n");
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
