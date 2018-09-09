package ru.job4j.calculator; // берем из класса Калькулятор и тестируем его.

import org.junit.Test; //нужно для автоматического тестирования

import static org.hamcrest.core.Is.is; // этот класс нужен чтоб вставить данные для сравнения.
import static org.junit.Assert.assertThat; // из этого класса взяли assertThat.
// перед названием класса сделал javaDoc.
// код проверил на правильное оформление Ctrl + Alt + i.
// проверил на анализ кода.
// green square right top
/**
 * test for Division.
 @author yankovski.
 */
public class CalculatorTestDivision {  //
    @Test // нужно поставить для автоматического теста
    // ругается javaDoc на комент ниже

    public void whenDivisionSixDivisionTwoThenThree () { // обозвать when что делаем Then что ждем
        Calculator calc_division = new Calculator(); // в классе Calculator (ссылоч. перем) создали переменную с нов Калкул
        calc_division.add (6, 2); // в классе Calculator есть метод add в него добавили по 6 2
        double result_division = calc_division.getResult(); // with help metod getResult() we got result
        int expected_division = 3; // enter our waiting result
        assertThat (result_division, is(expected_division)); // have comparison (сравнение)

    }
}
