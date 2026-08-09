package com.nandini.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By homePageLogo = By.xpath("//img[@alt='Website for automation practice']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(homePageLogo).isDisplayed();
    }
}