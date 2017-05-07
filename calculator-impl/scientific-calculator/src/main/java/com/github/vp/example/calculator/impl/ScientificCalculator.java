package com.github.vp.example.calculator.impl;

import com.github.vp.example.calculator.Calculator;

/**
 * Created by vimalpar on 07/05/17.
 */
public class ScientificCalculator implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

}
