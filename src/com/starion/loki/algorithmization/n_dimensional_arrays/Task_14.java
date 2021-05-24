package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Generate a random m x n matrix consisting of zeros and ones,
with the number of ones in each column being equal to the column number.*/

import static java.lang.Math.random;

public class Task_14 {

  public static void main(String[] args) {
    int[][] matrix;
    int m = 7;
    int n = 4;
    matrix = new int[m][n];
    for (int i = 0; i <= matrix.length - 1; i++) {
      for (int j = 0; j <= matrix[0].length - 1; j++) {
        matrix[i][j] = 0;
      }
    }

    increaseOnes(matrix, m);

    for (int i = 0; i <= matrix.length - 1; i++) {
      for (int j = 0; j <= matrix[0].length - 1; j++) {
        System.out.printf("%2.1s", matrix[i][j]);
      }
      System.out.println();
    }
  }

  private static void increaseOnes(int[][] matrix, int m) {
    for (int i = 0; i <= matrix[0].length - 1; i++) {
      int sum = 0;
      for (int j = 0; j <= matrix.length - 1; j++) {
        sum = sum + matrix[j][i];
      }
      if (sum != i + 1) {
        matrix[(int) (random() * m)][i] = 1;
        increaseOnes(matrix, m);
      }
    }
  }
}
