package com.Spring.Graduate.Project.Suwon.Controller;

import com.Spring.Graduate.Project.Suwon.Entity.SuwonRestaurant;
import com.Spring.Graduate.Project.Suwon.JPARepository.SRestaurantRepository;
import com.Spring.Graduate.Project.Suwon.Service.SuwonCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SuwonRestaurantController {

    @Autowired
    private SuwonCrawling suwonCrawling;

    @Autowired
    private SRestaurantRepository srestaurantRepository;

    @GetMapping("food/sucrawling")
    public void suwoncrawlandsave(){
        suwonCrawling.SuwonCrawlAndSave();
    }

    @GetMapping("sfood")
    public String getAllSRestaurants(Model model){
        List<SuwonRestaurant> sRestaurants = srestaurantRepository.findAll();
        model.addAttribute("sRestaurants", sRestaurants);
        return "Suwonfood";
    }
}
