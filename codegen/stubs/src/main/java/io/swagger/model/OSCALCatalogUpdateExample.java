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
 * OSCALCatalogUpdateExample
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALCatalogUpdateExample   {
  @JsonProperty("catalog")
  private OSCALPartialUpdateExample catalog = null;

  public OSCALCatalogUpdateExample catalog(OSCALPartialUpdateExample catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * Get catalog
   * @return catalog
   **/
  @Schema(description = "")
  
    @Valid
    public OSCALPartialUpdateExample getCatalog() {
    return catalog;
  }

  public void setCatalog(OSCALPartialUpdateExample catalog) {
    this.catalog = catalog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALCatalogUpdateExample osCALCatalogUpdateExample = (OSCALCatalogUpdateExample) o;
    return Objects.equals(this.catalog, osCALCatalogUpdateExample.catalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALCatalogUpdateExample {\n");
    
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
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
