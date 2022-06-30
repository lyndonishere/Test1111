package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    //driver used in POMs thus private, only used internally in class
    private WebDriver driver;

    //They need to be referenced to outside sources so it is public
    @FindBy(id="username")
    public WebElement usernameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    //This only finds the first button on the page, for one button it is selected as the element
    @FindBy(tagName = "button")
    public WebElement loginButton;

    public Login(WebDriver driver11){
        this.driver = driver11;   //This initializes private field

        //PageFactory from selenium, we provide the initElements() with the driver above 
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        this.usernameInput.sendKeys(username);
    }
    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);

    }
    public void clickButton(){
        this.loginButton.click();

    }
}

