package com.Spring.Graduate.Project.Incheon.Service;

import com.Spring.Graduate.Project.Incheon.Entity.IncheonRestaurant;
import com.Spring.Graduate.Project.Incheon.JPARepository.IRestaurantRepository;
import com.Spring.Graduate.Project.Suwon.Entity.SuwonRestaurant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IncheonCrawling {
    @Autowired
    private IRestaurantRepository irestaurantRepository;

    @Transactional
    public void IncheonCrawlAndSave(){
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\Graduate-Project\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        try {
            String url = "https://www.diningcode.com/search.dc?query=%EB%8F%84%EC%9B%90%EC%97%AD&keyword=%ED%98%BC%EB%B0%A5";
            driver.get(url);

            WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-gLLvby.qLVfB.Poi__List"));

            for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
                String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
                String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
                String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Hash > strong")).getText();
                String rating = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

                irestaurantRepository.save(new IncheonRestaurant(name, imageUrl, category, rating));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            String url = "https://www.diningcode.com/search.dc?query=%EB%8F%84%EC%9B%90%EC%97%AD&keyword=%EA%B0%80%EC%A1%B1%EC%99%B8%EC%8B%9D";
            driver.get(url);

            WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-gLLvby.qLVfB.Poi__List"));

            for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
                String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
                String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
                String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Hash > strong")).getText();
                String rating = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

                irestaurantRepository.save(new IncheonRestaurant(name, imageUrl, category, rating));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }
}
