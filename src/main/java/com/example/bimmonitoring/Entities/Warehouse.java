package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "warehouse")
@AllArgsConstructor
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "number_of_free_cells")
    private int number_of_free_cells;

    @Column(name = "address")
    private String address;

    @Column(name = "employee_id")
    @OneToMany
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Set<Employee> employeeSet;



    public Warehouse(){}

    public Warehouse(String name) {
        this.name = name;
    }
}
