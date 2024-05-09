package com.Spring.Graduate.Project.Pohang.JPARepository;

import com.Spring.Graduate.Project.Pohang.Entity.PohangRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PRestaurantRepository extends JpaRepository<PohangRestaurant,Long> {
}
