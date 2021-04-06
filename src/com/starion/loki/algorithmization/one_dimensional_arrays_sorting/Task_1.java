package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

import static java.lang.Math.random;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums;
        int n = 5;
        nums = new int[n];
        for (int i = 0; i <= nums.length - 1; i++)
            nums[i] = (int) (random() * 21) - 10;
        System.out.println("Первый массив:\n" + Arrays.toString(nums));

        int[] nums2;
        int m = 6;
        nums2 = new int[m];
        for (int i = 0; i <= nums2.length - 1; i++)
            nums2[i] = (int) (random() * 21) - 10;
        System.out.println("Второй массив:\n" + Arrays.toString(nums2));

        int k = 3;

        int[] nums3;
        nums3 = new int[n + m];
        for (int i = 0; i <= nums3.length - 1; i++) {
            if (i < k)
                nums3[i] = nums[i];
            if (i >= k && i < k + nums2.length) {
                nums3[i] = nums2[i - k];
            }
            if (i >= k + nums2.length)
                nums3[i] = nums[i - nums2.length];
        }
        System.out.println("Новый массив:\n" + Arrays.toString(nums3));
    }

}
