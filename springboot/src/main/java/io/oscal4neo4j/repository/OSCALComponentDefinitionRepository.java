package io.oscal4neo4j.repository;

import io.swagger.model.OSCALComponentDefinition;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sdr/componentdefinition",
                        path = "sdr/componentdefinition")
public interface OSCALComponentDefinitionRepository extends Neo4jRepository<OSCALComponentDefinition, Long>, NonDomainResults {
}
