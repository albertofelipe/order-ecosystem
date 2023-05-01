package com.projectalberto.projectapispring.repositories;

import com.projectalberto.projectapispring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
