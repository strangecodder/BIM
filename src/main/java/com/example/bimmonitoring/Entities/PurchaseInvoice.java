package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "purchace_invoice")
public class PurchaseInvoice {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "deal_list_id",referencedColumnName = "id")
    private DealList dealList;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "provider_id",referencedColumnName = "id")
    private Provider provider;


}
