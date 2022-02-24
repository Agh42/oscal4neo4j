package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specifies objects to be removed from a control based on specific aspects of the object that must all match.
 */
@Schema(description = "Specifies objects to be removed from a control based on specific aspects of the object that must all match.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileRemove   {
  @JsonProperty("by-name")
  private String byName = null;

  @JsonProperty("by-class")
  private String byClass = null;

  @JsonProperty("by-id")
  private String byId = null;

  @JsonProperty("by-item-name")
  private String byItemName = null;

  @JsonProperty("by-ns")
  private String byNs = null;

  public AssemblyOscalProfileRemove byName(String byName) {
    this.byName = byName;
    return this;
  }

  /**
   * Identify items to remove by matching their assigned name
   * @return byName
   **/
  @Schema(description = "Identify items to remove by matching their assigned name")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getByName() {
    return byName;
  }

  public void setByName(String byName) {
    this.byName = byName;
  }

  public AssemblyOscalProfileRemove byClass(String byClass) {
    this.byClass = byClass;
    return this;
  }

  /**
   * Identify items to remove by matching their class.
   * @return byClass
   **/
  @Schema(description = "Identify items to remove by matching their class.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getByClass() {
    return byClass;
  }

  public void setByClass(String byClass) {
    this.byClass = byClass;
  }

  public AssemblyOscalProfileRemove byId(String byId) {
    this.byId = byId;
    return this;
  }

  /**
   * Identify items to remove indicated by their id.
   * @return byId
   **/
  @Schema(description = "Identify items to remove indicated by their id.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getById() {
    return byId;
  }

  public void setById(String byId) {
    this.byId = byId;
  }

  public AssemblyOscalProfileRemove byItemName(String byItemName) {
    this.byItemName = byItemName;
    return this;
  }

  /**
   * Identify items to remove by the name of the item's information element name, e.g. title or prop
   * @return byItemName
   **/
  @Schema(description = "Identify items to remove by the name of the item's information element name, e.g. title or prop")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getByItemName() {
    return byItemName;
  }

  public void setByItemName(String byItemName) {
    this.byItemName = byItemName;
  }

  public AssemblyOscalProfileRemove byNs(String byNs) {
    this.byNs = byNs;
    return this;
  }

  /**
   * Identify items to remove by the item's ns, which is the namespace associated with a part, or prop.
   * @return byNs
   **/
  @Schema(description = "Identify items to remove by the item's ns, which is the namespace associated with a part, or prop.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getByNs() {
    return byNs;
  }

  public void setByNs(String byNs) {
    this.byNs = byNs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileRemove assemblyOscalProfileRemove = (AssemblyOscalProfileRemove) o;
    return Objects.equals(this.byName, assemblyOscalProfileRemove.byName) &&
        Objects.equals(this.byClass, assemblyOscalProfileRemove.byClass) &&
        Objects.equals(this.byId, assemblyOscalProfileRemove.byId) &&
        Objects.equals(this.byItemName, assemblyOscalProfileRemove.byItemName) &&
        Objects.equals(this.byNs, assemblyOscalProfileRemove.byNs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byName, byClass, byId, byItemName, byNs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileRemove {\n");
    
    sb.append("    byName: ").append(toIndentedString(byName)).append("\n");
    sb.append("    byClass: ").append(toIndentedString(byClass)).append("\n");
    sb.append("    byId: ").append(toIndentedString(byId)).append("\n");
    sb.append("    byItemName: ").append(toIndentedString(byItemName)).append("\n");
    sb.append("    byNs: ").append(toIndentedString(byNs)).append("\n");
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
