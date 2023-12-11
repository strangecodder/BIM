package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "workers_info")
public class WorkersInfo {

    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "object_id",referencedColumnName = "id")
    private Set<Alocation> alocation;

    private String jobTitle;
}
