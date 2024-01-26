package com.Spring.Graduate.Project.Seoul.Controller;

import com.Spring.Graduate.Project.Seoul.DTO.TeamDTO;
import com.Spring.Graduate.Project.Seoul.DTO.TeambDTO;
import com.Spring.Graduate.Project.Seoul.Service.ScrapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class RankController {
    private final ScrapingService scrapingService;

    @Autowired
    public RankController(ScrapingService scrapingService) {
        this.scrapingService=scrapingService;
    }

    @GetMapping("/Rank")
    public String getMainIndex(Model model) {
        List<TeamDTO> teamDataList = ScrapingService.scrapeRank();


        model.addAttribute("teamDataList", teamDataList);

        List<TeambDTO> teambDataList = ScrapingService.scrapebRank();

        model.addAttribute("teambDataList", teambDataList);

        return "Mainindex";

    }



}
