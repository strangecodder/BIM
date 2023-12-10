package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Warehouse {

    @Id
    private int warehouse_id;

    private String name;

    private String address;

    private int numberOfFreeCells;
}
