package co.uk.dog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import co.uk.dog.dto.DogDto;
import co.uk.dog.entity.Dog;

@Mapper(componentModel = MappingConstants.ComponentModel.JSR330)
public interface DogMapper {
    DogDto toDto(Dog dog);
    Dog toEntity(DogDto dogDto);
}