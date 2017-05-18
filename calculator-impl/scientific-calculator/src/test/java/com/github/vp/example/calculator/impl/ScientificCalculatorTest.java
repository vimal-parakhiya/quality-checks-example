package com.github.vp.example.calculator.impl;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

/**
 * Created by vimalpar on 19/05/17.
 */
public class ScientificCalculatorTest {
    private ScientificCalculator calculator = new ScientificCalculator();
    @Test
    public void add() throws Exception {
        assertThat(calculator.add(5.5, 4.4)).isEqualTo(9.9);
    }

    @Test
    public void substract() throws Exception {
        assertThat(calculator.substract(5.5, 4.4)).isCloseTo(1.1, withPercentage(0.1));
    }

    @Test
    public void multiply() throws Exception {
        assertThat(calculator.multiply(5.4, 2)).isEqualTo(10.8);
    }

    @Test
    public void divide() throws Exception {
        assertThat(calculator.divide(5.4, 2)).isEqualTo(2.7);
    }

}