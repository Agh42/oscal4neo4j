package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ConstraintTest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A formal or informal expression of a constraint or test
 */
@Schema(description = "A formal or informal expression of a constraint or test")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogCommonParameterConstraint1   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("tests")
  @Valid
  private List<ConstraintTest> tests = null;

  public AssemblyOscalCatalogCommonParameterConstraint1 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A textual summary of the constraint to be applied.
   * @return description
   **/
  @Schema(description = "A textual summary of the constraint to be applied.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssemblyOscalCatalogCommonParameterConstraint1 tests(List<ConstraintTest> tests) {
    this.tests = tests;
    return this;
  }

  public AssemblyOscalCatalogCommonParameterConstraint1 addTestsItem(ConstraintTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<ConstraintTest>();
    }
    this.tests.add(testsItem);
    return this;
  }

  /**
   * Get tests
   * @return tests
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<ConstraintTest> getTests() {
    return tests;
  }

  public void setTests(List<ConstraintTest> tests) {
    this.tests = tests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalCatalogCommonParameterConstraint1 assemblyOscalCatalogCommonParameterConstraint1 = (AssemblyOscalCatalogCommonParameterConstraint1) o;
    return Objects.equals(this.description, assemblyOscalCatalogCommonParameterConstraint1.description) &&
        Objects.equals(this.tests, assemblyOscalCatalogCommonParameterConstraint1.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogCommonParameterConstraint1 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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
