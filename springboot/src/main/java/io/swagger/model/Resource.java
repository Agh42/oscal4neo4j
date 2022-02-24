package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AssemblyOscalMetadataProperty;
import io.swagger.model.Base64;
import io.swagger.model.Citation;
import io.swagger.model.FieldOscalMetadataDocumentId;
import io.swagger.model.ResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A resource associated with content in the containing document. A resource may be directly included in the document base64 encoded or may point to one or more equivalent internet resources.
 */
@Schema(description = "A resource associated with content in the containing document. A resource may be directly included in the document base64 encoded or may point to one or more equivalent internet resources.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class Resource   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("props")
  @Valid
  private List<AssemblyOscalMetadataProperty> props = null;

  @JsonProperty("document-ids")
  @Valid
  private List<FieldOscalMetadataDocumentId> documentIds = null;

  @JsonProperty("citation")
  private Citation citation = null;

  @JsonProperty("rlinks")
  @Valid
  private List<ResourceLink> rlinks = null;

  @JsonProperty("base64")
  private Base64 base64 = null;

  @JsonProperty("remarks")
  private String remarks = null;

  public Resource uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * A globally unique identifier that can be used to reference this defined resource elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.
   * @return uuid
   **/
  @Schema(required = true, description = "A globally unique identifier that can be used to reference this defined resource elsewhere in an OSCAL document. A UUID should be consistently used for a given resource across revisions of the document.")
      @NotNull

  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Resource title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A name given to the resource, which may be used by a tool for display and navigation.
   * @return title
   **/
  @Schema(description = "A name given to the resource, which may be used by a tool for display and navigation.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Resource description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short summary of the resource used to indicate the purpose of the resource.
   * @return description
   **/
  @Schema(description = "A short summary of the resource used to indicate the purpose of the resource.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Resource props(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
    return this;
  }

  public Resource addPropsItem(AssemblyOscalMetadataProperty propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<AssemblyOscalMetadataProperty>();
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
  @Size(min=1)   public List<AssemblyOscalMetadataProperty> getProps() {
    return props;
  }

  public void setProps(List<AssemblyOscalMetadataProperty> props) {
    this.props = props;
  }

  public Resource documentIds(List<FieldOscalMetadataDocumentId> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public Resource addDocumentIdsItem(FieldOscalMetadataDocumentId documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<FieldOscalMetadataDocumentId>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * Get documentIds
   * @return documentIds
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<FieldOscalMetadataDocumentId> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<FieldOscalMetadataDocumentId> documentIds) {
    this.documentIds = documentIds;
  }

  public Resource citation(Citation citation) {
    this.citation = citation;
    return this;
  }

  /**
   * Get citation
   * @return citation
   **/
  @Schema(description = "")
  
    @Valid
    public Citation getCitation() {
    return citation;
  }

  public void setCitation(Citation citation) {
    this.citation = citation;
  }

  public Resource rlinks(List<ResourceLink> rlinks) {
    this.rlinks = rlinks;
    return this;
  }

  public Resource addRlinksItem(ResourceLink rlinksItem) {
    if (this.rlinks == null) {
      this.rlinks = new ArrayList<ResourceLink>();
    }
    this.rlinks.add(rlinksItem);
    return this;
  }

  /**
   * Get rlinks
   * @return rlinks
   **/
  @Schema(description = "")
      @Valid
  @Size(min=1)   public List<ResourceLink> getRlinks() {
    return rlinks;
  }

  public void setRlinks(List<ResourceLink> rlinks) {
    this.rlinks = rlinks;
  }

  public Resource base64(Base64 base64) {
    this.base64 = base64;
    return this;
  }

  /**
   * Get base64
   * @return base64
   **/
  @Schema(description = "")
  
    @Valid
    public Base64 getBase64() {
    return base64;
  }

  public void setBase64(Base64 base64) {
    this.base64 = base64;
  }

  public Resource remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Additional commentary on the containing object.
   * @return remarks
   **/
  @Schema(description = "Additional commentary on the containing object.")
  
    public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.uuid, resource.uuid) &&
        Objects.equals(this.title, resource.title) &&
        Objects.equals(this.description, resource.description) &&
        Objects.equals(this.props, resource.props) &&
        Objects.equals(this.documentIds, resource.documentIds) &&
        Objects.equals(this.citation, resource.citation) &&
        Objects.equals(this.rlinks, resource.rlinks) &&
        Objects.equals(this.base64, resource.base64) &&
        Objects.equals(this.remarks, resource.remarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, title, description, props, documentIds, citation, rlinks, base64, remarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    citation: ").append(toIndentedString(citation)).append("\n");
    sb.append("    rlinks: ").append(toIndentedString(rlinks)).append("\n");
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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
