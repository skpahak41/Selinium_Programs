package com.testingacademy.Selenium01;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Selinium09 {
    @Test
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");

        driver.navigate().to("http://app.vwo.com");
        //driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();



    }
}
