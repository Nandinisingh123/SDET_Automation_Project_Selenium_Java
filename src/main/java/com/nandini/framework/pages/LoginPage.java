package com.nandini.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By loginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    private final By emailField = By.xpath("//input[@data-qa='login-email']");
    private final By passwordField = By.xpath("//input[@data-qa='login-password']");
    private final By loginButton = By.xpath("//button[@data-qa='login-button']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginLink() {
        click(driver.findElement(loginLink));
    }

    public void enterEmail(String email) {
        type(driver.findElement(emailField), email);
    }

    public void enterPassword(String password) {
        type(driver.findElement(passwordField), password);
    }

    public void clickLoginButton() {
        click(driver.findElement(loginButton));
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}