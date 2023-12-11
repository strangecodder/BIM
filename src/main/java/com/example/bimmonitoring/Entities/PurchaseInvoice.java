package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "purchace_invoice")
public class PurchaseInvoice {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "deal_list_id",referencedColumnName = "id")
    private DealList dealList;

    @OneToMany
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Set<Employee> employee;

    @OneToMany
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Set<Product> product;

    @OneToMany
    @JoinColumn(name = "provider_id",referencedColumnName = "id")
    private Set<Provider> provider;


}
