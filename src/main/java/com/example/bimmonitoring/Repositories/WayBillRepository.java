package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WayBill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WayBillRepository extends CrudRepository<WayBill,Integer> {
}
