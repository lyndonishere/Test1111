package com.training.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue = "com/training/steps")


public class TestRunner {

    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.out.println("This runs before");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/features/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void teardown(){
        System.out.println("This runs after");

        driver.quit();
    }
}
