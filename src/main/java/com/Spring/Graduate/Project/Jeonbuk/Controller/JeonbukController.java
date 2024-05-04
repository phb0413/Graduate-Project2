package com.Spring.Graduate.Project.Jeonbuk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JeonbukController {
    @GetMapping("jindex")
    public String JeonbukIndex(){
        return "Jeonbukindex";
    }

    @GetMapping("jtour")
    public String JeonbukTour(){
        return "JeonbukTour";
    }

    @GetMapping("jhome")
    public String JeonbukHome(){
        return "JeonbukHome";
    }

    @GetMapping("jcourse")
    public String JeonbukCourse(){
        return "JeonbukCourse";
    }
}
