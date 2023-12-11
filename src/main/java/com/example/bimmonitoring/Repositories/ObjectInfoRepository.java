package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.ObjectInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectInfoRepository extends JpaRepository<ObjectInfo, Integer> {
}
