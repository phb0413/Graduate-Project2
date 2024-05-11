package com.Spring.Graduate.Project.Pohang.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PohangController {
    @GetMapping("pindex")
    public String PohangIndex(){
        return "Pohangindex";
    }
    @GetMapping("ptour")
    public String PohangTour(){
        return "PohangTour";
    }
    @GetMapping("phome")
    public String PohangHome(){
        return "PohangHome";
    }
    @GetMapping("pcourse")
    public String PohangCourse(){
        return "PohangCourse";
    }
}
