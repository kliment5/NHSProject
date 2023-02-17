package com.nhs.stepdefinitions;

import com.Utils.ConfigReader;
import com.Utils.DriverHelper;
import com.nhs.pages.NHSLoginPage;
import com.nhs.pages.NHSMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NHSStepDef {

    WebDriver driver = DriverHelper.getDriver();
    NHSLoginPage loginPage = new NHSLoginPage(driver);
    NHSMainPage mainPage = new NHSMainPage(driver);


    @Given("User navigates to the NHS website")
    public void user_navigates_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("nhsurl"));
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String userName, String passWord) {
        loginPage.logIn(userName, passWord);
    }

    @Then("User validates title {string} and url {string}")
    public void user_validates_title_and_url(String title, String url) {
        Assert.assertEquals(title, driver.getTitle());
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Then("User validates there are three cards visible")
    public void user_validates_there_are_three_cards_visible() {
        Assert.assertEquals();
    }

}
