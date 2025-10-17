package co.uk.dog.dto;

import lombok.Data;

@Data
public class SupplierDto {
    private Long id;
    private String name;
    private String type;
    private String contactInfo;
    private String address;
}