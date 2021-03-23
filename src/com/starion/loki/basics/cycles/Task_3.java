package com.starion.loki.basics.cycles;

import java.math.BigDecimal;

public class Task_3 {
    public static void main(String[] args) {
        /*int n = 100, sum = 0, i = 0;
        while (i <= n) {
            i++;
            sum += Math.pow(i, 2);
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);*/
        int sum = 0;
        for (int i = 1; i<=100; i++)
            sum = sum + i*i;
        System.out.println(sum);
    }
}
