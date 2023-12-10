package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

@Entity
public class WayBill {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "providerId",referencedColumnName = "id")
    private Provider provider;

    private int transportId;
}
