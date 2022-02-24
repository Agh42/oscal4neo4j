package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies the parameter that will be set by the enclosed value.
 */
@Schema(description = "Identifies the parameter that will be set by the enclosed value.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonSetParameter   {
  @JsonProperty("param-id")
  private String paramId = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = new ArrayList<String>();

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalImplementationCommonSetParameter paramId(String paramId) {
    this.paramId = paramId;
    return this;
  }

  /**
   * A reference to a parameter within a control, who's catalog has been imported into the current implementation context.
   * @return paramId
   **/
  @Schema(required = true, description = "A reference to a parameter within a control, who's catalog has been imported into the current implementation context.")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getParamId() {
    return paramId;
  }

  public void setParamId(String paramId) {
    this.paramId = paramId;
  }

  public AssemblyOscalImplementationCommonSetParameter values(List<String> values) {
    this.values = values;
    return this;
  }

  public AssemblyOscalImplementationCommonSetParameter addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1)   public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public AssemblyOscalImplementationCommonSetParameter remarks(String remarks) {
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
    AssemblyOscalImplementationCommonSetParameter assemblyOscalImplementationCommonSetParameter = (AssemblyOscalImplementationCommonSetParameter) o;
    return Objects.equals(this.paramId, assemblyOscalImplementationCommonSetParameter.paramId) &&
        Objects.equals(this.values, assemblyOscalImplementationCommonSetParameter.values) &&
        Objects.equals(this.remarks, assemblyOscalImplementationCommonSetParameter.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramId, values, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonSetParameter {\n");
    
    sb.append("    paramId: ").append(toIndentedString(paramId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
