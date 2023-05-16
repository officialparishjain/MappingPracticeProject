package com.parishjain.MappingsProject.service;

import com.parishjain.MappingsProject.models.Course;
import com.parishjain.MappingsProject.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;
    public String addCourse(Course course) {
        courseRepo.save(course);
        return "Course has been saved successfully";
    }

    // GET ALL COURSE
    public List<Course> getAllCourse(){
        return courseRepo.findAll();
    }
}
