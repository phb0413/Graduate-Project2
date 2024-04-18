package com.Spring.Graduate.Project.Gangwon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GangwonController {
    @GetMapping("gindex")
    public String GangwonIndex(){
        return "Gangwonindex";
    }
    @GetMapping("gtour")
    public String GangwonTour(){
        return "GangwonTour";
    }
    @GetMapping("ghome")
    public String GangwonHome(){
        return "GangwonHome";
    }
    @GetMapping("gcourse")
    public String GangwonCourse(){
        return "GangwonCourse";
    }
}
