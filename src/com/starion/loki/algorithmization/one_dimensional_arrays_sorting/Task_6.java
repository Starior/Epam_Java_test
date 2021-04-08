package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

/*Сортировка Шелла. Дан массив n действительных чисел.
Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента
         ai и ai+1
Если ai <= ai+1, то продвигаются на один элемент вперед.
Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.*/
public class Task_6 {
    public static void main(String[] args) {
        int[] nums = {-3, 3, 2, 3, 1, 55, 7, 34, 5, 6, 4};
        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0 && nums[j] > nums[j + 1]; j--) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
