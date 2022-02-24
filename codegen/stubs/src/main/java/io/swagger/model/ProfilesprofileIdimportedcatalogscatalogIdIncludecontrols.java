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
 * ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols   {
  @JsonProperty("with-ids")
  @Valid
  private List<String> withIds = null;

  public ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols withIds(List<String> withIds) {
    this.withIds = withIds;
    return this;
  }

  public ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols addWithIdsItem(String withIdsItem) {
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
  
    public List<String> getWithIds() {
    return withIds;
  }

  public void setWithIds(List<String> withIds) {
    this.withIds = withIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols profilesprofileIdimportedcatalogscatalogIdIncludecontrols = (ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols) o;
    return Objects.equals(this.withIds, profilesprofileIdimportedcatalogscatalogIdIncludecontrols.withIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilesprofileIdimportedcatalogscatalogIdIncludecontrols {\n");
    
    sb.append("    withIds: ").append(toIndentedString(withIds)).append("\n");
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
