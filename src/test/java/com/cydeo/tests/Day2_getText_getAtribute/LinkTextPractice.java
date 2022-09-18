package com.cydeo.tests.Day2_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

//        3- Click to A/B Testing from top of the list.
        //  driver.findElement(By.linkText("\"A/B Testing\"")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

//        4- Verify title is:Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("No A/B test title verification passed");
        } else {
            System.out.println("\"No A/B test title verification Failed\"");
        }
        Thread.sleep(3000);

//        5- Go back to home page by using the .back();
        driver.navigate().back();

        Thread.sleep(3000);

//        6- Verify title equals:Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Practice page title verification passed");
        } else {
            System.out.println("Practice page title verification Failed\"");


        }
        driver.quit();
    }
}
