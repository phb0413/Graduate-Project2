package com.Spring.Graduate.Project.Suwon.Service;

import com.Spring.Graduate.Project.Suwon.Entity.SuwonRestaurant;
import com.Spring.Graduate.Project.Suwon.JPARepository.SRestaurantRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SuwonCrawling {
    @Autowired
    private SRestaurantRepository srestaurantRepository;

    @Transactional
    public void SuwonCrawlAndSave(){
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\Graduate-Project\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        try {
            String url = "https://www.diningcode.com/search.dc?query=%EC%88%98%EC%9B%90%EC%A2%85%ED%95%A9%EC%9A%B4%EB%8F%99%EC%9E%A5&keyword=%ED%98%BC%EB%B0%A5";
            driver.get(url);

            WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-gLLvby.qLVfB.Poi__List"));

            for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
                String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
                String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
                String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Hash > strong")).getText();
                String rating = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

                srestaurantRepository.save(new SuwonRestaurant(name, imageUrl, category, rating));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            String url = "https://www.diningcode.com/search.dc?query=%EC%88%98%EC%9B%90%EC%A2%85%ED%95%A9%EC%9A%B4%EB%8F%99%EC%9E%A5&keyword=%EA%B0%80%EC%A1%B1%EC%99%B8%EC%8B%9D";
            driver.get(url);

            WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-gLLvby.qLVfB.Poi__List"));

            for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
                String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
                String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
                String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Hash > strong")).getText();
                String rating = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

                srestaurantRepository.save(new SuwonRestaurant(name, imageUrl, category, rating));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }
}
