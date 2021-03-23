package com.starion.loki.basics.cycles;

public class Task_2 {
    public static void main(String[] args) {
        double a = -1;
        double b = 2;
        double h = 0.3;
        double y;

        for (double x = a; x <= b; x += h) {
            if (x <= 2) {
                y = -x;
                System.out.println("y = " + y);
            } else {
                y = x;
                System.out.println("y = " + y);
            }
        }
    }
}
