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
 * Identifies a specific system privilege held by the user, along with an associated description and/or rationale for the privilege.
 */
@Schema(description = "Identifies a specific system privilege held by the user, along with an associated description and/or rationale for the privilege.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonAuthorizedPrivilege   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("functions-performed")
  @Valid
  private List<String> functionsPerformed = new ArrayList<String>();

  public AssemblyOscalImplementationCommonAuthorizedPrivilege title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human readable name for the privilege.
   * @return title
   **/
  @Schema(required = true, description = "A human readable name for the privilege.")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssemblyOscalImplementationCommonAuthorizedPrivilege description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A summary of the privilege's purpose within the system.
   * @return description
   **/
  @Schema(description = "A summary of the privilege's purpose within the system.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalImplementationCommonAuthorizedPrivilege functionsPerformed(List<String> functionsPerformed) {
    this.functionsPerformed = functionsPerformed;
    return this;
  }

  public AssemblyOscalImplementationCommonAuthorizedPrivilege addFunctionsPerformedItem(String functionsPerformedItem) {
    this.functionsPerformed.add(functionsPerformedItem);
    return this;
  }

  /**
   * Get functionsPerformed
   * @return functionsPerformed
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1)   public List<String> getFunctionsPerformed() {
    return functionsPerformed;
  }

  public void setFunctionsPerformed(List<String> functionsPerformed) {
    this.functionsPerformed = functionsPerformed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalImplementationCommonAuthorizedPrivilege assemblyOscalImplementationCommonAuthorizedPrivilege = (AssemblyOscalImplementationCommonAuthorizedPrivilege) o;
    return Objects.equals(this.title, assemblyOscalImplementationCommonAuthorizedPrivilege.title) &&
        Objects.equals(this.description, assemblyOscalImplementationCommonAuthorizedPrivilege.description) &&
        Objects.equals(this.functionsPerformed, assemblyOscalImplementationCommonAuthorizedPrivilege.functionsPerformed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, functionsPerformed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonAuthorizedPrivilege {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    functionsPerformed: ").append(toIndentedString(functionsPerformed)).append("\n");
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
