package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    /**
     * proverka
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    @Test
    public void when3x3Then() {
   //     String expect =
                Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)));
    }

    /**
     * proverka
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //напишите здесь тест, проверяющий формирование доски 5 на 4.
        Board boardd = new Board();
        String result = boardd.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(result, is(
                String.format("X X%s X %sX X%s X%s", ln, ln, ln, ln)));
    }
}
