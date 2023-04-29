package com.projectalberto.projectapispring.services;

import com.projectalberto.projectapispring.entities.User;
import com.projectalberto.projectapispring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj =  userRepository.findById(id);
        return obj.get();
    }
}
