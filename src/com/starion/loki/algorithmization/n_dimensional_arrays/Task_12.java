package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Sort matrix rows in ascending and descending order of element values.*/

import static java.lang.Math.random;

public class Task_12 {

  public static void main(String[] args) {
    int[][] nums;
    int n = 10;
    nums = new int[n][n];
    int temp = 0;

    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        nums[i][j] = (int) (random() * 21) - 10;
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Sort rows in ascending order");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = nums.length - 1; j >= 0; j--) {
        for (int k = 0; k < j; k++) {
          if (nums[i][k] < nums[i][k + 1]) {
            temp = nums[i][k];
            nums[i][k] = nums[i][k + 1];
            nums[i][k + 1] = temp;
          }
        }
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Sort rows in descending order");
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
