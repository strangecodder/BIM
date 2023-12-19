package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ObjectInfo {

    @Id
    @Column(name = "object_id")
    private int id;

    @Column(name = "object_adress")
    private String objectAdress;

    private int workersQuantity;

    private String organisation;

//    @OneToMany
//    @JoinColumn(name = "alocationId",referencedColumnName = "id")
//    private Set<Alocation> alocation;

    public int getId() {
        return id;
    }

    public String getObjectAddress() {
        return objectAdress;
    }

    public int getWorkers_quantity() {
        return workersQuantity;
    }

    public String getOrganisation() {
        return organisation;
    }

}
