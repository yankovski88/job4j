package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    /**
     * proverka правильность возведения в факториал 5
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    public void whenNRavnoFiveThenFactorialRavenStoTwenty() {
        int n = 5;
        int expect = 120;
        Factorial a = new Factorial();
        int result = a.calc(n);
        assertThat(result, is(expect));
    }

    @Test
    /**
     * proverka правильность возведения в факториал 0
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    public void whenNRavnoZeroThenFactorialRavenOne() {
        int t = 0;
        int exp = 1;
        Factorial b = new Factorial();
        int res = b.calc(t);
        assertThat(res, is(exp));
    }
}


