package com.starion.loki.algorithmization.n_dimensional_arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[][] nums;
        int n = 20;
        nums = new int[n][n];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (((j > nums.length - 1 - i) && i < j) || ((j < nums.length - 1 - i) && i > j)) {
                    nums[i][j] = 0;
                } else
                    nums[i][j] = 1;
                System.out.printf("%3.3s", nums[i][j]);
            }
            System.out.println();
        }
    }
}
