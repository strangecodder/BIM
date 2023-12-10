package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class WishList {

    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id",referencedColumnName = "id")
    private Material material;

    private int quantity;

    private int state;

    private Date bid_time;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "wish_list_id",referencedColumnName = "wish_list_id")
    private Set<DealList> dealLists;
}
