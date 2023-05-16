package com.parishjain.MappingsProject.repository;

import com.parishjain.MappingsProject.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {
}
