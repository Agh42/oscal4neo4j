package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.oscal4neo4j.api.ValidationConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact number by telephone.
 */
@Schema(description = "Contact number by telephone.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class FieldOscalMetadataTelephoneNumber   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("number")
  private String number = null;

  public FieldOscalMetadataTelephoneNumber type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of phone number.
   * @return type
   **/
  @Schema(description = "Indicates the type of phone number.")
  
  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FieldOscalMetadataTelephoneNumber number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldOscalMetadataTelephoneNumber fieldOscalMetadataTelephoneNumber = (FieldOscalMetadataTelephoneNumber) o;
    return Objects.equals(this.type, fieldOscalMetadataTelephoneNumber.type) &&
        Objects.equals(this.number, fieldOscalMetadataTelephoneNumber.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldOscalMetadataTelephoneNumber {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
