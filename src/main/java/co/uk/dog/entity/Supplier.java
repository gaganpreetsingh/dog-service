package co.uk.dog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import io.micronaut.data.annotation.GeneratedValue;

@Entity(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private String contactInfo;
    private String address;

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getAddress() {
        return address;
    }
}