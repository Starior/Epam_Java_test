package com.starion.loki.algorithmization.decomposition;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/

public class Task_11 {
    public static void main(String[] args) {
        int a = 234520;
        int b = 234345652;
        comparisonLength(a, b);
    }

    public static void comparisonLength(int a, int b) {
        if (countingLengthArray(a) > countingLengthArray(b))
            System.out.println("В числе " + a + " больше цифр, чем в числе " + b);
        else if (countingLengthArray(a) < countingLengthArray(b))
            System.out.println("В числе " + b + " больше цифр, чем в числе " + a);
        else
            System.out.println("В числах " + a + " и " + b + " одинаковое количество чисел");
    }

    public static int countingLengthArray(int n) {
        int i = 10;
        int countNumbers = 1;
        while (n != n % i) {
            i *= 10;
            countNumbers++;
        }
        return countNumbers;
    }
}
