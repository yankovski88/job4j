package ru.job4j.max;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * проверят наиболшее число
 */
public class MaxTest {
    @Test
    public void maxNumber () {
        Max number = new Max ();
        int big_number = number.biger(1, 2);
        assertThat(big_number, is(2));
    }

    @Test
    /**
     * выбор максимального числа из 3 введеных чисел
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    public void whenEnterThreeNumberThenViborMax(){
        Max numb = new Max();
        int expect = 3;
        int max_num = numb.maxthird(1,2,3);
        assertThat(max_num, is(expect));
    }
}


