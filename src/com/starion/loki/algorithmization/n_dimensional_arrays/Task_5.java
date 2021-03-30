package com.starion.loki.algorithmization.n_dimensional_arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[][] nums;
        int n = 20;
        nums = new int[n][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (j > nums.length - 1 - i) {
                    nums[i][j] = 0;
                } else
                    nums[i][j] = i + 1;
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }
    }
}
