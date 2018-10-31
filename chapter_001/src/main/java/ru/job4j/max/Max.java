package ru.job4j.max;

/**
 * выодит большее число из 2 введенных
 */
public class Max {
    public int biger(int first, int second) {
        return first > second ? first : second;

    }

    /**
     * выбор максимльного числа из 3 введеных
     *
     * @author Yura Yankovski (mailto:boets003@mail.ru)
     */
    public int maxthird(int first, int second, int third) {
        return biger(third, biger(first, second));
    }
//    public int max(int first, int second){
//        int temp = this.max(first, second);
//        return temp;
//    }
}
