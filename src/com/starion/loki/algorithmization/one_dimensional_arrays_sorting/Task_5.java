package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Insertion sort. Sequence of numbers a1≤ a2≤...≤ an is given. It
    is required to rearrange the numbers in ascending order. This is done as follows.
    Let a1≤a2≤...≤ai be an ordered sequence, that is, a1≤a2≤...≤an.
    The next number a(i+1) is taken and inserted into the sequence so that the new sequence is
    also increasing. The process is carried out until all elements from i +1 to n are enumerated.
    Note. Place the next element in the sorted part using a binary search.
    Binary search should be presented as a separate function.*/

import java.util.Arrays;

public class Task_5 {

  public static int binarySearch(int[] sequence, int i) {
    int index = -1;
    int left = 0;
    int right = i;
    while (left != right) {
      int mid = (left + right) / 2;
      if (sequence[mid] < sequence[i]) {
        left = mid + 1;
        index = mid + 1;
      } else if (sequence[mid] >= sequence[i]) {
        right = mid;
        index = mid;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int[] sequence = {3, 2, 3, 1, 55, 7, 34, 5, 6, 4};
    int index;
    int temp;
    System.out.println(Arrays.toString(sequence));
    for (int i = 1; i < sequence.length; i++) {
      index = binarySearch(sequence, i);
      temp = sequence[i];
      for (int j = i; j > index; j--) {
        sequence[j] = sequence[j - 1];
      }
      sequence[index] = temp;
    }
    System.out.println(Arrays.toString(sequence));
  }
}
