package com.starion.loki.algorithmization.one_dimensional_arrays;

/*An integer array is given with the number of elements n.
Compress the array by discarding every second element from it(fill the vacated elements with zeros).
Note:Do not use an additional array.*/

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_10 {

  public static void main(String[] args) {
    int[] nums;
    int n = 20;
    nums = new int[n];
    for (int i = 0; i <= nums.length - 1; i++) {
      nums[i] = (int) (random() * 21) - 10;
    }
    System.out.println("Array:\n" + Arrays.toString(nums));

    for (int i = 1; i <= nums.length - 1; i += 2) {
      nums[i] = 0;
    }
    System.out.println("Compressed array:\n" + Arrays.toString(nums));
  }
}
