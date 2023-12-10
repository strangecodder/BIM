package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Shelf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepository extends CrudRepository<Shelf,Integer> {
}
