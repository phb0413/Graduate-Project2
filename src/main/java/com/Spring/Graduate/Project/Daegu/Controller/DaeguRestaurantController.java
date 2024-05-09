package com.Spring.Graduate.Project.Daegu.Controller;

import com.Spring.Graduate.Project.Daegu.Entity.DaeguRestaurant;
import com.Spring.Graduate.Project.Daegu.JPARepository.DGRestaurantRepository;
import com.Spring.Graduate.Project.Daegu.Service.DaeguCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DaeguRestaurantController {
    @Autowired
    private DGRestaurantRepository dgRestaurantRepository;

    @Autowired
    private DaeguCrawling daeguCrawling;

    @GetMapping("food/dgcrawling")
    public void daegucrawlandsave(){
        daeguCrawling.DaeguCrawlAndSave();
    }

    @GetMapping("dgfood")
    public String getAllRestaurants(Model model){
        List<DaeguRestaurant> dgRestaurants = dgRestaurantRepository.findAll();
        model.addAttribute("dgRestaurants", dgRestaurants);
        return "Daegufood";
    }
}
