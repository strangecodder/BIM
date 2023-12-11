package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Alocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlocationRepository extends JpaRepository<Alocation,Integer> {
}
