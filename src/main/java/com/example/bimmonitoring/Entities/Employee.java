package com.example.bimmonitoring.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
@AllArgsConstructor
public class Employee {

    @Id
    private int id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "job_title")
    private String job_title;

    public Employee(){};
}
