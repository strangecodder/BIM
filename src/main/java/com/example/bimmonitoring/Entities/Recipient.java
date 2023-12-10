package com.example.bimmonitoring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recipient {

    @Id
    private int id;

    private String fullnameRecipient;

    private String company;
}
