package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.*/

import static java.lang.Math.random;

public class Task_14 {
    public static void main(String[] args) {
        int[][] nums;
        int m = 5;
        int n = 7;
        nums = new int[m][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                nums[i][j] = (int) (random() * 2);
                System.out.printf("%2.1s", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                nums[i][(int) (random() * n)]=1;
                System.out.printf("%2.1s", nums[i][j]);
            }
            System.out.println();
        }
    }
}
