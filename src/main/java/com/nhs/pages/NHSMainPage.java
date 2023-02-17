package com.nhs.pages;

import com.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSMainPage {

    public NHSMainPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//img[@alt='NHS Patients Manager']")
    WebElement title;

    @FindBy (id = "patients-with-rooms-live")
    WebElement patientsWithRooms;

    @FindBy (id = "patients-waiting-live")
    WebElement patientsWaiting;

    @FindBy (id = "free-rooms-live")
    WebElement freeRooms;


    public void validateTitle(WebDriver driver, String expectedTitle, String expectedUrl){
        Assert.assertEquals(BrowserUtils.getText(title), expectedTitle);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void validateThreeCards(String patientswithrooms, String patientswaiting, String freerooms){
        Assert.assertEquals(BrowserUtils.getText(patientsWithRooms), patientswithrooms);
        Assert.assertEquals(BrowserUtils.getText(patientsWaiting), patientswaiting);
        Assert.assertEquals(BrowserUtils.getText(freeRooms), freerooms);
    }



}
