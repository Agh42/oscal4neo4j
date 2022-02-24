package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An entry in a sequential list of revisions to the containing document in reverse chronological order (i.e., most recent previous revision first).
 */
@Schema(description = "An entry in a sequential list of revisions to the containing document in reverse chronological order (i.e., most recent previous revision first).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataRevision3   {
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

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataRevision3 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the document revision, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(description = "A name given to the document revision, which may be used by a tool for display and navigation.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalMetadataRevision3 published(OffsetDateTime published) {
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

  public AssemblyOscalMetadataRevision3 lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time the document was last modified. The date-time value must be formatted according to RFC 3339 with full time and time zone included.
   * @return lastModified
   **/
  @Schema(description = "The date and time the document was last modified. The date-time value must be formatted according to RFC 3339 with full time and time zone included.")
  
    @Valid
  @Pattern(regexp="^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\.[0-9]+)?(Z|[+-][0-9]{2}:[0-9]{2})$")   public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public AssemblyOscalMetadataRevision3 version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A string used to distinguish the current version of the document from other previous (and future) versions.
   * @return version
   **/
  @Schema(description = "A string used to distinguish the current version of the document from other previous (and future) versions.")
  
  @Pattern(regexp="^\S(.*\S)?$")   public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public AssemblyOscalMetadataRevision3 oscalVersion(String oscalVersion) {
    this.oscalVersion = oscalVersion;
    return this;
  }

  /**
   * The OSCAL model version the document was authored against.
   * @return oscalVersion
   **/
  @Schema(description = "The OSCAL model version the document was authored against.")
  
  @Pattern(regexp="^\S(.*\S)?$")   public String getOscalVersion() {
    return oscalVersion;
  }

  public void setOscalVersion(String oscalVersion) {
    this.oscalVersion = oscalVersion;
  }

  public AssemblyOscalMetadataRevision3 props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalMetadataRevision3 addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalMetadataRevision3 links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalMetadataRevision3 addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalMetadataRevision3 remarks(String remarks) {
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
    AssemblyOscalMetadataRevision3 assemblyOscalMetadataRevision3 = (AssemblyOscalMetadataRevision3) o;
    return Objects.equals(this.title, assemblyOscalMetadataRevision3.title) &&
        Objects.equals(this.published, assemblyOscalMetadataRevision3.published) &&
        Objects.equals(this.lastModified, assemblyOscalMetadataRevision3.lastModified) &&
        Objects.equals(this.version, assemblyOscalMetadataRevision3.version) &&
        Objects.equals(this.oscalVersion, assemblyOscalMetadataRevision3.oscalVersion) &&
        Objects.equals(this.props, assemblyOscalMetadataRevision3.props) &&
        Objects.equals(this.links, assemblyOscalMetadataRevision3.links) &&
        Objects.equals(this.remarks, assemblyOscalMetadataRevision3.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, published, lastModified, version, oscalVersion, props, links, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataRevision3 {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    oscalVersion: ").append(toIndentedString(oscalVersion)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
