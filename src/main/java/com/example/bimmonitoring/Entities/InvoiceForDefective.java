package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class InvoiceForDefective {

    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Set<Product> product;

    @OneToMany
    @JoinColumn(name = "recipient_id",referencedColumnName = "recipient_id")
    private Set<Recipient> recipient;
}
