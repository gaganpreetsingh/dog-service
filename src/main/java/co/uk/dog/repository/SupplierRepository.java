package co.uk.dog.repository;

import io.micronaut.data.annotation.Repository;
import co.uk.dog.entity.Supplier;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

@Repository
public interface SupplierRepository extends ReactorCrudRepository<Supplier, Long> {
}