package com.Spring.Graduate.Project.Ulsan.Controller;

import com.Spring.Graduate.Project.Ulsan.Entity.UlsanRestaurant;
import com.Spring.Graduate.Project.Ulsan.JPARepository.URestaurantRepository;
import com.Spring.Graduate.Project.Ulsan.Service.UlsanCrawling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UlsanRestaurantController {
    @Autowired
    private URestaurantRepository uRestaurantRepository;

    @Autowired
    private UlsanCrawling ulsanCrawling;

    @GetMapping("food/ucrawling")
    public void ulsancrawlandsave(){
        ulsanCrawling.UlsanCrawlAndSave();
    }

    @GetMapping("ufood")
    public String getAllRestaurants(Model model){
        List<UlsanRestaurant> uRestaurants = uRestaurantRepository.findAll();
        model.addAttribute("uRestaurants", uRestaurants);
        return "Ulsanfood";
    }
}
