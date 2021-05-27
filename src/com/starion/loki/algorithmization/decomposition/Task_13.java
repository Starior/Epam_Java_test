package com.starion.loki.algorithmization.decomposition;

/*Two primes are called "twins" if they differ from each other by 2 (for example, 41 and 43). Find
    and print all pairs of "twins" from the segment [n, 2n], where n is a given natural number
    greater than 2. To solve the task, use the decomposition.*/

public class Task_13 {

  public static void main(String[] args) {
    int n = 123;

    checkIsTwinPrime(n);
  }

  public static void checkIsTwinPrime(int n) {
    for (int i = n; i <= 2 * n - 2; i++) {
      if (checkIsPrime(i) && checkIsPrime(i + 2)) {
        System.out.println(i + " and " + (i + 2) + " are twins");
      }
    }
  }

  public static boolean checkIsPrime(int i) {
    int d = 0;
    for (int j = 1; j < i; j++) {
      if ((i % j) == 0) {
        d++;
      }
    }
    return d < 2;
  }
}
