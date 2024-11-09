package com.testingacademy.Selenium01;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium04 {
    @Test
    public static void main(String[] args) {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

       //  driver.manage().window().maximize();



    }
}
