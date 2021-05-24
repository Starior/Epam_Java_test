package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Form a square matrix of order n according to a given pattern (n is even):
        1   2    3   ...  n
        n  n-1  n-2  ...  1
        1   2    3   ...  n
        n  n-1  n-2  ...  1
        .   .    .   ...  .
        n  n-1  n-2  ...  1
*/

public class Task_4 {

  public static void main(String[] args) {
    int[][] nums;
    int n = 10;
    nums = new int[n][n];
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        if (i % 2 == 0) {
          nums[i][j] = j + 1;
        } else {
          nums[i][j] = nums.length - j;
        }
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
  }
}
