package com.starion.loki.algorithmization.decomposition;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2
(например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.*/
public class Task_13 {
    public static void main(String[] args) {
        int n = 123;

        checkIsTwinPrime(n);
    }

    public static void checkIsTwinPrime(int n) {
        for (int i = n; i <= 2 * n - 2; i++) {
            if (checkIsPrime(i) && checkIsPrime(i + 2))
                System.out.println(i + " и " + (i + 2) + " близнецы");
        }
    }

    public static boolean checkIsPrime(int i) {
        int d = 0;
        for (int j = 1; j < i; j++) {
            if ((i % j) == 0)
                d++;
        }
        if (d < 2)
            return true;
        return false;
    }
}
