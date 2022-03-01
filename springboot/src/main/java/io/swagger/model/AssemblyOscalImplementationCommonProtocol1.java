package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.model.AssemblyOscalImplementationCommonPortRange;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the protocol used to provide a service.
 */
@Schema(description = "Information about the protocol used to provide a service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonProtocol1   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("port-ranges")
  @Valid
  private List<AssemblyOscalImplementationCommonPortRange> portRanges = null;

  public AssemblyOscalImplementationCommonProtocol1 uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this service protocol entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(description = "A globally unique identifier that can be used to reference this service protocol entry elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
  
  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalImplementationCommonProtocol1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The common name of the protocol, which should be the appropriate \"service name\" from the IANA Service Name and Transport Protocol Port Number Registry.
   * @return name
   **/
  @Schema(required = true, description = "The common name of the protocol, which should be the appropriate \"service name\" from the IANA Service Name and Transport Protocol Port Number Registry.")
      @NotNull

  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssemblyOscalImplementationCommonProtocol1 title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human readable name for the protocol (e.g., Transport Layer Security).
   * @return title
   **/
  @Schema(description = "A human readable name for the protocol (e.g., Transport Layer Security).")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalImplementationCommonProtocol1 portRanges(List<AssemblyOscalImplementationCommonPortRange> portRanges) {
    this.portRanges = portRanges;
    return this;
  }

  public AssemblyOscalImplementationCommonProtocol1 addPortRangesItem(AssemblyOscalImplementationCommonPortRange portRangesItem) {
    if (this.portRanges == null) {
      this.portRanges = new ArrayList<AssemblyOscalImplementationCommonPortRange>();
    }
    this.portRanges.add(portRangesItem);
    return this;
  }

  /**
   * Get portRanges
   * @return portRanges
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalImplementationCommonPortRange> getPortRanges() {
    return portRanges;
  }

  public void setPortRanges(List<AssemblyOscalImplementationCommonPortRange> portRanges) {
    this.portRanges = portRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalImplementationCommonProtocol1 assemblyOscalImplementationCommonProtocol1 = (AssemblyOscalImplementationCommonProtocol1) o;
    return Objects.equals(this.uuid, assemblyOscalImplementationCommonProtocol1.uuid) &&
        Objects.equals(this.name, assemblyOscalImplementationCommonProtocol1.name) &&
        Objects.equals(this.title, assemblyOscalImplementationCommonProtocol1.title) &&
        Objects.equals(this.portRanges, assemblyOscalImplementationCommonProtocol1.portRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, title, portRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonProtocol1 {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
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
