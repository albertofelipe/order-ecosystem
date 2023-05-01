package com.projectalberto.projectapispring.services;

import com.projectalberto.projectapispring.entities.Order;
import com.projectalberto.projectapispring.entities.User;
import com.projectalberto.projectapispring.repositories.OrderRepository;
import com.projectalberto.projectapispring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
