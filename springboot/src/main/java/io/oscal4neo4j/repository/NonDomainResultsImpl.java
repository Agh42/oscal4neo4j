package io.oscal4neo4j.repository;

import java.util.Collection;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.neo4j.core.Neo4jClient;

@Slf4j
public class NonDomainResultsImpl implements NonDomainResults {

    private final Neo4jClient neo4jClient;

    NonDomainResultsImpl(Neo4jClient neo4jClient) {
        this.neo4jClient = neo4jClient;
    }

    @Override public Collection<String> findLabelsForNode(Long perpetualId) {
        Map<String, Object> params = Map.of("perpetualId", perpetualId);
        var labels = this.neo4jClient
                .query("" +
                               "MATCH (a) " +
                               "WHERE id(a) = $perpetualId " +
                               "RETURN labels(a) as labels"
                )
                .bindAll(params)
                .fetch()
                .first()
                .orElseThrow()
                .get("labels");
        return (Collection<String>) labels;
    }

    @Override public void deleteAllByLabel(String label) {
        Map<String, Object> params = Map.of("label", label);
        neo4jClient.query("MATCH (a) WHERE $label IN labels(a) DETACH DELETE a")
                   .bindAll(params)
                   .run();
    }

    private void execute(String query, Map<String, Object> params) {
        var resultSummary = this.neo4jClient
                .query(query)
                .bindAll(params)
                .run();
        log.debug(resultSummary.toString());
    }
}
