package online.vikramaaditya.address.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import online.vikramaaditya.address.validator.PinCodeValidator;

@Data
public class CreateAddressRequest {
    @NotBlank(message = "Address line 1 is mandatory")
    @Size(max=200,min=6,message="Address Line Should be more than 6 charaacters and less than 200 characters")
    private String addressLine1;
    private String addressLine2;
    @NotBlank(message = "City is mandatory")
    @Size(max=250,min=3,message="Maximum character allowed is 250 and minimum is 3")
    private String city;
    @NotBlank(message = "State is mandatory")
    private String state;
    @NotNull(message = "PIN code is mandatory")
    @PinCodeValidator()
    private Integer pincode;
}
