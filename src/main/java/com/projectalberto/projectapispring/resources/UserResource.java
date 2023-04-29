package com.projectalberto.projectapispring.resources;

import com.projectalberto.projectapispring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "alberto", "lala", "91919", "212");
        return ResponseEntity.ok().body(u);
    }
}

