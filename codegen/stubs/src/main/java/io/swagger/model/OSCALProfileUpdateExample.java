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
 * OSCALProfileUpdateExample
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALProfileUpdateExample   {
  @JsonProperty("profile")
  private OSCALPartialUpdateExample profile = null;

  public OSCALProfileUpdateExample profile(OSCALPartialUpdateExample profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   **/
  @Schema(description = "")
  
    @Valid
    public OSCALPartialUpdateExample getProfile() {
    return profile;
  }

  public void setProfile(OSCALPartialUpdateExample profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALProfileUpdateExample osCALProfileUpdateExample = (OSCALProfileUpdateExample) o;
    return Objects.equals(this.profile, osCALProfileUpdateExample.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALProfileUpdateExample {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
