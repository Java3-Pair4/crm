package srs.customerservice.Services.DTOs.Request;



import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequest {

    @NotEmpty(message = "This field is required")
    private String city;

    @NotEmpty(message = "This field is required")
    private String district;

    @NotEmpty(message = "This field is required")
    private String street;


    @NotEmpty(message = "This field is required")
    private String houseNumber;


    @NotEmpty(message = "This field is required")
    private String description;
}
