package com.Spring.Graduate.Project.Jeju.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JejuController {
    @GetMapping("jeindex")
    public String JejuIndex(){
        return "Jejuindex";
    }
    @GetMapping("jetour")
    public String JejuTour(){
        return "JejuTour";
    }
    @GetMapping("jehome")
    public String JejuHome(){
        return "JejuHome";
    }
    @GetMapping("jecourse")
    public String JejuCourse(){
        return "JejuCourse";
    }
}


