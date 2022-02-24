package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Select controls by (regular expression) match on ID
 */
@Schema(description = "Select controls by (regular expression) match on ID")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class MatchControlsByPattern   {
  @JsonProperty("pattern")
  private String pattern = null;

  public MatchControlsByPattern pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * A glob expression matching the IDs of one or more controls to be selected.
   * @return pattern
   **/
  @Schema(description = "A glob expression matching the IDs of one or more controls to be selected.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchControlsByPattern matchControlsByPattern = (MatchControlsByPattern) o;
    return Objects.equals(this.pattern, matchControlsByPattern.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchControlsByPattern {\n");
    
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
