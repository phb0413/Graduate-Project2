package com.Spring.Graduate.Project.Seoul.JPARepository;

import com.Spring.Graduate.Project.Seoul.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
