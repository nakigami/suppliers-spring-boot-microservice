package com.keycloack.suppliersmicroservice.dao;

import com.keycloack.suppliersmicroservice.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
