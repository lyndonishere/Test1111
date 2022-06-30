package com.training.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.training.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikiLinkSteps {
    
    @Given("The user is on the wikipedia homepage")
    public void the_user_is_on_the_wikipedia_homepage(){
        //the get() function is used to pull a webpage easily
        TestRunner.driver.get("https://www.wikipedia.org/");
    }

    @When("The user clicks the english link")
    public void the_user_clicks_the_english_link() {
        //setting up selenium to interact with web elements and how
        //first object is created tp represent
        By englishLinkInfo = By.id("js-link-box-en");

        //
        WebElement englishLink = TestRunner.driver.findElement(englishLinkInfo);

        //Instructions given on how element to act
        englishLink.click();
        
    }

    @Then("The user should be viewing content in english")
    public void the_user_should_be_viewing_content_in_english() {
        //Checking to see if the new page has loaded via page Title change
        String actualTitle = TestRunner.driver.getTitle();

        Assert.assertEquals("Wikipedia, the free encyclopedia", actualTitle);
    }

}
