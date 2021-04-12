package com.starion.loki.algorithmization.decomposition;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

public class Task_16 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Сумма " + n + "-значных чисел содержащих только нечетные цифры: " + sumNumbersNotContainEvenDigits(n));
        System.out.println("Количество четных цифр в найденной сумме: " + countingEvenDigits(sumNumbersNotContainEvenDigits(n)));
    }

    public static int sumNumbersNotContainEvenDigits(int n) {
        int sumNumbersNotContainEvenDigits = 0;
        for (int i = calculateMinNumber(n); i < calculateMaxNumber(n); i++) {
            if (isNumberNotContainEvenDigits(i, n)) {
                sumNumbersNotContainEvenDigits += i;
            }
        }
        return sumNumbersNotContainEvenDigits;
    }

    public static int countingEvenDigits(int sum) {
        int countEvenDigits = 0;
        for (int j = sum; j > 0; j /= 10) {
            if ((j % 10) % 2 == 0) {
                countEvenDigits++;
            }
        }
        return countEvenDigits;
    }

    public static boolean isNumberNotContainEvenDigits(int i, int n) {
        int k = 0;
        for (int j = i; j > 0; j /= 10) {
            if ((j % 10) % 2 != 0) {
                k++;
            }
        }
        if (k == countingLengthArray(i))
            return true;
        return false;
    }

    public static int calculateMaxNumber(int n) {
        return (int) (Math.pow(10, n) - 1);
    }

    public static int calculateMinNumber(int n) {
        return (int) (Math.pow(10, (n - 1)));
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
