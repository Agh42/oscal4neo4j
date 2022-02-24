package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A representation of a cryptographic digest generated over a resource using a specified hash algorithm.
 */
@Schema(description = "A representation of a cryptographic digest generated over a resource using a specified hash algorithm.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class FieldOscalMetadataHash   {
  @JsonProperty("algorithm")
  private String algorithm = null;

  @JsonProperty("value")
  private String value = null;

  public FieldOscalMetadataHash algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Method by which a hash is derived
   * @return algorithm
   **/
  @Schema(required = true, description = "Method by which a hash is derived")
      @NotNull

  @Pattern(regexp="^\\S(.*\\S)?$")   public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public FieldOscalMetadataHash value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldOscalMetadataHash fieldOscalMetadataHash = (FieldOscalMetadataHash) o;
    return Objects.equals(this.algorithm, fieldOscalMetadataHash.algorithm) &&
        Objects.equals(this.value, fieldOscalMetadataHash.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldOscalMetadataHash {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
