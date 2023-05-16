package com.parishjain.MappingsProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    // Many Course can be taken by Many student
    // WE PUT MANY TO MANY WHERE BOTH SIDES WE CAN ESTABLISH A RELATION OF ONE TO MANY
    // LIKE ONE COURSE CAN BE PURCHASED BY MANY STUDENTS ANS
    // ONE STUDENT CAN PURCHASE MANY COURSE
    // SO HERE BETTER TO USE MANY TO MANY
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "course_students",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    List<Student> courseStudentList;
}
