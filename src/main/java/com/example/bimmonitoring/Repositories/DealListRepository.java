package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.DealList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealListRepository extends JpaRepository<DealList,Integer> {

}