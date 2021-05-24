package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Bubble sort. Sequence of numbers a1≤ a2≤...≤ an is given. It is
    required to rearrange the numbers in ascending order. For this, two adjacent numbers
    ai and ai+1 are compared. If ai > a(i+1), then a permutation is done.
    This continues until all the elements are arranged in ascending order. Create a sorting
    algorithm, while counting the number of permutations.*/

import java.util.Arrays;

public class Task_4 {

  public static void main(String[] args) {
    int[] sequence = {-5, 5, 4, 7, 66, 777};
    int temp;
    int countReplaces = 0;
    for (int i = 0; i < sequence.length; i++) {
      for (int j = i + 1; j < sequence.length; j++) {
        if (sequence[i] > sequence[j]) {
          temp = sequence[i];
          sequence[i] = sequence[j];
          sequence[j] = temp;
          countReplaces++;
        }
      }
    }
    System.out.println(Arrays.toString(sequence));
    System.out.println("Number of permutations: " + countReplaces);
  }
}
