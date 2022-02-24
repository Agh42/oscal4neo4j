package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates the degree to which the a given control is implemented.
 */
@Schema(description = "Indicates the degree to which the a given control is implemented.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonImplementationStatus   {
  @JsonProperty("state")
  private String state = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalImplementationCommonImplementationStatus state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Identifies the implementation status of the control or control objective.
   * @return state
   **/
  @Schema(required = true, description = "Identifies the implementation status of the control or control objective.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AssemblyOscalImplementationCommonImplementationStatus remarks(String remarks) {
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
    AssemblyOscalImplementationCommonImplementationStatus assemblyOscalImplementationCommonImplementationStatus = (AssemblyOscalImplementationCommonImplementationStatus) o;
    return Objects.equals(this.state, assemblyOscalImplementationCommonImplementationStatus.state) &&
        Objects.equals(this.remarks, assemblyOscalImplementationCommonImplementationStatus.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonImplementationStatus {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
