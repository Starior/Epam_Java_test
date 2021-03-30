package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Найти положительные элементы главной диагонали квадратной матрицы.*/

import static java.lang.Math.random;

public class Task_10 {
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
        System.out.println("Положительные лементы, стоящие на главной диагонали:");
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i == j&& nums[i][j]>0)
                    System.out.printf("%5.3s", nums[i][j]);
            }
        }
    }
}