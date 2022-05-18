package io.oscal4neo4j.repository;

import io.swagger.model.OSCALComponentDefinition;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OSCALComponentDefinitionRepository extends Neo4jRepository<OSCALComponentDefinition, Long>, NonDomainResults {
}
