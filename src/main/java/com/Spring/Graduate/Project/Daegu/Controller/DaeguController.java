package com.Spring.Graduate.Project.Daegu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DaeguController {
    @GetMapping("dgindex")
    public String DaeguIndex(){
        return "Daeguindex";
    }
    @GetMapping("dgtour")
    public String DaeguTour(){
        return "DaeguTour";
    }
    @GetMapping("dghome")
    public String DaeguHome(){
        return "DaeguHome";
    }
    @GetMapping("dgcourse")
    public String DaeguCourse(){
        return "DaeguCourse";
    }
}
