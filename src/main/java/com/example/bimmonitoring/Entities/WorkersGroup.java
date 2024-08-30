package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
@Table(name = "workers_group")
@AllArgsConstructor
public class WorkersGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public WorkersGroup(){};
}
