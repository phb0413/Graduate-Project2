package com.Spring.Graduate.Project.Daejeon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DaejeonController {
    @GetMapping("dindex")
    public String DaejeonIndex(){
        return "Daejeonindex";
    }

    @GetMapping("dtour")
    public String DaejeonTour(){
        return "DaejeonTour";
    }

    @GetMapping("dhome")
    public String DaejeonHome(){
        return "DaejeonHome";
    }

    @GetMapping("dcourse")
    public String DaejeonCourse(){
        return "DaejeonCourse";
    }
}
