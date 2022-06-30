package com.tdd.calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTests {
    
    public static Calculatorinterface calculator;

    @BeforeClass
    public static void setup() {
        calculator = new Calculator(); //initializes calculator field
        
    }

    @Test
    public void additionTest() {
        Assert.assertEquals(10, calculator.addition(5, 5));
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(0, calculator.subtraction(5, 5));
    }

    @Test
    public void mutliplicationTest() {
        Assert.assertEquals(25, calculator.mutliplication(5, 5));
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals(5, calculator.division(10, 2));
    }

}
