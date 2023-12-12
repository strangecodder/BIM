package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class WayBill {

    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "providerId",referencedColumnName = "id")
    private Set<Provider> provider;

    @OneToMany
    @JoinColumn(name = "transport_id",referencedColumnName = "id")
    private Set<Transport> transports;
}

