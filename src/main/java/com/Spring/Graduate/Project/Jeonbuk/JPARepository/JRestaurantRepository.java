package com.Spring.Graduate.Project.Jeonbuk.JPARepository;

import com.Spring.Graduate.Project.Jeonbuk.Entity.JeonbukRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JRestaurantRepository extends JpaRepository<JeonbukRestaurant,Long> {
}
