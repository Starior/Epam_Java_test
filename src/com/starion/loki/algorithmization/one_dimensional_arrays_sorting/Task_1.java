package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums;
        int n = 10;
        nums = new int[n];
        for (int i = 0; i <= nums.length - 1; i++)
            nums[i] = (int) (random() * 21) - 10;
        System.out.println("Массив:\n" + Arrays.toString(nums));
    }
}
