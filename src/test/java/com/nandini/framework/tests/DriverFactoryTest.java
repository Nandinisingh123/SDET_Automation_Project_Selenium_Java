package com.nandini.framework.tests;

import com.nandini.framework.driver.BrowserType;
import com.nandini.framework.driver.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DriverFactoryTest {

    @Test
    public void verifyChromeDriver() {

        WebDriver driver =
                DriverFactory.createDriver(BrowserType.CHROME);

        driver.get("https://automationexercise.com");

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}