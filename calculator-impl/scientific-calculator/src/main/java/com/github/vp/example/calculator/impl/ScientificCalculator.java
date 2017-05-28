package com.github.vp.example.calculator.impl;

import com.github.vp.example.calculator.Calculator;

/**
 * Created by vimalpar on 07/05/17.
 */
public class ScientificCalculator implements Calculator {
    public double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public double substract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public double divide(double operand1, double operand2) {
        int[] intArray = new int[10];
        int[] anotherArray = new int[10];
        for (int i=0; i<intArray.length; ++i) {
            anotherArray[i] = intArray[i];
        }
        return operand1 / operand2;
    }

}
