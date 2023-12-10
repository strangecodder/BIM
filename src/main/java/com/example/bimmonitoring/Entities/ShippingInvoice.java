package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shipping_invoice")
public class ShippingInvoice {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "purchace_invoice_id",referencedColumnName = "id")
    private PurchaseInvoice purchaseInvoice;

    @ManyToOne
    @JoinColumn(name = "alocation_id",referencedColumnName = "id")
    private Alocation alocation;
}
