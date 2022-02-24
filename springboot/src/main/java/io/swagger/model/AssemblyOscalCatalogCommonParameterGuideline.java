package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A prose statement that provides a recommendation for the use of a parameter.
 */
@Schema(description = "A prose statement that provides a recommendation for the use of a parameter.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogCommonParameterGuideline   {
  @JsonProperty("prose")
  private String prose = null;

  public AssemblyOscalCatalogCommonParameterGuideline prose(String prose) {
    this.prose = prose;
    return this;
  }

  /**
   * Prose permits multiple paragraphs, lists, tables etc.
   * @return prose
   **/
  @Schema(required = true, description = "Prose permits multiple paragraphs, lists, tables etc.")
      @NotNull

    public String getProse() {
    return prose;
  }

  public void setProse(String prose) {
    this.prose = prose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalCatalogCommonParameterGuideline assemblyOscalCatalogCommonParameterGuideline = (AssemblyOscalCatalogCommonParameterGuideline) o;
    return Objects.equals(this.prose, assemblyOscalCatalogCommonParameterGuideline.prose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogCommonParameterGuideline {\n");
    
    sb.append("    prose: ").append(toIndentedString(prose)).append("\n");
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
