package io.swagger.api;

import io.swagger.model.OSCALSsp;
import io.swagger.model.OSCALSspUpdateExample;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")
@RestController
public class SystemSecurityPlansApiController implements SystemSecurityPlansApi {

    private static final Logger log = LoggerFactory.getLogger(SystemSecurityPlansApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SystemSecurityPlansApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addComponentToSsp(@Parameter(in = ParameterIn.PATH,
            description = "System security plan ID", required = true, schema = @Schema()) @PathVariable("sspId") String sspId, @Parameter(in = ParameterIn.PATH, description = "Component ID to be associated with SSP", required = true, schema = @Schema()) @PathVariable("componentId") String componentId, @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema()) @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addPartyToSsp(@Parameter(in = ParameterIn.PATH,
            description = "System security plan ID", required = true, schema = @Schema()) @PathVariable("sspId") String sspId, @Parameter(in = ParameterIn.PATH, description = "Party ID to be associated with SSP", required = true, schema = @Schema()) @PathVariable("partyId") String partyId, @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema()) @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addSsp(@Parameter(in = ParameterIn.DEFAULT,
            description = "OSCAL system security plan object to be added", required = true, schema = @Schema()) @Valid @RequestBody OSCALSsp body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteSsp(@Parameter(in = ParameterIn.PATH,
            description = "System security plan ID to delete", required = true, schema = @Schema()) @PathVariable("sspId") String sspId, @Parameter(in = ParameterIn.HEADER, description = "", schema = @Schema()) @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OSCALSsp>> findSspsByName(@NotNull @Parameter(in = ParameterIn.QUERY,
            description = "Terms to search for in system security plan names", required = true,
            schema = @Schema()) @Valid @RequestParam(value = "query", required = true) String query) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OSCALSsp>>(objectMapper.readValue("[ { \"method\": \"NOT_IMPLEMENTED\" }]",
                        List.class), HttpStatus.NOT_IMPLEMENTED);
//                        "  \"system-security-plan\" : {\n" +
//                        "    \"system-implementation\" : {\n" +
//                        "      \"inventory-items\" : [ {\n" +
//                        "        \"responsible-parties\" : [ null, null ],\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"implemented-components\" : [ {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"responsible-parties\" : [ null, null ],\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"implemented-components\" : [ {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"components\" : [ {\n" +
//                        "        \"responsible-roles\" : [ {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"purpose\" : \"purpose\",\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"type\" : \"type\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"protocols\" : [ {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        }, {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"status\" : {\n" +
//                        "          \"state\" : \"under-development\"\n" +
//                        "        }\n" +
//                        "      }, {\n" +
//                        "        \"responsible-roles\" : [ {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"purpose\" : \"purpose\",\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"type\" : \"type\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"protocols\" : [ {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        }, {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"status\" : {\n" +
//                        "          \"state\" : \"under-development\"\n" +
//                        "        }\n" +
//                        "      } ],\n" +
//                        "      \"leveraged-authorizations\" : [ {\n" +
//                        "        \"party-uuid\" : \"party-uuid\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"party-uuid\" : \"party-uuid\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"links\" : [ null, null ],\n" +
//                        "      \"users\" : [ {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"authorized-privileges\" : [ {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        }, {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        } ],\n" +
//                        "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"authorized-privileges\" : [ {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        }, {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        } ],\n" +
//                        "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"props\" : [ null, null ]\n" +
//                        "    },\n" +
//                        "    \"metadata\" : {\n" +
//                        "      \"responsible-parties\" : [ {\n" +
//                        "        \"role-id\" : \"role-id\",\n" +
//                        "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"role-id\" : \"role-id\",\n" +
//                        "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"roles\" : [ {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"id\" : \"id\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"id\" : \"id\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"published\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                        "      \"title\" : \"title\",\n" +
//                        "      \"version\" : \"version\",\n" +
//                        "      \"props\" : [ null, null ],\n" +
//                        "      \"last-modified\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                        "      \"document-ids\" : [ {\n" +
//                        "        \"identifier\" : \"identifier\",\n" +
//                        "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                        "      }, {\n" +
//                        "        \"identifier\" : \"identifier\",\n" +
//                        "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                        "      } ],\n" +
//                        "      \"parties\" : [ {\n" +
//                        "        \"telephone-numbers\" : [ null, null ],\n" +
//                        "        \"addresses\" : [ null, null ],\n" +
//                        "        \"external-ids\" : [ {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        }, {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        } ],\n" +
//                        "        \"type\" : \"person\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                        "        \"email-addresses\" : [ null, null ],\n" +
//                        "        \"name\" : \"name\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                        "      }, {\n" +
//                        "        \"telephone-numbers\" : [ null, null ],\n" +
//                        "        \"addresses\" : [ null, null ],\n" +
//                        "        \"external-ids\" : [ {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        }, {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        } ],\n" +
//                        "        \"type\" : \"person\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                        "        \"email-addresses\" : [ null, null ],\n" +
//                        "        \"name\" : \"name\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                        "      } ],\n" +
//                        "      \"revisions\" : [ {\n" +
//                        "        \"links\" : [ {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"props\" : [ {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        }, {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        } ]\n" +
//                        "      }, {\n" +
//                        "        \"links\" : [ {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"props\" : [ {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        }, {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        } ]\n" +
//                        "      } ],\n" +
//                        "      \"links\" : [ null, null ],\n" +
//                        "      \"locations\" : [ {\n" +
//                        "        \"telephone-numbers\" : [ {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        }, {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        } ],\n" +
//                        "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                        "        \"address\" : {\n" +
//                        "          \"country\" : \"country\",\n" +
//                        "          \"postal-code\" : \"postal-code\",\n" +
//                        "          \"city\" : \"city\",\n" +
//                        "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                        "          \"state\" : \"state\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        },\n" +
//                        "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"telephone-numbers\" : [ {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        }, {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        } ],\n" +
//                        "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                        "        \"address\" : {\n" +
//                        "          \"country\" : \"country\",\n" +
//                        "          \"postal-code\" : \"postal-code\",\n" +
//                        "          \"city\" : \"city\",\n" +
//                        "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                        "          \"state\" : \"state\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        },\n" +
//                        "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"oscal-version\" : \"oscal-version\"\n" +
//                        "    },\n" +
//                        "    \"control-implementation\" : {\n" +
//                        "      \"set-parameters\" : [ {\n" +
//                        "        \"values\" : [ \"values\", \"values\" ],\n" +
//                        "        \"param-id\" : \"param-id\"\n" +
//                        "      }, {\n" +
//                        "        \"values\" : [ \"values\", \"values\" ],\n" +
//                        "        \"param-id\" : \"param-id\"\n" +
//                        "      } ],\n" +
//                        "      \"description\" : \"description\",\n" +
//                        "      \"implemented-requirements\" : [ {\n" +
//                        "        \"responsible-roles\" : [ null, null ],\n" +
//                        "        \"control-id\" : \"control-id\",\n" +
//                        "        \"set-parameters\" : [ null, null ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"statements\" : [ {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"by-components\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"responsible-roles\" : [ null, null ],\n" +
//                        "        \"control-id\" : \"control-id\",\n" +
//                        "        \"set-parameters\" : [ null, null ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"statements\" : [ {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"by-components\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ]\n" +
//                        "    },\n" +
//                        "    \"import-profile\" : {\n" +
//                        "      \"href\" : \"href\"\n" +
//                        "    },\n" +
//                        "    \"system-characteristics\" : {\n" +
//                        "      \"data-flow\" : {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"diagrams\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"system-name-short\" : \"system-name-short\",\n" +
//                        "      \"responsible-parties\" : [ null, null ],\n" +
//                        "      \"system-ids\" : [ {\n" +
//                        "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                        "        \"id\" : \"id\"\n" +
//                        "      }, {\n" +
//                        "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                        "        \"id\" : \"id\"\n" +
//                        "      } ],\n" +
//                        "      \"authorization-boundary\" : {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"diagrams\" : [ {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"caption\" : \"caption\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"remarks\" : \"remarks\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"caption\" : \"caption\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"remarks\" : \"remarks\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"remarks\" : \"remarks\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"description\" : \"description\",\n" +
//                        "      \"security-sensitivity-level\" : \"security-sensitivity-level\",\n" +
//                        "      \"security-impact-level\" : {\n" +
//                        "        \"security-objective-integrity\" : \"security-objective-integrity\",\n" +
//                        "        \"security-objective-availability\" : \"security-objective-availability\",\n" +
//                        "        \"security-objective-confidentiality\" : \"security-objective-confidentiality\"\n" +
//                        "      },\n" +
//                        "      \"date-authorized\" : \"date-authorized\",\n" +
//                        "      \"system-information\" : {\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"information-types\" : [ {\n" +
//                        "          \"categorizations\" : [ {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          }, {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          } ],\n" +
//                        "          \"confidentiality-impact\" : {\n" +
//                        "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"selected\" : \"selected\",\n" +
//                        "            \"props\" : [ null, null ],\n" +
//                        "            \"base\" : \"base\"\n" +
//                        "          },\n" +
//                        "          \"integrity-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"availability-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"categorizations\" : [ {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          }, {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          } ],\n" +
//                        "          \"confidentiality-impact\" : {\n" +
//                        "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"selected\" : \"selected\",\n" +
//                        "            \"props\" : [ null, null ],\n" +
//                        "            \"base\" : \"base\"\n" +
//                        "          },\n" +
//                        "          \"integrity-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"availability-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"props\" : [ null, null ],\n" +
//                        "      \"system-name\" : \"system-name\",\n" +
//                        "      \"links\" : [ null, null ],\n" +
//                        "      \"network-architecture\" : {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"diagrams\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"status\" : {\n" +
//                        "        \"state\" : \"operational\"\n" +
//                        "      }\n" +
//                        "    },\n" +
//                        "    \"back-matter\" : {\n" +
//                        "      \"resources\" : [ {\n" +
//                        "        \"citation\" : {\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        },\n" +
//                        "        \"document-ids\" : [ null, null ],\n" +
//                        "        \"base64\" : {\n" +
//                        "          \"filename\" : \"filename\",\n" +
//                        "          \"media-type\" : \"media-type\",\n" +
//                        "          \"value\" : \"value\"\n" +
//                        "        },\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"rlinks\" : [ {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"citation\" : {\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        },\n" +
//                        "        \"document-ids\" : [ null, null ],\n" +
//                        "        \"base64\" : {\n" +
//                        "          \"filename\" : \"filename\",\n" +
//                        "          \"media-type\" : \"media-type\",\n" +
//                        "          \"value\" : \"value\"\n" +
//                        "        },\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"rlinks\" : [ {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ]\n" +
//                        "    },\n" +
//                        "    \"uuid\" : \"uuid\"\n" +
//                        "  }\n" +
//                        "}, {\n" +
//                        "  \"system-security-plan\" : {\n" +
//                        "    \"system-implementation\" : {\n" +
//                        "      \"inventory-items\" : [ {\n" +
//                        "        \"responsible-parties\" : [ null, null ],\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"implemented-components\" : [ {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"responsible-parties\" : [ null, null ],\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"implemented-components\" : [ {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-parties\" : [ null, null ],\n" +
//                        "          \"component-uuid\" : \"component-uuid\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"components\" : [ {\n" +
//                        "        \"responsible-roles\" : [ {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"purpose\" : \"purpose\",\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"type\" : \"type\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"protocols\" : [ {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        }, {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"status\" : {\n" +
//                        "          \"state\" : \"under-development\"\n" +
//                        "        }\n" +
//                        "      }, {\n" +
//                        "        \"responsible-roles\" : [ {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"role-id\" : \"role-id\",\n" +
//                        "          \"party-uuids\" : [ null, null ],\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"purpose\" : \"purpose\",\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"type\" : \"type\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"protocols\" : [ {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        }, {\n" +
//                        "          \"port-ranges\" : [ {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          }, {\n" +
//                        "            \"start\" : 0,\n" +
//                        "            \"end\" : 0,\n" +
//                        "            \"transport\" : \"TCP\"\n" +
//                        "          } ],\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"status\" : {\n" +
//                        "          \"state\" : \"under-development\"\n" +
//                        "        }\n" +
//                        "      } ],\n" +
//                        "      \"leveraged-authorizations\" : [ {\n" +
//                        "        \"party-uuid\" : \"party-uuid\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"party-uuid\" : \"party-uuid\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"links\" : [ null, null ],\n" +
//                        "      \"users\" : [ {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"authorized-privileges\" : [ {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        }, {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        } ],\n" +
//                        "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"authorized-privileges\" : [ {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        }, {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                        "        } ],\n" +
//                        "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"props\" : [ null, null ]\n" +
//                        "    },\n" +
//                        "    \"metadata\" : {\n" +
//                        "      \"responsible-parties\" : [ {\n" +
//                        "        \"role-id\" : \"role-id\",\n" +
//                        "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"role-id\" : \"role-id\",\n" +
//                        "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"roles\" : [ {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"id\" : \"id\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"id\" : \"id\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"published\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                        "      \"title\" : \"title\",\n" +
//                        "      \"version\" : \"version\",\n" +
//                        "      \"props\" : [ null, null ],\n" +
//                        "      \"last-modified\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                        "      \"document-ids\" : [ {\n" +
//                        "        \"identifier\" : \"identifier\",\n" +
//                        "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                        "      }, {\n" +
//                        "        \"identifier\" : \"identifier\",\n" +
//                        "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                        "      } ],\n" +
//                        "      \"parties\" : [ {\n" +
//                        "        \"telephone-numbers\" : [ null, null ],\n" +
//                        "        \"addresses\" : [ null, null ],\n" +
//                        "        \"external-ids\" : [ {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        }, {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        } ],\n" +
//                        "        \"type\" : \"person\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                        "        \"email-addresses\" : [ null, null ],\n" +
//                        "        \"name\" : \"name\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                        "      }, {\n" +
//                        "        \"telephone-numbers\" : [ null, null ],\n" +
//                        "        \"addresses\" : [ null, null ],\n" +
//                        "        \"external-ids\" : [ {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        }, {\n" +
//                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                        "          \"id\" : \"id\"\n" +
//                        "        } ],\n" +
//                        "        \"type\" : \"person\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"short-name\" : \"short-name\",\n" +
//                        "        \"props\" : [ null, null ],\n" +
//                        "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                        "        \"email-addresses\" : [ null, null ],\n" +
//                        "        \"name\" : \"name\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                        "      } ],\n" +
//                        "      \"revisions\" : [ {\n" +
//                        "        \"links\" : [ {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"props\" : [ {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        }, {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        } ]\n" +
//                        "      }, {\n" +
//                        "        \"links\" : [ {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"rel\" : \"rel\",\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"props\" : [ {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        }, {\n" +
//                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                        "          \"name\" : \"name\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"value\" : \"value\",\n" +
//                        "          \"class\" : \"class\",\n" +
//                        "          \"remarks\" : \"remarks\"\n" +
//                        "        } ]\n" +
//                        "      } ],\n" +
//                        "      \"links\" : [ null, null ],\n" +
//                        "      \"locations\" : [ {\n" +
//                        "        \"telephone-numbers\" : [ {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        }, {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        } ],\n" +
//                        "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                        "        \"address\" : {\n" +
//                        "          \"country\" : \"country\",\n" +
//                        "          \"postal-code\" : \"postal-code\",\n" +
//                        "          \"city\" : \"city\",\n" +
//                        "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                        "          \"state\" : \"state\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        },\n" +
//                        "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"telephone-numbers\" : [ {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        }, {\n" +
//                        "          \"number\" : \"number\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        } ],\n" +
//                        "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                        "        \"address\" : {\n" +
//                        "          \"country\" : \"country\",\n" +
//                        "          \"postal-code\" : \"postal-code\",\n" +
//                        "          \"city\" : \"city\",\n" +
//                        "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                        "          \"state\" : \"state\",\n" +
//                        "          \"type\" : \"type\"\n" +
//                        "        },\n" +
//                        "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ],\n" +
//                        "      \"oscal-version\" : \"oscal-version\"\n" +
//                        "    },\n" +
//                        "    \"control-implementation\" : {\n" +
//                        "      \"set-parameters\" : [ {\n" +
//                        "        \"values\" : [ \"values\", \"values\" ],\n" +
//                        "        \"param-id\" : \"param-id\"\n" +
//                        "      }, {\n" +
//                        "        \"values\" : [ \"values\", \"values\" ],\n" +
//                        "        \"param-id\" : \"param-id\"\n" +
//                        "      } ],\n" +
//                        "      \"description\" : \"description\",\n" +
//                        "      \"implemented-requirements\" : [ {\n" +
//                        "        \"responsible-roles\" : [ null, null ],\n" +
//                        "        \"control-id\" : \"control-id\",\n" +
//                        "        \"set-parameters\" : [ null, null ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"statements\" : [ {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"by-components\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"responsible-roles\" : [ null, null ],\n" +
//                        "        \"control-id\" : \"control-id\",\n" +
//                        "        \"set-parameters\" : [ null, null ],\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"statements\" : [ {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"responsible-roles\" : [ null, null ],\n" +
//                        "          \"statement-id\" : \"statement-id\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"by-components\" : [ {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          }, {\n" +
//                        "            \"responsible-roles\" : [ null, null ],\n" +
//                        "            \"component-uuid\" : \"component-uuid\",\n" +
//                        "            \"implementation-status\" : {\n" +
//                        "              \"state\" : \"state\"\n" +
//                        "            },\n" +
//                        "            \"inherited\" : [ {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"satisfied\" : [ {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            }, {\n" +
//                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                        "              \"responsible-roles\" : [ null, null ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"uuid\" : \"uuid\",\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            } ],\n" +
//                        "            \"set-parameters\" : [ null, null ],\n" +
//                        "            \"description\" : \"description\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"uuid\" : \"uuid\",\n" +
//                        "            \"export\" : {\n" +
//                        "              \"responsibilities\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"provided\" : [ {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              }, {\n" +
//                        "                \"responsible-roles\" : [ null, null ],\n" +
//                        "                \"description\" : \"description\",\n" +
//                        "                \"links\" : [ null, null ],\n" +
//                        "                \"uuid\" : \"uuid\",\n" +
//                        "                \"props\" : [ null, null ]\n" +
//                        "              } ],\n" +
//                        "              \"description\" : \"description\",\n" +
//                        "              \"links\" : [ null, null ],\n" +
//                        "              \"props\" : [ null, null ]\n" +
//                        "            },\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          } ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"by-components\" : [ null, null ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ]\n" +
//                        "    },\n" +
//                        "    \"import-profile\" : {\n" +
//                        "      \"href\" : \"href\"\n" +
//                        "    },\n" +
//                        "    \"system-characteristics\" : {\n" +
//                        "      \"data-flow\" : {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"diagrams\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"system-name-short\" : \"system-name-short\",\n" +
//                        "      \"responsible-parties\" : [ null, null ],\n" +
//                        "      \"system-ids\" : [ {\n" +
//                        "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                        "        \"id\" : \"id\"\n" +
//                        "      }, {\n" +
//                        "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                        "        \"id\" : \"id\"\n" +
//                        "      } ],\n" +
//                        "      \"authorization-boundary\" : {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"diagrams\" : [ {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"caption\" : \"caption\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"remarks\" : \"remarks\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"caption\" : \"caption\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"remarks\" : \"remarks\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"remarks\" : \"remarks\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"description\" : \"description\",\n" +
//                        "      \"security-sensitivity-level\" : \"security-sensitivity-level\",\n" +
//                        "      \"security-impact-level\" : {\n" +
//                        "        \"security-objective-integrity\" : \"security-objective-integrity\",\n" +
//                        "        \"security-objective-availability\" : \"security-objective-availability\",\n" +
//                        "        \"security-objective-confidentiality\" : \"security-objective-confidentiality\"\n" +
//                        "      },\n" +
//                        "      \"date-authorized\" : \"date-authorized\",\n" +
//                        "      \"system-information\" : {\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"information-types\" : [ {\n" +
//                        "          \"categorizations\" : [ {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          }, {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          } ],\n" +
//                        "          \"confidentiality-impact\" : {\n" +
//                        "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"selected\" : \"selected\",\n" +
//                        "            \"props\" : [ null, null ],\n" +
//                        "            \"base\" : \"base\"\n" +
//                        "          },\n" +
//                        "          \"integrity-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"availability-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        }, {\n" +
//                        "          \"categorizations\" : [ {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          }, {\n" +
//                        "            \"system\" : \"http://example.com/aeiou\",\n" +
//                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                        "          } ],\n" +
//                        "          \"confidentiality-impact\" : {\n" +
//                        "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"selected\" : \"selected\",\n" +
//                        "            \"props\" : [ null, null ],\n" +
//                        "            \"base\" : \"base\"\n" +
//                        "          },\n" +
//                        "          \"integrity-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"description\" : \"description\",\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"availability-impact\" : {\n" +
//                        "            \"links\" : [ null, null ],\n" +
//                        "            \"props\" : [ null, null ]\n" +
//                        "          },\n" +
//                        "          \"title\" : \"title\",\n" +
//                        "          \"uuid\" : \"uuid\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        } ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"props\" : [ null, null ],\n" +
//                        "      \"system-name\" : \"system-name\",\n" +
//                        "      \"links\" : [ null, null ],\n" +
//                        "      \"network-architecture\" : {\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"links\" : [ null, null ],\n" +
//                        "        \"diagrams\" : [ null, null ],\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      },\n" +
//                        "      \"status\" : {\n" +
//                        "        \"state\" : \"operational\"\n" +
//                        "      }\n" +
//                        "    },\n" +
//                        "    \"back-matter\" : {\n" +
//                        "      \"resources\" : [ {\n" +
//                        "        \"citation\" : {\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        },\n" +
//                        "        \"document-ids\" : [ null, null ],\n" +
//                        "        \"base64\" : {\n" +
//                        "          \"filename\" : \"filename\",\n" +
//                        "          \"media-type\" : \"media-type\",\n" +
//                        "          \"value\" : \"value\"\n" +
//                        "        },\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"rlinks\" : [ {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      }, {\n" +
//                        "        \"citation\" : {\n" +
//                        "          \"links\" : [ null, null ],\n" +
//                        "          \"text\" : \"text\",\n" +
//                        "          \"props\" : [ null, null ]\n" +
//                        "        },\n" +
//                        "        \"document-ids\" : [ null, null ],\n" +
//                        "        \"base64\" : {\n" +
//                        "          \"filename\" : \"filename\",\n" +
//                        "          \"media-type\" : \"media-type\",\n" +
//                        "          \"value\" : \"value\"\n" +
//                        "        },\n" +
//                        "        \"description\" : \"description\",\n" +
//                        "        \"title\" : \"title\",\n" +
//                        "        \"rlinks\" : [ {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        }, {\n" +
//                        "          \"hashes\" : [ {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          }, {\n" +
//                        "            \"value\" : \"value\",\n" +
//                        "            \"algorithm\" : \"algorithm\"\n" +
//                        "          } ],\n" +
//                        "          \"href\" : \"href\",\n" +
//                        "          \"media-type\" : \"media-type\"\n" +
//                        "        } ],\n" +
//                        "        \"uuid\" : \"uuid\",\n" +
//                        "        \"props\" : [ null, null ]\n" +
//                        "      } ]\n" +
//                        "    },\n" +
//                        "    \"uuid\" : \"uuid\"\n" +
//                        "  }\n" +
//                        "} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OSCALSsp>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OSCALSsp>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OSCALSsp> getSspById(@Parameter(in = ParameterIn.PATH,
            description = "ID of system security plan to return", required = true, schema = @Schema()) @PathVariable("sspId") String sspId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OSCALSsp>(objectMapper.readValue("{\n" +
                        "  \"system-security-plan\" : {\n" +
                        "    \"system-implementation\" : {\n" +
                        "      \"inventory-items\" : [ {\n" +
                        "        \"responsible-parties\" : [ null, null ],\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"implemented-components\" : [ {\n" +
                        "          \"responsible-parties\" : [ null, null ],\n" +
                        "          \"component-uuid\" : \"component-uuid\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"responsible-parties\" : [ null, null ],\n" +
                        "          \"component-uuid\" : \"component-uuid\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"responsible-parties\" : [ null, null ],\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"implemented-components\" : [ {\n" +
                        "          \"responsible-parties\" : [ null, null ],\n" +
                        "          \"component-uuid\" : \"component-uuid\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"responsible-parties\" : [ null, null ],\n" +
                        "          \"component-uuid\" : \"component-uuid\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ],\n" +
                        "      \"components\" : [ {\n" +
                        "        \"responsible-roles\" : [ {\n" +
                        "          \"role-id\" : \"role-id\",\n" +
                        "          \"party-uuids\" : [ null, null ],\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"role-id\" : \"role-id\",\n" +
                        "          \"party-uuids\" : [ null, null ],\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"purpose\" : \"purpose\",\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"type\" : \"type\",\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"protocols\" : [ {\n" +
                        "          \"port-ranges\" : [ {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          }, {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          } ],\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"uuid\" : \"uuid\"\n" +
                        "        }, {\n" +
                        "          \"port-ranges\" : [ {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          }, {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          } ],\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"uuid\" : \"uuid\"\n" +
                        "        } ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ],\n" +
                        "        \"status\" : {\n" +
                        "          \"state\" : \"under-development\"\n" +
                        "        }\n" +
                        "      }, {\n" +
                        "        \"responsible-roles\" : [ {\n" +
                        "          \"role-id\" : \"role-id\",\n" +
                        "          \"party-uuids\" : [ null, null ],\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"role-id\" : \"role-id\",\n" +
                        "          \"party-uuids\" : [ null, null ],\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"purpose\" : \"purpose\",\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"type\" : \"type\",\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"protocols\" : [ {\n" +
                        "          \"port-ranges\" : [ {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          }, {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          } ],\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"uuid\" : \"uuid\"\n" +
                        "        }, {\n" +
                        "          \"port-ranges\" : [ {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          }, {\n" +
                        "            \"start\" : 0,\n" +
                        "            \"end\" : 0,\n" +
                        "            \"transport\" : \"TCP\"\n" +
                        "          } ],\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"uuid\" : \"uuid\"\n" +
                        "        } ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ],\n" +
                        "        \"status\" : {\n" +
                        "          \"state\" : \"under-development\"\n" +
                        "        }\n" +
                        "      } ],\n" +
                        "      \"leveraged-authorizations\" : [ {\n" +
                        "        \"party-uuid\" : \"party-uuid\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"party-uuid\" : \"party-uuid\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ],\n" +
                        "      \"links\" : [ null, null ],\n" +
                        "      \"users\" : [ {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"authorized-privileges\" : [ {\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
                        "        }, {\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
                        "        } ],\n" +
                        "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"short-name\" : \"short-name\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"authorized-privileges\" : [ {\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
                        "        }, {\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
                        "        } ],\n" +
                        "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"short-name\" : \"short-name\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ],\n" +
                        "      \"props\" : [ null, null ]\n" +
                        "    },\n" +
                        "    \"metadata\" : {\n" +
                        "      \"responsible-parties\" : [ {\n" +
                        "        \"role-id\" : \"role-id\",\n" +
                        "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"role-id\" : \"role-id\",\n" +
                        "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ],\n" +
                        "      \"roles\" : [ {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"id\" : \"id\",\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"short-name\" : \"short-name\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"id\" : \"id\",\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"short-name\" : \"short-name\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ],\n" +
                        "      \"published\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
                        "      \"title\" : \"title\",\n" +
                        "      \"version\" : \"version\",\n" +
                        "      \"props\" : [ null, null ],\n" +
                        "      \"last-modified\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
                        "      \"document-ids\" : [ {\n" +
                        "        \"identifier\" : \"identifier\",\n" +
                        "        \"scheme\" : \"http://example.com/aeiou\"\n" +
                        "      }, {\n" +
                        "        \"identifier\" : \"identifier\",\n" +
                        "        \"scheme\" : \"http://example.com/aeiou\"\n" +
                        "      } ],\n" +
                        "      \"parties\" : [ {\n" +
                        "        \"telephone-numbers\" : [ null, null ],\n" +
                        "        \"addresses\" : [ null, null ],\n" +
                        "        \"external-ids\" : [ {\n" +
                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
                        "          \"id\" : \"id\"\n" +
                        "        }, {\n" +
                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
                        "          \"id\" : \"id\"\n" +
                        "        } ],\n" +
                        "        \"type\" : \"person\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"short-name\" : \"short-name\",\n" +
                        "        \"props\" : [ null, null ],\n" +
                        "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
                        "        \"email-addresses\" : [ null, null ],\n" +
                        "        \"name\" : \"name\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
                        "      }, {\n" +
                        "        \"telephone-numbers\" : [ null, null ],\n" +
                        "        \"addresses\" : [ null, null ],\n" +
                        "        \"external-ids\" : [ {\n" +
                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
                        "          \"id\" : \"id\"\n" +
                        "        }, {\n" +
                        "          \"scheme\" : \"http://example.com/aeiou\",\n" +
                        "          \"id\" : \"id\"\n" +
                        "        } ],\n" +
                        "        \"type\" : \"person\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"short-name\" : \"short-name\",\n" +
                        "        \"props\" : [ null, null ],\n" +
                        "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
                        "        \"email-addresses\" : [ null, null ],\n" +
                        "        \"name\" : \"name\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
                        "      } ],\n" +
                        "      \"revisions\" : [ {\n" +
                        "        \"links\" : [ {\n" +
                        "          \"rel\" : \"rel\",\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"text\" : \"text\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        }, {\n" +
                        "          \"rel\" : \"rel\",\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"text\" : \"text\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        } ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"props\" : [ {\n" +
                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"value\" : \"value\",\n" +
                        "          \"class\" : \"class\",\n" +
                        "          \"remarks\" : \"remarks\"\n" +
                        "        }, {\n" +
                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"value\" : \"value\",\n" +
                        "          \"class\" : \"class\",\n" +
                        "          \"remarks\" : \"remarks\"\n" +
                        "        } ]\n" +
                        "      }, {\n" +
                        "        \"links\" : [ {\n" +
                        "          \"rel\" : \"rel\",\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"text\" : \"text\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        }, {\n" +
                        "          \"rel\" : \"rel\",\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"text\" : \"text\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        } ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"props\" : [ {\n" +
                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"value\" : \"value\",\n" +
                        "          \"class\" : \"class\",\n" +
                        "          \"remarks\" : \"remarks\"\n" +
                        "        }, {\n" +
                        "          \"ns\" : \"http://example.com/aeiou\",\n" +
                        "          \"name\" : \"name\",\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"value\" : \"value\",\n" +
                        "          \"class\" : \"class\",\n" +
                        "          \"remarks\" : \"remarks\"\n" +
                        "        } ]\n" +
                        "      } ],\n" +
                        "      \"links\" : [ null, null ],\n" +
                        "      \"locations\" : [ {\n" +
                        "        \"telephone-numbers\" : [ {\n" +
                        "          \"number\" : \"number\",\n" +
                        "          \"type\" : \"type\"\n" +
                        "        }, {\n" +
                        "          \"number\" : \"number\",\n" +
                        "          \"type\" : \"type\"\n" +
                        "        } ],\n" +
                        "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
                        "        \"address\" : {\n" +
                        "          \"country\" : \"country\",\n" +
                        "          \"postal-code\" : \"postal-code\",\n" +
                        "          \"city\" : \"city\",\n" +
                        "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
                        "          \"state\" : \"state\",\n" +
                        "          \"type\" : \"type\"\n" +
                        "        },\n" +
                        "        \"email-addresses\" : [ \"\", \"\" ],\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"telephone-numbers\" : [ {\n" +
                        "          \"number\" : \"number\",\n" +
                        "          \"type\" : \"type\"\n" +
                        "        }, {\n" +
                        "          \"number\" : \"number\",\n" +
                        "          \"type\" : \"type\"\n" +
                        "        } ],\n" +
                        "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
                        "        \"address\" : {\n" +
                        "          \"country\" : \"country\",\n" +
                        "          \"postal-code\" : \"postal-code\",\n" +
                        "          \"city\" : \"city\",\n" +
                        "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
                        "          \"state\" : \"state\",\n" +
                        "          \"type\" : \"type\"\n" +
                        "        },\n" +
                        "        \"email-addresses\" : [ \"\", \"\" ],\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ],\n" +
                        "      \"oscal-version\" : \"oscal-version\"\n" +
                        "    },\n" +
                        "    \"control-implementation\" : {\n" +
                        "      \"set-parameters\" : [ {\n" +
                        "        \"values\" : [ \"values\", \"values\" ],\n" +
                        "        \"param-id\" : \"param-id\"\n" +
                        "      }, {\n" +
                        "        \"values\" : [ \"values\", \"values\" ],\n" +
                        "        \"param-id\" : \"param-id\"\n" +
                        "      } ],\n" +
                        "      \"description\" : \"description\",\n" +
                        "      \"implemented-requirements\" : [ {\n" +
                        "        \"responsible-roles\" : [ null, null ],\n" +
                        "        \"control-id\" : \"control-id\",\n" +
                        "        \"set-parameters\" : [ null, null ],\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"statements\" : [ {\n" +
                        "          \"responsible-roles\" : [ null, null ],\n" +
                        "          \"statement-id\" : \"statement-id\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"by-components\" : [ {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          }, {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          } ],\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"responsible-roles\" : [ null, null ],\n" +
                        "          \"statement-id\" : \"statement-id\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"by-components\" : [ {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          }, {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          } ],\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"by-components\" : [ null, null ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"responsible-roles\" : [ null, null ],\n" +
                        "        \"control-id\" : \"control-id\",\n" +
                        "        \"set-parameters\" : [ null, null ],\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"statements\" : [ {\n" +
                        "          \"responsible-roles\" : [ null, null ],\n" +
                        "          \"statement-id\" : \"statement-id\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"by-components\" : [ {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          }, {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          } ],\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"responsible-roles\" : [ null, null ],\n" +
                        "          \"statement-id\" : \"statement-id\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"by-components\" : [ {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          }, {\n" +
                        "            \"responsible-roles\" : [ null, null ],\n" +
                        "            \"component-uuid\" : \"component-uuid\",\n" +
                        "            \"implementation-status\" : {\n" +
                        "              \"state\" : \"state\"\n" +
                        "            },\n" +
                        "            \"inherited\" : [ {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"provided-uuid\" : \"provided-uuid\",\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"satisfied\" : [ {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            }, {\n" +
                        "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
                        "              \"responsible-roles\" : [ null, null ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"uuid\" : \"uuid\",\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            } ],\n" +
                        "            \"set-parameters\" : [ null, null ],\n" +
                        "            \"description\" : \"description\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"uuid\" : \"uuid\",\n" +
                        "            \"export\" : {\n" +
                        "              \"responsibilities\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"provided-uuid\" : \"provided-uuid\",\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"provided\" : [ {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              }, {\n" +
                        "                \"responsible-roles\" : [ null, null ],\n" +
                        "                \"description\" : \"description\",\n" +
                        "                \"links\" : [ null, null ],\n" +
                        "                \"uuid\" : \"uuid\",\n" +
                        "                \"props\" : [ null, null ]\n" +
                        "              } ],\n" +
                        "              \"description\" : \"description\",\n" +
                        "              \"links\" : [ null, null ],\n" +
                        "              \"props\" : [ null, null ]\n" +
                        "            },\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          } ],\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"by-components\" : [ null, null ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ]\n" +
                        "    },\n" +
                        "    \"import-profile\" : {\n" +
                        "      \"href\" : \"href\"\n" +
                        "    },\n" +
                        "    \"system-characteristics\" : {\n" +
                        "      \"data-flow\" : {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"diagrams\" : [ null, null ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      },\n" +
                        "      \"system-name-short\" : \"system-name-short\",\n" +
                        "      \"responsible-parties\" : [ null, null ],\n" +
                        "      \"system-ids\" : [ {\n" +
                        "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
                        "        \"id\" : \"id\"\n" +
                        "      }, {\n" +
                        "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
                        "        \"id\" : \"id\"\n" +
                        "      } ],\n" +
                        "      \"authorization-boundary\" : {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"diagrams\" : [ {\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"caption\" : \"caption\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"remarks\" : \"remarks\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"caption\" : \"caption\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"remarks\" : \"remarks\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"remarks\" : \"remarks\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      },\n" +
                        "      \"description\" : \"description\",\n" +
                        "      \"security-sensitivity-level\" : \"security-sensitivity-level\",\n" +
                        "      \"security-impact-level\" : {\n" +
                        "        \"security-objective-integrity\" : \"security-objective-integrity\",\n" +
                        "        \"security-objective-availability\" : \"security-objective-availability\",\n" +
                        "        \"security-objective-confidentiality\" : \"security-objective-confidentiality\"\n" +
                        "      },\n" +
                        "      \"date-authorized\" : \"date-authorized\",\n" +
                        "      \"system-information\" : {\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"information-types\" : [ {\n" +
                        "          \"categorizations\" : [ {\n" +
                        "            \"system\" : \"http://example.com/aeiou\",\n" +
                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
                        "          }, {\n" +
                        "            \"system\" : \"http://example.com/aeiou\",\n" +
                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
                        "          } ],\n" +
                        "          \"confidentiality-impact\" : {\n" +
                        "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"selected\" : \"selected\",\n" +
                        "            \"props\" : [ null, null ],\n" +
                        "            \"base\" : \"base\"\n" +
                        "          },\n" +
                        "          \"integrity-impact\" : {\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          },\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"availability-impact\" : {\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          },\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        }, {\n" +
                        "          \"categorizations\" : [ {\n" +
                        "            \"system\" : \"http://example.com/aeiou\",\n" +
                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
                        "          }, {\n" +
                        "            \"system\" : \"http://example.com/aeiou\",\n" +
                        "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
                        "          } ],\n" +
                        "          \"confidentiality-impact\" : {\n" +
                        "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"selected\" : \"selected\",\n" +
                        "            \"props\" : [ null, null ],\n" +
                        "            \"base\" : \"base\"\n" +
                        "          },\n" +
                        "          \"integrity-impact\" : {\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          },\n" +
                        "          \"description\" : \"description\",\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"availability-impact\" : {\n" +
                        "            \"links\" : [ null, null ],\n" +
                        "            \"props\" : [ null, null ]\n" +
                        "          },\n" +
                        "          \"title\" : \"title\",\n" +
                        "          \"uuid\" : \"uuid\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        } ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      },\n" +
                        "      \"props\" : [ null, null ],\n" +
                        "      \"system-name\" : \"system-name\",\n" +
                        "      \"links\" : [ null, null ],\n" +
                        "      \"network-architecture\" : {\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"links\" : [ null, null ],\n" +
                        "        \"diagrams\" : [ null, null ],\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      },\n" +
                        "      \"status\" : {\n" +
                        "        \"state\" : \"operational\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"back-matter\" : {\n" +
                        "      \"resources\" : [ {\n" +
                        "        \"citation\" : {\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"text\" : \"text\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        },\n" +
                        "        \"document-ids\" : [ null, null ],\n" +
                        "        \"base64\" : {\n" +
                        "          \"filename\" : \"filename\",\n" +
                        "          \"media-type\" : \"media-type\",\n" +
                        "          \"value\" : \"value\"\n" +
                        "        },\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"rlinks\" : [ {\n" +
                        "          \"hashes\" : [ {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          }, {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          } ],\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        }, {\n" +
                        "          \"hashes\" : [ {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          }, {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          } ],\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        } ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      }, {\n" +
                        "        \"citation\" : {\n" +
                        "          \"links\" : [ null, null ],\n" +
                        "          \"text\" : \"text\",\n" +
                        "          \"props\" : [ null, null ]\n" +
                        "        },\n" +
                        "        \"document-ids\" : [ null, null ],\n" +
                        "        \"base64\" : {\n" +
                        "          \"filename\" : \"filename\",\n" +
                        "          \"media-type\" : \"media-type\",\n" +
                        "          \"value\" : \"value\"\n" +
                        "        },\n" +
                        "        \"description\" : \"description\",\n" +
                        "        \"title\" : \"title\",\n" +
                        "        \"rlinks\" : [ {\n" +
                        "          \"hashes\" : [ {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          }, {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          } ],\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        }, {\n" +
                        "          \"hashes\" : [ {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          }, {\n" +
                        "            \"value\" : \"value\",\n" +
                        "            \"algorithm\" : \"algorithm\"\n" +
                        "          } ],\n" +
                        "          \"href\" : \"href\",\n" +
                        "          \"media-type\" : \"media-type\"\n" +
                        "        } ],\n" +
                        "        \"uuid\" : \"uuid\",\n" +
                        "        \"props\" : [ null, null ]\n" +
                        "      } ]\n" +
                        "    },\n" +
                        "    \"uuid\" : \"uuid\"\n" +
                        "  }\n" +
                        "}", OSCALSsp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OSCALSsp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OSCALSsp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OSCALSsp>> getSsps() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OSCALSsp>>(objectMapper.
                        readValue("[ { \"method\": \"NOT_IMPLEMENTED\" }]", List.class), HttpStatus.NOT_IMPLEMENTED);
//                        readValue("[ {\n" +
//                                "  \"system-security-plan\" : {\n" +
//                                "    \"system-implementation\" : {\n" +
//                                "      \"inventory-items\" : [ {\n" +
//                                "        \"responsible-parties\" : [ null, null ],\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"implemented-components\" : [ {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"responsible-parties\" : [ null, null ],\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"implemented-components\" : [ {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"components\" : [ {\n" +
//                                "        \"responsible-roles\" : [ {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"purpose\" : \"purpose\",\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"type\" : \"type\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"protocols\" : [ {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        }, {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"status\" : {\n" +
//                                "          \"state\" : \"under-development\"\n" +
//                                "        }\n" +
//                                "      }, {\n" +
//                                "        \"responsible-roles\" : [ {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"purpose\" : \"purpose\",\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"type\" : \"type\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"protocols\" : [ {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        }, {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"status\" : {\n" +
//                                "          \"state\" : \"under-development\"\n" +
//                                "        }\n" +
//                                "      } ],\n" +
//                                "      \"leveraged-authorizations\" : [ {\n" +
//                                "        \"party-uuid\" : \"party-uuid\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"party-uuid\" : \"party-uuid\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"links\" : [ null, null ],\n" +
//                                "      \"users\" : [ {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"authorized-privileges\" : [ {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        }, {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        } ],\n" +
//                                "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"authorized-privileges\" : [ {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        }, {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        } ],\n" +
//                                "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"props\" : [ null, null ]\n" +
//                                "    },\n" +
//                                "    \"metadata\" : {\n" +
//                                "      \"responsible-parties\" : [ {\n" +
//                                "        \"role-id\" : \"role-id\",\n" +
//                                "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"role-id\" : \"role-id\",\n" +
//                                "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"roles\" : [ {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"id\" : \"id\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"id\" : \"id\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"published\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                                "      \"title\" : \"title\",\n" +
//                                "      \"version\" : \"version\",\n" +
//                                "      \"props\" : [ null, null ],\n" +
//                                "      \"last-modified\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                                "      \"document-ids\" : [ {\n" +
//                                "        \"identifier\" : \"identifier\",\n" +
//                                "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                                "      }, {\n" +
//                                "        \"identifier\" : \"identifier\",\n" +
//                                "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                                "      } ],\n" +
//                                "      \"parties\" : [ {\n" +
//                                "        \"telephone-numbers\" : [ null, null ],\n" +
//                                "        \"addresses\" : [ null, null ],\n" +
//                                "        \"external-ids\" : [ {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        }, {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        } ],\n" +
//                                "        \"type\" : \"person\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                                "        \"email-addresses\" : [ null, null ],\n" +
//                                "        \"name\" : \"name\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                                "      }, {\n" +
//                                "        \"telephone-numbers\" : [ null, null ],\n" +
//                                "        \"addresses\" : [ null, null ],\n" +
//                                "        \"external-ids\" : [ {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        }, {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        } ],\n" +
//                                "        \"type\" : \"person\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                                "        \"email-addresses\" : [ null, null ],\n" +
//                                "        \"name\" : \"name\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                                "      } ],\n" +
//                                "      \"revisions\" : [ {\n" +
//                                "        \"links\" : [ {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"props\" : [ {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        }, {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        } ]\n" +
//                                "      }, {\n" +
//                                "        \"links\" : [ {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"props\" : [ {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        }, {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        } ]\n" +
//                                "      } ],\n" +
//                                "      \"links\" : [ null, null ],\n" +
//                                "      \"locations\" : [ {\n" +
//                                "        \"telephone-numbers\" : [ {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        }, {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        } ],\n" +
//                                "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                                "        \"address\" : {\n" +
//                                "          \"country\" : \"country\",\n" +
//                                "          \"postal-code\" : \"postal-code\",\n" +
//                                "          \"city\" : \"city\",\n" +
//                                "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                                "          \"state\" : \"state\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        },\n" +
//                                "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"telephone-numbers\" : [ {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        }, {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        } ],\n" +
//                                "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                                "        \"address\" : {\n" +
//                                "          \"country\" : \"country\",\n" +
//                                "          \"postal-code\" : \"postal-code\",\n" +
//                                "          \"city\" : \"city\",\n" +
//                                "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                                "          \"state\" : \"state\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        },\n" +
//                                "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"oscal-version\" : \"oscal-version\"\n" +
//                                "    },\n" +
//                                "    \"control-implementation\" : {\n" +
//                                "      \"set-parameters\" : [ {\n" +
//                                "        \"values\" : [ \"values\", \"values\" ],\n" +
//                                "        \"param-id\" : \"param-id\"\n" +
//                                "      }, {\n" +
//                                "        \"values\" : [ \"values\", \"values\" ],\n" +
//                                "        \"param-id\" : \"param-id\"\n" +
//                                "      } ],\n" +
//                                "      \"description\" : \"description\",\n" +
//                                "      \"implemented-requirements\" : [ {\n" +
//                                "        \"responsible-roles\" : [ null, null ],\n" +
//                                "        \"control-id\" : \"control-id\",\n" +
//                                "        \"set-parameters\" : [ null, null ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"statements\" : [ {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"by-components\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"responsible-roles\" : [ null, null ],\n" +
//                                "        \"control-id\" : \"control-id\",\n" +
//                                "        \"set-parameters\" : [ null, null ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"statements\" : [ {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"by-components\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ]\n" +
//                                "    },\n" +
//                                "    \"import-profile\" : {\n" +
//                                "      \"href\" : \"href\"\n" +
//                                "    },\n" +
//                                "    \"system-characteristics\" : {\n" +
//                                "      \"data-flow\" : {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"diagrams\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"system-name-short\" : \"system-name-short\",\n" +
//                                "      \"responsible-parties\" : [ null, null ],\n" +
//                                "      \"system-ids\" : [ {\n" +
//                                "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                                "        \"id\" : \"id\"\n" +
//                                "      }, {\n" +
//                                "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                                "        \"id\" : \"id\"\n" +
//                                "      } ],\n" +
//                                "      \"authorization-boundary\" : {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"diagrams\" : [ {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"caption\" : \"caption\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"remarks\" : \"remarks\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"caption\" : \"caption\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"remarks\" : \"remarks\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"remarks\" : \"remarks\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"description\" : \"description\",\n" +
//                                "      \"security-sensitivity-level\" : \"security-sensitivity-level\",\n" +
//                                "      \"security-impact-level\" : {\n" +
//                                "        \"security-objective-integrity\" : \"security-objective-integrity\",\n" +
//                                "        \"security-objective-availability\" : \"security-objective-availability\",\n" +
//                                "        \"security-objective-confidentiality\" : \"security-objective-confidentiality\"\n" +
//                                "      },\n" +
//                                "      \"date-authorized\" : \"date-authorized\",\n" +
//                                "      \"system-information\" : {\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"information-types\" : [ {\n" +
//                                "          \"categorizations\" : [ {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          }, {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          } ],\n" +
//                                "          \"confidentiality-impact\" : {\n" +
//                                "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"selected\" : \"selected\",\n" +
//                                "            \"props\" : [ null, null ],\n" +
//                                "            \"base\" : \"base\"\n" +
//                                "          },\n" +
//                                "          \"integrity-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"availability-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"categorizations\" : [ {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          }, {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          } ],\n" +
//                                "          \"confidentiality-impact\" : {\n" +
//                                "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"selected\" : \"selected\",\n" +
//                                "            \"props\" : [ null, null ],\n" +
//                                "            \"base\" : \"base\"\n" +
//                                "          },\n" +
//                                "          \"integrity-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"availability-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"props\" : [ null, null ],\n" +
//                                "      \"system-name\" : \"system-name\",\n" +
//                                "      \"links\" : [ null, null ],\n" +
//                                "      \"network-architecture\" : {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"diagrams\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"status\" : {\n" +
//                                "        \"state\" : \"operational\"\n" +
//                                "      }\n" +
//                                "    },\n" +
//                                "    \"back-matter\" : {\n" +
//                                "      \"resources\" : [ {\n" +
//                                "        \"citation\" : {\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        },\n" +
//                                "        \"document-ids\" : [ null, null ],\n" +
//                                "        \"base64\" : {\n" +
//                                "          \"filename\" : \"filename\",\n" +
//                                "          \"media-type\" : \"media-type\",\n" +
//                                "          \"value\" : \"value\"\n" +
//                                "        },\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"rlinks\" : [ {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"citation\" : {\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        },\n" +
//                                "        \"document-ids\" : [ null, null ],\n" +
//                                "        \"base64\" : {\n" +
//                                "          \"filename\" : \"filename\",\n" +
//                                "          \"media-type\" : \"media-type\",\n" +
//                                "          \"value\" : \"value\"\n" +
//                                "        },\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"rlinks\" : [ {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ]\n" +
//                                "    },\n" +
//                                "    \"uuid\" : \"uuid\"\n" +
//                                "  }\n" +
//                                "}, {\n" +
//                                "  \"system-security-plan\" : {\n" +
//                                "    \"system-implementation\" : {\n" +
//                                "      \"inventory-items\" : [ {\n" +
//                                "        \"responsible-parties\" : [ null, null ],\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"implemented-components\" : [ {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"responsible-parties\" : [ null, null ],\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"implemented-components\" : [ {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-parties\" : [ null, null ],\n" +
//                                "          \"component-uuid\" : \"component-uuid\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"components\" : [ {\n" +
//                                "        \"responsible-roles\" : [ {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"purpose\" : \"purpose\",\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"type\" : \"type\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"protocols\" : [ {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        }, {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"status\" : {\n" +
//                                "          \"state\" : \"under-development\"\n" +
//                                "        }\n" +
//                                "      }, {\n" +
//                                "        \"responsible-roles\" : [ {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"role-id\" : \"role-id\",\n" +
//                                "          \"party-uuids\" : [ null, null ],\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"purpose\" : \"purpose\",\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"type\" : \"type\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"protocols\" : [ {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        }, {\n" +
//                                "          \"port-ranges\" : [ {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          }, {\n" +
//                                "            \"start\" : 0,\n" +
//                                "            \"end\" : 0,\n" +
//                                "            \"transport\" : \"TCP\"\n" +
//                                "          } ],\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"status\" : {\n" +
//                                "          \"state\" : \"under-development\"\n" +
//                                "        }\n" +
//                                "      } ],\n" +
//                                "      \"leveraged-authorizations\" : [ {\n" +
//                                "        \"party-uuid\" : \"party-uuid\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"party-uuid\" : \"party-uuid\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"links\" : [ null, null ],\n" +
//                                "      \"users\" : [ {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"authorized-privileges\" : [ {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        }, {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        } ],\n" +
//                                "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"authorized-privileges\" : [ {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        }, {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"functions-performed\" : [ \"functions-performed\", \"functions-performed\" ]\n" +
//                                "        } ],\n" +
//                                "        \"role-ids\" : [ \"role-ids\", \"role-ids\" ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"props\" : [ null, null ]\n" +
//                                "    },\n" +
//                                "    \"metadata\" : {\n" +
//                                "      \"responsible-parties\" : [ {\n" +
//                                "        \"role-id\" : \"role-id\",\n" +
//                                "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"role-id\" : \"role-id\",\n" +
//                                "        \"party-uuids\" : [ \"party-uuids\", \"party-uuids\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"roles\" : [ {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"id\" : \"id\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"id\" : \"id\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"published\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                                "      \"title\" : \"title\",\n" +
//                                "      \"version\" : \"version\",\n" +
//                                "      \"props\" : [ null, null ],\n" +
//                                "      \"last-modified\" : \"2000-01-23T04:56:07.000+00:00\",\n" +
//                                "      \"document-ids\" : [ {\n" +
//                                "        \"identifier\" : \"identifier\",\n" +
//                                "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                                "      }, {\n" +
//                                "        \"identifier\" : \"identifier\",\n" +
//                                "        \"scheme\" : \"http://example.com/aeiou\"\n" +
//                                "      } ],\n" +
//                                "      \"parties\" : [ {\n" +
//                                "        \"telephone-numbers\" : [ null, null ],\n" +
//                                "        \"addresses\" : [ null, null ],\n" +
//                                "        \"external-ids\" : [ {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        }, {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        } ],\n" +
//                                "        \"type\" : \"person\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                                "        \"email-addresses\" : [ null, null ],\n" +
//                                "        \"name\" : \"name\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                                "      }, {\n" +
//                                "        \"telephone-numbers\" : [ null, null ],\n" +
//                                "        \"addresses\" : [ null, null ],\n" +
//                                "        \"external-ids\" : [ {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        }, {\n" +
//                                "          \"scheme\" : \"http://example.com/aeiou\",\n" +
//                                "          \"id\" : \"id\"\n" +
//                                "        } ],\n" +
//                                "        \"type\" : \"person\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"short-name\" : \"short-name\",\n" +
//                                "        \"props\" : [ null, null ],\n" +
//                                "        \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n" +
//                                "        \"email-addresses\" : [ null, null ],\n" +
//                                "        \"name\" : \"name\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n" +
//                                "      } ],\n" +
//                                "      \"revisions\" : [ {\n" +
//                                "        \"links\" : [ {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"props\" : [ {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        }, {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        } ]\n" +
//                                "      }, {\n" +
//                                "        \"links\" : [ {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"rel\" : \"rel\",\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"props\" : [ {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        }, {\n" +
//                                "          \"ns\" : \"http://example.com/aeiou\",\n" +
//                                "          \"name\" : \"name\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"value\" : \"value\",\n" +
//                                "          \"class\" : \"class\",\n" +
//                                "          \"remarks\" : \"remarks\"\n" +
//                                "        } ]\n" +
//                                "      } ],\n" +
//                                "      \"links\" : [ null, null ],\n" +
//                                "      \"locations\" : [ {\n" +
//                                "        \"telephone-numbers\" : [ {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        }, {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        } ],\n" +
//                                "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                                "        \"address\" : {\n" +
//                                "          \"country\" : \"country\",\n" +
//                                "          \"postal-code\" : \"postal-code\",\n" +
//                                "          \"city\" : \"city\",\n" +
//                                "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                                "          \"state\" : \"state\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        },\n" +
//                                "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"telephone-numbers\" : [ {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        }, {\n" +
//                                "          \"number\" : \"number\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        } ],\n" +
//                                "        \"urls\" : [ \"http://example.com/aeiou\", \"http://example.com/aeiou\" ],\n" +
//                                "        \"address\" : {\n" +
//                                "          \"country\" : \"country\",\n" +
//                                "          \"postal-code\" : \"postal-code\",\n" +
//                                "          \"city\" : \"city\",\n" +
//                                "          \"addr-lines\" : [ \"addr-lines\", \"addr-lines\" ],\n" +
//                                "          \"state\" : \"state\",\n" +
//                                "          \"type\" : \"type\"\n" +
//                                "        },\n" +
//                                "        \"email-addresses\" : [ \"\", \"\" ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ],\n" +
//                                "      \"oscal-version\" : \"oscal-version\"\n" +
//                                "    },\n" +
//                                "    \"control-implementation\" : {\n" +
//                                "      \"set-parameters\" : [ {\n" +
//                                "        \"values\" : [ \"values\", \"values\" ],\n" +
//                                "        \"param-id\" : \"param-id\"\n" +
//                                "      }, {\n" +
//                                "        \"values\" : [ \"values\", \"values\" ],\n" +
//                                "        \"param-id\" : \"param-id\"\n" +
//                                "      } ],\n" +
//                                "      \"description\" : \"description\",\n" +
//                                "      \"implemented-requirements\" : [ {\n" +
//                                "        \"responsible-roles\" : [ null, null ],\n" +
//                                "        \"control-id\" : \"control-id\",\n" +
//                                "        \"set-parameters\" : [ null, null ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"statements\" : [ {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"by-components\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"responsible-roles\" : [ null, null ],\n" +
//                                "        \"control-id\" : \"control-id\",\n" +
//                                "        \"set-parameters\" : [ null, null ],\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"statements\" : [ {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"responsible-roles\" : [ null, null ],\n" +
//                                "          \"statement-id\" : \"statement-id\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"by-components\" : [ {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          }, {\n" +
//                                "            \"responsible-roles\" : [ null, null ],\n" +
//                                "            \"component-uuid\" : \"component-uuid\",\n" +
//                                "            \"implementation-status\" : {\n" +
//                                "              \"state\" : \"state\"\n" +
//                                "            },\n" +
//                                "            \"inherited\" : [ {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"satisfied\" : [ {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            }, {\n" +
//                                "              \"responsibility-uuid\" : \"responsibility-uuid\",\n" +
//                                "              \"responsible-roles\" : [ null, null ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"uuid\" : \"uuid\",\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            } ],\n" +
//                                "            \"set-parameters\" : [ null, null ],\n" +
//                                "            \"description\" : \"description\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"uuid\" : \"uuid\",\n" +
//                                "            \"export\" : {\n" +
//                                "              \"responsibilities\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"provided-uuid\" : \"provided-uuid\",\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"provided\" : [ {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              }, {\n" +
//                                "                \"responsible-roles\" : [ null, null ],\n" +
//                                "                \"description\" : \"description\",\n" +
//                                "                \"links\" : [ null, null ],\n" +
//                                "                \"uuid\" : \"uuid\",\n" +
//                                "                \"props\" : [ null, null ]\n" +
//                                "              } ],\n" +
//                                "              \"description\" : \"description\",\n" +
//                                "              \"links\" : [ null, null ],\n" +
//                                "              \"props\" : [ null, null ]\n" +
//                                "            },\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          } ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"by-components\" : [ null, null ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ]\n" +
//                                "    },\n" +
//                                "    \"import-profile\" : {\n" +
//                                "      \"href\" : \"href\"\n" +
//                                "    },\n" +
//                                "    \"system-characteristics\" : {\n" +
//                                "      \"data-flow\" : {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"diagrams\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"system-name-short\" : \"system-name-short\",\n" +
//                                "      \"responsible-parties\" : [ null, null ],\n" +
//                                "      \"system-ids\" : [ {\n" +
//                                "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                                "        \"id\" : \"id\"\n" +
//                                "      }, {\n" +
//                                "        \"identifier-type\" : \"http://example.com/aeiou\",\n" +
//                                "        \"id\" : \"id\"\n" +
//                                "      } ],\n" +
//                                "      \"authorization-boundary\" : {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"diagrams\" : [ {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"caption\" : \"caption\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"remarks\" : \"remarks\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"caption\" : \"caption\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"remarks\" : \"remarks\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"remarks\" : \"remarks\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"description\" : \"description\",\n" +
//                                "      \"security-sensitivity-level\" : \"security-sensitivity-level\",\n" +
//                                "      \"security-impact-level\" : {\n" +
//                                "        \"security-objective-integrity\" : \"security-objective-integrity\",\n" +
//                                "        \"security-objective-availability\" : \"security-objective-availability\",\n" +
//                                "        \"security-objective-confidentiality\" : \"security-objective-confidentiality\"\n" +
//                                "      },\n" +
//                                "      \"date-authorized\" : \"date-authorized\",\n" +
//                                "      \"system-information\" : {\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"information-types\" : [ {\n" +
//                                "          \"categorizations\" : [ {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          }, {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          } ],\n" +
//                                "          \"confidentiality-impact\" : {\n" +
//                                "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"selected\" : \"selected\",\n" +
//                                "            \"props\" : [ null, null ],\n" +
//                                "            \"base\" : \"base\"\n" +
//                                "          },\n" +
//                                "          \"integrity-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"availability-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        }, {\n" +
//                                "          \"categorizations\" : [ {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          }, {\n" +
//                                "            \"system\" : \"http://example.com/aeiou\",\n" +
//                                "            \"information-type-ids\" : [ \"information-type-ids\", \"information-type-ids\" ]\n" +
//                                "          } ],\n" +
//                                "          \"confidentiality-impact\" : {\n" +
//                                "            \"adjustment-justification\" : \"adjustment-justification\",\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"selected\" : \"selected\",\n" +
//                                "            \"props\" : [ null, null ],\n" +
//                                "            \"base\" : \"base\"\n" +
//                                "          },\n" +
//                                "          \"integrity-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"description\" : \"description\",\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"availability-impact\" : {\n" +
//                                "            \"links\" : [ null, null ],\n" +
//                                "            \"props\" : [ null, null ]\n" +
//                                "          },\n" +
//                                "          \"title\" : \"title\",\n" +
//                                "          \"uuid\" : \"uuid\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        } ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"props\" : [ null, null ],\n" +
//                                "      \"system-name\" : \"system-name\",\n" +
//                                "      \"links\" : [ null, null ],\n" +
//                                "      \"network-architecture\" : {\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"links\" : [ null, null ],\n" +
//                                "        \"diagrams\" : [ null, null ],\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      },\n" +
//                                "      \"status\" : {\n" +
//                                "        \"state\" : \"operational\"\n" +
//                                "      }\n" +
//                                "    },\n" +
//                                "    \"back-matter\" : {\n" +
//                                "      \"resources\" : [ {\n" +
//                                "        \"citation\" : {\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        },\n" +
//                                "        \"document-ids\" : [ null, null ],\n" +
//                                "        \"base64\" : {\n" +
//                                "          \"filename\" : \"filename\",\n" +
//                                "          \"media-type\" : \"media-type\",\n" +
//                                "          \"value\" : \"value\"\n" +
//                                "        },\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"rlinks\" : [ {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      }, {\n" +
//                                "        \"citation\" : {\n" +
//                                "          \"links\" : [ null, null ],\n" +
//                                "          \"text\" : \"text\",\n" +
//                                "          \"props\" : [ null, null ]\n" +
//                                "        },\n" +
//                                "        \"document-ids\" : [ null, null ],\n" +
//                                "        \"base64\" : {\n" +
//                                "          \"filename\" : \"filename\",\n" +
//                                "          \"media-type\" : \"media-type\",\n" +
//                                "          \"value\" : \"value\"\n" +
//                                "        },\n" +
//                                "        \"description\" : \"description\",\n" +
//                                "        \"title\" : \"title\",\n" +
//                                "        \"rlinks\" : [ {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        }, {\n" +
//                                "          \"hashes\" : [ {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          }, {\n" +
//                                "            \"value\" : \"value\",\n" +
//                                "            \"algorithm\" : \"algorithm\"\n" +
//                                "          } ],\n" +
//                                "          \"href\" : \"href\",\n" +
//                                "          \"media-type\" : \"media-type\"\n" +
//                                "        } ],\n" +
//                                "        \"uuid\" : \"uuid\",\n" +
//                                "        \"props\" : [ null, null ]\n" +
//                                "      } ]\n" +
//                                "    },\n" +
//                                "    \"uuid\" : \"uuid\"\n" +
//                                "  }\n" +
//                                "} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OSCALSsp>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OSCALSsp>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeComponentfromSsp(@Parameter(in = ParameterIn.PATH,
            description = "System security plan ID", required = true, schema = @Schema()) @PathVariable("sspId") String sspId,
                                                       @Parameter(in = ParameterIn.PATH,
                                                               description = "Component ID to be associated with SSP",
                                                               required = true,
                                                               schema = @Schema()) @PathVariable("componentId") String componentId,
                                                       @Parameter(in = ParameterIn.HEADER, description = "",
                                                               schema = @Schema())
                                                       @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removePartyfromSsp(@Parameter(in = ParameterIn.PATH,
            description = "System security plan ID", required = true, schema = @Schema()) @PathVariable("sspId") String sspId,
                                                   @Parameter(in = ParameterIn.PATH,
                                                           description = "Party ID to be associated with SSP",
                                                           required = true,
                                                           schema = @Schema()) @PathVariable("partyId") String partyId,
                                                   @Parameter(in = ParameterIn.HEADER, description = "",
                                                           schema = @Schema())
                                                   @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> replaceSsp(@Parameter(in = ParameterIn.PATH,
            description = "ID of system security plan to replace.", required = true,
            schema = @Schema()) @PathVariable("sspId") String sspId, @Parameter(in = ParameterIn.DEFAULT,
            description = "System security plan object to be replaced.", required = true,
            schema = @Schema()) @Valid @RequestBody OSCALSsp body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateSsp(@Parameter(in = ParameterIn.PATH,
            description = "ID of system security plan to return", required = true,
            schema = @Schema()) @PathVariable("sspId") String sspId,
                                          @Parameter(in = ParameterIn.DEFAULT,
                                                  description = "System security plan object to be updated",
                                                  required = true,
                                                  schema = @Schema()) @Valid @RequestBody OSCALSspUpdateExample body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
