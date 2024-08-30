package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "transport")
@AllArgsConstructor
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "state_number")
    private String state_number;

    public Transport(){}
}
