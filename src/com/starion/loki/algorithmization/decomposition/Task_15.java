package com.starion.loki.algorithmization.decomposition;

/*Find all natural n-digit numbers whose digits form a strictly increasing sequence (for example,
    1234, 5789). To solve the task, use decomposition.*/

public class Task_15 {

  public static void main(String[] args) {
    int n = 4;

    printNumbers(n);
  }

  private static void printNumbers(int n) {
    for (int i = calculateMinNumber(n); i < calculateMaxNumber(n); i++) {
      if (isIncreasingSequence(i, n)) {
        System.out.println(i);
      }
    }
  }

  private static boolean isIncreasingSequence(int i, int n) {
    int k = 0;
    for (int j = i; j > 0; j /= 10) {
      if (j % 10 > (((j - j % 10) / 10) % 10) && (((j - j % 10) / 10) % 10) != 0) {
        k++;
      }
    }
    if (k == n - 1) {
      return true;
    }
    return false;
  }

  private static int calculateMaxNumber(int n) {
    return (int) (Math.pow(10, n) - 1);
  }

  private static int calculateMinNumber(int n) {
    return (int) (Math.pow(10, (n - 1)));
  }
}
