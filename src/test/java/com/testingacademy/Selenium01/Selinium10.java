package com.testingacademy.Selenium01;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


// Open app.vwo.com
// Print the title and get the Current URL
// Verify the Current URL is ap.vwo.com

public class Selinium10 {
    @Test(groups = "QA")
    @Description("Verify the URL, title of vwo app")

    public void testVWOLogin(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"login - vwo");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

    }
}
