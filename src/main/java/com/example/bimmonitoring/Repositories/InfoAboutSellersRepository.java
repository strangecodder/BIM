package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.InfoAboutSellers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoAboutSellersRepository extends JpaRepository<InfoAboutSellers,Integer> {

}