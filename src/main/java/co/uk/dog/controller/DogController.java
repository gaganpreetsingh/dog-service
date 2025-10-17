package co.uk.dog.controller;

import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import co.uk.dog.dto.DogDto;
import co.uk.dog.service.DogService;
import reactor.core.publisher.Mono;

@Controller("/v1/api/dogs")
@Produces("application/json")
@Consumes("application/json")
public class DogController {
    
    @Inject
    private DogService dogService;
    
    @Post("/")
    public Mono<HttpResponse<DogDto>> create(@Body DogDto dogDto) {
        return dogService.create(dogDto)
            .map(HttpResponse::created);
    }
    
    @Get("/")
    public Mono<Page<DogDto>> list(Pageable pageable) {
        return dogService.findAll(pageable);
    }
    
    @Get("/{id}")
    public Mono<MutableHttpResponse<DogDto>> get(Long id) {
        return dogService.findById(id)
            .map(HttpResponse::ok)
            .defaultIfEmpty(HttpResponse.notFound());
    }
    
    @Put("/{id}")
    public Mono<MutableHttpResponse<DogDto>> update(Long id, @Body DogDto dogDto) {
        return dogService.update(id, dogDto)
            .map(HttpResponse::ok)
            .defaultIfEmpty(HttpResponse.notFound());
    }
    
    @Delete("/{id}")
    public Mono<HttpResponse<Void>> delete(Long id) {
        return dogService.delete(id)
            .map(deleted -> deleted ? HttpResponse.noContent() : HttpResponse.notFound());
    }
}