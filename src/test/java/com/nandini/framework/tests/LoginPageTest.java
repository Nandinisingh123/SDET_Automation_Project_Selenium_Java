package com.nandini.framework.tests;

import com.nandini.framework.pages.LoginPage;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void verifyLoginPage() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickLoginLink();

        loginPage.login(
                "your-email@example.com",
                "your-password"
        );
    }
}