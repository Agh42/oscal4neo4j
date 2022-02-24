package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Loads a component definition from another resource.
 */
@Schema(description = "Loads a component definition from another resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalComponentDefinitionImportComponentDefinition   {
  @JsonProperty("href")
  private String href = null;

  public AssemblyOscalComponentDefinitionImportComponentDefinition href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A link to a resource that defines a set of components and/or capabilities to import into this collection.
   * @return href
   **/
  @Schema(required = true, description = "A link to a resource that defines a set of components and/or capabilities to import into this collection.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalComponentDefinitionImportComponentDefinition assemblyOscalComponentDefinitionImportComponentDefinition = (AssemblyOscalComponentDefinitionImportComponentDefinition) o;
    return Objects.equals(this.href, assemblyOscalComponentDefinitionImportComponentDefinition.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalComponentDefinitionImportComponentDefinition {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
