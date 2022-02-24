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
 * A description of another authorized system from which this system inherits capabilities that satisfy security requirements. Another term for this concept is a common control provider.
 */
@Schema(description = "A description of another authorized system from which this system inherits capabilities that satisfy security requirements. Another term for this concept is a common control provider.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class LeveragedAuthorization   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("party-uuid")
  private String partyUuid = null;

  @JsonProperty("date-authorized")
  private String dateAuthorized = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public LeveragedAuthorization uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this leveraged authorization entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this leveraged authorization entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public LeveragedAuthorization title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human readable name for the leveraged authorization in the context of the system.
   * @return title
   **/
  @Schema(required = true, description = "A human readable name for the leveraged authorization in the context of the system.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LeveragedAuthorization props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public LeveragedAuthorization addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public LeveragedAuthorization links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public LeveragedAuthorization addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public LeveragedAuthorization partyUuid(String partyUuid) {
    this.partyUuid = partyUuid;
    return this;
  }

  /**
   * A reference to the party that manages the leveraged system.
   * @return partyUuid
   **/
  @Schema(required = true, description = "A reference to the party that manages the leveraged system.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getPartyUuid() {
    return partyUuid;
  }

  public void setPartyUuid(String partyUuid) {
    this.partyUuid = partyUuid;
  }

  public LeveragedAuthorization dateAuthorized(String dateAuthorized) {
    this.dateAuthorized = dateAuthorized;
    return this;
  }

  /**
   * The date the system received its authorization.
   * @return dateAuthorized
   **/
  @Schema(required = true, description = "The date the system received its authorization.")
      @NotNull

  @Pattern(regexp="^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))(Z|[+-][0-9]{2}:[0-9]{2})?$")   public String getDateAuthorized() {
    return dateAuthorized;
  }

  public void setDateAuthorized(String dateAuthorized) {
    this.dateAuthorized = dateAuthorized;
  }

  public LeveragedAuthorization remarks(String remarks) {
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
    LeveragedAuthorization leveragedAuthorization = (LeveragedAuthorization) o;
    return Objects.equals(this.uuid, leveragedAuthorization.uuid) &&
        Objects.equals(this.title, leveragedAuthorization.title) &&
        Objects.equals(this.props, leveragedAuthorization.props) &&
        Objects.equals(this.links, leveragedAuthorization.links) &&
        Objects.equals(this.partyUuid, leveragedAuthorization.partyUuid) &&
        Objects.equals(this.dateAuthorized, leveragedAuthorization.dateAuthorized) &&
        Objects.equals(this.remarks, leveragedAuthorization.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, title, props, links, partyUuid, dateAuthorized, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeveragedAuthorization {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    partyUuid: ").append(toIndentedString(partyUuid)).append("\n");
    sb.append("    dateAuthorized: ").append(toIndentedString(dateAuthorized)).append("\n");
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
