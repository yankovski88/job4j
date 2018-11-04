package ru.job4j.array;

import java.lang.reflect.Array;

public class Turn {
    public int[] back(int[] array) {
    //public static void main(String args[]){

       for (int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
array[i] = array[array.length - 1 - i];
array[array.length -1 -i] = temp;
//           System.out.println(array[i]);
//           System.out.println(array.length - 1);

} return array;
      }//
        //System.out.println(Array.a.array);

    }
//for (int i = 0; i <= array.length / 2; i++) { почему  <= ??? должно быть <
//        нет переменной для сохранения перекидываемого значения
//        int temp = array[i];
//        array[i] = array[array.length - 1 - i];
//        array[array.length - 1 - i] = temp;

////3. Метод должен перевернуть массив задом наперёд
////        4. В задании нельзя использовать дополнительный массив.
////        5. В классе TurnTest напишите 2 тест-метода, которые будет проверять вашу программу для чётного и нечётного количества элементов в массиве.