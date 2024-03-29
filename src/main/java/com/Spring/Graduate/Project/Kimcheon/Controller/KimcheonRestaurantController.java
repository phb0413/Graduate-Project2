package com.Spring.Graduate.Project.Kimcheon.Controller;

import com.Spring.Graduate.Project.Kimcheon.Entity.KimcheonRestaurant;
import com.Spring.Graduate.Project.Kimcheon.JPARepository.KRestaurantRepository;
import com.Spring.Graduate.Project.Kimcheon.Service.KimcheonCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KimcheonRestaurantController {

    @Autowired
    private KimcheonCrawling kimcheonCrawling;

    @Autowired
    private KRestaurantRepository krestaurantRepository;


    @GetMapping("food/kimcrawling")
    public void kimcheoncrawlandsave(){
        kimcheonCrawling.KimcheonCrawlAndSave();
    }

    @GetMapping("kfood")
    public String getAllKRestaurants(Model model){
        List<KimcheonRestaurant> kRestaurants = krestaurantRepository.findAll();
        model.addAttribute("kRestaurants", kRestaurants);
        return "Kimfood";
    }


}
