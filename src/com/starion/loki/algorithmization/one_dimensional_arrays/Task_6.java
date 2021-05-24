package com.starion.loki.algorithmization.one_dimensional_arrays;

/*A sequence of N real numbers is given. Calculate the sum of numbers whose
ordinal numbers are prime numbers.*/

public class Task_6 {

  public static void main(String[] args) {
    int[] nums = {4, 2, -23, 5};
    int sum = 0;
    for (int i = 2; i <= nums.length - 1; i++) {
      int d = 0;
      for (int j = 1; j < i; j++) {
        if ((i % j) == 0) {
          d++;
        }
      }
      if (d < 2) {
        sum += nums[i];
      }
    }
    System.out.println(sum);
  }
}
