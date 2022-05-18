package io.oscal4neo4j.repository;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

public interface NonDomainResults {

    @Transactional(readOnly = true) Collection<String> findLabelsForNode(Long perpetualId);

    @Transactional
    void deleteAllByLabel(String label);

}
