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
}
