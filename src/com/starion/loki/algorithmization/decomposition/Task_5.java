package com.starion.loki.algorithmization.decomposition;

import java.util.Arrays;

/*Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива,
но больше всех других элементов).*/
public class Task_5 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
        }
        System.out.println("Массив точек: " + Arrays.toString(array));

        int max = -1;
        int oneLessMaxIndex = -1;
        int maxIndex = maxElementIndex(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max && array[i] != array[maxIndex]) {
                max = array[i];
                oneLessMaxIndex = i;
            }
        }
        System.out.println("Dторое по величине число в массиве: " + array[oneLessMaxIndex]);
    }

    public static int maxElementIndex(int[] array) {
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(array[maxIndex]);
        return maxIndex;
    }
}
