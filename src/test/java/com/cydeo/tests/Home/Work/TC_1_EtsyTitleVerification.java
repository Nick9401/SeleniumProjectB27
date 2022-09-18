package com.cydeo.tests.Home.Work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_EtsyTitleVerification {
    public static void main(String[] args) {


//1. Open Chrome browser
//2. Go to https://www.etsy.com
//3. Search for “wooden spoon”
//4. Verify title:Expected: “Wooden spoon | Etsy”

//1
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//2
        driver.get("https://www.etsy.com");
//3
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
//4
        String expectTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (expectTitle.equals(actualTitle)){
            System.out.println("Etsy");
        }else{
            System.out.println("False");
        }

       driver.quit();

    }
}
