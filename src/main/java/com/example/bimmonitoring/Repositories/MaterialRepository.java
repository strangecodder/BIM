package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material,Integer> {

//    @Query("SELECT name FROM Material where name=?")
//    Material queryByName(String string);
}
