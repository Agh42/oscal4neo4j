package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AvailabilityImpactLevel;
import io.swagger.model.ConfidentialityImpactLevel;
import io.swagger.model.InformationTypeCategorization;
import io.swagger.model.IntegrityImpactLevel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains details about one information type that is stored, processed, or transmitted by the system, such as privacy information, and those defined in NIST SP 800-60.
 */
@Schema(description = "Contains details about one information type that is stored, processed, or transmitted by the system, such as privacy information, and those defined in NIST SP 800-60.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class InformationType   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("categorizations")
  @Valid
  private List<InformationTypeCategorization> categorizations = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("confidentiality-impact")
  private ConfidentialityImpactLevel confidentialityImpact = null;

  @JsonProperty("integrity-impact")
  private IntegrityImpactLevel integrityImpact = null;

  @JsonProperty("availability-impact")
  private AvailabilityImpactLevel availabilityImpact = null;

  public InformationType uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this information type entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(description = "A globally unique identifier that can be used to reference this information type entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
  
  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public InformationType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human readable name for the information type. This title should be meaningful within the context of the system.
   * @return title
   **/
  @Schema(required = true, description = "A human readable name for the information type. This title should be meaningful within the context of the system.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InformationType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of how this information type is used within the system.
   * @return description
   **/
  @Schema(required = true, description = "A summary of how this information type is used within the system.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InformationType categorizations(List<InformationTypeCategorization> categorizations) {
    this.categorizations = categorizations;
    return this;
  }

  public InformationType addCategorizationsItem(InformationTypeCategorization categorizationsItem) {
    if (this.categorizations == null) {
      this.categorizations = new ArrayList<InformationTypeCategorization>();
    }
    this.categorizations.add(categorizationsItem);
    return this;
  }

  /**
   * Get categorizations
   * @return categorizations
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<InformationTypeCategorization> getCategorizations() {
    return categorizations;
  }

  public void setCategorizations(List<InformationTypeCategorization> categorizations) {
    this.categorizations = categorizations;
  }

  public InformationType props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public InformationType addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public InformationType links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public InformationType addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public InformationType confidentialityImpact(ConfidentialityImpactLevel confidentialityImpact) {
    this.confidentialityImpact = confidentialityImpact;
    return this;
  }

  /**
   * Get confidentialityImpact
   * @return confidentialityImpact
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ConfidentialityImpactLevel getConfidentialityImpact() {
    return confidentialityImpact;
  }

  public void setConfidentialityImpact(ConfidentialityImpactLevel confidentialityImpact) {
    this.confidentialityImpact = confidentialityImpact;
  }

  public InformationType integrityImpact(IntegrityImpactLevel integrityImpact) {
    this.integrityImpact = integrityImpact;
    return this;
  }

  /**
   * Get integrityImpact
   * @return integrityImpact
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public IntegrityImpactLevel getIntegrityImpact() {
    return integrityImpact;
  }

  public void setIntegrityImpact(IntegrityImpactLevel integrityImpact) {
    this.integrityImpact = integrityImpact;
  }

  public InformationType availabilityImpact(AvailabilityImpactLevel availabilityImpact) {
    this.availabilityImpact = availabilityImpact;
    return this;
  }

  /**
   * Get availabilityImpact
   * @return availabilityImpact
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AvailabilityImpactLevel getAvailabilityImpact() {
    return availabilityImpact;
  }

  public void setAvailabilityImpact(AvailabilityImpactLevel availabilityImpact) {
    this.availabilityImpact = availabilityImpact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformationType informationType = (InformationType) o;
    return Objects.equals(this.uuid, informationType.uuid) &&
        Objects.equals(this.title, informationType.title) &&
        Objects.equals(this.description, informationType.description) &&
        Objects.equals(this.categorizations, informationType.categorizations) &&
        Objects.equals(this.props, informationType.props) &&
        Objects.equals(this.links, informationType.links) &&
        Objects.equals(this.confidentialityImpact, informationType.confidentialityImpact) &&
        Objects.equals(this.integrityImpact, informationType.integrityImpact) &&
        Objects.equals(this.availabilityImpact, informationType.availabilityImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, title, description, categorizations, props, links, confidentialityImpact, integrityImpact, availabilityImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationType {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categorizations: ").append(toIndentedString(categorizations)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    confidentialityImpact: ").append(toIndentedString(confidentialityImpact)).append("\n");
    sb.append("    integrityImpact: ").append(toIndentedString(integrityImpact)).append("\n");
    sb.append("    availabilityImpact: ").append(toIndentedString(availabilityImpact)).append("\n");
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
