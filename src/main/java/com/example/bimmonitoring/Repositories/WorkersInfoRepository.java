package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WorkersInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersInfoRepository extends CrudRepository<WorkersInfo, Integer> {
}
