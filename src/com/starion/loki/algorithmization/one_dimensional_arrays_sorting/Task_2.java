package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {

        int[] nums1 = {-5, 1, 4, 7, 66, 777};
        int count1 = 0;
        int[] nums2 = {-10, 0, 2, 44, 234, 634,};
        int count2 = 0;
        int[] nums3;
        nums3 = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums3.length; i++) {
            if (count1 == nums1.length) {
                nums3[i] = nums2[count2];
            }
            if (count2 == nums2.length) {
                nums3[i] = nums1[count1];
            }
            if (count1 < nums1.length && count2 < nums2.length) {
                if (nums1[count1] < nums2[count2]) {
                    nums3[i] = nums1[count1];
                    count1++;
                } else if (nums1[count1] > nums2[count2]) {
                    nums3[i] = nums2[count2];
                    count2++;
                }
            }
        }
        System.out.println(Arrays.toString(nums3));
    }
}
