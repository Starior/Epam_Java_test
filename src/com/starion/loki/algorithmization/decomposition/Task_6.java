package com.starion.loki.algorithmization.decomposition;

/*Написать метод(методы), проверяющий,
являются ли данные три числа взаимно простыми.*/
public class Task_6 {
    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        int c = 18;
        coprimeIntegersCheck(a, b, c);
    }

    public static void coprimeIntegersCheck(int a, int b, int c) {
        if (gcd(gcd(a, c), b) == 1)
            System.out.println("Данные числа: " + a + ", " + b + ", " + c
                    + " взаимно простые (в совокупности) числа.\nПопарная взаимность не проверялась");
        else
            System.out.println("Данные числа: " + a + ", " + b + ", " + c
                    + " не взаимно простые (в совокупности) числа.\nПопарная взаимность не проверялась");
    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
