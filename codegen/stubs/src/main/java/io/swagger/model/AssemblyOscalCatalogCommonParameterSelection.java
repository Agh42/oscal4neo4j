package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Presenting a choice among alternatives
 */
@Schema(description = "Presenting a choice among alternatives")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalCatalogCommonParameterSelection   {
  /**
   * Describes the number of selections that must occur. Without this setting, only one value should be assumed to be permitted.
   */
  public enum HowManyEnum {
    ONE("one"),
    
    ONE_OR_MORE("one-or-more");

    private String value;

    HowManyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HowManyEnum fromValue(String text) {
      for (HowManyEnum b : HowManyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("how-many")
  private HowManyEnum howMany = null;

  @JsonProperty("choice")
  @Valid
  private List<String> choice = null;

  public AssemblyOscalCatalogCommonParameterSelection howMany(HowManyEnum howMany) {
    this.howMany = howMany;
    return this;
  }

  /**
   * Describes the number of selections that must occur. Without this setting, only one value should be assumed to be permitted.
   * @return howMany
   **/
  @Schema(description = "Describes the number of selections that must occur. Without this setting, only one value should be assumed to be permitted.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public HowManyEnum getHowMany() {
    return howMany;
  }

  public void setHowMany(HowManyEnum howMany) {
    this.howMany = howMany;
  }

  public AssemblyOscalCatalogCommonParameterSelection choice(List<String> choice) {
    this.choice = choice;
    return this;
  }

  public AssemblyOscalCatalogCommonParameterSelection addChoiceItem(String choiceItem) {
    if (this.choice == null) {
      this.choice = new ArrayList<String>();
    }
    this.choice.add(choiceItem);
    return this;
  }

  /**
   * Get choice
   * @return choice
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getChoice() {
    return choice;
  }

  public void setChoice(List<String> choice) {
    this.choice = choice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalCatalogCommonParameterSelection assemblyOscalCatalogCommonParameterSelection = (AssemblyOscalCatalogCommonParameterSelection) o;
    return Objects.equals(this.howMany, assemblyOscalCatalogCommonParameterSelection.howMany) &&
        Objects.equals(this.choice, assemblyOscalCatalogCommonParameterSelection.choice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(howMany, choice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalCatalogCommonParameterSelection {\n");
    
    sb.append("    howMany: ").append(toIndentedString(howMany)).append("\n");
    sb.append("    choice: ").append(toIndentedString(choice)).append("\n");
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
