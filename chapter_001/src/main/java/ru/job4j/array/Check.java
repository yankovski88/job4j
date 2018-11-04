package ru.job4j.array;

public class Check {


    public static void mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i <= data.length; i++) {
            if(data[i] = false){
                result = true;
            }else if (data[i] = true){
                result = true;
            }else {result = false;}
        }System.out.println(result);
        }
        //return result;
    public static void main(String args[]){
        boolean[] data = new boolean[] {true};
        Check.mono(data);
    }
}
