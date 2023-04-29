package com.projectalberto.projectapispring.repositories;

import com.projectalberto.projectapispring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { //Contem as operações relacionadas ao banco de dados

}
