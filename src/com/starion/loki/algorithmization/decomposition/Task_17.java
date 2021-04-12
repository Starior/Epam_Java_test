package com.starion.loki.algorithmization.decomposition;

/*Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.*/
public class Task_17 {
    public static void main(String[] args) {
        int number = 21;

        countingIteration(number);
    }

    public static void countingIteration(int number) {
        int count = 0;
        for (int i = number; i > 0; i -= summingDigits(i)) {
            count++;
            //System.out.println(summingDigits(i));
        }
        System.out.println(count);
    }

    public static int summingDigits(int i) {
        int k = 0;
        for (int j = i; j > 0; j /= 10) {
            k += j % 10;
        }
        return k;
    }
}
