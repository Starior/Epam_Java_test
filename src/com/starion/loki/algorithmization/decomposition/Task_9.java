package com.starion.loki.algorithmization.decomposition;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y — прямой.*/
public class Task_9 {
    public static void main(String[] args) {
        int x = 13;
        int y = 7;
        int z = 22;
        int t = 4;
        if (x < y + z + t && y < x + z + t && z < y + x + t && t < y + z + x)
            calculateArea(x, y, z, t);
        else
            System.out.println("Четырехугольник с такими сторонами не существует.");
    }

    public static double calculateSemiperimeter(int x, int y, int z, int t) {
        //double p = (x+y+z+t)/2;
        return (x + y + z + t) / 2;
    }

    public static void calculateArea(int x, int y, int z, int t) {
        double p = calculateSemiperimeter(x, y, z, t);
        System.out.println("Площадь четырехугольника со сторонами " + x + ", " + y + ", " + z + ", " + t
                + " равна " + Math.sqrt((p - x) * (p - y) * (p - z) * (p - t)));
    }
}
