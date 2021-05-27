package com.starion.loki.algorithmization.decomposition;

/*A natural number N is given. Write a method (methods) for forming an array,
    the elements of which are the digits of the number N.*/

import java.util.Arrays;

public class Task_10 {

  public static void main(String[] args) {
    int n = 1890105;
    NumberToArray(n);
  }

  public static int countingLengthArray(int n) {
    int i = 10;
    int countNumbers = 1;
    while (n != n % i) {
      i *= 10;
      countNumbers++;
    }
    return countNumbers;
  }

  public static void NumberToArray(int n) {
    int[] array = new int[countingLengthArray(n)];
    for (int j = array.length - 1; j >= 0; j--) {
      array[j] = n % 10;
      n = (n - array[j]) / 10;
    }
    System.out.println(Arrays.toString(array));
  }

}
