package ru.job4j.calculator;


public class Calculator {
    private double result;

    public void add (double first, double second){
        this.result = first + second;
    }


    /**
     * division Деление
     * @param first делимое
     * @param second делитель
     */
    public void division (double first, double second) {
        this.result = first / second;
    }
    /**
     * умножение
     * @param first
     * @param second
     */

    public void multiplication (double first, double second) {
        this.result = first * second;
    }

    /**
     * вычетание
     * @param first
     * @param second
     */
    public void vichet (double first, double second) {
        this.result = first - second;
    }
    /**
     * получить результат
     */
    public double getResult () {
        return this.result;
    }
}