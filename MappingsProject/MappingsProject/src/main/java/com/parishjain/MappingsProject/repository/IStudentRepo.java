package com.parishjain.MappingsProject.repository;

import com.parishjain.MappingsProject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {
}
