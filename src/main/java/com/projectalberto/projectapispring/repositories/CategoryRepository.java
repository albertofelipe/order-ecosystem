package com.projectalberto.projectapispring.repositories;

import com.projectalberto.projectapispring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
