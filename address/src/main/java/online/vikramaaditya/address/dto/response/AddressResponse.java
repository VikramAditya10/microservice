package online.vikramaaditya.address.dto.response;

import lombok.Data;
import online.vikramaaditya.address.entity.Address;

@Data
public class AddressResponse {
    Long id;
    private String adressLine1;
    private String adressLine2;
    private String city;
    private String state;
    private Integer pincode;
    public AddressResponse(Address address){
        this.id= address.getId();
        this.adressLine1= address.getAddressLine1();
        this.adressLine2= address.getAddressLine2();
        this.city= address.getCity();
        this.state = address.getState();
        this.pincode = address.getPincode();
    }
}
