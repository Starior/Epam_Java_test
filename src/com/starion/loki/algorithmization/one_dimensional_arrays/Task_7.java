package com.starion.loki.algorithmization.one_dimensional_arrays;

/*Real numbers a1, a2, ..., an are given. Find:
    max(a1 + a2n, a2 + a2n-1,..., an + an+1)*/

public class Task_7 {

  public static void main(String[] args) {
    int[] nums = {4, 2, -23, 5, 81, 0, 23, 7, 234, 234, 42, 100};
    int max = 0;
    try {
      for (int i = 0; i <= nums.length - 1; i += 2) {
        if (nums[i] + nums[i + 1] > max) {
          max = nums[i] + nums[i + 1];
        }
      }
      System.out.println(max);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Odd number of array elements");
      ;
    }
  }
}
