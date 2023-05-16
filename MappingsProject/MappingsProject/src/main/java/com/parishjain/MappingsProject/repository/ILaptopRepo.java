package com.parishjain.MappingsProject.repository;

import com.parishjain.MappingsProject.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Long> {

    @Modifying
    @Query(value = "update laptop set laptop_price = :price where laptopid = :id",nativeQuery = true)
    String updatePriceById(Long id, Integer price);
}
