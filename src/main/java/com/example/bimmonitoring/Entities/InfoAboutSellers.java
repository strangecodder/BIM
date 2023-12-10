package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InfoAboutSellers {

    @Id
    private int id;

    private String company_name;

    private String address;

    private String webSite;

    private int workersQuantity;

    private String email;
}
