package com.starion.loki.algorithmization.decomposition;

/*Даны натуральные числа К и N.
Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К
и которые не большее N.*/

import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {
        int k = 15;
        int n = 6;
        createArray(k, n);
    }

    public static void createArray(int k, int n) {
        int[] a = new int[1];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (n + 1));
            sum = sum + a[i];
            if (sum < k) {
                // a = Arrays.copyOf(a, a.length + 1);
                a = increaseLengthOfArray(a);
            } else if (sum > k)
                a[i] = a[i] - (sum - k);
        }
        System.out.println(Arrays.toString(a));
    }

    public static int[] increaseLengthOfArray(int[] a) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
