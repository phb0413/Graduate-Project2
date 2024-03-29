package com.Spring.Graduate.Project.Kimcheon.JPARepository;

import com.Spring.Graduate.Project.Kimcheon.Entity.KimcheonRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KRestaurantRepository extends JpaRepository<KimcheonRestaurant, Long> {
}
