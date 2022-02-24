package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Where applicable this is the IPv4 port range on which the service operates.
 */
@Schema(description = "Where applicable this is the IPv4 port range on which the service operates.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")


public class AssemblyOscalImplementationCommonPortRange   {
  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("end")
  private Integer end = null;

  /**
   * Indicates the transport type.
   */
  public enum TransportEnum {
    TCP("TCP"),
    
    UDP("UDP");

    private String value;

    TransportEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransportEnum fromValue(String text) {
      for (TransportEnum b : TransportEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("transport")
  private TransportEnum transport = null;

  public AssemblyOscalImplementationCommonPortRange start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Indicates the starting port number in a port range
   * minimum: 0
   * @return start
   **/
  @Schema(description = "Indicates the starting port number in a port range")
  
  @Min(0)  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public AssemblyOscalImplementationCommonPortRange end(Integer end) {
    this.end = end;
    return this;
  }

  /**
   * Indicates the ending port number in a port range
   * minimum: 0
   * @return end
   **/
  @Schema(description = "Indicates the ending port number in a port range")
  
  @Min(0)  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public AssemblyOscalImplementationCommonPortRange transport(TransportEnum transport) {
    this.transport = transport;
    return this;
  }

  /**
   * Indicates the transport type.
   * @return transport
   **/
  @Schema(description = "Indicates the transport type.")
  
  @Pattern(regexp="^[_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD][_A-Za-z\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD\\-\\.0-9\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$")   public TransportEnum getTransport() {
    return transport;
  }

  public void setTransport(TransportEnum transport) {
    this.transport = transport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssemblyOscalImplementationCommonPortRange assemblyOscalImplementationCommonPortRange = (AssemblyOscalImplementationCommonPortRange) o;
    return Objects.equals(this.start, assemblyOscalImplementationCommonPortRange.start) &&
        Objects.equals(this.end, assemblyOscalImplementationCommonPortRange.end) &&
        Objects.equals(this.transport, assemblyOscalImplementationCommonPortRange.transport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, transport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssemblyOscalImplementationCommonPortRange {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
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
