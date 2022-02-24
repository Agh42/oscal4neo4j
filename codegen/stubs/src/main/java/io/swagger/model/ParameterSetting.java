package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalCatalogCommonParameterConstraint1;
import io.swagger.model.AssemblyOscalCatalogCommonParameterGuideline;
import io.swagger.model.AssemblyOscalCatalogCommonParameterSelection;
import io.swagger.model.AssemblyOscalMetadataLink;
import io.swagger.model.AssemblyOscalMetadataProperty1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A parameter setting, to be propagated to points of insertion
 */
@Schema(description = "A parameter setting, to be propagated to points of insertion")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class ParameterSetting   {
  @JsonProperty("param-id")
  private String paramId = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("depends-on")
  private String dependsOn = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty1> props = null;

  @JsonProperty("links")
  @Valid
  private List<AssemblyOscalMetadataLink> links = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("usage")
  private String usage = null;

  @JsonProperty("constraints")
  @Valid
  private List<AssemblyOscalCatalogCommonParameterConstraint1> constraints = null;

  @JsonProperty("guidelines")
  @Valid
  private List<AssemblyOscalCatalogCommonParameterGuideline> guidelines = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  @JsonProperty("select")
  private AssemblyOscalCatalogCommonParameterSelection select = null;

  public ParameterSetting paramId(String paramId) {
    this.paramId = paramId;
    return this;
  }

  /**
   * Indicates the value of the 'id' flag on a target parameter; i.e. which parameter to set
   * @return paramId
   **/
  @Schema(required = true, description = "Indicates the value of the 'id' flag on a target parameter; i.e. which parameter to set")
      @NotNull

  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getParamId() {
    return paramId;
  }

  public void setParamId(String paramId) {
    this.paramId = paramId;
  }

  public ParameterSetting propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * A textual label that provides a characterization of the parameter.
   * @return propertyClass
   **/
  @Schema(description = "A textual label that provides a characterization of the parameter.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public ParameterSetting dependsOn(String dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  /**
   * Another parameter invoking this one
   * @return dependsOn
   **/
  @Schema(description = "Another parameter invoking this one")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(String dependsOn) {
    this.dependsOn = dependsOn;
  }

  public ParameterSetting props(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
    return this;
  }

  public ParameterSetting addPropsItem(AssemblyOscalMetadataProperty1 propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty1>();
    }
    this.props.add(propsItem);
    return this;
  }

  /**
   * Get props
   * @return props
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataProperty1> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty1> props) {
    this.props = props;
  }

  public ParameterSetting links(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
    return this;
  }

  public ParameterSetting addLinksItem(AssemblyOscalMetadataLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<AssemblyOscalMetadataLink>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalMetadataLink> getLinks() {
    return links;
  }

  public void setLinks(List<AssemblyOscalMetadataLink> links) {
    this.links = links;
  }

  public ParameterSetting label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A short, placeholder name for the parameter, which can be used as a substitute for a value if no value is assigned.
   * @return label
   **/
  @Schema(description = "A short, placeholder name for the parameter, which can be used as a substitute for a value if no value is assigned.")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ParameterSetting usage(String usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Describes the purpose and use of a parameter
   * @return usage
   **/
  @Schema(description = "Describes the purpose and use of a parameter")
  
    public String getUsage() {
    return usage;
  }

  public void setUsage(String usage) {
    this.usage = usage;
  }

  public ParameterSetting constraints(List<AssemblyOscalCatalogCommonParameterConstraint1> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ParameterSetting addConstraintsItem(AssemblyOscalCatalogCommonParameterConstraint1 constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<AssemblyOscalCatalogCommonParameterConstraint1>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogCommonParameterConstraint1> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<AssemblyOscalCatalogCommonParameterConstraint1> constraints) {
    this.constraints = constraints;
  }

  public ParameterSetting guidelines(List<AssemblyOscalCatalogCommonParameterGuideline> guidelines) {
    this.guidelines = guidelines;
    return this;
  }

  public ParameterSetting addGuidelinesItem(AssemblyOscalCatalogCommonParameterGuideline guidelinesItem) {
    if (this.guidelines == null) {
      this.guidelines = new ArrayList<AssemblyOscalCatalogCommonParameterGuideline>();
    }
    this.guidelines.add(guidelinesItem);
    return this;
  }

  /**
   * Get guidelines
   * @return guidelines
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<AssemblyOscalCatalogCommonParameterGuideline> getGuidelines() {
    return guidelines;
  }

  public void setGuidelines(List<AssemblyOscalCatalogCommonParameterGuideline> guidelines) {
    this.guidelines = guidelines;
  }

  public ParameterSetting values(List<String> values) {
    this.values = values;
    return this;
  }

  public ParameterSetting addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public ParameterSetting select(AssemblyOscalCatalogCommonParameterSelection select) {
    this.select = select;
    return this;
  }

  /**
   * Get select
   * @return select
   **/
  @Schema(description = "")
  
    @Valid
    public AssemblyOscalCatalogCommonParameterSelection getSelect() {
    return select;
  }

  public void setSelect(AssemblyOscalCatalogCommonParameterSelection select) {
    this.select = select;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterSetting parameterSetting = (ParameterSetting) o;
    return Objects.equals(this.paramId, parameterSetting.paramId) &&
        Objects.equals(this.propertyClass, parameterSetting.propertyClass) &&
        Objects.equals(this.dependsOn, parameterSetting.dependsOn) &&
        Objects.equals(this.props, parameterSetting.props) &&
        Objects.equals(this.links, parameterSetting.links) &&
        Objects.equals(this.label, parameterSetting.label) &&
        Objects.equals(this.usage, parameterSetting.usage) &&
        Objects.equals(this.constraints, parameterSetting.constraints) &&
        Objects.equals(this.guidelines, parameterSetting.guidelines) &&
        Objects.equals(this.values, parameterSetting.values) &&
        Objects.equals(this.select, parameterSetting.select);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramId, propertyClass, dependsOn, props, links, label, usage, constraints, guidelines, values, select);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterSetting {\n");
    
    sb.append("    paramId: ").append(toIndentedString(paramId)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    guidelines: ").append(toIndentedString(guidelines)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
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