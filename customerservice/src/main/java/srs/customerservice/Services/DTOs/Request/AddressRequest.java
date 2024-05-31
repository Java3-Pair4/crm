package srs.customerservice.Services.DTOs.Request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddressRequest {

    @NotBlank(message = "This field is required")
    private String city;

    @NotBlank(message = "This field is required")
    private String district;

    @NotBlank(message = "This field is required")
    private String street;


    @NotBlank(message = "This field is required")
    private Long houseNumber;


    @NotBlank(message = "This field is required")
    private String description;
}
