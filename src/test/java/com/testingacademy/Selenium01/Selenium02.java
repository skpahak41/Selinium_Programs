package com.testingacademy.Selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void testMethod(){
        // Inportant concept oops
        // interface interfaceRef = new Class();
        // 1. Inheritance
        // 2. Upcasting - Dynamic Dispatch.

        WebDriver driver = new EdgeDriver();
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2  = new SafariDriver();
        WebDriver driver3 = new FirefoxDriver();
        WebDriver driver4= new InternetExplorerDriver();

    }

}
