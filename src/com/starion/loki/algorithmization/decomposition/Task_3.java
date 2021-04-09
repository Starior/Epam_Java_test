package com.starion.loki.algorithmization.decomposition;

/*Вычислить площадь правильного шестиугольника со стороной а,
используя метод вычисления площади треугольника.*/
public class Task_3 {
    public static void main(String[] args) {
        double a = 5;
        //System.out.println(triangleArea(a)*6);
        System.out.println(regularHexagonArea(a));
    }

    private static double regularHexagonArea(double a) {
        return triangleArea(a)*6;
    }

    private static double triangleArea(double a) {
        return (Math.sqrt(3) / 4) * Math.pow(a, 2);
    }
}
