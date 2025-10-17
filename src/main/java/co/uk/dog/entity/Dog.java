package co.uk.dog.entity;

import co.uk.dog.dto.CurrentStatus;
import co.uk.dog.dto.Gender;
import co.uk.dog.dto.LeavingReason;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity(name = "dogs")
public class Dog {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String breed;
    private Long supplierId;
    private String badgeId;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate dateAcquired;
    private CurrentStatus currentStatus;
    private LocalDate leavingDate;
    private LeavingReason leavingReason;
    private Long kennellingCharacteristicsId;

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDateAcquired() {
        return dateAcquired;
    }

    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public LocalDate getLeavingDate() {
        return leavingDate;
    }

    public LeavingReason getLeavingReason() {
        return leavingReason;
    }

    public Long getKennellingCharacteristicsId() {
        return kennellingCharacteristicsId;
    }
}