package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "job_title")
    private String job_title;

    public Employee(){};
}
