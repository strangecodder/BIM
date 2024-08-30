package com.example.bimmonitoring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "info_about_sellers")
@AllArgsConstructor
public class InfoAboutSellers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "address")
    private String address;

    @Column(name = "web_site")
    private String web_site;

    @Column(name = "workers_quantity")
    private int workers_quantity;

    @Column(name = "email")
    private String email;

    public InfoAboutSellers(){}
}
