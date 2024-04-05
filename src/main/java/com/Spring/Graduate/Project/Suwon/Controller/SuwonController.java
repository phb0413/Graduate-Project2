package com.Spring.Graduate.Project.Suwon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuwonController {
    @GetMapping("sindex")
    public String Suwonindex(){
        return "SuwonIndex";
    }

    @GetMapping("stour")
    public String SuwonTour(){
        return "SuwonTour";
    }

    @GetMapping("shome")
    public String SuwonHome(){
        return "SuwonHome";
    }

    @GetMapping("scourse")
    public String SuwonCourse(){
        return "SuwonCourse";
    }
}
