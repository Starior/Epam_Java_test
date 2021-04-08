package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[] nums = {-5, 1, 4, 7, 66, 777};
        int temp = 0;
        int countReplaces = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    countReplaces++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Количество перестановок: " + countReplaces);
    }
}
