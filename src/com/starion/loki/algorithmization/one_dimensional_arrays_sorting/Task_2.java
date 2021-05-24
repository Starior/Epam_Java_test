package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Two sequences are given a1≤ a2≤...≤ an and b1≤ b2≤...≤ bm.
    Form a new sequence of numbers from them so that it is also non-decreasing.
    Note.Do not use an additional array.*/

import java.util.Arrays;

public class Task_2 {

  public static void main(String[] args) {

    int[] firstSequence = {-5, 1, 4, 7, 66, 777};
    int firstSequenceCount = 0;
    int[] secondSequence = {-10, 0, 2, 44, 234, 634,};
    int secondSequenceCount = 0;
    int[] newSequence = new int[firstSequence.length + secondSequence.length];

    for (int i = 0; i < newSequence.length; i++) {
      if (firstSequenceCount == firstSequence.length) {
        newSequence[i] = secondSequence[secondSequenceCount];
      }
      if (secondSequenceCount == secondSequence.length) {
        newSequence[i] = firstSequence[firstSequenceCount];
      }
      if (firstSequenceCount < firstSequence.length
          && secondSequenceCount < secondSequence.length) {
        if (firstSequence[firstSequenceCount] < secondSequence[secondSequenceCount]) {
          newSequence[i] = firstSequence[firstSequenceCount];
          firstSequenceCount++;
        } else if (firstSequence[firstSequenceCount] > secondSequence[secondSequenceCount]) {
          newSequence[i] = secondSequence[secondSequenceCount];
          secondSequenceCount++;
        }
      }
    }
    System.out.println(Arrays.toString(newSequence));
  }
}
