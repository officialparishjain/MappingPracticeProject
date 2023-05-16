package com.parishjain.MappingsProject.controller;

import com.parishjain.MappingsProject.models.Laptop;
import com.parishjain.MappingsProject.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/laptop")
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    // ADD LAPTOP
    @PostMapping(value = "/add")
    public String addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
        return "Laptop has been Successfully added";
    }

    // GET ALL LAPTOPS
    @GetMapping(value = "/getAll")
    public List<Laptop> getALlLaptops(){
        return laptopService.getAllLaptops();
    }

    // UPDATE LAPTOP PRICE
    @PutMapping(value = "/update/{id}/{price}")
    public String updateLaptopPrice(@PathVariable Long id, @PathVariable Integer price){
        return laptopService.updateLaptopPrice(id,price);
    }

}
