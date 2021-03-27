package com.starion.loki.algorithmization.one_dimensional_arrays;
/*
. Дана последовательность целых чисел
        a a an
        , , ,
        1 2 
        . Образовать новую последовательность, выбросив из
        исходной те члены, которые равны
        min( , , , ) a1 a2  an
        .
*/

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {

        int[] nums = {4, 2, -23, 5, 81, 0, 23, 7, 234, 234, 42, 100};
        int min = nums[0];
        int[] numsNew;


        for (int i : nums)
            if (i < min)
                min = i;

        int k = 0;
        for (int i : nums)
            if (i == min)
                k++;

        numsNew = new int[nums.length - k];

        k = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != min) {
                numsNew[k] = nums[i];
                k++;
            }
        System.out.println(Arrays.toString(numsNew));
    }
}
