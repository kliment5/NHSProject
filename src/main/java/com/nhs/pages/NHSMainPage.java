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



    public String getFirstCardNumber(){
        return BrowserUtils.getText(patientsWithRooms);
    }

    public String getSecondCardNumber(){
        return BrowserUtils.getText(patientsWaiting);
    }

    public String getThirdCardNumber(){
        return BrowserUtils.getText(freeRooms);
    }

}
