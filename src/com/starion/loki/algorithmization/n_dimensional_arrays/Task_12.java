package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

import static java.lang.Math.random;

public class Task_12 {
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

        int temp = 0;

        System.out.println("Сортировка строк по возрастанию");
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <=nums.length - 1; j++) {
                for (int k = 0; k < j; k++) {
                    if (nums[i][k] > nums[i][k + 1]) {
                        temp = nums[i][k];
                        nums[i][k] = nums[i][k + 1];
                        nums[i][k + 1] = temp;
                    }
                }
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }

        System.out.println("Сортировка строк по убыванию");
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (nums[i][k] > nums[i][k + 1]) {
                        temp = nums[i][k];
                        nums[i][k] = nums[i][k + 1];
                        nums[i][k + 1] = temp;
                    }
                }
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }

    }
}
