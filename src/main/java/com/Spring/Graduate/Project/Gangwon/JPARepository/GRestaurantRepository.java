package com.Spring.Graduate.Project.Gangwon.JPARepository;

import com.Spring.Graduate.Project.Gangwon.Entity.GangwonRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GRestaurantRepository extends JpaRepository<GangwonRestaurant, Long> {
}
