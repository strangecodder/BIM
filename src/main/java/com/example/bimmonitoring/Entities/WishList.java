package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "wish_list")
@AllArgsConstructor
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id",referencedColumnName = "id")
    private Material material;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "state")
    private int state;

    public WishList(){};

    // todo: сделать триггер на инкременитацию состояния при внесение материала в
    //       другой таблице

}
