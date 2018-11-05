package ru.job4j.array;

public class Check {
    /**
     * Check.mono(boolean[] data) при добавлении массива boolean он показывает или все элименты одинаковы
     * @param data массив в котором будет находиться объект
     * @author yura yankovski(mailto:boets003@mail.ru)
     * @version 1.
     */

    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean a = data[0];
            if (a != data[i]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }//System.out.println(result);
        return result;
    }

//    public static void main(String args[]){
//        boolean[] data = new boolean[] {false, false, false};
//        Check.mono(data);
//    }
}
