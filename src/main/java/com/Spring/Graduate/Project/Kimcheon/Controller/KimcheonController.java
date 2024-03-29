package com.Spring.Graduate.Project.Kimcheon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class KimcheonController {
    @GetMapping("ktour")
    public String KimTour(){
        return "KimTour";
    }

    @GetMapping("khome")
    public String KimHome(){
        return "KimHome";
    }

    @GetMapping("kindex")
    public String Kimindex(){
        return "Kimindex";
    }

    @GetMapping("kcourse")
    public String KimCourse(){
        return "KimCourse";
    }
}
