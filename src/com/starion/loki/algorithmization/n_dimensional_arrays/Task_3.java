package com.starion.loki.algorithmization.n_dimensional_arrays;

/*A matrix is given. Print the k-th row and p-th column of the matrix.*/

import static java.lang.Math.random;

public class Task_3 {

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
    int k = 4;
    int p = 12;

    System.out.println(k + "-th row elements:");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        if (i == k) {
          System.out.printf("%5.3s", nums[i][j]);
        }
      }
    }
    System.out.println();
    System.out.println(p + "-th column elements:");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        if (j == p) {
          System.out.printf("%5.3s", nums[i][j]);
        }
      }
    }
  }
}
