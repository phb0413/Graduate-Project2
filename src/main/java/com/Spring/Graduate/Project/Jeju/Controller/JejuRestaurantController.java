package com.Spring.Graduate.Project.Jeju.Controller;

import com.Spring.Graduate.Project.Jeju.Entity.JejuRestaurant;
import com.Spring.Graduate.Project.Jeju.JPARepository.JeRestaurantRepository;
import com.Spring.Graduate.Project.Jeju.Service.JejuCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JejuRestaurantController {
    @Autowired
    private JeRestaurantRepository jeRestaurantRepository;

    @Autowired
    private JejuCrawling jejuCrawling;

    @GetMapping("food/jecrawling")
    public void jejucrawlandsave(){
        jejuCrawling.JejuCrawlAndSave();
    }

    @GetMapping("jefood")
    public String getAllRestaurants(Model model){
        List<JejuRestaurant> jeRestaurants = jeRestaurantRepository.findAll();
        model.addAttribute("jeRestaurants", jeRestaurants);
        return "Jejufood";
    }
}
