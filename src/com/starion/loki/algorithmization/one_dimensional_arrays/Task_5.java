package com.starion.loki.algorithmization.one_dimensional_arrays;

/*Integers a1, a2, ..., an are given. Print only those numbers for which ai > i.*/

public class Task_5 {

  public static void main(String[] args) {
    int[] nums = {4, 2, -23, 5, 81, 0, 23};

    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] > i) {
        System.out.println(nums[i]);
      }
    }
  }
}
