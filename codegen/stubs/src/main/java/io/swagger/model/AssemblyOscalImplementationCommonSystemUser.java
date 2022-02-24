package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalImplementationCommonAuthorizedPrivilege;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A type of user that interacts with the system based on an associated role.
 */
@Schema(description = "A type of user that interacts with the system based on an associated role.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonSystemUser   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("short-name")
  private String shortName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("role-ids")
  @Valid
  private List<String> roleIds = null;

  @JsonProperty("authorized-privileges")
  @Valid
  private List<AssemblyOscalImplementationCommonAuthorizedPrivilege> authorizedPrivileges = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalImplementationCommonSystemUser uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The unique identifier for the user class.
   * @return uuid
   **/
  @Schema(required = true, description = "The unique identifier for the user class.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalImplementationCommonSystemUser title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the user, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(description = "A name given to the user, which may be used by a tool for display and navigation.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalImplementationCommonSystemUser shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * A short common name, abbreviation, or acronym for the user.
   * @return shortName
   **/
  @Schema(description = "A short common name, abbreviation, or acronym for the user.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public AssemblyOscalImplementationCommonSystemUser description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the user's purpose within the system.
   * @return description
   **/
  @Schema(description = "A summary of the user's purpose within the system.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalImplementationCommonSystemUser props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemUser addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalImplementationCommonSystemUser links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemUser addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalImplementationCommonSystemUser roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemUser addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<String>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

  /**
   * Get roleIds
   * @return roleIds
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  public AssemblyOscalImplementationCommonSystemUser authorizedPrivileges(List<AssemblyOscalImplementationCommonAuthorizedPrivilege> authorizedPrivileges) {
    this.authorizedPrivileges = authorizedPrivileges;
    return this;
  }

  public AssemblyOscalImplementationCommonSystemUser addAuthorizedPrivilegesItem(AssemblyOscalImplementationCommonAuthorizedPrivilege authorizedPrivilegesItem) {
    if (this.authorizedPrivileges == null) {
      this.authorizedPrivileges = new ArrayList<AssemblyOscalImplementationCommonAuthorizedPrivilege>();
    }
    this.authorizedPrivileges.add(authorizedPrivilegesItem);
    return this;
  }

  /**
   * Get authorizedPrivileges
   * @return authorizedPrivileges
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonAuthorizedPrivilege> getAuthorizedPrivileges() {
    return authorizedPrivileges;
  }

  public void setAuthorizedPrivileges(List<AssemblyOscalImplementationCommonAuthorizedPrivilege> authorizedPrivileges) {
    this.authorizedPrivileges = authorizedPrivileges;
  }

  public AssemblyOscalImplementationCommonSystemUser remarks(String remarks) {
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
    AssemblyOscalImplementationCommonSystemUser assemblyOscalImplementationCommonSystemUser = (AssemblyOscalImplementationCommonSystemUser) o;
    return Objects.equals(this.uuid, assemblyOscalImplementationCommonSystemUser.uuid) &&
        Objects.equals(this.title, assemblyOscalImplementationCommonSystemUser.title) &&
        Objects.equals(this.shortName, assemblyOscalImplementationCommonSystemUser.shortName) &&
        Objects.equals(this.description, assemblyOscalImplementationCommonSystemUser.description) &&
        Objects.equals(this.props, assemblyOscalImplementationCommonSystemUser.props) &&
        Objects.equals(this.links, assemblyOscalImplementationCommonSystemUser.links) &&
        Objects.equals(this.roleIds, assemblyOscalImplementationCommonSystemUser.roleIds) &&
        Objects.equals(this.authorizedPrivileges, assemblyOscalImplementationCommonSystemUser.authorizedPrivileges) &&
        Objects.equals(this.remarks, assemblyOscalImplementationCommonSystemUser.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, title, shortName, description, props, links, roleIds, authorizedPrivileges, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonSystemUser {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    authorizedPrivileges: ").append(toIndentedString(authorizedPrivileges)).append("\n");
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
