package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "deal_list")
public class DealList {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "wish_list_id",referencedColumnName = "id")
    private WishList custom;

    private int delivery_id;

    @OneToOne
    @JoinColumn(name = "seller_id",referencedColumnName = "id")
    private InfoAboutSellers sellers;
}
