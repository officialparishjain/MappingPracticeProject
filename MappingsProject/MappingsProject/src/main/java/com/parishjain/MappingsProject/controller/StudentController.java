package com.parishjain.MappingsProject.controller;

import com.parishjain.MappingsProject.models.Student;
import com.parishjain.MappingsProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    // Add Student
    @PostMapping(value = "/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    // Get All students
    @GetMapping(value = "/getAll")
    public List<Student> getStudentList(){
        return studentService.getAllStudent();
    }

    // DELETE STUDENT
    @DeleteMapping(value = "/delete/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteById(id);
    }
}
