package ru.job4j.loop;


public class Counter {

//  static  ArrayList<Integer> list = new ArrayList<Integer>();

    public static int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
    if ( i % 2 == 0){
        sum = sum + i;
    }
        }
//        list.add(sum);
//        System.out.println(list);
        return sum;
    }
//    public static void main(String args[]) {
//        add(1, 10);
//    }
}

   // Для диапазона значений от 1 до 10, метод add должен вернуть сумму чётных чисел, равную 30 (2 + 4 + 6 + 8 + 10).