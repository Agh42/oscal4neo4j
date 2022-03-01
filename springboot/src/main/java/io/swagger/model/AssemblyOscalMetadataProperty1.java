package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An attribute, characteristic, or quality of the containing object expressed as a namespace qualified name/value pair. The value of a property is a simple scalar value, which may be expressed as a list of values.
 */
@Schema(description = "An attribute, characteristic, or quality of the containing object expressed as a namespace qualified name/value pair. The value of a property is a simple scalar value, which may be expressed as a list of values.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataProperty1   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("ns")
  private String ns = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalMetadataProperty1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A textual label that uniquely identifies a specific attribute, characteristic, or quality of the property's containing object.
   * @return name
   **/
  @Schema(required = true, description = "A textual label that uniquely identifies a specific attribute, characteristic, or quality of the property's containing object.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssemblyOscalMetadataProperty1 uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A unique identifier that can be used to reference this property elsewhere in an OSCAL document. A UUID should be consistently used for a given location across revisions of the document.
   * @return uuid
   **/
  @Schema(description = "A unique identifier that can be used to reference this property elsewhere in an OSCAL document. A UUID should be consistently used for a given location across revisions of the document.")
  
  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AssemblyOscalMetadataProperty1 ns(String ns) {
    this.ns = ns;
    return this;
  }

  /**
   * A namespace qualifying the property's name. This allows different organizations to associate distinct semantics with the same name.
   * @return ns
   **/
  @Schema(description = "A namespace qualifying the property's name. This allows different organizations to associate distinct semantics with the same name.")
  
    public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public AssemblyOscalMetadataProperty1 value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Indicates the value of the attribute, characteristic, or quality.
   * @return value
   **/
  @Schema(required = true, description = "Indicates the value of the attribute, characteristic, or quality.")
      @NotNull

  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AssemblyOscalMetadataProperty1 propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * A textual label that provides a sub-type or characterization of the property's name. This can be used to further distinguish or discriminate between the semantics of multiple properties of the same object with the same name and ns.
   * @return propertyClass
   **/
  @Schema(description = "A textual label that provides a sub-type or characterization of the property's name. This can be used to further distinguish or discriminate between the semantics of multiple properties of the same object with the same name and ns.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public AssemblyOscalMetadataProperty1 remarks(String remarks) {
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
    AssemblyOscalMetadataProperty1 assemblyOscalMetadataProperty1 = (AssemblyOscalMetadataProperty1) o;
    return Objects.equals(this.name, assemblyOscalMetadataProperty1.name) &&
        Objects.equals(this.uuid, assemblyOscalMetadataProperty1.uuid) &&
        Objects.equals(this.ns, assemblyOscalMetadataProperty1.ns) &&
        Objects.equals(this.value, assemblyOscalMetadataProperty1.value) &&
        Objects.equals(this.propertyClass, assemblyOscalMetadataProperty1.propertyClass) &&
        Objects.equals(this.remarks, assemblyOscalMetadataProperty1.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, ns, value, propertyClass, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataProperty1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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
