package com.starion.loki.algorithmization.decomposition;

/*Написать метод(методы) для вычисления суммы факториалов
        всех нечетных чисел от 1 до 9.*/
public class Task_7 {
    public static void main(String[] args) {
        calculateFactorialOneToNine();
    }

    public static void calculateFactorialOneToNine() {
        int sumFactorial = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sumFactorial += calculateFactorial(i);
            }
        }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна: " + sumFactorial);
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
