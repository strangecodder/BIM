package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends CrudRepository<Provider,Integer> {
}
