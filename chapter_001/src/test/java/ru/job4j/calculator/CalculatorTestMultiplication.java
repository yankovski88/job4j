package ru.job4j.calculator;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
// перед названием класса сделал javaDoc.
// код проверил на правильное оформление Ctrl + Alt + i.
// проверил на анализ кода.
// green square right top
/**
 * test for umnojenie.
 @author yankovski.
 */
public class CalculatorTestMultiplication {
    @Test
    public void  whenMultiplicationThreeMultiplicationThreeThenNight() {
        Calculator calc_multiplication = new Calculator();
        calc_multiplication.add(3, 3);
        double result_multiplication = calc_multiplication.getResult();
        int expected_multiplication = 9;
        assertThat (result_multiplication, is (expected_multiplication));

    }
}

