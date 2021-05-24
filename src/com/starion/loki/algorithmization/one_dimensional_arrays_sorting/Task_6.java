package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Shell sort. An array of n real numbers is given.Sort it in ascending order.
    This is done as follows: two neighboring elements ai and a(i+1)are compared. If ai≤a(i+1),
    then move forward one element. If ai>a(i+1),then a permutation is performed and
    shifted one element back. Create an algorithm for this sorting.*/

import java.util.Arrays;

public class Task_6 {

  public static void main(String[] args) {
    int[] array = {-3, 3, 2, 3, 1, 55, 7, 34, 5, 6, 4};
    System.out.println(Arrays.toString(array));

    for (int i = 1; i < array.length; i++) {
      for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
