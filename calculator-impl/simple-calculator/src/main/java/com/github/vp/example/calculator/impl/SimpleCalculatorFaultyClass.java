package com.github.vp.example.calculator.impl;

/**
 * Created by vimalpar on 07/05/17.
 */
public class SimpleCalculatorFaultyClass {
    public static void FaultyFunctionInSimpleCalculator() {
        int x = 10;
        int y=10;
        if(x > y) {
            if(x > y) {

            }
        }
    }

    public static void duplicateFunction1InSimpleCalculator() {
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
    }

    public static void duplicateFunction2InSimpleCalculator() {
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
        System.out.println("Hello World in Duplicate Function...");
    }

    public static void fooInSimpleCalculator(int[] input) {
        input[10] = 10;
    }
}
