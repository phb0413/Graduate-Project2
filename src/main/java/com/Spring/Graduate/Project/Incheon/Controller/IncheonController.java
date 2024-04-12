package com.Spring.Graduate.Project.Incheon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncheonController {
    @GetMapping("iindex")
    public String Incheonindex(){
        return "Incheonindex";
    }

    @GetMapping("itour")
    public String IncheonTour(){
        return "IncheonTour";
    }

    @GetMapping("ihome")
    public String IncheonHome(){
        return "IncheonHome";
    }

    @GetMapping("icourse")
    public String IncheonCourse(){
        return "IncheonCourse";
    }
}
