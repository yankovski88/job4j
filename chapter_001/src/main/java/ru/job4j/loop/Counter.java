package ru.job4j.loop;


public class Counter {
    /**
     * Counter.add(start, finish) возвращает сумму всех четных чисел
     * @param start начало диапазона
     * @param finish конец диапазона
     * @author yura yankovski(mailto:boets003@mail.ru)
     * @version 1.
     */
    public static int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

//// Для диапазона значений от 1 до 10, метод add должен вернуть сумму чётных чисел, равную 30 (2 + 4 + 6 + 8 + 10).