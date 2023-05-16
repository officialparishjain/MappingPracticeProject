package com.parishjain.MappingsProject.repository;

import com.parishjain.MappingsProject.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,Long> {
}
