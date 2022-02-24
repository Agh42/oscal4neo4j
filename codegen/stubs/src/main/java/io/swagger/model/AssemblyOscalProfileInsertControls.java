package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.AssemblyOscalProfileIncludeAll;
import io.swagger.model.AssemblyOscalProfileSelectControlById;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specifies which controls to use in the containing context.
 */
@Schema(description = "Specifies which controls to use in the containing context.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalProfileInsertControls   {
  /**
   * A designation of how a selection of controls in a profile is to be ordered.
   */
  public enum OrderEnum {
    KEEP("keep"),
    
    ASCENDING("ascending"),
    
    DESCENDING("descending");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("order")
  private OrderEnum order = null;

  @JsonProperty("include-all")
  private AssemblyOscalProfileIncludeAll includeAll = null;

  @JsonProperty("include-controls")
  @Valid
  private List<AssemblyOscalProfileSelectControlById> includeControls = null;

  @JsonProperty("exclude-controls")
  @Valid
  private List<AssemblyOscalProfileSelectControlById> excludeControls = null;

  public AssemblyOscalProfileInsertControls order(OrderEnum order) {
    this.order = order;
    return this;
  }

  /**
   * A designation of how a selection of controls in a profile is to be ordered.
   * @return order
   **/
  @Schema(description = "A designation of how a selection of controls in a profile is to be ordered.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public AssemblyOscalProfileInsertControls includeAll(AssemblyOscalProfileIncludeAll includeAll) {
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

  public AssemblyOscalProfileInsertControls includeControls(List<AssemblyOscalProfileSelectControlById> includeControls) {
    this.includeControls = includeControls;
    return this;
  }

  public AssemblyOscalProfileInsertControls addIncludeControlsItem(AssemblyOscalProfileSelectControlById includeControlsItem) {
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

  public AssemblyOscalProfileInsertControls excludeControls(List<AssemblyOscalProfileSelectControlById> excludeControls) {
    this.excludeControls = excludeControls;
    return this;
  }

  public AssemblyOscalProfileInsertControls addExcludeControlsItem(AssemblyOscalProfileSelectControlById excludeControlsItem) {
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
    AssemblyOscalProfileInsertControls assemblyOscalProfileInsertControls = (AssemblyOscalProfileInsertControls) o;
    return Objects.equals(this.order, assemblyOscalProfileInsertControls.order) &&
        Objects.equals(this.includeAll, assemblyOscalProfileInsertControls.includeAll) &&
        Objects.equals(this.includeControls, assemblyOscalProfileInsertControls.includeControls) &&
        Objects.equals(this.excludeControls, assemblyOscalProfileInsertControls.excludeControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, includeAll, includeControls, excludeControls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalProfileInsertControls {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
