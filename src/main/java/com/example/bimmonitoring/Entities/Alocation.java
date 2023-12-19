package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "alocation")
public class Alocation {

    @Id
    private int id;

    private Date shipping_time;

    private Date real_shipping_time;

    @ManyToOne
    @JoinColumn(name = "object_id", referencedColumnName = "object_id")
    private ObjectInfo objectId;
}
