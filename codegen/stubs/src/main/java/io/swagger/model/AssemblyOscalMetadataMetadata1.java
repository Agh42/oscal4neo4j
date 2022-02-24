package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataLocation1;
import io.swagger.model.AssemblyOscalMetadataParty1;
import io.swagger.model.AssemblyOscalMetadataProperty1;
import io.swagger.model.AssemblyOscalMetadataResponsibleParty1;
import io.swagger.model.AssemblyOscalMetadataRevision1;
import io.swagger.model.AssemblyOscalMetadataRole1;
import io.swagger.model.FieldOscalMetadataDocumentId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides information about the publication and availability of the containing document.
 */
@Schema(description = "Provides information about the publication and availability of the containing document.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataMetadata1   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("published")
  private OffsetDateTime published = null;

  @JsonProperty("last-modified")
  private OffsetDateTime lastModified = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("oscal-version")
  private String oscalVersion = null;

  @JsonProperty("revisions")
  @Valid
  private List<AssemblyOscalMetadataRevision1> revisions = null;

  @JsonProperty("document-ids")
  @Valid
  private List<FieldOscalMetadataDocumentId> documentIds = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty1> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("roles")
  @Valid
  private List<AssemblyOscalMetadataRole1> roles = null;

  @JsonProperty("locations")
  @Valid
  private List<AssemblyOscalMetadataLocation1> locations = null;

  @JsonProperty("parties")
  @Valid
  private List<AssemblyOscalMetadataParty1> parties = null;

  @JsonProperty("responsible-parties")
  @Valid
  private List<AssemblyOscalMetadataResponsibleParty1> responsibleParties = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataMetadata1 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the document, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(required = true, description = "A name given to the document, which may be used by a tool for display and navigation.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalMetadataMetadata1 published(OffsetDateTime published) {
    this.published = published;
    return this;
  }

  /**
   * The date and time the document was published. The date-time value must be formatted according to RFC 3339 with full time and time zone included.
   * @return published
   **/
  @Schema(description = "The date and time the document was published. The date-time value must be formatted according to RFC 3339 with full time and time zone included.")
  
    @Valid
  @Pattern(regexp="^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\.[0-9]+)?(Z|[+-][0-9]{2}:[0-9]{2})$")   public OffsetDateTime getPublished() {
    return published;
  }

  public void setPublished(OffsetDateTime published) {
    this.published = published;
  }

  public AssemblyOscalMetadataMetadata1 lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time the document was last modified. The date-time value must be formatted according to RFC 3339 with full time and time zone included.
   * @return lastModified
   **/
  @Schema(required = true, description = "The date and time the document was last modified. The date-time value must be formatted according to RFC 3339 with full time and time zone included.")
      @NotNull

    @Valid
  @Pattern(regexp="^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\.[0-9]+)?(Z|[+-][0-9]{2}:[0-9]{2})$")   public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public AssemblyOscalMetadataMetadata1 version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A string used to distinguish the current version of the document from other previous (and future) versions.
   * @return version
   **/
  @Schema(required = true, description = "A string used to distinguish the current version of the document from other previous (and future) versions.")
      @NotNull

  @Pattern(regexp="^\S(.*\S)?$")   public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public AssemblyOscalMetadataMetadata1 oscalVersion(String oscalVersion) {
    this.oscalVersion = oscalVersion;
    return this;
  }

  /**
   * The OSCAL model version the document was authored against.
   * @return oscalVersion
   **/
  @Schema(required = true, description = "The OSCAL model version the document was authored against.")
      @NotNull

  @Pattern(regexp="^\S(.*\S)?$")   public String getOscalVersion() {
    return oscalVersion;
  }

  public void setOscalVersion(String oscalVersion) {
    this.oscalVersion = oscalVersion;
  }

  public AssemblyOscalMetadataMetadata1 revisions(List<AssemblyOscalMetadataRevision1> revisions) {
    this.revisions = revisions;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addRevisionsItem(AssemblyOscalMetadataRevision1 revisionsItem) {
    if (this.revisions == null) {
      this.revisions = new ArrayList<AssemblyOscalMetadataRevision1>();
    }
    this.revisions.add(revisionsItem);
    return this;
  }

  /**
   * Get revisions
   * @return revisions
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataRevision1> getRevisions() {
    return revisions;
  }

  public void setRevisions(List<AssemblyOscalMetadataRevision1> revisions) {
    this.revisions = revisions;
  }

  public AssemblyOscalMetadataMetadata1 documentIds(List<FieldOscalMetadataDocumentId> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addDocumentIdsItem(FieldOscalMetadataDocumentId documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<FieldOscalMetadataDocumentId>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * Get documentIds
   * @return documentIds
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<FieldOscalMetadataDocumentId> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<FieldOscalMetadataDocumentId> documentIds) {
    this.documentIds = documentIds;
  }

  public AssemblyOscalMetadataMetadata1 props(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addPropsItem(AssemblyOscalMetadataProperty1 propsItem) {
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

  public AssemblyOscalMetadataMetadata1 links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalMetadataMetadata1 roles(List<AssemblyOscalMetadataRole1> roles) {
    this.roles = roles;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addRolesItem(AssemblyOscalMetadataRole1 rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<AssemblyOscalMetadataRole1>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataRole1> getRoles() {
    return roles;
  }

  public void setRoles(List<AssemblyOscalMetadataRole1> roles) {
    this.roles = roles;
  }

  public AssemblyOscalMetadataMetadata1 locations(List<AssemblyOscalMetadataLocation1> locations) {
    this.locations = locations;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addLocationsItem(AssemblyOscalMetadataLocation1 locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<AssemblyOscalMetadataLocation1>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataLocation1> getLocations() {
    return locations;
  }

  public void setLocations(List<AssemblyOscalMetadataLocation1> locations) {
    this.locations = locations;
  }

  public AssemblyOscalMetadataMetadata1 parties(List<AssemblyOscalMetadataParty1> parties) {
    this.parties = parties;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addPartiesItem(AssemblyOscalMetadataParty1 partiesItem) {
    if (this.parties == null) {
      this.parties = new ArrayList<AssemblyOscalMetadataParty1>();
    }
    this.parties.add(partiesItem);
    return this;
  }

  /**
   * Get parties
   * @return parties
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataParty1> getParties() {
    return parties;
  }

  public void setParties(List<AssemblyOscalMetadataParty1> parties) {
    this.parties = parties;
  }

  public AssemblyOscalMetadataMetadata1 responsibleParties(List<AssemblyOscalMetadataResponsibleParty1> responsibleParties) {
    this.responsibleParties = responsibleParties;
    return this;
  }

  public AssemblyOscalMetadataMetadata1 addResponsiblePartiesItem(AssemblyOscalMetadataResponsibleParty1 responsiblePartiesItem) {
    if (this.responsibleParties == null) {
      this.responsibleParties = new ArrayList<AssemblyOscalMetadataResponsibleParty1>();
    }
    this.responsibleParties.add(responsiblePartiesItem);
    return this;
  }

  /**
   * Get responsibleParties
   * @return responsibleParties
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataResponsibleParty1> getResponsibleParties() {
    return responsibleParties;
  }

  public void setResponsibleParties(List<AssemblyOscalMetadataResponsibleParty1> responsibleParties) {
    this.responsibleParties = responsibleParties;
  }

  public AssemblyOscalMetadataMetadata1 remarks(String remarks) {
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
    AssemblyOscalMetadataMetadata1 assemblyOscalMetadataMetadata1 = (AssemblyOscalMetadataMetadata1) o;
    return Objects.equals(this.title, assemblyOscalMetadataMetadata1.title) &&
        Objects.equals(this.published, assemblyOscalMetadataMetadata1.published) &&
        Objects.equals(this.lastModified, assemblyOscalMetadataMetadata1.lastModified) &&
        Objects.equals(this.version, assemblyOscalMetadataMetadata1.version) &&
        Objects.equals(this.oscalVersion, assemblyOscalMetadataMetadata1.oscalVersion) &&
        Objects.equals(this.revisions, assemblyOscalMetadataMetadata1.revisions) &&
        Objects.equals(this.documentIds, assemblyOscalMetadataMetadata1.documentIds) &&
        Objects.equals(this.props, assemblyOscalMetadataMetadata1.props) &&
        Objects.equals(this.links, assemblyOscalMetadataMetadata1.links) &&
        Objects.equals(this.roles, assemblyOscalMetadataMetadata1.roles) &&
        Objects.equals(this.locations, assemblyOscalMetadataMetadata1.locations) &&
        Objects.equals(this.parties, assemblyOscalMetadataMetadata1.parties) &&
        Objects.equals(this.responsibleParties, assemblyOscalMetadataMetadata1.responsibleParties) &&
        Objects.equals(this.remarks, assemblyOscalMetadataMetadata1.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, published, lastModified, version, oscalVersion, revisions, documentIds, props, links, roles, locations, parties, responsibleParties, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataMetadata1 {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    oscalVersion: ").append(toIndentedString(oscalVersion)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    parties: ").append(toIndentedString(parties)).append("\n");
    sb.append("    responsibleParties: ").append(toIndentedString(responsibleParties)).append("\n");
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
