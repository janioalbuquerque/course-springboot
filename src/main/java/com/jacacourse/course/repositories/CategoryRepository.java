package com.jacacourse.course.repositories;

import com.jacacourse.course.entities.Category;
import com.jacacourse.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
