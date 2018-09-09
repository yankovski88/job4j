package ru.job4j.calculator; // берем из класса Калькулятор и тестируем его.

import org.junit.Test; //нужно для автоматического тестирования

import static org.hamcrest.core.Is.is; // этот класс нужен чтоб вставить данные для сравнения.
import static org.junit.Assert.assertThat; // из этого класса взяли assertThat.
// перед названием класса сделал javaDoc.
// код проверил на правильное оформление Ctrl + Alt + i.
// проверил на анализ кода.
// green square right top
/**
 * test for vichetania.
 @author yankovski.
 */
public class CalculatorTestVichet {  //
    @Test // нужно поставить для автоматического теста
    // ругается javaDoc на комент ниже

    public void whenVichetOneMinusOneThenZero () { // обозвать when что делаем Then что ждем
        Calculator calc_vichet = new Calculator(); // в классе Calculator (ссылоч. перем) создали переменную с нов Калкул
        calc_vichet.add (1, 1); // в классе Calculator есть метод add в него добавили по 1 1
        double result_vichet = calc_vichet.getResult(); // with help metod getResult() we got result
        int expected_vichet = 0; // enter our waiting result
        assertThat (result_vichet, is(expected_vichet)); // have comparison (сравнение)

    }
}
