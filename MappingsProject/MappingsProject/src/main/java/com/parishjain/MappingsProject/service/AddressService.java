package com.parishjain.MappingsProject.service;

import com.parishjain.MappingsProject.models.Address;
import com.parishjain.MappingsProject.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address has been saved successfully..";
    }

    @Modifying
    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Deleted";
    }
}
