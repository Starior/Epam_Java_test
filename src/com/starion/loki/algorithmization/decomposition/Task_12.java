package com.starion.loki.algorithmization.decomposition;

/*Natural numbers K and N are given. Write a method (methods) for forming an array A, the elements
    of which are numbers, the sum of the digits of which is equal to K and which are not greater
    than N.*/

import java.util.Arrays;

public class Task_12 {

  public static void main(String[] args) {
    int k = 15;
    int n = 6;
    createArray(k, n);
  }

  public static void createArray(int k, int n) {
    int[] a = new int[1];
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      a[i] = (int) (Math.random() * (n + 1));
      sum = sum + a[i];
      if (sum < k) {
        a = increaseLengthOfArray(a);
      } else if (sum > k) {
        a[i] = a[i] - (sum - k);
      }
    }
    System.out.println(Arrays.toString(a));
  }

  public static int[] increaseLengthOfArray(int[] a) {
    int[] b = new int[a.length + 1];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    return b;
  }
}
