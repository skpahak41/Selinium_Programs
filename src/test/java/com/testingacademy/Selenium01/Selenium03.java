package com.testingacademy.Selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {
    @Test
    public void TestMethod(){

        // Extension to the Edge Browser
        //youtube video - ad blocker
        // selenium = ?
        EdgeOptions  edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("headless");
        edgeOptions.addExtensions(new File("/Users/shivam/Downloads/CFHDOJBKJHNKLBPKDAIBDCCDDILIFDDB_4_9_0_0.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/@sdetpavan");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
