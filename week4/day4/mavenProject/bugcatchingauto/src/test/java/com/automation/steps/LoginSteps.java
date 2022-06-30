package com.automation.steps;

import static org.junit.Assert.assertEquals;

import java.sql.Time;
import java.util.Timer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

        //BOTH LOGIN
        @Given("the employee is on the login page")
        public void the_employee_is_on_the_login_page() {
        TestRunner.driver.get("C:/Users/lyndo/Revature Training/week4/day4/mavenProject/bugcatchingauto/src/test/resources/web-pages/login.html");
        }
        @When("the employee clicks on the login button")
        public void the_employee_clicks_on_the_login_button(){
            TestRunner.login.clickButton();
        }

        //MANAGER LOGIN
        @When("the manager enters his username")
        public void the_manager_enters_his_username() {
            TestRunner.login.enterUsername("bigboss");
        }
        @When("the manager enters his password")
        public void the_manager_enters_his_password() {
            TestRunner.login.enterPassword("password");
        }
        @Then("the manager should be logged into the manager home page")
        public void the_manager_should_be_logged_into_the_manager_home_page() {
            TestRunner.wait.until(ExpectedConditions.titleIs("Manager Page"));
            String title = TestRunner.driver.getTitle();
            Assert.assertEquals("Manager Page", title);
        }

        //TESTER LOGIN
        @When("the tester enters his username")
        public void the_tester_enters_his_username() {
            TestRunner.login.enterUsername("loron6563");
        }
        @When("the tester enters his password")
        public void the_tester_enters_his_password() {
            TestRunner.login.enterPassword("password");
        }
        @Then("the tester should be logged into the tester home page")
        public void the_tester_should_be_logged_into_the_tester_home_page() {
            TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
            String title = TestRunner.driver.getTitle();
            Assert.assertEquals("Tester Page", title);
        }

        //MANGER CREATES DEFECT
        @Given("the manager is on the manager page")
        public void the_manager_is_on_the_manager_page() {
            TestRunner.driver.get("C:/Users/lyndo/Revature Training/week4/day4/mavenProject/bugcatchingauto/src/test/resources/web-pages/managerPage.html");
        }
        @When("the manager enters a defect description")
        public void the_manager_enters_a_defect_description() {
            // Write code here that turns the phrase above into concrete actions
            TestRunner.manager.enterDefectDescription("This descriprion was autoinputed via selenium");
        }
        @When("the manager selects a tester")
        public void the_manager_selects_a_tester() {
            TestRunner.manager.selectedTester("Loron Smyth");
        }
        @When("the manager clicks the assign button")
        public void the_manager_clicks_the_assign_button() {
            TestRunner.manager.clickAssignButton();
        }
        @Then("the manager should have created and assigned a defect")
        public void the_manager_should_have_created_and_assigned_a_defect() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String alertText = TestRunner.driver.switchTo().alert().getText();
            assertEquals("You have just submitted your defect", alertText);
            TestRunner.driver.switchTo().alert().accept();
        }
        
        //TESTER REPEATS
        @Given("the tester is on the tester page")
        public void the_tester_is_on_the_tester_page() {
            TestRunner.driver.get("C:/Users/lyndo/Revature Training/week4/day4/mavenProject/bugcatchingauto/src/test/resources/web-pages/login.html");
            TestRunner.login.enterUsername("loron6563");
            TestRunner.login.enterPassword("password");
            TestRunner.login.clickButton();
            // TestRunner.driver.get("C:/Users/lyndo/Revature Training/week4/day4/mavenProject/bugcatchingauto/src/test/resources/web-pages/testerPage.html");
            TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
            
        }
        @When("the tester selects a pending defect")
        public void the_tester_selects_a_pending_defect() {
            TestRunner.tester.pendingSelection(0);
        }
        @When("the tester clicks the pull pending defect button")
        public void the_tester_clicks_the_pull_pending_defect_button() {
            TestRunner.tester.pullPending();
            TestRunner.wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("defectDescPull"), "This descriprion was autoinputed via selenium"));
        }
        
        //FOR ACCEPTED
        @When("the tester selects an accepted defect")
        public void the_tester_selects_an_accepted_defect() {
            TestRunner.tester.acceptedSelection(0);
        }
        @When("the tester clicks the pull accepted defect button")
        public void the_tester_clicks_the_pull_accepted_defect_button() {
            TestRunner.tester.pullAccepted();
        }

        //TESTER ACCEPTS
        @When("the tester clicks the accept button")
        public void the_tester_clicks_the_accept_button() {
            TestRunner.tester.acceptButton();
            // WebElement button = TestRunner.driver.findElement(By.id("acceptButton"));
            // button.click();

        }
        @Then("the defect should have status accepted")
        public void the_defect_should_have_status_accepted() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String alertText = TestRunner.driver.switchTo().alert().getText();
            assertEquals("You Accepted the Current Defect", alertText);
            TestRunner.driver.switchTo().alert().accept();
        }
        
        //TESTER DECLINES
        @When("the tester clicks the decline button")
        public void the_tester_clicks_the_decline_button() {
            TestRunner.tester.declineButton();
        }
        @Then("the defect should have status declined")
        public void the_defect_should_have_status_declined() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String alertText = TestRunner.driver.switchTo().alert().getText();
            assertEquals("You Declined the Current Defect", alertText);
            TestRunner.driver.switchTo().alert().accept();
        }
        
        //TESTER REJECTS
        @When("the tester selects the reject option")
        public void the_tester_selects_the_reject_option() {
            TestRunner.tester.rejectedButton();
        }
        @Then("the defect should have status rejected")
        public void the_defect_should_have_status_rejected() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String alertText = TestRunner.driver.switchTo().alert().getText();
            assertEquals("You Rejected the Current Defect", alertText);
            TestRunner.driver.switchTo().alert().accept();
        }
        
        //TESTER FIXES
        @When("the tester selects the fixed option")
        public void the_tester_selects_the_fixed_option() {
            TestRunner.tester.fixedButton();
        }
        @Then("the defect should have status fixed")
        public void the_defect_should_have_status_fixed() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String alertText = TestRunner.driver.switchTo().alert().getText();
            assertEquals("You Fixed the Current Defect", alertText);
            TestRunner.driver.switchTo().alert().accept();
        }
        
        //TESTER SHELVES
        @When("the tester selects the shelved option")
        public void the_tester_selects_the_shelved_option() {
            TestRunner.tester.shelvedButton();
        }
        @Then("the defect should have status shelved")
        public void the_defect_should_have_status_shelved() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String alertText = TestRunner.driver.switchTo().alert().getText();
            assertEquals("You Shelved the Current Defect", alertText);
            TestRunner.driver.switchTo().alert().accept();
        }
        

}
