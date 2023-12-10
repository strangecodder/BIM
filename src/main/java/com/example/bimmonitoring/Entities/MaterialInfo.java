package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MaterialInfo {

    @Id
    private int id;

    private String gost;

    private String ref;
}
