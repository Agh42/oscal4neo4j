/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.31).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ImportedcatalogsCatalogIdBody;
import io.swagger.model.ImportedprofilesImportProfileIdBody;
import io.swagger.model.OSCALProfile;
import io.swagger.model.OSCALProfileUpdateExample;
import io.swagger.model.OSCALRole;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-24T08:30:46.962624+01:00[Europe/Berlin]")
@Validated
public interface ProfilesApi {

    @Operation(summary = "Defines a catalog import in an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or catalog not found") })
    @RequestMapping(value = "/profiles/{profileId}/imported-catalogs/{catalogId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> addCatalogToProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Catalog ID to be imported into the profile", required=true, schema=@Schema()) @PathVariable("catalogId") String catalogId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey, @Parameter(in = ParameterIn.DEFAULT, description = "Further description of the controls imported", schema=@Schema()) @Valid @RequestBody ImportedcatalogsCatalogIdBody body);


    @Operation(summary = "Associates a party with an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or party not found") })
    @RequestMapping(value = "/profiles/{profileId}/parties/{partyId}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> addPartyToProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Party ID to be associated with the profile", required=true, schema=@Schema()) @PathVariable("partyId") String partyId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Associates a party with role within an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile, role, or party not found") })
    @RequestMapping(value = "/profiles/{profileId}/responsible-parties/{roleId}/parties/{partyId}",
        method = RequestMethod.POST)
    ResponseEntity<Void> addPartyToProfileRole(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Role ID for the party to be associated with within the profile", required=true, schema=@Schema()) @PathVariable("roleId") String roleId, @Parameter(in = ParameterIn.PATH, description = "Party ID to be added to the role within the profile", required=true, schema=@Schema()) @PathVariable("partyId") String partyId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Adds a new OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/profiles",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addProfile(@Parameter(in = ParameterIn.DEFAULT, description = "OSCAL profile to be added", required=true, schema=@Schema()) @Valid @RequestBody OSCALProfile body);


    @Operation(summary = "Defines the import of another profile in an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or import profile not found") })
    @RequestMapping(value = "/profiles/{profileId}/imported-profiles/{importProfileId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> addProfileToProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Other profile ID to be defined as an import in the profile", required=true, schema=@Schema()) @PathVariable("importProfileId") String importProfileId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey, @Parameter(in = ParameterIn.DEFAULT, description = "Further description of the controls imported", schema=@Schema()) @Valid @RequestBody ImportedprofilesImportProfileIdBody body);


    @Operation(summary = "Adds a new role to an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile not found") })
    @RequestMapping(value = "/profiles/{profileId}/roles",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addRoleToProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.DEFAULT, description = "OSCAL role to be added", required=true, schema=@Schema()) @Valid @RequestBody OSCALRole body, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Deletes an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile not found") })
    @RequestMapping(value = "/profiles/{profileId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID to delete", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Searches for OSCAL profiles by name", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OSCALProfile.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid status value") })
    @RequestMapping(value = "/profiles/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OSCALProfile>> findProfilesByName(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Terms to search for in profile names" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "query", required = true) String query);


    @Operation(summary = "Finds an OSCAL profile by ID", description = "Returns a single OSCAL profile", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = OSCALProfile.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile not found") })
    @RequestMapping(value = "/profiles/{profileId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OSCALProfile> getProfileById(@Parameter(in = ParameterIn.PATH, description = "ID of profile to return", required=true, schema=@Schema()) @PathVariable("profileId") String profileId);


    @Operation(summary = "Returns all OSCAL profiles", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OSCALProfile.class)))) })
    @RequestMapping(value = "/profiles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OSCALProfile>> getProfiles();


    @Operation(summary = "Removes a catalog from an OSCAL profile imports", description = "Removes the given catalog from the given profile.  This should also result in references under other parts of the schema being removed. ", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or catalog not found") })
    @RequestMapping(value = "/profiles/{profileId}/imported-catalogs/{catalogId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removeCatalogfromProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Catalog ID to be removed from the profile imports", required=true, schema=@Schema()) @PathVariable("catalogId") String catalogId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Removes a party from an OSCAL profile", description = "Removes the given party from the given profile.  This should also result in references under other parts of the schema such as responsible roles being removed. ", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or party not found") })
    @RequestMapping(value = "/profiles/{profileId}/parties/{partyId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removePartyfromProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Party ID to be removed with the profile", required=true, schema=@Schema()) @PathVariable("partyId") String partyId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Removes a party from a role within an OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile, role, or party not found") })
    @RequestMapping(value = "/profiles/{profileId}/responsible-parties/{roleId}/parties/{partyId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removePartyfromProfileRole(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Role ID within the profile that the party should be removed from", required=true, schema=@Schema()) @PathVariable("roleId") String roleId, @Parameter(in = ParameterIn.PATH, description = "Party ID to be removed from the role within the profile", required=true, schema=@Schema()) @PathVariable("partyId") String partyId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Removes a another profile from an OSCAL profile imports", description = "Removes the given other profile from the given profile.  This should also result in references under other parts of the schema being removed. ", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or import profile not found") })
    @RequestMapping(value = "/profiles/{profileId}/imported-profiles/{importProfileId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removeProfilefromProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Other profile ID to be removed from the profile imports", required=true, schema=@Schema()) @PathVariable("importProfileId") String importProfileId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Removes a role from an OSCAL profile", description = "Removes the given role from the given profile.  This should also result in references under other parts of the schema such as responsible parties being removed. ", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Profile or role not found") })
    @RequestMapping(value = "/profiles/{profileId}/roles/{roleId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removeRolefromProfile(@Parameter(in = ParameterIn.PATH, description = "Profile ID", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.PATH, description = "Role ID to be removed from the profile", required=true, schema=@Schema()) @PathVariable("roleId") String roleId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Replaces an existing OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Updated profile"),
        
        @ApiResponse(responseCode = "404", description = "Profile not found"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request"),
        
        @ApiResponse(responseCode = "415", description = "Unsupported media type") })
    @RequestMapping(value = "/profiles/{profileId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> replaceProfile(@Parameter(in = ParameterIn.PATH, description = "ID of profile to replace.", required=true, schema=@Schema()) @PathVariable("profileId") String profileId, @Parameter(in = ParameterIn.DEFAULT, description = "Profile object to be replaced.", required=true, schema=@Schema()) @Valid @RequestBody OSCALProfile body);


    @Operation(summary = "Updates an existing OSCAL profile", description = "", security = {
        @SecurityRequirement(name = "oscal_auth", scopes = {
            "write:catalogs",
"read:catalogs",
"write:profiles",
"read:profiles",
"write:componentDefinitions",
"read:componentDefinitions",
"write:ssps",
"read:ssps",
"write:parties",
"read:parties"        })    }, tags={ "OSCAL Profile" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Catalog not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/profiles",
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Void> updateProfile(@Parameter(in = ParameterIn.DEFAULT, description = "Catalog object to be updated", required=true, schema=@Schema()) @Valid @RequestBody OSCALProfileUpdateExample body);

}

