package com.starion.loki.basics.branching;

public class Task_1 {
    public static void main(String[] args) {
        byte a = 47;
        byte b = 43;

        if (a + b < 180) {
            System.out.println("Такой треугольник существует");
            if (a == 90 || b == 90 || 180 - a - b == 90)
                System.out.println("Этот треугольник прямоугольный");
        } else
            System.out.println("Такой треугольник не существует");
    }
}
