package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.AssemblyOscalMetadataAddress3;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty3;
import io.swagger.model.FieldOscalMetadataTelephoneNumber;
import io.swagger.model.PartyExternalIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A responsible entity which is either a person or an organization.
 */
@Schema(description = "A responsible entity which is either a person or an organization.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataParty3   {
  @JsonProperty("uuid")
  private String uuid = null;

  /**
   * A category describing the kind of party the object describes.
   */
  public enum TypeEnum {
    PERSON("person"),
    
    ORGANIZATION("organization");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("short-name")
  private String shortName = null;

  @JsonProperty("external-ids")
  @Valid
  private List<PartyExternalIdentifier> externalIds = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty3> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("email-addresses")
  @Valid
  private List<String> emailAddresses = null;

  @JsonProperty("telephone-numbers")
  @Valid
  private List<FieldOscalMetadataTelephoneNumber> telephoneNumbers = null;

  @JsonProperty("addresses")
  @Valid
  private List<AssemblyOscalMetadataAddress3> addresses = null;

  @JsonProperty("location-uuids")
  @Valid
  private List<String> locationUuids = null;

  @JsonProperty("member-of-organizations")
  @Valid
  private List<String> memberOfOrganizations = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataParty3 uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A unique identifier that can be used to reference this defined location elsewhere in an OSCAL document. A UUID should be consistently used for a given party across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A unique identifier that can be used to reference this defined location elsewhere in an OSCAL document. A UUID should be consistently used for a given party across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalMetadataParty3 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * A category describing the kind of party the object describes.
   * @return type
   **/
  @Schema(required = true, description = "A category describing the kind of party the object describes.")
      @NotNull

  @Pattern(regexp="^\\S(.*\\S)?$")   public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AssemblyOscalMetadataParty3 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of the party. This is typically the legal name associated with the party.
   * @return name
   **/
  @Schema(description = "The full name of the party. This is typically the legal name associated with the party.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssemblyOscalMetadataParty3 shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * A short common name, abbreviation, or acronym for the party.
   * @return shortName
   **/
  @Schema(description = "A short common name, abbreviation, or acronym for the party.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public AssemblyOscalMetadataParty3 externalIds(List<PartyExternalIdentifier> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public AssemblyOscalMetadataParty3 addExternalIdsItem(PartyExternalIdentifier externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new ArrayList<PartyExternalIdentifier>();
    }
    this.externalIds.add(externalIdsItem);
    return this;
  }

  /**
   * Get externalIds
   * @return externalIds
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<PartyExternalIdentifier> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(List<PartyExternalIdentifier> externalIds) {
    this.externalIds = externalIds;
  }

  public AssemblyOscalMetadataParty3 props(List<AssemblyOscalMetadataProperty3> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalMetadataParty3 addPropsItem(AssemblyOscalMetadataProperty3 propsItem) {
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

  public AssemblyOscalMetadataParty3 links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalMetadataParty3 addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalMetadataParty3 emailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public AssemblyOscalMetadataParty3 addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<String>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

  /**
   * Get emailAddresses
   * @return emailAddresses
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public AssemblyOscalMetadataParty3 telephoneNumbers(List<FieldOscalMetadataTelephoneNumber> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public AssemblyOscalMetadataParty3 addTelephoneNumbersItem(FieldOscalMetadataTelephoneNumber telephoneNumbersItem) {
    if (this.telephoneNumbers == null) {
      this.telephoneNumbers = new ArrayList<FieldOscalMetadataTelephoneNumber>();
    }
    this.telephoneNumbers.add(telephoneNumbersItem);
    return this;
  }

  /**
   * Get telephoneNumbers
   * @return telephoneNumbers
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<FieldOscalMetadataTelephoneNumber> getTelephoneNumbers() {
    return telephoneNumbers;
  }

  public void setTelephoneNumbers(List<FieldOscalMetadataTelephoneNumber> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
  }

  public AssemblyOscalMetadataParty3 addresses(List<AssemblyOscalMetadataAddress3> addresses) {
    this.addresses = addresses;
    return this;
  }

  public AssemblyOscalMetadataParty3 addAddressesItem(AssemblyOscalMetadataAddress3 addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<AssemblyOscalMetadataAddress3>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataAddress3> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AssemblyOscalMetadataAddress3> addresses) {
    this.addresses = addresses;
  }

  public AssemblyOscalMetadataParty3 locationUuids(List<String> locationUuids) {
    this.locationUuids = locationUuids;
    return this;
  }

  public AssemblyOscalMetadataParty3 addLocationUuidsItem(String locationUuidsItem) {
    if (this.locationUuids == null) {
      this.locationUuids = new ArrayList<String>();
    }
    this.locationUuids.add(locationUuidsItem);
    return this;
  }

  /**
   * Get locationUuids
   * @return locationUuids
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getLocationUuids() {
    return locationUuids;
  }

  public void setLocationUuids(List<String> locationUuids) {
    this.locationUuids = locationUuids;
  }

  public AssemblyOscalMetadataParty3 memberOfOrganizations(List<String> memberOfOrganizations) {
    this.memberOfOrganizations = memberOfOrganizations;
    return this;
  }

  public AssemblyOscalMetadataParty3 addMemberOfOrganizationsItem(String memberOfOrganizationsItem) {
    if (this.memberOfOrganizations == null) {
      this.memberOfOrganizations = new ArrayList<String>();
    }
    this.memberOfOrganizations.add(memberOfOrganizationsItem);
    return this;
  }

  /**
   * Get memberOfOrganizations
   * @return memberOfOrganizations
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getMemberOfOrganizations() {
    return memberOfOrganizations;
  }

  public void setMemberOfOrganizations(List<String> memberOfOrganizations) {
    this.memberOfOrganizations = memberOfOrganizations;
  }

  public AssemblyOscalMetadataParty3 remarks(String remarks) {
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
    AssemblyOscalMetadataParty3 assemblyOscalMetadataParty3 = (AssemblyOscalMetadataParty3) o;
    return Objects.equals(this.uuid, assemblyOscalMetadataParty3.uuid) &&
        Objects.equals(this.type, assemblyOscalMetadataParty3.type) &&
        Objects.equals(this.name, assemblyOscalMetadataParty3.name) &&
        Objects.equals(this.shortName, assemblyOscalMetadataParty3.shortName) &&
        Objects.equals(this.externalIds, assemblyOscalMetadataParty3.externalIds) &&
        Objects.equals(this.props, assemblyOscalMetadataParty3.props) &&
        Objects.equals(this.links, assemblyOscalMetadataParty3.links) &&
        Objects.equals(this.emailAddresses, assemblyOscalMetadataParty3.emailAddresses) &&
        Objects.equals(this.telephoneNumbers, assemblyOscalMetadataParty3.telephoneNumbers) &&
        Objects.equals(this.addresses, assemblyOscalMetadataParty3.addresses) &&
        Objects.equals(this.locationUuids, assemblyOscalMetadataParty3.locationUuids) &&
        Objects.equals(this.memberOfOrganizations, assemblyOscalMetadataParty3.memberOfOrganizations) &&
        Objects.equals(this.remarks, assemblyOscalMetadataParty3.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, name, shortName, externalIds, props, links, emailAddresses, telephoneNumbers, addresses, locationUuids, memberOfOrganizations, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataParty3 {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    telephoneNumbers: ").append(toIndentedString(telephoneNumbers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    locationUuids: ").append(toIndentedString(locationUuids)).append("\n");
    sb.append("    memberOfOrganizations: ").append(toIndentedString(memberOfOrganizations)).append("\n");
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
