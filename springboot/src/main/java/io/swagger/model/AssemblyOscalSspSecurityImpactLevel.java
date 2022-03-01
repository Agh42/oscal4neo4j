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
 * The overall level of expected impact resulting from unauthorized disclosure, modification, or loss of access to information.
 */
@Schema(description = "The overall level of expected impact resulting from unauthorized disclosure, modification, or loss of access to information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalSspSecurityImpactLevel   {
  @JsonProperty("security-objective-confidentiality")
  private String securityObjectiveConfidentiality = null;

  @JsonProperty("security-objective-integrity")
  private String securityObjectiveIntegrity = null;

  @JsonProperty("security-objective-availability")
  private String securityObjectiveAvailability = null;

  public AssemblyOscalSspSecurityImpactLevel securityObjectiveConfidentiality(String securityObjectiveConfidentiality) {
    this.securityObjectiveConfidentiality = securityObjectiveConfidentiality;
    return this;
  }

  /**
   * A target-level of confidentiality for the system, based on the sensitivity of information within the system.
   * @return securityObjectiveConfidentiality
   **/
  @Schema(required = true, description = "A target-level of confidentiality for the system, based on the sensitivity of information within the system.")
      @NotNull

  @Pattern(regexp= ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getSecurityObjectiveConfidentiality() {
    return securityObjectiveConfidentiality;
  }

  public void setSecurityObjectiveConfidentiality(String securityObjectiveConfidentiality) {
    this.securityObjectiveConfidentiality = securityObjectiveConfidentiality;
  }

  public AssemblyOscalSspSecurityImpactLevel securityObjectiveIntegrity(String securityObjectiveIntegrity) {
    this.securityObjectiveIntegrity = securityObjectiveIntegrity;
    return this;
  }

  /**
   * A target-level of integrity for the system, based on the sensitivity of information within the system.
   * @return securityObjectiveIntegrity
   **/
  @Schema(required = true, description = "A target-level of integrity for the system, based on the sensitivity of information within the system.")
      @NotNull

  @Pattern(regexp=ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getSecurityObjectiveIntegrity() {
    return securityObjectiveIntegrity;
  }

  public void setSecurityObjectiveIntegrity(String securityObjectiveIntegrity) {
    this.securityObjectiveIntegrity = securityObjectiveIntegrity;
  }

  public AssemblyOscalSspSecurityImpactLevel securityObjectiveAvailability(String securityObjectiveAvailability) {
    this.securityObjectiveAvailability = securityObjectiveAvailability;
    return this;
  }

  /**
   * A target-level of availability for the system, based on the sensitivity of information within the system.
   * @return securityObjectiveAvailability
   **/
  @Schema(required = true, description = "A target-level of availability for the system, based on the sensitivity of information within the system.")
      @NotNull

  @Pattern(regexp=ValidationConstants.REGEX_MIN_ONE_CHAR)   public String getSecurityObjectiveAvailability() {
    return securityObjectiveAvailability;
  }

  public void setSecurityObjectiveAvailability(String securityObjectiveAvailability) {
    this.securityObjectiveAvailability = securityObjectiveAvailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalSspSecurityImpactLevel assemblyOscalSspSecurityImpactLevel = (AssemblyOscalSspSecurityImpactLevel) o;
    return Objects.equals(this.securityObjectiveConfidentiality, assemblyOscalSspSecurityImpactLevel.securityObjectiveConfidentiality) &&
        Objects.equals(this.securityObjectiveIntegrity, assemblyOscalSspSecurityImpactLevel.securityObjectiveIntegrity) &&
        Objects.equals(this.securityObjectiveAvailability, assemblyOscalSspSecurityImpactLevel.securityObjectiveAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityObjectiveConfidentiality, securityObjectiveIntegrity, securityObjectiveAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalSspSecurityImpactLevel {\n");
    
    sb.append("    securityObjectiveConfidentiality: ").append(toIndentedString(securityObjectiveConfidentiality)).append("\n");
    sb.append("    securityObjectiveIntegrity: ").append(toIndentedString(securityObjectiveIntegrity)).append("\n");
    sb.append("    securityObjectiveAvailability: ").append(toIndentedString(securityObjectiveAvailability)).append("\n");
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
