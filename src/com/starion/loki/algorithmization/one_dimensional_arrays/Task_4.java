package com.starion.loki.algorithmization.one_dimensional_arrays;

/*There are real numbers a1, a2, ..., an. Swap the largest and smallest elements.*/

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_4 {

  public static void main(String[] args) {
    int[] nums = {4, 2, -23, 5, 81, 0, 23};

    System.out.println("Array:\n" + Arrays.toString(nums));

    int min = 99;
    int max = -99;
    int minI = 0;
    int maxI = 0;

    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxI = i;
      }
      if (nums[i] < min) {
        min = nums[i];
        minI = i;
      }
    }

    nums[minI] = max;
    nums[maxI] = min;

    System.out.println(Arrays.toString(nums));
  }
}
