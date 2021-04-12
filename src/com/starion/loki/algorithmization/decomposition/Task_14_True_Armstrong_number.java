package com.starion.loki.algorithmization.decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.*/

public class Task_14_True_Armstrong_number {
    public static void main(String[] args) {
        int k = 12345;
        for (int i = 1; i <= k; i++) {
            if (sumNumbersInPow(i) == i) {
                System.out.println(" Число " + i + " является числом Армстронга.");
            }
        }
    }

    public static int sumNumbersInPow(int k) {
        int sum = 0;
        int length = countingLength(k);
        for (int j = k; j > 0; j /= 10) {
            sum = sum + (int) Math.pow((j % 10), length);
        }
        return sum;
    }

    public static int countingLength(int n) {
        int i = 10;
        int countNumbers = 1;
        while (n != n % i) {
            i *= 10;
            countNumbers++;
        }
        return countNumbers;
    }
}
