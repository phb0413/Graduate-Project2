package com.Spring.Graduate.Project.Pohang.Controller;

import com.Spring.Graduate.Project.Pohang.Entity.PohangRestaurant;
import com.Spring.Graduate.Project.Pohang.JPARepository.PRestaurantRepository;
import com.Spring.Graduate.Project.Pohang.Service.PohangCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PohangRestaurantController {
    @Autowired
    private PRestaurantRepository pRestaurantRepository;

    @Autowired
    private PohangCrawling pohangCrawling;

    @GetMapping("food/pcrawling")
    public void pohangcrawlandsave(){
        pohangCrawling.PohangCrawlAndSave();
    }

    @GetMapping("pfood")
    public String getAllRestaurants(Model model){
        List<PohangRestaurant> pRestaurants = pRestaurantRepository.findAll();
        model.addAttribute("pRestaurants", pRestaurants);
        return "Pohangfood";
    }
}
