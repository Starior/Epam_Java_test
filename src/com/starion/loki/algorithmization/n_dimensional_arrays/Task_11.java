package com.starion.loki.algorithmization.n_dimensional_arrays;

import static java.lang.Math.random;
/*Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

public class Task_11 {
    public static void main(String[] args) {
        int[][] nums;
        nums = new int[10][20];


        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                nums[i][j] = (int) (random() * 16);
                System.out.printf("%5.3s", nums[i][j]);

            }
            System.out.println();
        }
        int countCounts = 0;
        System.out.println("Номера строк(нумерация от 1 до 10), в которых число 5 встречается три и более раз:");
        for (int i = 0; i <= nums.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= nums[0].length - 1; j++) {
                if (nums[i][j] == 5)
                    count++;
            }
            if (count >= 3) {
                System.out.println(i + 1);
                countCounts++;
            }
        }
        if (countCounts == 0)
            System.out.println("В данной матрице отсутствуют строки, в которых число 5 встречается три и более раз.");
    }
}
