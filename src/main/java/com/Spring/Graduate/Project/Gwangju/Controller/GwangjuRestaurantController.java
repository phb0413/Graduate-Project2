package com.Spring.Graduate.Project.Gwangju.Controller;

import com.Spring.Graduate.Project.Gwangju.Entity.GwangjuRestaurant;
import com.Spring.Graduate.Project.Gwangju.JPARepository.GJRestaurantRepository;
import com.Spring.Graduate.Project.Gwangju.Service.GwangjuCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GwangjuRestaurantController {
    @Autowired
    private GJRestaurantRepository gjRestaurantRepository;

    @Autowired
    private GwangjuCrawling gwangjuCrawling;

    @GetMapping("food/gjcrawling")
    public void gwangjucrawlandsave(){
        gwangjuCrawling.GwangjuCrawlAndSave();
    }

    @GetMapping("gjfood")
    public String getAllRestaurants(Model model){
        List<GwangjuRestaurant> gjRestaurants = gjRestaurantRepository.findAll();
        model.addAttribute("gjRestaurants", gjRestaurants);
        return "Gwangjufood";
    }
}
