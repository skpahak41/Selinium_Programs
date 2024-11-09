package com.testingacademy.Selenium01;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium05 {
    @Test
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
