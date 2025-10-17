package co.uk.dog.entity;

import jakarta.persistence.Entity;
import io.micronaut.data.annotation.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "kennelling_characteristics")
public class KennellingCharacteristics {

    @Id
    @GeneratedValue
    private Long id;

    private boolean aggressive;
    private boolean socialWithOtherDogs;
    private boolean requiresSpecialDiet;
    private String feedingInstructions;
    private String behavioralNotes;
    private boolean requiresSeparateKennel;
    private String exerciseRequirements;
    private String medicalNotes;

    // Getters

    public Long getId() {
        return id;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public boolean isSocialWithOtherDogs() {
        return socialWithOtherDogs;
    }

    public boolean isRequiresSpecialDiet() {
        return requiresSpecialDiet;
    }

    public String getFeedingInstructions() {
        return feedingInstructions;
    }

    public String getBehavioralNotes() {
        return behavioralNotes;
    }

    public boolean isRequiresSeparateKennel() {
        return requiresSeparateKennel;
    }

    public String getExerciseRequirements() {
        return exerciseRequirements;
    }

    public String getMedicalNotes() {
        return medicalNotes;
    }
}