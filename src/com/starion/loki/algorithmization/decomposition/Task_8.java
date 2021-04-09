package com.starion.loki.algorithmization.decomposition;
/*Задан массив D.
Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
расположенных элементов массива с номерами от k до m.*/

public class Task_8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        sum(array, 7, 9);
    }

    private static void sum(int[] array, int k, int m) {
        if (m <= array.length && m - k == 2) {
            int a = k - 1, b = m - 1;
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += array[i];
            }
            System.out.println("Сумма от " + k + " до " + m + " = " + sum);
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
