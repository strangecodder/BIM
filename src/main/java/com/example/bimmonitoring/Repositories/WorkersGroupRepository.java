package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WorkersGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersGroupRepository extends CrudRepository<WorkersGroup,Integer> {
}
