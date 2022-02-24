package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.MatchControlsByPattern;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Call a control by its ID
 */
@Schema(description = "Call a control by its ID")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileSelectControlById   {
  /**
   * When a control is included, whether its child (dependent) controls are also included.
   */
  public enum WithChildControlsEnum {
    YES("yes"),
    
    NO("no");

    private String value;

    WithChildControlsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WithChildControlsEnum fromValue(String text) {
      for (WithChildControlsEnum b : WithChildControlsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("with-child-controls")
  private WithChildControlsEnum withChildControls = null;

  @JsonProperty("with-ids")
  @Valid
  private List<String> withIds = null;

  @JsonProperty("matching")
  @Valid
  private List<MatchControlsByPattern> matching = null;

  public AssemblyOscalProfileSelectControlById withChildControls(WithChildControlsEnum withChildControls) {
    this.withChildControls = withChildControls;
    return this;
  }

  /**
   * When a control is included, whether its child (dependent) controls are also included.
   * @return withChildControls
   **/
  @Schema(description = "When a control is included, whether its child (dependent) controls are also included.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public WithChildControlsEnum getWithChildControls() {
    return withChildControls;
  }

  public void setWithChildControls(WithChildControlsEnum withChildControls) {
    this.withChildControls = withChildControls;
  }

  public AssemblyOscalProfileSelectControlById withIds(List<String> withIds) {
    this.withIds = withIds;
    return this;
  }

  public AssemblyOscalProfileSelectControlById addWithIdsItem(String withIdsItem) {
    if (this.withIds == null) {
      this.withIds = new ArrayList<String>();
    }
    this.withIds.add(withIdsItem);
    return this;
  }

  /**
   * Get withIds
   * @return withIds
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getWithIds() {
    return withIds;
  }

  public void setWithIds(List<String> withIds) {
    this.withIds = withIds;
  }

  public AssemblyOscalProfileSelectControlById matching(List<MatchControlsByPattern> matching) {
    this.matching = matching;
    return this;
  }

  public AssemblyOscalProfileSelectControlById addMatchingItem(MatchControlsByPattern matchingItem) {
    if (this.matching == null) {
      this.matching = new ArrayList<MatchControlsByPattern>();
    }
    this.matching.add(matchingItem);
    return this;
  }

  /**
   * Get matching
   * @return matching
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<MatchControlsByPattern> getMatching() {
    return matching;
  }

  public void setMatching(List<MatchControlsByPattern> matching) {
    this.matching = matching;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileSelectControlById assemblyOscalProfileSelectControlById = (AssemblyOscalProfileSelectControlById) o;
    return Objects.equals(this.withChildControls, assemblyOscalProfileSelectControlById.withChildControls) &&
        Objects.equals(this.withIds, assemblyOscalProfileSelectControlById.withIds) &&
        Objects.equals(this.matching, assemblyOscalProfileSelectControlById.matching);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withChildControls, withIds, matching);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileSelectControlById {\n");
    
    sb.append("    withChildControls: ").append(toIndentedString(withChildControls)).append("\n");
    sb.append("    withIds: ").append(toIndentedString(withIds)).append("\n");
    sb.append("    matching: ").append(toIndentedString(matching)).append("\n");
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
