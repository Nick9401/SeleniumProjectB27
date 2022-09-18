package com.cydeo.tests.Home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3Backandforthnavigation {

//1- Open a chrome browser
//2- Go to: https://google.com
// 3- Click to Gmail from top right.
//4- Verify title contains:Expected: Gmail
//5- Go back to Google by using the .back();
//6- Verify title equals:Expected: Google




    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com ");

        WebElement gmailButtom = driver.findElement(By.linkText("Gmail"));

        String ExpectedTitle = "Gmail";
        String ActualTitle = gmailButtom.getText();

        if (ActualTitle.contains(ExpectedTitle)){
            System.out.println("Confirm");
        }else {
            System.out.println("Reject");
        }

        driver.navigate().back();


        String ExpectGoogle = "Google";
        String ActualOutput = driver.getTitle();

        if(ActualOutput.equals(ExpectGoogle)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        driver.quit();








    }
}
