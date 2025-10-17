package co.uk.dog.service;

import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import co.uk.dog.dto.DogDto;
import co.uk.dog.mapper.DogMapper;
import co.uk.dog.entity.Dog;
import co.uk.dog.repository.DogRepository;
import co.uk.dog.repository.SupplierRepository;
import co.uk.dog.repository.KennellingCharacteristicsRepository;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Singleton
public class DogService {
    
    @Inject
    private DogRepository dogRepository;
    
    @Inject
    private SupplierRepository supplierRepository;
    
    @Inject
    private KennellingCharacteristicsRepository kennellingRepository;
    
    @Inject
    private DogMapper dogMapper;
    
    public Mono<DogDto> create(DogDto dogDto) {
        return Mono.fromCallable(() -> dogMapper.toEntity(dogDto))
            .flatMap(dogRepository::save)
            .map(dogMapper::toDto);
    }
    
    public Mono<Page<DogDto>> findAll(Pageable pageable) {
        return dogRepository.findAll(pageable)
            .map(page -> {
                var mappedContent = page.getContent().stream().map(dogMapper::toDto)
                    .collect(Collectors.toList());
                return Page.of(mappedContent, pageable, page.getTotalSize());
            });
    }
    
    public Mono<DogDto> findById(Long id) {
        return dogRepository.findById(id)
            .map(dogMapper::toDto);
    }
    
    public Mono<DogDto> update(Long id, DogDto dogDto) {
        return dogRepository.findById(id)
            .flatMap(existing -> {
                Dog updated = dogMapper.toEntity(dogDto);
                return dogRepository.update(updated);
            })
            .map(dogMapper::toDto);

    }
    
    public Mono<Boolean> delete(Long id) {
        return dogRepository.existsById(id)
            .flatMap(exists -> {
                if (exists) {
                    return dogRepository.deleteById(id).thenReturn(true);
                }
                return Mono.just(false);
            });
    }
}