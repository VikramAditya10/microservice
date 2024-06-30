package online.vikramaaditya.address.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<PinCodeValidator,Integer> {
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if(value==null||!value.toString().matches("\\d{6}")) {
            return false;
        }
        return true;
    }


}
