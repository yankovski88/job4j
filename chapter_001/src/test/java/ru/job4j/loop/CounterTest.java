package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test

    public void whenEnterInAddStartFinishThenSumChetNumber(){
        int start = 1;
        int finish = 10;
        int expect = 30;
        Counter counter = new Counter();
        int result = counter.add(start, finish);
        assertThat(result, is(expect));
    }

}
//    @Test
//    public void manWeight() {
//        Fit fit = new Fit();
//        double weight = fit.manWeight(180);
//        assertThat(weight, closeTo(92.0, 0.1));
//        /*
//        В этом тесты мы используем метод closeTo - Он нужен что сравнения чисел с плавающей точкой.
//closeTo(value, round)
//value - это ожидаемое значение
//round - это диапазон в округ значения. например, если round = 0.1, то диапазон будет [value - 0.1, value + 0.1];
//Ожидаемое значение должно попасть в этот диапазон.
//         */
//    }


//public class CalculateTest {
//    ///**
//     * Test echo.
//     */
//    @Test
//    public void whenTakeNameThenTreeEchoPlusName() {
//        String input = "Petr Arsentev";
//        String expect = "Echo, echo, echo : Petr Arsentev";
//        Calculate calc = new Calculate();
//        String result = calc.echo(input);
//        assertThat(result, is(expect));
//    }
//
//}