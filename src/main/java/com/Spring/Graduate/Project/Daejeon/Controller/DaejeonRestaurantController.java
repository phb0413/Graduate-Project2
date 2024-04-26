package com.Spring.Graduate.Project.Daejeon.Controller;

import com.Spring.Graduate.Project.Daejeon.Entity.DaejeonRestaurant;
import com.Spring.Graduate.Project.Daejeon.JPARepository.DRestaurantRepository;
import com.Spring.Graduate.Project.Daejeon.Service.DaejeonCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DaejeonRestaurantController {
    @Autowired
    private DaejeonCrawling daejeonCrawling;

    @Autowired
    private DRestaurantRepository drestaurantRepository;

    @GetMapping("food/dcrawling")
    public void daejeoncrawlandsave(){
        daejeonCrawling.DaejeonCrawlAndSave();
    }

    @GetMapping("dfood")
    public String getAllRestaurants(Model model){
        List<DaejeonRestaurant> dRestaurants = drestaurantRepository.findAll();
        model.addAttribute("dRestaurants", dRestaurants);
        return "Daejeonfood";
     }
}
