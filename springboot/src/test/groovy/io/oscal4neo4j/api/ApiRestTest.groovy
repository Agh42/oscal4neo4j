package io.oscal4neo4j.api

import com.fasterxml.jackson.databind.JsonNode
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
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

    def "get a page of entities"() {
        given:
        37.times {
            newEntity("Control", "Name" + it)
        }

        when:
        def json = restTemplate.getForObject("/api/v1/entities/control", JsonNode)
        def response = jsonSlurper.parseText(json.toString())

        then:
        response != null
        response.content.size() == 20
        response.number == 0
        response.size == 20
        response.numberOfElements == 20
        response.first == true
        response.last == false
        response.pageable.paged == true
        response.sort.sorted == true

        when: "get second page"
        json = restTemplate.getForObject("/api/v1/entities/control?page=1", JsonNode)
        response = jsonSlurper.parseText(json.toString())

        then:
        response != null
        response.content.size() == 17
        response.number == 1
        response.size == 20
        response.numberOfElements == 17
        response.first == false
        response.last == true
        response.pageable.paged == true
        response.sort.sorted == true
        response.empty == false

        when: "get nonexistent third page"
        json = restTemplate.getForObject("/api/v1/entities/control?page=2", JsonNode)
        response = jsonSlurper.parseText(json.toString())

        then:
        response.content.size() == 0
        response.pageable.offset == 40
        response.first == false
        response.last == true
        response.empty == true
    }

    @Ignore
    def "Get an old version via point in time"() {
    }

}



