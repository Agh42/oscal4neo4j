package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataLocation2;
import io.swagger.model.AssemblyOscalMetadataParty2;
import io.swagger.model.AssemblyOscalMetadataProperty2;
import io.swagger.model.AssemblyOscalMetadataResponsibleParty2;
import io.swagger.model.AssemblyOscalMetadataRevision2;
import io.swagger.model.AssemblyOscalMetadataRole2;
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


public class AssemblyOscalMetadataMetadata2   {
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
  private List<AssemblyOscalMetadataRevision2> revisions = null;

  @JsonProperty("document-ids")
  @Valid
  private List<FieldOscalMetadataDocumentId> documentIds = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty2> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("roles")
  @Valid
  private List<AssemblyOscalMetadataRole2> roles = null;

  @JsonProperty("locations")
  @Valid
  private List<AssemblyOscalMetadataLocation2> locations = null;

  @JsonProperty("parties")
  @Valid
  private List<AssemblyOscalMetadataParty2> parties = null;

  @JsonProperty("responsible-parties")
  @Valid
  private List<AssemblyOscalMetadataResponsibleParty2> responsibleParties = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataMetadata2 title(String title) {
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

  public AssemblyOscalMetadataMetadata2 published(OffsetDateTime published) {
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

  public AssemblyOscalMetadataMetadata2 lastModified(OffsetDateTime lastModified) {
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

  public AssemblyOscalMetadataMetadata2 version(String version) {
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

  public AssemblyOscalMetadataMetadata2 oscalVersion(String oscalVersion) {
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

  public AssemblyOscalMetadataMetadata2 revisions(List<AssemblyOscalMetadataRevision2> revisions) {
    this.revisions = revisions;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addRevisionsItem(AssemblyOscalMetadataRevision2 revisionsItem) {
    if (this.revisions == null) {
      this.revisions = new ArrayList<AssemblyOscalMetadataRevision2>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataRevision2> getRevisions() {
    return revisions;
  }

  public void setRevisions(List<AssemblyOscalMetadataRevision2> revisions) {
    this.revisions = revisions;
  }

  public AssemblyOscalMetadataMetadata2 documentIds(List<FieldOscalMetadataDocumentId> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addDocumentIdsItem(FieldOscalMetadataDocumentId documentIdsItem) {
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

  public AssemblyOscalMetadataMetadata2 props(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addPropsItem(AssemblyOscalMetadataProperty2 propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty2>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataProperty2> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty2> props) {
    this.props = props;
  }

  public AssemblyOscalMetadataMetadata2 links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalMetadataMetadata2 roles(List<AssemblyOscalMetadataRole2> roles) {
    this.roles = roles;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addRolesItem(AssemblyOscalMetadataRole2 rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<AssemblyOscalMetadataRole2>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataRole2> getRoles() {
    return roles;
  }

  public void setRoles(List<AssemblyOscalMetadataRole2> roles) {
    this.roles = roles;
  }

  public AssemblyOscalMetadataMetadata2 locations(List<AssemblyOscalMetadataLocation2> locations) {
    this.locations = locations;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addLocationsItem(AssemblyOscalMetadataLocation2 locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<AssemblyOscalMetadataLocation2>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataLocation2> getLocations() {
    return locations;
  }

  public void setLocations(List<AssemblyOscalMetadataLocation2> locations) {
    this.locations = locations;
  }

  public AssemblyOscalMetadataMetadata2 parties(List<AssemblyOscalMetadataParty2> parties) {
    this.parties = parties;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addPartiesItem(AssemblyOscalMetadataParty2 partiesItem) {
    if (this.parties == null) {
      this.parties = new ArrayList<AssemblyOscalMetadataParty2>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataParty2> getParties() {
    return parties;
  }

  public void setParties(List<AssemblyOscalMetadataParty2> parties) {
    this.parties = parties;
  }

  public AssemblyOscalMetadataMetadata2 responsibleParties(List<AssemblyOscalMetadataResponsibleParty2> responsibleParties) {
    this.responsibleParties = responsibleParties;
    return this;
  }

  public AssemblyOscalMetadataMetadata2 addResponsiblePartiesItem(AssemblyOscalMetadataResponsibleParty2 responsiblePartiesItem) {
    if (this.responsibleParties == null) {
      this.responsibleParties = new ArrayList<AssemblyOscalMetadataResponsibleParty2>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataResponsibleParty2> getResponsibleParties() {
    return responsibleParties;
  }

  public void setResponsibleParties(List<AssemblyOscalMetadataResponsibleParty2> responsibleParties) {
    this.responsibleParties = responsibleParties;
  }

  public AssemblyOscalMetadataMetadata2 remarks(String remarks) {
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
    AssemblyOscalMetadataMetadata2 assemblyOscalMetadataMetadata2 = (AssemblyOscalMetadataMetadata2) o;
    return Objects.equals(this.title, assemblyOscalMetadataMetadata2.title) &&
        Objects.equals(this.published, assemblyOscalMetadataMetadata2.published) &&
        Objects.equals(this.lastModified, assemblyOscalMetadataMetadata2.lastModified) &&
        Objects.equals(this.version, assemblyOscalMetadataMetadata2.version) &&
        Objects.equals(this.oscalVersion, assemblyOscalMetadataMetadata2.oscalVersion) &&
        Objects.equals(this.revisions, assemblyOscalMetadataMetadata2.revisions) &&
        Objects.equals(this.documentIds, assemblyOscalMetadataMetadata2.documentIds) &&
        Objects.equals(this.props, assemblyOscalMetadataMetadata2.props) &&
        Objects.equals(this.links, assemblyOscalMetadataMetadata2.links) &&
        Objects.equals(this.roles, assemblyOscalMetadataMetadata2.roles) &&
        Objects.equals(this.locations, assemblyOscalMetadataMetadata2.locations) &&
        Objects.equals(this.parties, assemblyOscalMetadataMetadata2.parties) &&
        Objects.equals(this.responsibleParties, assemblyOscalMetadataMetadata2.responsibleParties) &&
        Objects.equals(this.remarks, assemblyOscalMetadataMetadata2.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, published, lastModified, version, oscalVersion, revisions, documentIds, props, links, roles, locations, parties, responsibleParties, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataMetadata2 {\n");
    
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
