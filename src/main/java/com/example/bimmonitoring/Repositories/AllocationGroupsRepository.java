package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.AllocationGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationGroupsRepository extends CrudRepository<AllocationGroup,Integer> {
}
