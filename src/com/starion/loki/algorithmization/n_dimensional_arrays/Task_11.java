package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Fill the 10x20 matrix with random numbers from 0 to 15.
Display the matrix itself and the row numbers in which the number 5 occurs three or more times.*/

import static java.lang.Math.random;

public class Task_11 {

  public static void main(String[] args) {
    int[][] nums;
    nums = new int[10][20];
    String numbers = "";

    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums[0].length - 1; j++) {
        nums[i][j] = (int) (random() * 16);
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
    int countCounts = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      int count = 0;
      for (int j = 0; j <= nums[0].length - 1; j++) {
        if (nums[i][j] == 5) {
          count++;
        }
      }
      if (count >= 3) {
        numbers = numbers + (i + 1) + " ";
        countCounts++;
      }
    }
    if (countCounts == 0) {
      System.out.println(
          "This matrix does not contain rows in which the number 5 occurs three or more times.");
    } else {
      System.out.println(
          "Row numbers (numbered from 1 to 10) in which the number 5 occurs three or more times:\n"
              + numbers);
    }
  }
}
