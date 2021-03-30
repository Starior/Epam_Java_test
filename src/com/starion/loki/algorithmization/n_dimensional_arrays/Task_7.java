package com.starion.loki.algorithmization.n_dimensional_arrays;

import static java.lang.Math.pow;
import static java.lang.Math.random;

public class Task_7 {
    public static void main(String[] args) {
        double[][] nums;
        int n = 10;
        nums = new double[n][n];
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = Math.sin((i * i - j * j) / (double) nums.length);
                System.out.printf("%10.6s", nums[i][j]);
                if (nums[i][j] > 0)
                    sum++;
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов в матрице: " + sum);
    }
}
