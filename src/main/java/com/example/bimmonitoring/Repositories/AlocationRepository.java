package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Alocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlocationRepository extends CrudRepository<Alocation,Integer> {
}
