package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CatalogsBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class CatalogsBody   {
  @JsonProperty("url")
  private Resource url = null;

  @JsonProperty("fileName")
  private Resource fileName = null;

  public CatalogsBody url(Resource url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @Schema(description = "")
  
    @Valid
    public Resource getUrl() {
    return url;
  }

  public void setUrl(Resource url) {
    this.url = url;
  }

  public CatalogsBody fileName(Resource fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   **/
  @Schema(description = "")
  
    @Valid
    public Resource getFileName() {
    return fileName;
  }

  public void setFileName(Resource fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsBody catalogsBody = (CatalogsBody) o;
    return Objects.equals(this.url, catalogsBody.url) &&
        Objects.equals(this.fileName, catalogsBody.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsBody {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
