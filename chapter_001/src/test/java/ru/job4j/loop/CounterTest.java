package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
/**
 * proverka суммы на заданый диапазон.
 * @author Yura Yankovski (mailto:boets003@mail.ru)
 */
    public void whenEnterInAddStartFinishThenSumChetNumber() {
        int start = 1;
        int finish = 10;
        int expect = 30;
        Counter counter = new Counter();
        int result = counter.add(start, finish);
        assertThat(result, is(expect));
    }
}
