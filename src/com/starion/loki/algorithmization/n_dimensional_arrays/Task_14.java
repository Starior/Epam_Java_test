package com.starion.loki.algorithmization.n_dimensional_arrays;
/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.*/

import static java.lang.Math.random;

public class Task_14 {
    public static void main(String[] args) {
        int[][] nums;
        int m = 7;
        int n = 4;
        nums = new int[m][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                nums[i][j] = 0;
                System.out.printf("%2.1s", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                int count = j - i;
                if (count > 0)
                    nums[(int) (random() * m)][j] = 1;
            }
        }
        increase(nums, m);
        System.out.println();
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                System.out.printf("%2.1s", nums[i][j]);
            }
            System.out.println();
        }
    }

    private static void increase(int[][] nums, int m) {
        for (int i = 0; i <= nums[0].length - 1; i++) {
            int sum = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                sum = sum + nums[j][i];
            }
            if (sum != i) {
                nums[(int) (random() * m)][i] = 1;
                increase(nums, m);
            }
        }
    }
}
