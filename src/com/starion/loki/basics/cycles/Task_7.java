package com.starion.loki.basics.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        try {
            System.out.print("Введите число m: ");
            int m = new Scanner(System.in).nextInt();
            System.out.print("Введите число n: ");
            int n = new Scanner(System.in).nextInt();
            if (m < 0 || n < 0 || n < m) {
                System.out.print("Неверный формат чисел");
            } else {
                for (int i = m; i <= n; i++) {
                    System.out.println("Делители числа " + i + ":");
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            System.out.println(j);
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверно введено число");
        }
    }
}
