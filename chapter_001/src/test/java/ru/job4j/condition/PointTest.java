package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class PointTest {
    /**
     * Тест проверяющий работу метода вычисляющего расстояние между
     * точками
     */
    @Test
    public void whenPointZeroOneTwoFiveThenFourFour() { // обозвать when что делаем Then что ждем
        Point a = new Point(0, 1);// создаем объект первой точки
        Point b = new Point(2, 5);//создаем  объект второй точки
        double dist = a.distanceTo(b);//вычисляем расстояние и сохраняем его в переменную dist
        double expected = 4.47213595499958; // ожидаемый результат
        assertThat(dist, is(expected )); //сравниваем то что получили с ожидаемым результатом
    }
}
