package com.Spring.Graduate.Project.Seoul.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping(value = "Page")
    public String Pageindex() {
        return "Pageindex";
    }

    @GetMapping(value = "SeoulTour")
    public String SeoulTour() {return "SeoulTour";}

    @GetMapping(value = "SeoulHome")
    public String SeoulHome() {return "SeoulHome";}

    @GetMapping(value = "SeoulCourse")
    public String SeoulCourse() {return "SeoulCourse";}



}
