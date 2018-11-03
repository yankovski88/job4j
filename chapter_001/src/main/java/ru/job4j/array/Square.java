package ru.job4j.array;

import java.util.ArrayList;

public class Square {
    /**
     * Square.doubl(number) возводит в степень все числа от 1 до nuber и добавляет в список
     * @param number конец диапазона
     * @author yura yankovski(mailto:boets003@mail.ru)
     * @version 1.
     */
    public static ArrayList<Integer> doubl (int number){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= number; i++){
            list.add(i * i);
        }
        return list;
    }
//public static void main(String[] args){
//        Square.doubl(5);
//    }
}
//Необходимо создать программу, которая будет заполнять массив числами возведенными в квадрат.