package com.Spring.Graduate.Project.Seoul.Controller;

import com.Spring.Graduate.Project.Seoul.Entity.Restaurant;
import com.Spring.Graduate.Project.Seoul.JPARepository.RestaurantRepository;
import com.Spring.Graduate.Project.Seoul.Service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class RestaurantController {


    @Autowired
    private  CrawlingService crawlingService;

    @Autowired
    private  RestaurantRepository restaurantRepository;



    @GetMapping("food/crawlAndSave")
    public void crawlAndSaveData(){
        crawlingService.crawlAndSaveData();
    }

    @GetMapping("food")
    public String getAllRestaurants(Model model){
        List<Restaurant> restaurants = restaurantRepository.findAll();
        model.addAttribute("restaurants", restaurants);
        return "Pagefoodindex";
    }
}
