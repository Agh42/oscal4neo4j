package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalProfileIncludeAll;
import io.swagger.model.AssemblyOscalProfileSelectControlById;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The import designates a catalog, profile, or other resource to be included (referenced and potentially modified) by this profile. The import also identifies which controls to select using the include-all, include-controls, and exclude-controls directives.
 */
@Schema(description = "The import designates a catalog, profile, or other resource to be included (referenced and potentially modified) by this profile. The import also identifies which controls to select using the include-all, include-controls, and exclude-controls directives.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileImport   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("include-all")
  private AssemblyOscalProfileIncludeAll includeAll = null;

  @JsonProperty("include-controls")
  @Valid
  private List<AssemblyOscalProfileSelectControlById> includeControls = null;

  @JsonProperty("exclude-controls")
  @Valid
  private List<AssemblyOscalProfileSelectControlById> excludeControls = null;

  public AssemblyOscalProfileImport href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A resolvable URL reference to the base catalog or profile that this profile is tailoring.
   * @return href
   **/
  @Schema(required = true, description = "A resolvable URL reference to the base catalog or profile that this profile is tailoring.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AssemblyOscalProfileImport includeAll(AssemblyOscalProfileIncludeAll includeAll) {
    this.includeAll = includeAll;
    return this;
  }

  /**
   * Get includeAll
   * @return includeAll
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalProfileIncludeAll getIncludeAll() {
    return includeAll;
  }

  public void setIncludeAll(AssemblyOscalProfileIncludeAll includeAll) {
    this.includeAll = includeAll;
  }

  public AssemblyOscalProfileImport includeControls(List<AssemblyOscalProfileSelectControlById> includeControls) {
    this.includeControls = includeControls;
    return this;
  }

  public AssemblyOscalProfileImport addIncludeControlsItem(AssemblyOscalProfileSelectControlById includeControlsItem) {
    if (this.includeControls == null) {
      this.includeControls = new ArrayList<AssemblyOscalProfileSelectControlById>();
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
  @Size(min=1)   public List<AssemblyOscalProfileSelectControlById> getIncludeControls() {
    return includeControls;
  }

  public void setIncludeControls(List<AssemblyOscalProfileSelectControlById> includeControls) {
    this.includeControls = includeControls;
  }

  public AssemblyOscalProfileImport excludeControls(List<AssemblyOscalProfileSelectControlById> excludeControls) {
    this.excludeControls = excludeControls;
    return this;
  }

  public AssemblyOscalProfileImport addExcludeControlsItem(AssemblyOscalProfileSelectControlById excludeControlsItem) {
    if (this.excludeControls == null) {
      this.excludeControls = new ArrayList<AssemblyOscalProfileSelectControlById>();
    }
    this.excludeControls.add(excludeControlsItem);
    return this;
  }

  /**
   * Get excludeControls
   * @return excludeControls
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalProfileSelectControlById> getExcludeControls() {
    return excludeControls;
  }

  public void setExcludeControls(List<AssemblyOscalProfileSelectControlById> excludeControls) {
    this.excludeControls = excludeControls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalProfileImport assemblyOscalProfileImport = (AssemblyOscalProfileImport) o;
    return Objects.equals(this.href, assemblyOscalProfileImport.href) &&
        Objects.equals(this.includeAll, assemblyOscalProfileImport.includeAll) &&
        Objects.equals(this.includeControls, assemblyOscalProfileImport.includeControls) &&
        Objects.equals(this.excludeControls, assemblyOscalProfileImport.excludeControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, includeAll, includeControls, excludeControls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileImport {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    includeAll: ").append(toIndentedString(includeAll)).append("\n");
    sb.append("    includeControls: ").append(toIndentedString(includeControls)).append("\n");
    sb.append("    excludeControls: ").append(toIndentedString(excludeControls)).append("\n");
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
