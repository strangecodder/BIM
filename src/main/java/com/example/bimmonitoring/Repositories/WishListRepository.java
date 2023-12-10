package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.WishList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends CrudRepository<WishList,String> {

    @Query("SELECT wl.bid_time,wl.quantity,wl.state FROM WishList wl WHERE wl.id = ?")
    WishList getWishListById();
}
