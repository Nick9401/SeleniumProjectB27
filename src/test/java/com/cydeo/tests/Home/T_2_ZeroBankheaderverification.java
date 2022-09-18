package com.cydeo.tests.Home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_2_ZeroBankheaderverification {

//1. Open Chrome browser
//2. Go to http://zero.webappsecurity.com/login.html
//3. Verify header text Expected: “Log in to ZeroBank”



    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement headerText = driver.findElement(By.tagName("h3"));

        String ExpectName = "Log in to ZeroBank";
        String actualName = headerText.getText();

        if (actualName.equals(ExpectName)) {
            System.out.println("Pass");
        } else {
            System.out.println("false");
        }
        driver.quit();
    }
}
