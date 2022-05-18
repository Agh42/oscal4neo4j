package io.oscal4neo4j.service;

import io.oscal4neo4j.repository.OSCALComponentDefinitionRepository;
import io.swagger.model.AssemblyOscalProfileProfile;
import io.swagger.model.OSCALComponentDefinition;

public class ComponentDefinitionsService {

    private OSCALComponentDefinitionRepository repo;

    public void addComponentDefinition(OSCALComponentDefinition body) {
        this.repo.save(body);
    }
}
