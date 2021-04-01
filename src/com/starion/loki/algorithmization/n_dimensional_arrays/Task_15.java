package com.starion.loki.algorithmization.n_dimensional_arrays;

import static java.lang.Math.random;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
public class Task_15 {
    public static void main(String[] args) {
        int[][] nums;
        int n = 10;
        nums = new int[n][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = (int) (random() * 101);
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }
        int max = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
        }
        System.out.println(max);
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[i][j] % 2 != 0) {
                    nums[i][j] = max;
                }
            }
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }
    }
}
