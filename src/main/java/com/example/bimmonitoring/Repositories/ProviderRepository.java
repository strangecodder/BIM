package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Integer> {
}
