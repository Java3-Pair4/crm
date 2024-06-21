package srs.customerservice.Services.DTOs.Request.Contact;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactRequest {

    @NotEmpty(message = "This field is required")
    @Email
    private String email;

    @NotEmpty(message = "This field is required")
    @Size(min=11,max=11)
    private String gsmNumber;

    @Size(min=11,max=11)
    private String homeNumber;

    //TODO: check the fax
    @Size(min=12,max=12,message = "It should be entered as country code-area code-fax number.")
    private String fax;
}
