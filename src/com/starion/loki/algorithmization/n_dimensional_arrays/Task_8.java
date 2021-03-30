package com.starion.loki.algorithmization.n_dimensional_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.random;

public class Task_8 {
    public static void main(String[] args) {
        int[][] nums;
        int n = 10;
        nums = new int[n][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = (int) (random() * 21) - 10;
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        try {
            System.out.print("Введите номер первого столбца: ");
            int num = new Scanner(System.in).nextInt() - 1;
            if (num < 0 || num >= n) {
                System.out.print("Неверный формат числа. Необходимо ввести число от 1 до " + n);
                return;
            }
            System.out.print("Введите номер второго столбца: ");
            int num2 = new Scanner(System.in).nextInt() - 1;
            if (num2 < 0 || num2 >= n) {
                System.out.print("Неверный формат числа. Необходимо ввести число от 1 до " + n);
                return;
            }

            for (int i = 0; i <= nums.length - 1; i++) {
                for (int j = 0; j <= nums.length - 1; j++) {
                    if (j == num && num < num2) {
                        int temp = nums[i][num];
                        nums[i][num] = nums[i][num2];
                        nums[i][num2] = temp;
                    } else if (j == num2 && num > num2){
                        int temp = nums[i][num];
                        nums[i][num] = nums[i][num2];
                        nums[i][num2] = temp;
                    }
                    System.out.printf("%5.3s", nums[i][j]);
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println("Неверный формат числа. Необходимо ввести числа от 1 до " + n);
        }

    }
}
