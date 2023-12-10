package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Warehouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Integer> {
}
