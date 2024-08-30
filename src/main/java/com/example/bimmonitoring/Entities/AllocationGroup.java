package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "allocation_group")
@AllArgsConstructor
public class AllocationGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "object_id",referencedColumnName = "id")
    private ObjectInfo object_info;

    @ManyToOne
    @JoinColumn(name = "allocation_id",referencedColumnName = "id")
    private Alocation alocation;


    public AllocationGroup(){}
}
