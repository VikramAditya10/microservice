package online.vikramaaditya.address.controller;

import jakarta.validation.Valid;
import online.vikramaaditya.address.dto.request.CreateAddressRequest;
import online.vikramaaditya.address.dto.response.AddressResponse;
import online.vikramaaditya.address.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressServiceImpl addressService;
    @PostMapping("/save")
    public AddressResponse saveAddress(@Valid @RequestBody CreateAddressRequest createAddressRequest){
        return addressService.createAddress(createAddressRequest);
    }
    @GetMapping("/get/{id}")
    public AddressResponse getAddressById(@PathVariable Long id){
    return addressService.getAddressById(id);
    }
}
