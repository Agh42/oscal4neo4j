package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OSCALPartialUpdateExample;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OSCALSspUpdateExample
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALSspUpdateExample   {
  @JsonProperty("system-security-plan")
  private OSCALPartialUpdateExample systemSecurityPlan = null;

  public OSCALSspUpdateExample systemSecurityPlan(OSCALPartialUpdateExample systemSecurityPlan) {
    this.systemSecurityPlan = systemSecurityPlan;
    return this;
  }

  /**
   * Get systemSecurityPlan
   * @return systemSecurityPlan
   **/
  @Schema(description = "")
  
    @Valid
    public OSCALPartialUpdateExample getSystemSecurityPlan() {
    return systemSecurityPlan;
  }

  public void setSystemSecurityPlan(OSCALPartialUpdateExample systemSecurityPlan) {
    this.systemSecurityPlan = systemSecurityPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALSspUpdateExample osCALSspUpdateExample = (OSCALSspUpdateExample) o;
    return Objects.equals(this.systemSecurityPlan, osCALSspUpdateExample.systemSecurityPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemSecurityPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALSspUpdateExample {\n");
    
    sb.append("    systemSecurityPlan: ").append(toIndentedString(systemSecurityPlan)).append("\n");
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
