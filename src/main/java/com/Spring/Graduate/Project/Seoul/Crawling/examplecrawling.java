package com.Spring.Graduate.Project.Seoul.Crawling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class examplecrawling {
    public static void main(String[] args) {
        // ChromeDriver 경로를 다운로드한 드라이버의 경로로 설정
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\Graduate-Project\\chromedriver.exe");

        // Chrome 브라우저를 시작
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // 웹 페이지 열기
        driver.get("https://www.diningcode.com/search.dc?query=%EC%83%81%EC%95%94%EC%9B%94%EB%93%9C%EC%BB%B5%EA%B2%BD%EA%B8%B0%EC%9E%A5");

        // 맛집 정보 가져오기
        WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-gLLvby.qLVfB.Poi__List"));

        // 각 맛집 정보 순회
        for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
            String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
            String imageUrl = restaurant.findElement(By.cssSelector("a > div.RHeader > img")).getAttribute("src");
            String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Category > span:nth-child(1)")).getText();
            String rating =restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Rate > p.UserScore")).getText();

            // 추출한 데이터 출력 또는 다른 작업 수행
            System.out.println("맛집 이름: " + name);
            System.out.println("맛집 이미지 URL: " + imageUrl);
            System.out.println("맛집 카테고리: " + category);
            System.out.println("맛집 별점: " + rating);
            System.out.println("--------------------------------");
        }

        // 브라우저 종료
        driver.quit();
    }
}
