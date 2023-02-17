package com.nhs.stepdefinitions;

import com.Utils.BrowserUtils;
import com.Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class NHSHook {

    public WebDriver driver;

    @Before
    public void setup(){
        driver = DriverHelper.getDriver();
    }

    @After
    public void tearDown(){
        BrowserUtils.getScreenShot(driver, "nhs");
        driver.quit();
    }

}
