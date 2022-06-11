package com.jacacourse.course.repositories;

import com.jacacourse.course.entities.OrderItem;
import com.jacacourse.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
