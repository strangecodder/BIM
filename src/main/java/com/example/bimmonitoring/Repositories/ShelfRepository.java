package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf,Integer> {
}
