package com.starion.loki.algorithmization.decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/
public class Task_15 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = calculateMinNumber(n); i < calculateMaxNumber(n); i++) {
            if (isIncreasingSequence(i, n))
                System.out.println(i);
        }
    }

    public static boolean isIncreasingSequence(int i, int n) {
        int k = 0;
        for (int j = i; j > 0; j /= 10) {
            if (j % 10 > (((j - j % 10) / 10) % 10) && (((j - j % 10) / 10) % 10) != 0) {
                k++;
            }
        }
        if (k == n - 1)
            return true;
        return false;
    }

    public static int calculateMaxNumber(int n) {
        return (int) (Math.pow(10, n) - 1);
    }

    public static int calculateMinNumber(int n) {
        return (int) (Math.pow(10, (n - 1)));
    }
}
