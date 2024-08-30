package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "shelf")
@AllArgsConstructor
public class Shelf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String productSection;

    private int freeSpace;

    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
    private Warehouse warehouse;

    public Shelf(){};
}
