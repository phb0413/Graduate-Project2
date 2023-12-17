package com.Spring.Graduate.Project.Seoul.Crawling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DiningcodeScraper {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\Graduate-Project\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Chrome 브라우저를 시작
        WebDriver driver = new ChromeDriver(options);

        // 웹 페이지 열기
        driver.get("https://www.diningcode.com/search.dc?query=%EC%83%81%EC%95%94%EC%9B%94%EB%93%9C%EC%BB%B5%EA%B2%BD%EA%B8%B0%EC%9E%A5");

        // 맛집 정보 가져오기
        WebElement restaurantContainer = driver.findElement(By.cssSelector("div.sc-gLLvby.qLVfB.Poi__List"));

        // 각 맛집 정보 순회
        for (WebElement restaurant : restaurantContainer.findElements(By.tagName("li"))) {
            String name = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.InfoHeader > h1")).getText();
            String imageUrl = restaurant.findElement(By.cssSelector(" a > div.RHeader > img")).getAttribute("src");
            String category = restaurant.findElement(By.cssSelector("a > div.RHeader > div > div.Poi__Info__Middle > p.Category > span:nth-child(1)")).getText();
            String rating = restaurant.findElement(By.cssSelector(" a > div.RHeader > div > div.Rate > p.UserScore")).getText();



            saveToDatabase(name, imageUrl, category, rating);

        }
        driver.quit();
    }

    private static void saveToDatabase(String name, String imageUrl, String category, String rating) {
        try {
            // MySQL 연결
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seoul", "root", "1234");

            // SQL 쿼리 작성
            String insertQuery = "INSERT INTO matzip_tbl (m_name, m_img, m_category, m_rating ) VALUES (?, ?, ?, ?)";

            // PreparedStatement 생성
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // 파라미터 설정
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, imageUrl);
            preparedStatement.setString(3, category);
            preparedStatement.setString(4, rating);

            // 쿼리 실행
            preparedStatement.executeUpdate();

            // 리소스 정리
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

