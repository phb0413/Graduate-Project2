package com.Spring.Graduate.Project.Suwon.JPARepository;

import com.Spring.Graduate.Project.Suwon.Entity.SuwonRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SRestaurantRepository extends JpaRepository<SuwonRestaurant, Long> {
}
