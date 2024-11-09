package com.testingacademy;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02 {
    @Test
    @Description("Verify the title of the Testacademy website.")
    public void vwoLogin(){



        WebDriver driver = new EdgeDriver();
        driver.get("https://courses.thetestingacademy.com");
        System.out.println(driver.getTitle());

    }
}
