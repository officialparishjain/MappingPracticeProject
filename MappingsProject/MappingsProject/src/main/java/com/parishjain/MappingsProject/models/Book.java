package com.parishjain.MappingsProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;

    // ************************ MANY TO ONE ****************************
    // HERE WE HAVE PUT THE MANY-TO-ONE MAPPING WITH BOOK AND STUDENT
    // BECAUSE MANY BOOK CAN BE ISSUED TO ONE STUDENT
    @ManyToOne
    private Student bookStudent;
}
