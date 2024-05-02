package com.Spring.Graduate.Project.Jeonbuk.Controller;

import com.Spring.Graduate.Project.Jeonbuk.Entity.JeonbukRestaurant;
import com.Spring.Graduate.Project.Jeonbuk.JPARepository.JRestaurantRepository;
import com.Spring.Graduate.Project.Jeonbuk.Service.JeonbukCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JeonbukRestaurantController {
    @Autowired
    private JeonbukCrawling jeonbukCrawling;

    @Autowired
    private JRestaurantRepository jrestaurantRepository;

    @GetMapping("food/jcrawling")
    public void jeonbukcrawlandsave(){
        jeonbukCrawling.JeonbukCrawlAndSave();
    }

    @GetMapping("jfood")
    public String getAllRestaurants(Model model){
        List<JeonbukRestaurant> jRestaurants = jrestaurantRepository.findAll();
        model.addAttribute("jRestaurants", jRestaurants);
        return "Jeonbukfood";
    }
}
