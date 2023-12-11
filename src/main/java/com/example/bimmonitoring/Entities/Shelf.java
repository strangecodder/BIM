package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

@Entity
public class Shelf {

    @Id
    private String shelfId;

    private String productSection;

    private int freeSpace;

    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "warehouse_id", referencedColumnName = "warehouse_id")
    private Warehouse warehouse;
}
