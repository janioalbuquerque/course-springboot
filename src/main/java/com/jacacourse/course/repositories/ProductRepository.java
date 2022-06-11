package com.jacacourse.course.repositories;

import com.jacacourse.course.entities.Category;
import com.jacacourse.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
