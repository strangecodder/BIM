package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transport,Integer> {
}
