package com.starion.loki.algorithmization.one_dimensional_arrays;

/*Find the most frequent number in an array of integers with n elements.
If there are several such numbers,then determine the smallest of them.*/

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_9 {

  public static void main(String[] args) {
    int[] nums = {4, 2, 2, 5, 4, 4, 1, 0, 7, 2, 9, 3, 12, 1, 1, 31};

    System.out.println("Array:\n" + Arrays.toString(nums));

    int min = nums[0];
    int index = 0;
    int count = 1;

    for (int i = 0; i <= nums.length; i++) {
      int countTemp = 1;
      for (int j = i + 1; j <= nums.length - 1; j++) {
        if (nums[i] == nums[j]) {
          countTemp++;
        }
      }
      if (countTemp == count && nums[index] > nums[i]) {
        index = i;
        count = countTemp;
      }
      if (countTemp > count) {
        index = i;
        count = countTemp;
      }
    }
    System.out.println(count);
    System.out.println(nums[index]);
  }
}

