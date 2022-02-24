package io.swagger.api;

import io.swagger.model.OSCALParty;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")
@RestController
public class PartiesApiController implements PartiesApi {

    private static final Logger log = LoggerFactory.getLogger(PartiesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PartiesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addParty(@Parameter(in = ParameterIn.DEFAULT, description = "OSCAL party to be added", required=true, schema=@Schema()) @Valid @RequestBody OSCALParty body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteParty(@Parameter(in = ParameterIn.PATH, description = "Party ID to delete", required=true, schema=@Schema()) @PathVariable("partyId") String partyId,@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OSCALParty>> findPartiesByName(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Terms to search for in party names" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "query", required = true) String query) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OSCALParty>>(objectMapper.readValue("[ {\n  \"party\" : {\n    \"telephone-numbers\" : [ null, null ],\n    \"addresses\" : [ null, null ],\n    \"external-ids\" : [ {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    }, {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    } ],\n    \"type\" : \"person\",\n    \"uuid\" : \"uuid\",\n    \"short-name\" : \"short-name\",\n    \"props\" : [ null, null ],\n    \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n    \"email-addresses\" : [ null, null ],\n    \"name\" : \"name\",\n    \"links\" : [ null, null ],\n    \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n  }\n}, {\n  \"party\" : {\n    \"telephone-numbers\" : [ null, null ],\n    \"addresses\" : [ null, null ],\n    \"external-ids\" : [ {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    }, {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    } ],\n    \"type\" : \"person\",\n    \"uuid\" : \"uuid\",\n    \"short-name\" : \"short-name\",\n    \"props\" : [ null, null ],\n    \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n    \"email-addresses\" : [ null, null ],\n    \"name\" : \"name\",\n    \"links\" : [ null, null ],\n    \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OSCALParty>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OSCALParty>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OSCALParty>> getParties() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OSCALParty>>(objectMapper.readValue("[ {\n  \"party\" : {\n    \"telephone-numbers\" : [ null, null ],\n    \"addresses\" : [ null, null ],\n    \"external-ids\" : [ {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    }, {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    } ],\n    \"type\" : \"person\",\n    \"uuid\" : \"uuid\",\n    \"short-name\" : \"short-name\",\n    \"props\" : [ null, null ],\n    \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n    \"email-addresses\" : [ null, null ],\n    \"name\" : \"name\",\n    \"links\" : [ null, null ],\n    \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n  }\n}, {\n  \"party\" : {\n    \"telephone-numbers\" : [ null, null ],\n    \"addresses\" : [ null, null ],\n    \"external-ids\" : [ {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    }, {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    } ],\n    \"type\" : \"person\",\n    \"uuid\" : \"uuid\",\n    \"short-name\" : \"short-name\",\n    \"props\" : [ null, null ],\n    \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n    \"email-addresses\" : [ null, null ],\n    \"name\" : \"name\",\n    \"links\" : [ null, null ],\n    \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OSCALParty>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OSCALParty>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OSCALParty> getPartyById(@Parameter(in = ParameterIn.PATH, description = "ID of party to return", required=true, schema=@Schema()) @PathVariable("partyId") String partyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OSCALParty>(objectMapper.readValue("{\n  \"party\" : {\n    \"telephone-numbers\" : [ null, null ],\n    \"addresses\" : [ null, null ],\n    \"external-ids\" : [ {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    }, {\n      \"scheme\" : \"http://example.com/aeiou\",\n      \"id\" : \"id\"\n    } ],\n    \"type\" : \"person\",\n    \"uuid\" : \"uuid\",\n    \"short-name\" : \"short-name\",\n    \"props\" : [ null, null ],\n    \"location-uuids\" : [ \"location-uuids\", \"location-uuids\" ],\n    \"email-addresses\" : [ null, null ],\n    \"name\" : \"name\",\n    \"links\" : [ null, null ],\n    \"member-of-organizations\" : [ \"member-of-organizations\", \"member-of-organizations\" ]\n  }\n}", OSCALParty.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OSCALParty>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OSCALParty>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateParty(@Parameter(in = ParameterIn.PATH, description = "ID of party to return", required=true, schema=@Schema()) @PathVariable("partyId") String partyId,@Parameter(in = ParameterIn.DEFAULT, description = "Party object to be updated", required=true, schema=@Schema()) @Valid @RequestBody OSCALParty body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
