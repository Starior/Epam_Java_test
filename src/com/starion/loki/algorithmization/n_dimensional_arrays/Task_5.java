package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Form a square matrix of order n according to a given pattern (n is even):
        1   1   1  ...  1  1  1
        2   2   2  ...  2  2  0
        3   3   3  ...  3  0  0
        .   .   .  ...  .  .  .
       n-1 n-1  0  ...  0  0  0
        n   0   0  ...  0  0  0
*/

public class Task_5 {

  public static void main(String[] args) {
    int[][] nums;
    int n = 20;
    nums = new int[n][n];
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
          if (j > nums.length - 1 - i) {
              nums[i][j] = 0;
          } else {
              nums[i][j] = i + 1;
          }
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
  }
}
