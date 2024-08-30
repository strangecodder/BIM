package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "workers_info")
@AllArgsConstructor
public class WorkersInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @ManyToOne
    @JoinColumn(name = "group_id",referencedColumnName = "id")
    private WorkersGroup group_id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "full_name")
    private String full_name;

    public  WorkersInfo(){};
}
