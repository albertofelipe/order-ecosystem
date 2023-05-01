package com.projectalberto.projectapispring.repositories;

import com.projectalberto.projectapispring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
