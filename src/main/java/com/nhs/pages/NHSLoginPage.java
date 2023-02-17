package com.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSLoginPage {

    public NHSLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id='inputEmail']")
    WebElement userName;

    @FindBy (xpath = "//input[@id='inputPassword']")
    WebElement passWord;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement signInBtn;

    public void logIn(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signInBtn.click();
    }

}

