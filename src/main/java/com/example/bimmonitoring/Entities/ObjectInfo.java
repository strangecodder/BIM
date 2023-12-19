package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ObjectInfo {

    @Id
    private int id;

    private String objectAddress;

    private int workers_quantity;

    private String organisation;

    @OneToMany
    @JoinColumn(name = "alocation_id",referencedColumnName = "id")
    private Set<Alocation> alocation;

    public int getId() {
        return id;
    }

    public String getObjectAddress() {
        return objectAddress;
    }

    public int getWorkers_quantity() {
        return workers_quantity;
    }

    public String getOrganisation() {
        return organisation;
    }

    public Set<Alocation> getAlocation() {
        return alocation;
    }


}
