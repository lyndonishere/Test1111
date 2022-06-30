package com.automation.poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Manager {
    private WebDriver driver;

    @FindBy(id = "defectDesc")
    public WebElement defectDescription;

    @FindBy(id = "testerSelect")
    public WebElement selectedTester;
    
    @FindBy(id = "testerAssign")
    public WebElement assignButton;

    public Manager(WebDriver driver){
        this.driver = driver;   //This initializes private field

        //PageFactory from selenium, we provide the initElements() with the driver above 
        PageFactory.initElements(driver,this);
    }

    public void enterDefectDescription(String defectDescription){
        this.defectDescription.sendKeys(defectDescription);
    }

    public void selectedTester(String testerSelected){
        Select dropdown = new Select(this.selectedTester);
        dropdown.selectByVisibleText(testerSelected);
        
    }
    public void clickAssignButton(){
        this.assignButton.click();

    }
}
