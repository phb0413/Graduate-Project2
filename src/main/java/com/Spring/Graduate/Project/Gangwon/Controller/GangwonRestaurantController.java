package com.Spring.Graduate.Project.Gangwon.Controller;

import com.Spring.Graduate.Project.Gangwon.Entity.GangwonRestaurant;
import com.Spring.Graduate.Project.Gangwon.JPARepository.GRestaurantRepository;
import com.Spring.Graduate.Project.Gangwon.Service.GangwonCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GangwonRestaurantController {
    @Autowired
    private GangwonCrawling gangwonCrawling;

    @Autowired
    private GRestaurantRepository grestaurantRepository;

    @GetMapping("food/gcrawling")
    public void gangwoncrawlandsave(){
        gangwonCrawling.GangwonCrawlAndSave();
    }
    @GetMapping("gfood")
    public String getAllRestaurants(Model model){
        List<GangwonRestaurant> gRestaurants = grestaurantRepository.findAll();
        model.addAttribute("gRestaurants", gRestaurants);
        return "Gangwonfood";
    }
}
