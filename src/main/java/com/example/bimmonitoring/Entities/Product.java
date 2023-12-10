package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "product")
public class Product {

    @Id
    private int id;

    private int quantityOfGoods;

    private String name;

    private Date expiring_date;
}
