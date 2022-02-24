package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataAddress1;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty1;
import io.swagger.model.FieldOscalMetadataTelephoneNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A location, with associated metadata that can be referenced.
 */
@Schema(description = "A location, with associated metadata that can be referenced.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataLocation1   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("address")
  private AssemblyOscalMetadataAddress1 address = null;

  @JsonProperty("email-addresses")
  @Valid
  private List<String> emailAddresses = null;

  @JsonProperty("telephone-numbers")
  @Valid
  private List<FieldOscalMetadataTelephoneNumber> telephoneNumbers = null;

  @JsonProperty("urls")
  @Valid
  private List<String> urls = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty1> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataLocation1 uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A unique identifier that can be used to reference this defined location elsewhere in an OSCAL document. A UUID should be consistently used for a given location across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A unique identifier that can be used to reference this defined location elsewhere in an OSCAL document. A UUID should be consistently used for a given location across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalMetadataLocation1 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the location, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(description = "A name given to the location, which may be used by a tool for display and navigation.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalMetadataLocation1 address(AssemblyOscalMetadataAddress1 address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AssemblyOscalMetadataAddress1 getAddress() {
    return address;
  }

  public void setAddress(AssemblyOscalMetadataAddress1 address) {
    this.address = address;
  }

  public AssemblyOscalMetadataLocation1 emailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public AssemblyOscalMetadataLocation1 addEmailAddressesItem(String emailAddressesItem) {
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

  public AssemblyOscalMetadataLocation1 telephoneNumbers(List<FieldOscalMetadataTelephoneNumber> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public AssemblyOscalMetadataLocation1 addTelephoneNumbersItem(FieldOscalMetadataTelephoneNumber telephoneNumbersItem) {
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

  public AssemblyOscalMetadataLocation1 urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public AssemblyOscalMetadataLocation1 addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public AssemblyOscalMetadataLocation1 props(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
    return this;
  }

  public AssemblyOscalMetadataLocation1 addPropsItem(AssemblyOscalMetadataProperty1 propsItem) {
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

  public AssemblyOscalMetadataLocation1 links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public AssemblyOscalMetadataLocation1 addLinksItem(AssemblyOscalMetadataLink linksItem) {
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

  public AssemblyOscalMetadataLocation1 remarks(String remarks) {
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
    AssemblyOscalMetadataLocation1 assemblyOscalMetadataLocation1 = (AssemblyOscalMetadataLocation1) o;
    return Objects.equals(this.uuid, assemblyOscalMetadataLocation1.uuid) &&
        Objects.equals(this.title, assemblyOscalMetadataLocation1.title) &&
        Objects.equals(this.address, assemblyOscalMetadataLocation1.address) &&
        Objects.equals(this.emailAddresses, assemblyOscalMetadataLocation1.emailAddresses) &&
        Objects.equals(this.telephoneNumbers, assemblyOscalMetadataLocation1.telephoneNumbers) &&
        Objects.equals(this.urls, assemblyOscalMetadataLocation1.urls) &&
        Objects.equals(this.props, assemblyOscalMetadataLocation1.props) &&
        Objects.equals(this.links, assemblyOscalMetadataLocation1.links) &&
        Objects.equals(this.remarks, assemblyOscalMetadataLocation1.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, title, address, emailAddresses, telephoneNumbers, urls, props, links, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataLocation1 {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    telephoneNumbers: ").append(toIndentedString(telephoneNumbers)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
