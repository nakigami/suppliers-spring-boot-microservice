package com.keycloack.suppliersmicroservice;

import com.keycloack.suppliersmicroservice.dao.SupplierRepository;
import com.keycloack.suppliersmicroservice.models.Supplier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class SuppliersMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuppliersMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(SupplierRepository supplierRepository, RepositoryRestConfiguration repositoryRestConfiguration)
    {
        repositoryRestConfiguration.exposeIdsFor(Supplier.class);
        return args -> {
          supplierRepository.save(new Supplier(null, "IBM", "ibm@gmail.com"));
          supplierRepository.save(new Supplier(null, "Capgemini", "capgemini@gmail.com"));
          supplierRepository.save(new Supplier(null, "ATOS", "atos@gmail.com"));
        };
    }
}
