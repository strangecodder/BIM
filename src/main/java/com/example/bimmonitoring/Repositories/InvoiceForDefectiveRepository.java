package com.example.bimmonitoring.Repositories;

import com.example.bimmonitoring.Entities.InvoiceForDefective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceForDefectiveRepository extends JpaRepository<InvoiceForDefective, Integer> {
}
