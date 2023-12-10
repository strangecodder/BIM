package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "alocation")
public class Alocation {

    @Id
    private int id;

    private Date shipping_time;

    private Date real_shipping_time;

    private int object_id;
}
