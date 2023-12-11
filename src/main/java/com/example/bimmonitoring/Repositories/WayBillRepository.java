package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WayBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WayBillRepository extends JpaRepository<WayBill,Integer> {
}
