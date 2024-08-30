package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "waybill")
@AllArgsConstructor
public class WayBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @ManyToOne
    @JoinColumn(name = "providerId",referencedColumnName = "id")
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "transport_id",referencedColumnName = "id")
    private Transport transports;

    public WayBill(){};

}

