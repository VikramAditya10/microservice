package online.vikramaaditya.address.service;

import online.vikramaaditya.address.dto.request.CreateAddressRequest;
import online.vikramaaditya.address.dto.response.AddressResponse;

public interface AddressService {
    public AddressResponse getAddressById(Long id);
    public AddressResponse createAddress(CreateAddressRequest createAddressRequest);
}
