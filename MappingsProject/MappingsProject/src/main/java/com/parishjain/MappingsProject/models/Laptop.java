package com.parishjain.MappingsProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopID;
    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;

    // ONE TO ONE MAPPING WITH STUDENT
    // One laptop can be associated to only one student
    @OneToOne
    private Student laptopStudent;

}
