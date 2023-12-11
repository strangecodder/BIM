package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "shipping_invoice")
public class ShippingInvoice {

    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "purchace_invoice_id",referencedColumnName = "id")
    private Set<PurchaseInvoice> purchaseInvoice;

    @OneToMany
    @JoinColumn(name = "alocation_id",referencedColumnName = "id")
    private Set<Alocation> alocation;
}
