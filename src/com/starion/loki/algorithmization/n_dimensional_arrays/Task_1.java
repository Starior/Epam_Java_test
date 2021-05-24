package com.starion.loki.algorithmization.n_dimensional_arrays;

/*A matrix is given.Display all odd columns with the first element greater than the last.*/

import static java.lang.Math.random;

public class Task_1 {

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

    System.out.println("All odd columns with the first element greater than the last:");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 1; j <= nums.length - 1; j += 2) {
        if (nums[0][j] > nums[nums.length - 1][j]) {
          System.out.printf("%5.3s", nums[i][j]);
        }
      }
      System.out.println();
    }
  }
}
