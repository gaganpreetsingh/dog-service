package co.uk.dog.dto;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDate;

@Serdeable
@Data
public class DogDto {
    private Long id;
    private String name;
    private String breed;
    private SupplierDto supplier;
    private String badgeId;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate dateAcquired;
    private CurrentStatus currentStatus;
    private LocalDate leavingDate;
    private LeavingReason leavingReason;
    private KennellingCharacteristicsDto kennellingCharacteristics;
}