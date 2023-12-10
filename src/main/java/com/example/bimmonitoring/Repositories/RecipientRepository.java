package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Recipient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends CrudRepository<Recipient, Integer> {
}
