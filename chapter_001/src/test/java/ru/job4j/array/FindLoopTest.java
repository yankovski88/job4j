package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    /**
     * proverka на поиск перебором
     * @param data Это массив в чем искать
     * @param el это элимент который мы исчем
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
@Test
    public void whenData123Then2() {
    int[] data = {1, 2, 3};
    int el = 2;
    int expect = 1;
    int rst = FindLoop.indexOf(data, el);
    FindLoop.indexOf(data, el);
    Assert.assertThat(rst, is(expect));
    }

    /**
     * ищем 88
     */
    @Test
    public void whenData667788Then88() {
        int[] data = {66, 77, 88};
        int el = 88;
        int expect = 2;
        int rst = FindLoop.indexOf(data, el);
        FindLoop.indexOf(data, el);
        Assert.assertThat(rst, is(expect));
    }
    @Test
    /**
     * ищем 99 этого элимента нет в списке
     */
    public void whenData362781Then99() {
        int[] data = {36, 27, 81};
        int el = 99;
        int expect = -1;
        int rst = FindLoop.indexOf(data, el);
        FindLoop.indexOf(data, el);
        Assert.assertThat(rst, is(expect));
    }
}
