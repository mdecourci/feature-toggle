package org.michaeldecourci.feature.toggle.repository;

import org.michaeldecourci.feature.toggle.model.Feature;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "features", path = "feature")
public interface FeatureRepository extends PagingAndSortingRepository<Feature, Long> {
    List<Feature> findByActiveTrue();
}
