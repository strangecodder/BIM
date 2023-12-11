package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WorkersInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersInfoRepository extends JpaRepository<WorkersInfo, Integer> {
}
