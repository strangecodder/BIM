package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "product")
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "quantity_of_goods")
    private int quantity_of_goods;

    @Column(name = "name")
    private String name;

    @Column(name = "expiring_date")
    private Date expiring_date;

    public Product(){};
}
