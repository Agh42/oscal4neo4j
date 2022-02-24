package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OSCALPartialUpdateExampleMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OSCALPartialUpdateExample
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class OSCALPartialUpdateExample   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("metadata")
  private OSCALPartialUpdateExampleMetadata metadata = null;

  public OSCALPartialUpdateExample uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   **/
  @Schema(description = "")
  
  @Pattern(regexp="^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")   public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public OSCALPartialUpdateExample metadata(OSCALPartialUpdateExampleMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @Schema(description = "")
  
    @Valid
    public OSCALPartialUpdateExampleMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(OSCALPartialUpdateExampleMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSCALPartialUpdateExample osCALPartialUpdateExample = (OSCALPartialUpdateExample) o;
    return Objects.equals(this.uuid, osCALPartialUpdateExample.uuid) &&
        Objects.equals(this.metadata, osCALPartialUpdateExample.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSCALPartialUpdateExample {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
