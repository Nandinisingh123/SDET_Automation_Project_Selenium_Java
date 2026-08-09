// package com.nandini.framework.tests;

// import org.testng.Assert;
// import org.testng.annotations.Test;

// public class HomePageTest extends BaseTest {

//     @Test
//     public void verifyHomePageTitle() {

//         String title = driver.getTitle();

//         System.out.println("Page title: " + title);

//         Assert.assertEquals(
//                 title,
//                 "Automation Exercise"
//         );
//     }
// }
package com.nandini.framework.tests;

import com.nandini.framework.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageDisplayed() {

        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed"
        );
    }
}