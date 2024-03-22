package com.Spring.Graduate.Project.Seoul.Controller;

import com.Spring.Graduate.Project.Seoul.DTO.TeamDTO;
import com.Spring.Graduate.Project.Seoul.Service.ScrapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RankController {
    private final ScrapingService scrapingService;

    @Autowired
    public RankController(ScrapingService scrapingService) {
        this.scrapingService=scrapingService;
    }

    @GetMapping("/")
    public String getMainIndex(Model model) {
        List<TeamDTO> teamDataList = ScrapingService.scrapeRank();


        model.addAttribute("teamDataList", teamDataList);


        return "Mainindex";

    }



}
