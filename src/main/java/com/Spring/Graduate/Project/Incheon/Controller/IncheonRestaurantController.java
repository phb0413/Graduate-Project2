package com.Spring.Graduate.Project.Incheon.Controller;

import com.Spring.Graduate.Project.Incheon.Entity.IncheonRestaurant;
import com.Spring.Graduate.Project.Incheon.JPARepository.IRestaurantRepository;
import com.Spring.Graduate.Project.Incheon.Service.IncheonCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IncheonRestaurantController {
    @Autowired
    private IncheonCrawling incheonCrawling;

    @Autowired
    private IRestaurantRepository irestaurantRepository;

    @GetMapping("food/Incrawling")
    public void incheoncrawlandsave(){
        incheonCrawling.IncheonCrawlAndSave();
    }

    @GetMapping("ifood")
    public String getAllRestaurants(Model model){
        List<IncheonRestaurant> iRestaurants = irestaurantRepository.findAll();
        model.addAttribute("iRestaurants", iRestaurants);
        return "Incheonfood";
    }
}
