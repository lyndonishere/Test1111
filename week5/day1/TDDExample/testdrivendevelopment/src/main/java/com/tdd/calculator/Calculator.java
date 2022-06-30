package com.tdd.calculator;

public class Calculator implements Calculatorinterface{

    @Override
    public int addition(int numOne, int numTwo) {
        int result = numOne + numTwo;
        return result;
    }

    @Override
    public int subtraction(int numOne, int numTwo) {
        int result = numOne - numTwo;
        return result;
    }

    @Override
    public int mutliplication(int numOne, int numTwo) {
        int result = numOne * numTwo;
        return result;
    }

    @Override
    public int division(int numOne, int numTwo) {
        int result = numOne / numTwo;
        return result;
    }
    
}
