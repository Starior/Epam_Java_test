package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Two one-dimensional arrays with different number of elements and a natural number k are given.
    Combine them into one array, including the second array between the k-th and (k+1)-th
    elements of the first, without using an additional array.*/

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_1 {

  public static void main(String[] args) {
    int[] firstArray;
    int n = 5;
    firstArray = new int[n];
      for (int i = 0; i <= firstArray.length - 1; i++) {
          firstArray[i] = (int) (random() * 21) - 10;
      }
    System.out.println("First array:\n" + Arrays.toString(firstArray));

    int[] secondArray;
    int m = 6;
    secondArray = new int[m];
      for (int i = 0; i <= secondArray.length - 1; i++) {
          secondArray[i] = (int) (random() * 21) - 10;
      }
    System.out.println("Second array:\n" + Arrays.toString(secondArray));

    int k = 3;

    int[] newArray;
    newArray = new int[n + m];
    for (int i = 0; i <= newArray.length - 1; i++) {
        if (i < k) {
            newArray[i] = firstArray[i];
        }
      if (i >= k && i < k + secondArray.length) {
        newArray[i] = secondArray[i - k];
      }
        if (i >= k + secondArray.length) {
            newArray[i] = firstArray[i - secondArray.length];
        }
    }
    System.out.println("New array:\n" + Arrays.toString(newArray));
  }

}
