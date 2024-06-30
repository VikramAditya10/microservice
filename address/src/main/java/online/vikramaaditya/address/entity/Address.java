package online.vikramaaditya.address.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import online.vikramaaditya.address.dto.request.CreateAddressRequest;

@Data
@Entity(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer pincode;
    public Address(){}
public Address(CreateAddressRequest createAddressRequest){
    this.addressLine1 = createAddressRequest.getAddressLine1();
    this.addressLine2= createAddressRequest.getAddressLine2();
    this.city= createAddressRequest.getCity();
    this.state=createAddressRequest.getState();
    this.pincode= createAddressRequest.getPincode();
}
}
