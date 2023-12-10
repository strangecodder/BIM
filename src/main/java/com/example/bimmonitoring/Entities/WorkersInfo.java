package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "workers_info")
public class WorkersInfo {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "object_id",referencedColumnName = "id")
    private Alocation alocation;

    private String jobTitle;
}
