package com.parishjain.MappingsProject.service;

import com.parishjain.MappingsProject.models.Laptop;
import com.parishjain.MappingsProject.repository.ILaptopRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;
    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    @Transactional
    public String updateLaptopPrice(Long id, Integer price) {
        return laptopRepo.updatePriceById(id,price);
    }
}
