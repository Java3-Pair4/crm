package srs.customerservice.Services.DTOs.Request;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactRequest {

    @NotBlank(message = "This field is required")
    @Email
    private String email;

    @NotBlank(message = "This field is required")
    @Size(min=11,max=11)
    @Positive
    private String gsmNumber;

    @Size(min=11,max=11)
    @Positive
    private String homeNumber;

    //TODO: check the fax
    @Size(min=12,max=12,message = "It should be entered as country code-area code-fax number.")
    @Positive
    private String fax;
}
