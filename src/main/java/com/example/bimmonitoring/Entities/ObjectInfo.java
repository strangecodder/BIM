package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "object_info")
@AllArgsConstructor
public class ObjectInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Integer id;

    @Column(name = "object_address")
    private String object_address;

    @Column(name = "workers_quantity")
    private int workers_quantity;

    @Column(name = "organization")
    private String organisation;


    @OneToMany
    @JoinColumn(name = "workers_group_id",referencedColumnName = "id")
    @Column(name = "workers_group_id")
    private Set<WorkersInfo> workersInfo;

    public ObjectInfo(){}

    public ObjectInfo( String object_address, String organisation) {
        this.object_address = object_address;
        this.organisation = organisation;
    }

    public ObjectInfo(String object_address, String organisation, Set<WorkersInfo> workersInfo) {
        this.object_address = object_address;
        this.organisation = organisation;
        this.workersInfo = workersInfo;
    }
}
