package online.vikramaaditya.address.service;

import online.vikramaaditya.address.dto.request.CreateAddressRequest;
import online.vikramaaditya.address.dto.response.AddressResponse;
import online.vikramaaditya.address.entity.Address;
import online.vikramaaditya.address.exception.AddressNotFoundException;
import online.vikramaaditya.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepository addressRepository;
    @Override
    public AddressResponse getAddressById(Long id) {
        return new AddressResponse( addressRepository.findById(id).orElseThrow(()->new AddressNotFoundException("Address not found")));
    }

    @Override
    public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address(createAddressRequest);

        return new AddressResponse(addressRepository.save(address));
    }
}
