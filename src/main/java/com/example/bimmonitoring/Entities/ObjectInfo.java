package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ObjectInfo {

    @Id
    private int id;

    private String objectAddress;

    private int workers_quantity;

    private String organisation;

    @ManyToOne
    @JoinColumn(name = "alocation_id",referencedColumnName = "id")
    private Alocation alocation;
}
