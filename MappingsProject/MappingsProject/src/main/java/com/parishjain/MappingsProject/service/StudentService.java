package com.parishjain.MappingsProject.service;

import com.parishjain.MappingsProject.models.Student;
import com.parishjain.MappingsProject.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student saved successfully...";
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Modifying
    public String deleteById(Long id) {
        studentRepo.deleteById(id);
        return "Deleted";
    }

    public Student getStudentById(Long stdId) {
        Optional<Student> optionalStudent = studentRepo.findById(stdId);
        if(optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        else return null;
    }
}
