package co.uk.dog.dto;

import lombok.Data;

@Data
public class KennellingCharacteristicsDto {
    private Long id;
    private boolean aggressive;
    private boolean socialWithOtherDogs;
    private boolean requiresSpecialDiet;
    private String feedingInstructions;
    private String behavioralNotes;
    private boolean requiresSeparateKennel;
    private String exerciseRequirements;
    private String medicalNotes;
}