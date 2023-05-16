package com.parishjain.MappingsProject.controller;

import com.parishjain.MappingsProject.models.Course;
import com.parishjain.MappingsProject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    // ADD COURSE
    @PostMapping("/add")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    // GET ALL COURSES
    @GetMapping(value = "/all")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
}
