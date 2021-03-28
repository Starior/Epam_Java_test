package com.starion.loki.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

import static java.lang.Math.random;

/*
В массиве целых чисел с количеством элементов n
найти наиболее часто встречающееся число.
Если такихчисел несколько, то определить наименьшее из них.
*/
public class Task_9 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 5, 4, 4, 1, 0, 7, 2, 9, 3, 12, 1, 1, 31};
        /*int[] nums;
        int n = 20;
        nums = new int[n];
        for (int i = 0; i <= nums.length - 1; i++)
            nums[i] = (int) (random() * 21) - 10;*/
        System.out.println("Массив:\n" + Arrays.toString(nums));

        int min = nums[0];
        int index = 0;
        int count = 1;

        for (int i = 0; i <= nums.length; i++) {
            int countTemp = 1;
            for (int j = i + 1; j <= nums.length - 1; j++) {
               /* if (nums[i] < nums[j]) {
                    min = nums[i];
                }*/
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

