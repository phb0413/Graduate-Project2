package com.Spring.Graduate.Project.Seoul.Controller;

import com.Spring.Graduate.Project.Seoul.Entity.Restaurant;
import com.Spring.Graduate.Project.Seoul.JPARepository.RestaurantRepository;
import com.Spring.Graduate.Project.Seoul.Service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private CrawlingService crawlingService;

    @Autowired
    private RestaurantRepository restaurantRepository;



    @GetMapping("/crawlAndSave")
    public void crawlAndSaveData(){
        crawlingService.crawlAndSaveData();
    }

    @GetMapping("/getAll")
    public List<Restaurant> getAllRestaurants(){
        return crawlingService.getAllRestaurants();
    }
}
