package com.example.yeongnyamsa.controller;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Allergy {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allergy_id")
    Long id;
    String ingredient;
    String img;

    @OneToMany(mappedBy = "allergy")
    private List<UserAllergy> userAllergyList = new ArrayList<>();

}
