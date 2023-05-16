package com.parishjain.MappingsProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private String studentName;
    private String studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String studentDepartment;

    //**************************** ONE TO ONE ******************************
    // STUDENT HAVE ONE TO ONE MAPPING WITH ADDRESS
    // UNIDIRECTIONAL MAPPING BECAUSE STUDENT HAS ONE TO ONE MAPPING BUT
    // ADDRESS NOT HAVE MAPPING THE STUDENT
    @OneToOne(cascade = CascadeType.ALL)
    private Address studentAddress;
}
