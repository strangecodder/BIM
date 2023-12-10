package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "workers_info")
public class WorkerInfo {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "object_id",referencedColumnName = "id")
    private Alocation alocation;

    private String jobTitle;
}
