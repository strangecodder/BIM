package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "shipping_invoice")
@AllArgsConstructor
public class ShippingInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "purchace_invoice_id",referencedColumnName = "id")
    private PurchaseInvoice purchaseInvoice;

    @ManyToOne
    @JoinColumn(name = "alocation_id",referencedColumnName = "id")
    private Alocation alocation;

    @Column(name = "expected_delivery_time")
    private Timestamp expected_delivery_time;

    @Column(name = "real_delivery_time")
    private Timestamp real_delivery_time;

    public ShippingInvoice(){}
}
