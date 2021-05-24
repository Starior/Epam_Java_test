package com.starion.loki.algorithmization.one_dimensional_arrays;

/*An array of real numbers is given,the dimension of which is N.Calculate how many negative,
positive and zero elements there are.*/

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_3 {

  public static void main(String[] args) {
    int[] nums;
    int n = 20;
    nums = new int[n];
    for (int i = 0; i <= nums.length - 1; i++) {
      nums[i] = (int) (random() * 21) - 10;
    }
    System.out.println("Массив:\n" + Arrays.toString(nums));

    int sumNull = 0;
    int sumPlus = 0;
    int sumMinus = 0;

    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] < 0) {
        sumMinus++;
      }
      if (nums[i] == 0) {
        sumNull++;
      }
      if (nums[i] > 0) {
        sumPlus++;
      }
    }
    System.out.println("Количество отруцательных элементов: " + sumMinus +
        "\n" + "Количество нулевых элементов: " + sumNull +
        "\n" + "Количество положительных элементов: " + sumPlus);

  }
}
