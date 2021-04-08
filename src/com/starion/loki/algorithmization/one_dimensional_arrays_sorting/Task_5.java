package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

/*Сортировка вставками. Дана последовательность чисел
        a1, a2,..., an
Требуется переставить числа в порядке возрастания.
Делается это следующим образом. Пусть
        a1, a2,..., ai - упорядоченная последовательность, т. е.
        a1<=a2<=...<=an
Берется следующее число ai+1 и вставляется в последовательность так,
чтобы новая последовательность была тоже возрастающей.
Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/
public class Task_5 {

    public static int binarySearch(int[] nums, int i) {
        int index = -1;
        int left = 0;
        int right = i;
        while (left != right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[i]) {
                left = mid + 1;
                index = mid + 1;
            } else if (nums[mid] >= nums[i]) {
                right = mid;
                index = mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int index = -1;
        int[] nums = {3, 2, 3, 1, 55, 7, 34, 5, 6, 4};
        int temp = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            index = binarySearch(nums, i);
            temp = nums[i];
            for (int j = i; j > index; j--) {
                nums[j] = nums[j - 1];
            }
            nums[index] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
