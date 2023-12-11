package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.MaterialInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialInfoRepository extends JpaRepository<MaterialInfo,Integer> {

}
