package com.automation.poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tester {
    private WebDriver driver;

    @FindBy(id = "defectDescPull")
    public WebElement defectDesc;

    @FindBy(id = "defectSelect")
    public WebElement defectSelector;
    @FindBy(id = "selectDefect")
    public WebElement pendingPullButton;

    @FindBy(id = "defectDeclined")
    public WebElement declinedSelector;
    @FindBy(id = "declinedDefect")
    public WebElement declinedPullButton;

    @FindBy(id = "defectAccepted")
    public WebElement acceptedSelector;
    @FindBy(id = "acceptedDefect")
    public WebElement acceptedPullButton;

    @FindBy(xpath = "//*[@id='acceptButton']")
    public WebElement acceptButton;
    @FindBy(id = "declineButton")
    public WebElement declineButton;

    @FindBy(id = "Rejected Button")
    public WebElement rejectButton;
    @FindBy(id = "Fixed Button")
    public WebElement fixedButton;
    @FindBy(id = "Shelved Button")
    public WebElement shelvedButton;
    @FindBy(id = "Pending Button")
    public WebElement pendingButton;
    // @FindBy(xpath = "//*[@id='acceptedAction']")
    // public WebElement acceptedAction;
    // @FindBy(id = "updateButton")
    // public WebElement updateButton;
    
    




    
    public Tester(WebDriver driver){
        this.driver = driver;   //This initializes private field

        //PageFactory from selenium, we provide the initElements() with the driver above 
        PageFactory.initElements(driver,this);
    }


    public void pullPending(){
        this.pendingPullButton.click();

    }
    public void pullDeclined(){
        this.declinedPullButton.click();

    }
    public void pullAccepted(){
        this.acceptedPullButton.click();

    }

    public void acceptButton(){
        this.acceptButton.click();

    }
    public void declineButton(){
        this.declineButton.click();
    }

    public void pendingSelection(int defectID){
        Select dropdown = new Select(this.defectSelector);
        dropdown.selectByIndex(defectID);
    }
    public void declinedSelection(int defectID){
        Select dropdown = new Select(this.declinedSelector);
        dropdown.selectByIndex(defectID);
    }
    public void acceptedSelection(int defectID){
        Select dropdown = new Select(this.acceptedSelector);
        dropdown.selectByIndex(defectID);
    }

    public void rejectedButton(){
        this.rejectButton.click();
    }
    public void shelvedButton(){
        this.shelvedButton.click();
    }
    public void fixedButton(){
        this.fixedButton.click();
    }
    public void pendingButton(){
        this.pendingButton.click();
    }


    // public void acceptedSelection(int defectID){
    //     Select dropdown = new Select(this.acceptedSelector);
    //     dropdown.selectByIndex(defectID);;
    // }
    // 0 Invalid/Rejected
    // 1 Fixed
    // 2 Shelved
    // 3 Return to Pending

}
