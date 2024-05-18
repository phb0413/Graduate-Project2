package com.Spring.Graduate.Project.Ulsan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UlsanController {
    @GetMapping("uindex")
    public String UlsanIndex(){
        return "Ulsanindex";
    }
    @GetMapping("utour")
    public String UlsanTour(){
        return "UlsanTour";
    }
    @GetMapping("uhome")
    public String UlsanHome(){
        return "UlsanHome";
    }
    @GetMapping("ucourse")
    public String UlsanCourse(){
        return "UlsanCourse";
    }
}
