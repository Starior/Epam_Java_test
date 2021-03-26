package com.starion.loki.algorithmization.one_dimensional_arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 16, 10, 14, 9};
        int k = 4;
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] % k == 0)
                sum += nums[i];
        }
        System.out.println(sum);

    }
}
