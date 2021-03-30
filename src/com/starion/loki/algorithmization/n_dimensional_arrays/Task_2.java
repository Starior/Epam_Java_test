package com.starion.loki.algorithmization.n_dimensional_arrays;

import static java.lang.Math.random;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

public class Task_2 {
    public static void main(String[] args) {
        int[][] nums;
        int n = 20;
        nums = new int[n][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = (int) (random() * 21) - 10;
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }

        System.out.println("Элементы, стоящие на диагонали слева направо:");
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i == j)
                    System.out.printf("%5.3s", nums[i][j]);
            }
        }
        System.out.println();
        System.out.println("Элементы, стоящие на диагонали справа налево:");
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (j == nums.length - 1 - i)
                    System.out.printf("%5.3s", nums[i][j]);
            }
        }
    }
}
