package com.Spring.Graduate.Project.Seoul.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String home() {
        return "Mainindex";
    }
    @GetMapping(value = "Page")
    public String Pageindex() {
        return "Pageindex";
    }

    @GetMapping(value = "food")
    public String getPagefoodindex() {
        return "Pagefoodindex";
    }

}
