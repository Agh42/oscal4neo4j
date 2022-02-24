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
 * A postal address for the location.
 */
@Schema(description = "A postal address for the location.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalMetadataAddress3   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("addr-lines")
  @Valid
  private List<String> addrLines = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("postal-code")
  private String postalCode = null;

  @JsonProperty("country")
  private String country = null;

  public AssemblyOscalMetadataAddress3 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of address.
   * @return type
   **/
  @Schema(description = "Indicates the type of address.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AssemblyOscalMetadataAddress3 addrLines(List<String> addrLines) {
    this.addrLines = addrLines;
    return this;
  }

  public AssemblyOscalMetadataAddress3 addAddrLinesItem(String addrLinesItem) {
    if (this.addrLines == null) {
      this.addrLines = new ArrayList<String>();
    }
    this.addrLines.add(addrLinesItem);
    return this;
  }

  /**
   * Get addrLines
   * @return addrLines
   **/
  @Schema(description = "")
  
  @Size(min=1)   public List<String> getAddrLines() {
    return addrLines;
  }

  public void setAddrLines(List<String> addrLines) {
    this.addrLines = addrLines;
  }

  public AssemblyOscalMetadataAddress3 city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City, town or geographical region for the mailing address.
   * @return city
   **/
  @Schema(description = "City, town or geographical region for the mailing address.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AssemblyOscalMetadataAddress3 state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State, province or analogous geographical region for mailing address
   * @return state
   **/
  @Schema(description = "State, province or analogous geographical region for mailing address")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AssemblyOscalMetadataAddress3 postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal or ZIP code for mailing address
   * @return postalCode
   **/
  @Schema(description = "Postal or ZIP code for mailing address")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AssemblyOscalMetadataAddress3 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The ISO 3166-1 alpha-2 country code for the mailing address.
   * @return country
   **/
  @Schema(description = "The ISO 3166-1 alpha-2 country code for the mailing address.")
  
  @Pattern(regexp="^\\S(.*\\S)?$")   public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalMetadataAddress3 assemblyOscalMetadataAddress3 = (AssemblyOscalMetadataAddress3) o;
    return Objects.equals(this.type, assemblyOscalMetadataAddress3.type) &&
        Objects.equals(this.addrLines, assemblyOscalMetadataAddress3.addrLines) &&
        Objects.equals(this.city, assemblyOscalMetadataAddress3.city) &&
        Objects.equals(this.state, assemblyOscalMetadataAddress3.state) &&
        Objects.equals(this.postalCode, assemblyOscalMetadataAddress3.postalCode) &&
        Objects.equals(this.country, assemblyOscalMetadataAddress3.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, addrLines, city, state, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalMetadataAddress3 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    addrLines: ").append(toIndentedString(addrLines)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
