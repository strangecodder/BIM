package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.MaterialInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialInfoRepository extends CrudRepository<MaterialInfo,String> {

    @Query("select mi.gost , mi.ref from MaterialInfo mi where mi.id = ?")
    MaterialInfo getMaterialInfoById(int id);


}
