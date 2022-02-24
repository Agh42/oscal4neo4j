package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Resource3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collection of resources, which may be included directly or by reference.
 */
@Schema(description = "A collection of resources, which may be included directly or by reference.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataBackMatter3   {
  @JsonProperty("resources")
  @Valid
  private List<Resource3> resources = null;

  public AssemblyOscalMetadataBackMatter3 resources(List<Resource3> resources) {
    this.resources = resources;
    return this;
  }

  public AssemblyOscalMetadataBackMatter3 addResourcesItem(Resource3 resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<Resource3>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<Resource3> getResources() {
    return resources;
  }

  public void setResources(List<Resource3> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalMetadataBackMatter3 assemblyOscalMetadataBackMatter3 = (AssemblyOscalMetadataBackMatter3) o;
    return Objects.equals(this.resources, assemblyOscalMetadataBackMatter3.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataBackMatter3 {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
