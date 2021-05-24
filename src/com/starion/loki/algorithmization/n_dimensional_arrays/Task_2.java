package com.starion.loki.algorithmization.n_dimensional_arrays;

/*A square matrix is given. Display the elements on the diagonal.*/

import static java.lang.Math.random;

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

    System.out.println("Elements on the main diagonal:");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        if (i == j) {
          System.out.printf("%5.3s", nums[i][j]);
        }
      }
    }
    System.out.println();
    System.out.println("Elements on the minor diagonal:");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        if (j == nums.length - 1 - i) {
          System.out.printf("%5.3s", nums[i][j]);
        }
      }
    }
  }
}
