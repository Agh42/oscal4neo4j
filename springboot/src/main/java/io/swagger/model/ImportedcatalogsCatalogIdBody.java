package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImportedcatalogsCatalogIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class ImportedcatalogsCatalogIdBody   {
  @JsonProperty("include-controls")
  @Valid
  private List<ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols> includeControls = null;

  public ImportedcatalogsCatalogIdBody includeControls(List<ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols> includeControls) {
    this.includeControls = includeControls;
    return this;
  }

  public ImportedcatalogsCatalogIdBody addIncludeControlsItem(ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols includeControlsItem) {
    if (this.includeControls == null) {
      this.includeControls = new ArrayList<ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols>();
    }
    this.includeControls.add(includeControlsItem);
    return this;
  }

  /**
   * Get includeControls
   * @return includeControls
   **/
  @Schema(description = "")
      @Valid
    public List<ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols> getIncludeControls() {
    return includeControls;
  }

  public void setIncludeControls(List<ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols> includeControls) {
    this.includeControls = includeControls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportedcatalogsCatalogIdBody importedcatalogsCatalogIdBody = (ImportedcatalogsCatalogIdBody) o;
    return Objects.equals(this.includeControls, importedcatalogsCatalogIdBody.includeControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeControls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportedcatalogsCatalogIdBody {\n");
    
    sb.append("    includeControls: ").append(toIndentedString(includeControls)).append("\n");
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
