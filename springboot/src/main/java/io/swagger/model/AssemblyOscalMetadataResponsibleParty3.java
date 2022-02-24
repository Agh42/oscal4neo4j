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
 * A reference to a set of organizations or persons that have responsibility for performing a referenced role in the context of the containing object.
 */
@Schema(description = "A reference to a set of organizations or persons that have responsibility for performing a referenced role in the context of the containing object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataResponsibleParty3   {
  @JsonProperty("role-id")
  private String roleId = null;

  @JsonProperty("party-uuids")
  @Valid
  private List<String> partyUuids = new ArrayList<String>();

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataResponsibleParty3 roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * The role that the party is responsible for.
   * @return roleId
   **/
  @Schema(required = true, description = "The role that the party is responsible for.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public AssemblyOscalMetadataResponsibleParty3 partyUuids(List<String> partyUuids) {
    this.partyUuids = partyUuids;
    return this;
  }

  public AssemblyOscalMetadataResponsibleParty3 addPartyUuidsItem(String partyUuidsItem) {
    this.partyUuids.add(partyUuidsItem);
    return this;
  }

  /**
   * Get partyUuids
   * @return partyUuids
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1)   public List<String> getPartyUuids() {
    return partyUuids;
  }

  public void setPartyUuids(List<String> partyUuids) {
    this.partyUuids = partyUuids;
  }

  public AssemblyOscalMetadataResponsibleParty3 props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalMetadataResponsibleParty3 addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalMetadataResponsibleParty3 links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalMetadataResponsibleParty3 addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalMetadataResponsibleParty3 remarks(String remarks) {
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
    AssemblyOscalMetadataResponsibleParty3 assemblyOscalMetadataResponsibleParty3 = (AssemblyOscalMetadataResponsibleParty3) o;
    return Objects.equals(this.roleId, assemblyOscalMetadataResponsibleParty3.roleId) &&
        Objects.equals(this.partyUuids, assemblyOscalMetadataResponsibleParty3.partyUuids) &&
        Objects.equals(this.props, assemblyOscalMetadataResponsibleParty3.props) &&
        Objects.equals(this.links, assemblyOscalMetadataResponsibleParty3.links) &&
        Objects.equals(this.remarks, assemblyOscalMetadataResponsibleParty3.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, partyUuids, props, links, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataResponsibleParty3 {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    partyUuids: ").append(toIndentedString(partyUuids)).append("\n");
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
