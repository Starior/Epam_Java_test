package com.starion.loki.algorithmization.n_dimensional_arrays;

/*A matrix of non-negative numbers is given. Calculate the sum of the items in each column.
Determine which column contains the maximum sum.*/

import static java.lang.Math.random;

public class Task_9 {

  public static void main(String[] args) {
    int[][] nums;
    int n = 10;
    nums = new int[n][n];
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        nums[i][j] = (int) (random() * 11);
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      int sum = 0;
      for (int j = 0; j <= nums.length - 1; j++) {
        sum = sum + nums[j][i];
      }
      System.out.println("The sum of the elements in " + (i + 1) + " column = " + sum);
      if (sum > max) {
        max = sum;
        maxIndex = i;
      }
    }
    System.out.println("Column number with maximum sum of elements: " + (maxIndex + 1));

  }
}
