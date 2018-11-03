package ru.job4j.array;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SquareTest {
    /**
     * proverka на возведение в степень от 1 до вводимого числа Number и добавление его в массив
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    @Test
    public void whenDoubleNumber3Then149() {
        int number = 3;
         Square square = new Square();
        ArrayList<Integer> rst = square.doubl(number);
       ArrayList<Integer> expect = new ArrayList<Integer>();
       Collections.addAll(expect, 1, 4, 9);
        assertThat(rst, is(expect));
    }
}
