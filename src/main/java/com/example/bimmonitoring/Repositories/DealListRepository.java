package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.DealList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealListRepository extends CrudRepository<DealList,Integer> {

}
