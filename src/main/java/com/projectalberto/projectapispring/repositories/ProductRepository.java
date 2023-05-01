package com.projectalberto.projectapispring.repositories;

import com.projectalberto.projectapispring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
