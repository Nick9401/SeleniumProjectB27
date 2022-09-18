package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        driver.manage().window().maximize();


        String URL = "cydeo";
        String expectURL = driver.getCurrentUrl();

        String title = "Practice";
        String expectTitle = driver.getTitle();


        if (expectURL.equalsIgnoreCase(URL)){
            System.out.println("URL contains Cydeo");
        } else{
            System.out.println("URL does not contains Cydeo");

               Thread.sleep(5000);

            if (title.equals(expectTitle)){
                System.out.println("Title contains Practice");
            }else{
                System.out.println("Title doesnt contains Practice");
            }
            driver.quit();
        }
    }
}
