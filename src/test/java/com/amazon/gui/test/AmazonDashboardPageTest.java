package com.amazon.gui.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonDashboardPageTest {

    @Test
    public void testAmazon() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnjKumar\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.close();
    }

}
