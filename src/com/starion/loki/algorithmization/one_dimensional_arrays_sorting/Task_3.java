package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Selection sort. Sequence of numbers a1≤ a2≤...≤ an is given. It
    is required to rearrange the elements so that they are arranged in descending order.
    To do this, in the array, starting from the first, the largest element is selected and put in
    the first place, and the first - in the place of the largest. Then, starting from the second,
    this procedure is repeated. Write a selection sorting algorithm.*/

import java.util.Arrays;

public class Task_3 {

  public static void main(String[] args) {
    int[] array = {-5, 1, 4, 7, 66, 241};
    int temp;
    for (int i = 0; i < array.length; i++) {
      int max = i;
      for (int j = i; j < array.length; j++) {
        if (array[i] < array[j]) {
          max = j;
        }
      }
      temp = array[i];
      array[i] = array[max];
      array[max] = temp;
    }
    System.out.println(Arrays.toString(array));
  }
}
