package com.starion.loki.algorithmization.decomposition;

/*Write a program that finds the second largest number in the array A [N]
    (print out a number that is less than the maximum element of the array,
    but larger than all other elements).*/

import java.util.Arrays;

public class Task_5 {

  public static void main(String[] args) {
    int n = 10;
    int[] array = createRandomArray(n);
    findingSecondLargestElement(array);
  }

  private static int[] createRandomArray(int countElements) {
    int[] array = new int[countElements];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 21) - 10;
    }
    System.out.println("Array of the numbers: " + Arrays.toString(array));
    return array;
  }

  private static void findingSecondLargestElement(int[] array) {
    int max = -1;
    int oneLessMaxIndex = -1;
    int maxIndex = maxElementIndex(array);
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > max && array[i] != array[maxIndex]) {
        max = array[i];
        oneLessMaxIndex = i;
      }
    }
    System.out.println("Second largest number in the array: " + array[oneLessMaxIndex]);
  }

  private static int maxElementIndex(int[] array) {
    int max = -1;
    int maxIndex = -1;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > max) {
        max = array[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }
}
