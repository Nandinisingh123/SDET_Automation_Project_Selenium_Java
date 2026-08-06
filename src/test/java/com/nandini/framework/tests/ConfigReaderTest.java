package com.nandini.framework.tests;

import com.nandini.framework.config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigReaderTest {

    @Test
    public void verifyConfigFile() {

        String browser = ConfigReader.getProperty("browser");

        Assert.assertEquals(browser, "chrome");

    }

}