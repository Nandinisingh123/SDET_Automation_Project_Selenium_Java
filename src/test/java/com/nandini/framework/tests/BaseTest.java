package com.nandini.framework.tests;

import com.nandini.framework.config.ConfigReader;
import com.nandini.framework.driver.BrowserType;
import com.nandini.framework.driver.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        String browser = ConfigReader.getProperty("browser");

        BrowserType browserType =
                BrowserType.valueOf(browser.toUpperCase());

        driver = DriverFactory.createDriver(browserType);

        driver.manage().window().maximize();

        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}