package ru.job4j.loop;

import java.util.ArrayList;

public class Factorial {
    /**
     * Factorial.calc(n)высчитывает факторил любого чила n
     *
     * @param n число для расчета факториала
     * @author yura yankovski(mailto:boets003@mail.ru)
     * @version 1.
     */
    public static int calc(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int total = 1;
        for (int i = n; i > 0; i--) {
            list.add(i);
        }
        for (int it = 0; it < list.size(); it++) {
            total = total * list.get(0 + it);
        }
        return total;
    }
}
//    Факториал для числа 5 будет равен 120 (1 * 2 * 3 * 4 * 5).
//        Факториал для числа 0 равен 1