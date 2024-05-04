package com.Spring.Graduate.Project.Gwangju.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GwangjuController {
    @GetMapping("gjindex")
    public String GwangjuIndex(){
        return "Gwangjuindex";
    }

    @GetMapping("gjtour")
    public String GwangjuTour(){
        return "GwangjuTour";
    }

    @GetMapping("gjhome")
    public String GwangjuHome(){
        return "GwangjuHome";
    }

    @GetMapping("gjcourse")
    public String GwangjuCourse(){
        return "GwangjuCourse";
    }
}
