package ru.job4j.array;

import java.lang.reflect.Array;

public class Turn {
    public int[] back(int[] array) {
    //public static void main(String args[]){

       for (int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
array[i] = array[array.length - 1 - i];
array[array.length -1 -i] = temp;


} return array;
      }
        //System.out.println(Array.a.array);

    }
