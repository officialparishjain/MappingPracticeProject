package com.parishjain.MappingsProject.controller;

import com.parishjain.MappingsProject.models.Address;
import com.parishjain.MappingsProject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    // ADD ADDRESS
    @PostMapping(value = "/add")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    // DELETE ADDRESS
    @DeleteMapping(value = "/delete/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
