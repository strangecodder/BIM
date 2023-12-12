package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList,Integer> {
}
