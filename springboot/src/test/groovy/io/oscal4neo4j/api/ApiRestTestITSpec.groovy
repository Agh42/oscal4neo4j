package io.oscal4neo4j.api

import com.fasterxml.jackson.databind.JsonNode
import groovy.json.JsonSlurper
import io.swagger.model.OSCALComponentDefinition
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.parsing.ComponentDefinition
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.ActiveProfiles
import spock.lang.Ignore
import spock.lang.Shared
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(classes = ApiApplication.class, webEnvironment = RANDOM_PORT)
@ActiveProfiles(["test", "dev", "local"])
class ApiRestTest extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    @Shared
    JsonSlurper jsonSlurper

    def setupSpec() {
        jsonSlurper = new JsonSlurper()
    }

    def setup() {
    }

    def "Create and retrieve a component definition"() {

    }

    private Object newCCD() {
        HttpEntity<CreateEntityDto> request = new HttpEntity<>(new OSCALComponentDefinition())
        def json = restTemplate.postForObject("/api/v1/entities/${label}",
                request,
                ObjectNode.class)
        def response = jsonSlurper.parseText(json.toString())
        response
    }

}



