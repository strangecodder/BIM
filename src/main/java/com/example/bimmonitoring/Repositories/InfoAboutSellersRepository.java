package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.InfoAboutSellers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoAboutSellersRepository extends CrudRepository<InfoAboutSellers,Integer> {

}
