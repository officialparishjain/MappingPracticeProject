package com.parishjain.MappingsProject.repository;

import com.parishjain.MappingsProject.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Long> {
}
