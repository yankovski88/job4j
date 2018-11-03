package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    /**
     * proverka на возведение в степень от 1 до вводимого числа Number и добавление его в массив
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
}
