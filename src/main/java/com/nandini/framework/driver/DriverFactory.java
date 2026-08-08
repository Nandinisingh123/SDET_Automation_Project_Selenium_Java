package com.nandini.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    public static WebDriver createDriver(BrowserType browserType) {

        switch (browserType) {

            case CHROME:
                return new ChromeDriver();

            case EDGE:
                return new EdgeDriver();

            case FIREFOX:
                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException(
                        "Unsupported browser: " + browserType
                );
        }
    }
}