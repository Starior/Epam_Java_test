package com.starion.loki.algorithmization.n_dimensional_arrays;

/*
A magic square of order n is an nxn square matrix composed of the numbers 1, 2, 3, ..., n ^ 2
so that the sums for each column, each row and each of the two large diagonals are equal.
Construct such a square. An example of a magic square of order 3:
        6 1 8
        7 5 3
        2 9 4
*/
//Shuffle construct 3х3

public class Task_16_three_n_shuffle {

  public static void main(String[] args) {
    int[][] nums;
    int n = 3;
    nums = new int[n][n];
    int k = 1;

    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        nums[i][j] = k;
        k++;
      }
    }

    while (check(nums)) {
      shuffle(nums);
    }

    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
  }

  private static boolean check(int[][] nums) {
    final int i1 = (nums.length) * ((nums.length) * (nums.length) + 1) / 2;
    int sumDM = 0;
    int sumDO = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      int sum = 0;
      int sumCol = 0;
      for (int j = 0; j <= nums.length - 1; j++) {
        if (i == j) {
          sumDM = sumDM + nums[j][i];
        }
        if (j == nums.length - 1 - i) {
          sumDO = sumDO + nums[j][i];
        }
        sum = sum + nums[i][j];
        sumCol = sumCol + nums[j][i];
      }
      if (sum != i1 || sumCol != i1) {
        // System.out.println(sum);
        return true;
      }
    }
    if (sumDM != i1 || sumDO != i1) {
      // System.out.println(sum);
      return true;
    }

    return false;
  }

  private static void shuffle(int[][] nums) {
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        int i1 = (int) (Math.random() * (nums.length));
        int j1 = (int) (Math.random() * (nums.length));
        int i2 = (int) (Math.random() * (nums.length));
        int j2 = (int) (Math.random() * (nums.length));
        int temp = nums[i1][j1];
        nums[i1][j1] = nums[i2][j2];
        nums[i2][j2] = temp;
      }
    }
  }
}



