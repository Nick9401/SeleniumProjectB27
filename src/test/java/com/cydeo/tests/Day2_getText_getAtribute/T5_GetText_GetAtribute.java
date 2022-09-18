package com.cydeo.tests.Day2_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAtribute {
    public static void main(String[] args) {




//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/registration_form
//3- Verify header text is as expected:Expected: Registration form
//4- Locate “First name” input box
//5- Verify placeholder attribute’s value is as expected:Expected: first name

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");



       // 3- Verify header text is as expected:Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header test verification passed!");
        }

//4- Locate “First name” input box
        WebElement firstanameInput = driver.findElement(By.name("firstname"));


        String expecteedPlaceHolder = "first name";
        String actualPlaceholde = firstanameInput.getAttribute("palceholder");
//5- Verify placeholder attribute’s value is as expected:Expected: first name
        if (actualPlaceholde.equals(expectedHeader)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


        driver.quit();


}}
