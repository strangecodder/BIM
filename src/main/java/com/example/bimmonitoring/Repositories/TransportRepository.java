package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends CrudRepository<Transport,Integer> {
}
