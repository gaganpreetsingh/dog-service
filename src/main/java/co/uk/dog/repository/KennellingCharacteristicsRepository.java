package co.uk.dog.repository;

import io.micronaut.data.annotation.Repository;
import co.uk.dog.entity.KennellingCharacteristics;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

@Repository
public interface KennellingCharacteristicsRepository extends ReactorCrudRepository<KennellingCharacteristics, Long> {
}