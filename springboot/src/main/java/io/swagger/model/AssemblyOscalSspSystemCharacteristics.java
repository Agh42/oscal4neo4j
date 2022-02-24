package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.AssemblyOscalMetadataResponsibleParty3;
import io.swagger.model.AssemblyOscalSspAuthorizationBoundary;
import io.swagger.model.AssemblyOscalSspDataFlow;
import io.swagger.model.AssemblyOscalSspNetworkArchitecture;
import io.swagger.model.AssemblyOscalSspSecurityImpactLevel;
import io.swagger.model.AssemblyOscalSspStatus;
import io.swagger.model.AssemblyOscalSspSystemInformation;
import io.swagger.model.FieldOscalImplementationCommonSystemId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the characteristics of the system, such as its name, purpose, and security impact level.
 */
@Schema(description = "Contains the characteristics of the system, such as its name, purpose, and security impact level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspSystemCharacteristics   {
  @JsonProperty("system-ids")
  @Valid
  private List<FieldOscalImplementationCommonSystemId> systemIds = new ArrayList<FieldOscalImplementationCommonSystemId>();

  @JsonProperty("system-name")
  private String systemName = null;

  @JsonProperty("system-name-short")
  private String systemNameShort = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("date-authorized")
  private String dateAuthorized = null;

  @JsonProperty("security-sensitivity-level")
  private String securitySensitivityLevel = null;

  @JsonProperty("system-information")
  private AssemblyOscalSspSystemInformation systemInformation = null;

  @JsonProperty("security-impact-level")
  private AssemblyOscalSspSecurityImpactLevel securityImpactLevel = null;

  @JsonProperty("status")
  private AssemblyOscalSspStatus status = null;

  @JsonProperty("authorization-boundary")
  private AssemblyOscalSspAuthorizationBoundary authorizationBoundary = null;

  @JsonProperty("network-architecture")
  private AssemblyOscalSspNetworkArchitecture networkArchitecture = null;

  @JsonProperty("data-flow")
  private AssemblyOscalSspDataFlow dataFlow = null;

  @JsonProperty("responsible-parties")
  @Valid
  private List<AssemblyOscalMetadataResponsibleParty3> responsibleParties = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalSspSystemCharacteristics systemIds(List<FieldOscalImplementationCommonSystemId> systemIds) {
    this.systemIds = systemIds;
    return this;
  }

  public AssemblyOscalSspSystemCharacteristics addSystemIdsItem(FieldOscalImplementationCommonSystemId systemIdsItem) {
    this.systemIds.add(systemIdsItem);
    return this;
  }

  /**
   * Get systemIds
   * @return systemIds
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<FieldOscalImplementationCommonSystemId> getSystemIds() {
    return systemIds;
  }

  public void setSystemIds(List<FieldOscalImplementationCommonSystemId> systemIds) {
    this.systemIds = systemIds;
  }

  public AssemblyOscalSspSystemCharacteristics systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

  /**
   * The full name of the system.
   * @return systemName
   **/
  @Schema(required = true, description = "The full name of the system.")
      @NotNull

  @Pattern(regexp="^\\S(.*\\S)?$")   public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public AssemblyOscalSspSystemCharacteristics systemNameShort(String systemNameShort) {
    this.systemNameShort = systemNameShort;
    return this;
  }

  /**
   * A short name for the system, such as an acronym, that is suitable for display in a data table or summary list.
   * @return systemNameShort
   **/
  @Schema(description = "A short name for the system, such as an acronym, that is suitable for display in a data table or summary list.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getSystemNameShort() {
    return systemNameShort;
  }

  public void setSystemNameShort(String systemNameShort) {
    this.systemNameShort = systemNameShort;
  }

  public AssemblyOscalSspSystemCharacteristics description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the system.
   * @return description
   **/
  @Schema(required = true, description = "A summary of the system.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalSspSystemCharacteristics props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalSspSystemCharacteristics addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalSspSystemCharacteristics links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalSspSystemCharacteristics addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalSspSystemCharacteristics dateAuthorized(String dateAuthorized) {
    this.dateAuthorized = dateAuthorized;
    return this;
  }

  /**
   * The date the system received its authorization.
   * @return dateAuthorized
   **/
  @Schema(description = "The date the system received its authorization.")
  
  @Pattern(regexp="^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))(Z|[+-][0-9]{2}:[0-9]{2})?$")   public String getDateAuthorized() {
    return dateAuthorized;
  }

  public void setDateAuthorized(String dateAuthorized) {
    this.dateAuthorized = dateAuthorized;
  }

  public AssemblyOscalSspSystemCharacteristics securitySensitivityLevel(String securitySensitivityLevel) {
    this.securitySensitivityLevel = securitySensitivityLevel;
    return this;
  }

  /**
   * The overall information system sensitivity categorization, such as defined by FIPS-199.
   * @return securitySensitivityLevel
   **/
  @Schema(required = true, description = "The overall information system sensitivity categorization, such as defined by FIPS-199.")
      @NotNull

  @Pattern(regexp="^\\S(.*\\S)?$")   public String getSecuritySensitivityLevel() {
    return securitySensitivityLevel;
  }

  public void setSecuritySensitivityLevel(String securitySensitivityLevel) {
    this.securitySensitivityLevel = securitySensitivityLevel;
  }

  public AssemblyOscalSspSystemCharacteristics systemInformation(AssemblyOscalSspSystemInformation systemInformation) {
    this.systemInformation = systemInformation;
    return this;
  }

  /**
   * Get systemInformation
   * @return systemInformation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspSystemInformation getSystemInformation() {
    return systemInformation;
  }

  public void setSystemInformation(AssemblyOscalSspSystemInformation systemInformation) {
    this.systemInformation = systemInformation;
  }

  public AssemblyOscalSspSystemCharacteristics securityImpactLevel(AssemblyOscalSspSecurityImpactLevel securityImpactLevel) {
    this.securityImpactLevel = securityImpactLevel;
    return this;
  }

  /**
   * Get securityImpactLevel
   * @return securityImpactLevel
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspSecurityImpactLevel getSecurityImpactLevel() {
    return securityImpactLevel;
  }

  public void setSecurityImpactLevel(AssemblyOscalSspSecurityImpactLevel securityImpactLevel) {
    this.securityImpactLevel = securityImpactLevel;
  }

  public AssemblyOscalSspSystemCharacteristics status(AssemblyOscalSspStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspStatus getStatus() {
    return status;
  }

  public void setStatus(AssemblyOscalSspStatus status) {
    this.status = status;
  }

  public AssemblyOscalSspSystemCharacteristics authorizationBoundary(AssemblyOscalSspAuthorizationBoundary authorizationBoundary) {
    this.authorizationBoundary = authorizationBoundary;
    return this;
  }

  /**
   * Get authorizationBoundary
   * @return authorizationBoundary
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalSspAuthorizationBoundary getAuthorizationBoundary() {
    return authorizationBoundary;
  }

  public void setAuthorizationBoundary(AssemblyOscalSspAuthorizationBoundary authorizationBoundary) {
    this.authorizationBoundary = authorizationBoundary;
  }

  public AssemblyOscalSspSystemCharacteristics networkArchitecture(AssemblyOscalSspNetworkArchitecture networkArchitecture) {
    this.networkArchitecture = networkArchitecture;
    return this;
  }

  /**
   * Get networkArchitecture
   * @return networkArchitecture
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalSspNetworkArchitecture getNetworkArchitecture() {
    return networkArchitecture;
  }

  public void setNetworkArchitecture(AssemblyOscalSspNetworkArchitecture networkArchitecture) {
    this.networkArchitecture = networkArchitecture;
  }

  public AssemblyOscalSspSystemCharacteristics dataFlow(AssemblyOscalSspDataFlow dataFlow) {
    this.dataFlow = dataFlow;
    return this;
  }

  /**
   * Get dataFlow
   * @return dataFlow
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalSspDataFlow getDataFlow() {
    return dataFlow;
  }

  public void setDataFlow(AssemblyOscalSspDataFlow dataFlow) {
    this.dataFlow = dataFlow;
  }

  public AssemblyOscalSspSystemCharacteristics responsibleParties(List<AssemblyOscalMetadataResponsibleParty3> responsibleParties) {
    this.responsibleParties = responsibleParties;
    return this;
  }

  public AssemblyOscalSspSystemCharacteristics addResponsiblePartiesItem(AssemblyOscalMetadataResponsibleParty3 responsiblePartiesItem) {
    if (this.responsibleParties == null) {
      this.responsibleParties = new ArrayList<AssemblyOscalMetadataResponsibleParty3>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataResponsibleParty3> getResponsibleParties() {
    return responsibleParties;
  }

  public void setResponsibleParties(List<AssemblyOscalMetadataResponsibleParty3> responsibleParties) {
    this.responsibleParties = responsibleParties;
  }

  public AssemblyOscalSspSystemCharacteristics remarks(String remarks) {
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
    AssemblyOscalSspSystemCharacteristics assemblyOscalSspSystemCharacteristics = (AssemblyOscalSspSystemCharacteristics) o;
    return Objects.equals(this.systemIds, assemblyOscalSspSystemCharacteristics.systemIds) &&
        Objects.equals(this.systemName, assemblyOscalSspSystemCharacteristics.systemName) &&
        Objects.equals(this.systemNameShort, assemblyOscalSspSystemCharacteristics.systemNameShort) &&
        Objects.equals(this.description, assemblyOscalSspSystemCharacteristics.description) &&
        Objects.equals(this.props, assemblyOscalSspSystemCharacteristics.props) &&
        Objects.equals(this.links, assemblyOscalSspSystemCharacteristics.links) &&
        Objects.equals(this.dateAuthorized, assemblyOscalSspSystemCharacteristics.dateAuthorized) &&
        Objects.equals(this.securitySensitivityLevel, assemblyOscalSspSystemCharacteristics.securitySensitivityLevel) &&
        Objects.equals(this.systemInformation, assemblyOscalSspSystemCharacteristics.systemInformation) &&
        Objects.equals(this.securityImpactLevel, assemblyOscalSspSystemCharacteristics.securityImpactLevel) &&
        Objects.equals(this.status, assemblyOscalSspSystemCharacteristics.status) &&
        Objects.equals(this.authorizationBoundary, assemblyOscalSspSystemCharacteristics.authorizationBoundary) &&
        Objects.equals(this.networkArchitecture, assemblyOscalSspSystemCharacteristics.networkArchitecture) &&
        Objects.equals(this.dataFlow, assemblyOscalSspSystemCharacteristics.dataFlow) &&
        Objects.equals(this.responsibleParties, assemblyOscalSspSystemCharacteristics.responsibleParties) &&
        Objects.equals(this.remarks, assemblyOscalSspSystemCharacteristics.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemIds, systemName, systemNameShort, description, props, links, dateAuthorized, securitySensitivityLevel, systemInformation, securityImpactLevel, status, authorizationBoundary, networkArchitecture, dataFlow, responsibleParties, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspSystemCharacteristics {\n");
    
    sb.append("    systemIds: ").append(toIndentedString(systemIds)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    systemNameShort: ").append(toIndentedString(systemNameShort)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    dateAuthorized: ").append(toIndentedString(dateAuthorized)).append("\n");
    sb.append("    securitySensitivityLevel: ").append(toIndentedString(securitySensitivityLevel)).append("\n");
    sb.append("    systemInformation: ").append(toIndentedString(systemInformation)).append("\n");
    sb.append("    securityImpactLevel: ").append(toIndentedString(securityImpactLevel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    authorizationBoundary: ").append(toIndentedString(authorizationBoundary)).append("\n");
    sb.append("    networkArchitecture: ").append(toIndentedString(networkArchitecture)).append("\n");
    sb.append("    dataFlow: ").append(toIndentedString(dataFlow)).append("\n");
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
