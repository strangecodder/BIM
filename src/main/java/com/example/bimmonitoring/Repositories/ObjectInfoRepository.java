package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.ObjectInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectInfoRepository extends CrudRepository<ObjectInfo, Integer> {
}
