package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.calculator.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test // нужно поставить для автоматического теста
    // ругается javaDoc на комент ниже

    public void whenPointZeroOneTwoFiveThenFourFour () { // обозвать when что делаем Then что ждем
        Point poin = new Point(0, y: 1); //
        poin.distanceTo (2, y: 2); //
        double result = poin.getResult(); //
        double expected_division = 4.4; // enter our waiting result
        assertThat (result, is(expected_division)); // have comparison (сравнение)

    }
}

