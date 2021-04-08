package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] nums = {-5, 1, 4, 7, 66, 241};
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = i;
            for (int j = i ; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    max = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
