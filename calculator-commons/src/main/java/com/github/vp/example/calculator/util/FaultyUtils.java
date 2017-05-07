package com.github.vp.example.calculator.util;

/**
 * Created by vimalpar on 07/05/17.
 */
public class FaultyUtils {
    public static void FaultyFunction() {
        int x = 10;
        int y=10;
        if(x > y) {
            if(x > y) {

            }
        }
    }

    public static void duplicateFunction1() {
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

    public static void duplicateFunction2() {
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

    public static void foo(int[] input) {
        input[100] = 100;
    }
}

