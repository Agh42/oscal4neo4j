package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A set of information type identifiers qualified by the given identification system used, such as NIST SP 800-60.
 */
@Schema(description = "A set of information type identifiers qualified by the given identification system used, such as NIST SP 800-60.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class InformationTypeCategorization   {
  @JsonProperty("system")
  private String system = null;

  @JsonProperty("information-type-ids")
  @Valid
  private List<String> informationTypeIds = null;

  public InformationTypeCategorization system(String system) {
    this.system = system;
    return this;
  }

  /**
   * Specifies the information type identification system used.
   * @return system
   **/
  @Schema(required = true, description = "Specifies the information type identification system used.")
      @NotNull

    public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public InformationTypeCategorization informationTypeIds(List<String> informationTypeIds) {
    this.informationTypeIds = informationTypeIds;
    return this;
  }

  public InformationTypeCategorization addInformationTypeIdsItem(String informationTypeIdsItem) {
    if (this.informationTypeIds == null) {
      this.informationTypeIds = new ArrayList<String>();
    }
    this.informationTypeIds.add(informationTypeIdsItem);
    return this;
  }

  /**
   * Get informationTypeIds
   * @return informationTypeIds
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getInformationTypeIds() {
    return informationTypeIds;
  }

  public void setInformationTypeIds(List<String> informationTypeIds) {
    this.informationTypeIds = informationTypeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformationTypeCategorization informationTypeCategorization = (InformationTypeCategorization) o;
    return Objects.equals(this.system, informationTypeCategorization.system) &&
        Objects.equals(this.informationTypeIds, informationTypeCategorization.informationTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, informationTypeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationTypeCategorization {\n");
    
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    informationTypeIds: ").append(toIndentedString(informationTypeIds)).append("\n");
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
