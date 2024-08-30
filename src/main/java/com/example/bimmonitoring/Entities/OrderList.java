package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "order_list")
@AllArgsConstructor
public class OrderList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @OneToMany
    @JoinColumn(name = "wish_list_id",referencedColumnName = "id")
    private Set<WishList> wish_list_id;

    @OneToMany
    @JoinColumn(name = "deal_list_id")
    private Set<DealList> dealLists;

    public OrderList(){};
}
