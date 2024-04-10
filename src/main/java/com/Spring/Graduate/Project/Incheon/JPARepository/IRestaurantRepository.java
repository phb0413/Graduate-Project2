package com.Spring.Graduate.Project.Incheon.JPARepository;

import com.Spring.Graduate.Project.Incheon.Entity.IncheonRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<IncheonRestaurant, Long> {
}
