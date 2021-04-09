package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

public class Task_7 {
    public static void main(String[] args) {
        int[] arrayA = {2, 6, 11, 13, 14, 18};
        int[] arrayB = {3, 4, 7, 12, 15, 19, 20};

        for (int i = 0, count1 = 0, count2 = 0; i < (arrayA.length + arrayB.length) &&
                count1 < arrayA.length && count2 < arrayB.length; i++) {
            if (arrayA[count1] > arrayB[count2]) {
                System.out.println(i);
                count2++;
            } else {
                count1++;
            }
        }
    }
}
