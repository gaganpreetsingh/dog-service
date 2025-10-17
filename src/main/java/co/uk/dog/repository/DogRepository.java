package co.uk.dog.repository;

import io.micronaut.data.annotation.Repository;
import co.uk.dog.entity.Dog;
import io.micronaut.data.repository.reactive.ReactorPageableRepository;

@Repository
public interface DogRepository extends ReactorPageableRepository<Dog, Long> {
}