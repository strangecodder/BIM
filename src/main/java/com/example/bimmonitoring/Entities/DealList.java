package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "deal_list")
@AllArgsConstructor
public class DealList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @OneToOne
    @JoinColumn(name = "wish_list_id",referencedColumnName = "id")
    private WishList custom;

    @OneToOne
    @JoinColumn(name = "seller_id",referencedColumnName = "id")
    private InfoAboutSellers sellers;

    public DealList(){}
}
