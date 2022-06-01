package io.oscal4neo4j.service;

import io.oscal4neo4j.repository.OSCALComponentDefinitionRepository;
import io.swagger.model.OSCALComponentDefinition;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComponentDefinitionsService {

    private final OSCALComponentDefinitionRepository repo;

    public void addComponentDefinition(OSCALComponentDefinition body) {
        this.repo.save(body);
    }

    public OSCALComponentDefinition getComponentDefinition(Long id) {
        return this.repo.findById(id).orElseThrow();
    }
}
