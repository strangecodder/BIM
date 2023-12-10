package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.PurchaseInvoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseInvoiceRepository extends CrudRepository<PurchaseInvoice, Integer> {
}
