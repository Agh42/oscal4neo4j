package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Resource2;
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


public class AssemblyOscalMetadataBackMatter2   {
  @JsonProperty("resources")
  @Valid
  private List<Resource2> resources = null;

  public AssemblyOscalMetadataBackMatter2 resources(List<Resource2> resources) {
    this.resources = resources;
    return this;
  }

  public AssemblyOscalMetadataBackMatter2 addResourcesItem(Resource2 resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<Resource2>();
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
  @Size(min=1)   public List<Resource2> getResources() {
    return resources;
  }

  public void setResources(List<Resource2> resources) {
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
    AssemblyOscalMetadataBackMatter2 assemblyOscalMetadataBackMatter2 = (AssemblyOscalMetadataBackMatter2) o;
    return Objects.equals(this.resources, assemblyOscalMetadataBackMatter2.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataBackMatter2 {\n");
    
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
