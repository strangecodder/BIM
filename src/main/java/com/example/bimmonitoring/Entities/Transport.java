package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transport {

    @Id
    private int id;

    private String brand;

    private String state_number;
}
