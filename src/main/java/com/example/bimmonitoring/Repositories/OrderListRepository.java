package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.OrderList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderListRepository extends CrudRepository<OrderList,Integer> {
}
