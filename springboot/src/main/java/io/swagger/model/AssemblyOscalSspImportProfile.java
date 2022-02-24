package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Used to import the OSCAL profile representing the system&#x27;s control baseline.
 */
@Schema(description = "Used to import the OSCAL profile representing the system's control baseline.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspImportProfile   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public AssemblyOscalSspImportProfile href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A resolvable URL reference to the profile to use as the system's control baseline.
   * @return href
   **/
  @Schema(required = true, description = "A resolvable URL reference to the profile to use as the system's control baseline.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AssemblyOscalSspImportProfile remarks(String remarks) {
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
    AssemblyOscalSspImportProfile assemblyOscalSspImportProfile = (AssemblyOscalSspImportProfile) o;
    return Objects.equals(this.href, assemblyOscalSspImportProfile.href) &&
        Objects.equals(this.remarks, assemblyOscalSspImportProfile.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspImportProfile {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
