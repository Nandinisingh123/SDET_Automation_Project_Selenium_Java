package com.nandini.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.nandini.framework.utils.WaitUtils;

public class BasePage {

    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver, 10);
    }

    protected void click(By locator) {
        waitUtils.waitForClickable(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = waitUtils.waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return waitUtils.waitForVisibility(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        return waitUtils.waitForVisibility(locator).isDisplayed();
    }
}