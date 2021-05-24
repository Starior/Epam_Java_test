package com.starion.loki.algorithmization.one_dimensional_arrays;

/* A sequence of integers a1, a2, ..., an is given. Form a new sequence by discarding
from the original those terms that are equal to min(a1, a2, ..., an).*/

import java.util.Arrays;

public class Task_8 {

  public static void main(String[] args) {

    int[] nums = {4, 2, -23, 5, 81, 0, 23, 7, 234, 234, 42, 100};
    int min = nums[0];
    int[] numsNew;

    for (int i : nums) {
      if (i < min) {
        min = i;
      }
    }

    int k = 0;
    for (int i : nums) {
      if (i == min) {
        k++;
      }
    }

    numsNew = new int[nums.length - k];

    k = 0;

    for (int num : nums) {
      if (num != min) {
        numsNew[k] = num;
        k++;
      }
    }
    System.out.println(Arrays.toString(numsNew));
  }
}
