package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.ShippingInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingInvoiceRepository extends JpaRepository<ShippingInvoice,Integer> {

}
