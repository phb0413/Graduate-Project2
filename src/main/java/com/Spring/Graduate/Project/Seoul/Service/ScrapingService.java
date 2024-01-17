package com.Spring.Graduate.Project.Seoul.Service;

import com.Spring.Graduate.Project.Seoul.DTO.TeamDTO;
import com.Spring.Graduate.Project.Seoul.DTO.TeambDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class ScrapingService {
    public static List<TeamDTO> scrapeRank() {
        List<TeamDTO> teamDataList = new ArrayList<>();
        try {

            Document doc = Jsoup.connect("https://sports.news.naver.com/kfootball/record/index")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36").get();

            Elements soccerTeams = doc.select("#splitGroupA_table > tr");

            for(Element soccerTeam : soccerTeams) {
                int rank = Integer.parseInt(soccerTeam.select("th").text());
                String image = soccerTeam.select("td.tm > div > span.emblem > img").text();
                String title = soccerTeam.select("span:nth-child(2)").text();
                int match = Integer.parseInt(soccerTeam.selectFirst("td:nth-child(3)").text());
                int point = Integer.parseInt(soccerTeam.selectFirst("td:nth-child(4)").text());
                int victory = Integer.parseInt( soccerTeam.selectFirst("td:nth-child(5)").text());
                int draw = Integer.parseInt(soccerTeam.selectFirst("td:nth-child(6)").text());
                int defeat = Integer.parseInt(soccerTeam.selectFirst("td:nth-child(7)").text());
                int diff = Integer.parseInt(soccerTeam.selectFirst("td:nth-child(10)").text());

                teamDataList.add(new TeamDTO(rank, image, title, match, point, victory, draw, defeat, diff));
            }



        } catch (IOException e){
            e.printStackTrace();
        }
        return teamDataList;
    }
    public static List<TeambDTO> scrapebRank() {
        List<TeambDTO> teambDataList = new ArrayList<>();
        try{
            Document doc = Jsoup.connect("https://sports.news.naver.com/kfootball/record/index")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36").get();

            Elements soccerbTeams = doc.select("#splitGroupB_table > tr");

            for(Element soccerbTeam : soccerbTeams) {
                int brank = Integer.parseInt(soccerbTeam.select("th").text());
                String bimage = soccerbTeam.select("td.tm > div > span.emblem > img").text();
                String btitle = soccerbTeam.select("span:nth-child(2)").text();
                int bmatch = Integer.parseInt(soccerbTeam.selectFirst("td:nth-child(3)").text());
                int bpoint = Integer.parseInt(soccerbTeam.selectFirst("td:nth-child(4)").text());
                int bvictory = Integer.parseInt( soccerbTeam.selectFirst("td:nth-child(5)").text());
                int bdraw = Integer.parseInt(soccerbTeam.selectFirst("td:nth-child(6)").text());
                int bdefeat = Integer.parseInt(soccerbTeam.selectFirst("td:nth-child(7)").text());
                int bdiff = Integer.parseInt(soccerbTeam.selectFirst("td:nth-child(10)").text());

                teambDataList.add(new TeambDTO(brank, bimage, btitle, bmatch, bpoint, bvictory, bdraw, bdefeat, bdiff));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return teambDataList;
    }
}