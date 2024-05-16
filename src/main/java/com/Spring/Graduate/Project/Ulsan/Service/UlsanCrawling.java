package com.Spring.Graduate.Project.Ulsan.Service;

import com.Spring.Graduate.Project.Pohang.Entity.PohangRestaurant;
import com.Spring.Graduate.Project.Ulsan.Entity.UlsanRestaurant;
import com.Spring.Graduate.Project.Ulsan.JPARepository.URestaurantRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UlsanCrawling {
    @Autowired
    private URestaurantRepository uRestaurantRepository;

    @Transactional
    public void UlsanCrawlAndSave(){
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\Graduate-Project\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        try {
            String url = "https://www.diningcode.com/search.dc?query=%EC%9A%B8%EC%82%B0%EB%AC%B8%EC%88%98%EC%9B%94%EB%93%9C%EC%BB%B5%EA%B2%BD%EA%B8%B0%EC%9E%A5&keyword=%ED%98%BC%EB%B0%A5";
            driver.get(url);

            WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-jTQDnj.huwjaA.Poi__List"));

            for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
                String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
                String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
                String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Hash > span")).getText();
                String rating = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

                uRestaurantRepository.save(new UlsanRestaurant(name, imageUrl, category, rating));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            String url = "https://www.diningcode.com/search.dc?query=%EC%9A%B8%EC%82%B0%EB%AC%B8%EC%88%98%EC%9B%94%EB%93%9C%EC%BB%B5%EA%B2%BD%EA%B8%B0%EC%9E%A5&keyword=%EA%B0%80%EC%A1%B1%EC%99%B8%EC%8B%9D";
            driver.get(url);

            WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-jTQDnj.huwjaA.Poi__List"));

            for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
                String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
                String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
                String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Hash > span")).getText();
                String rating = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

                uRestaurantRepository.save(new UlsanRestaurant(name, imageUrl, category, rating));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }
}
