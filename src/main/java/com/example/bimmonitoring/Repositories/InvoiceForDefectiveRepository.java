package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.InvoiceForDefective;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceForDefectiveRepository extends CrudRepository<InvoiceForDefective, Integer> {
}
