package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "purchace_invoice")
@AllArgsConstructor
public class PurchaseInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @OneToOne
    @JoinColumn(name = "deal_list_id",referencedColumnName = "id")
    private DealList dealList;

    @ManyToOne
    @JoinColumn(name = "prodiver_id",referencedColumnName = "id")
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

//    @OneToMany
//    @JoinColumn(name = "provider_id",referencedColumnName = "id")
//    private Set<Provider> provider;

    public PurchaseInvoice(){};
}
