package com.starion.loki.basics.branching;

public class Task_3 {
    public static void main(String[] args) {
        float x1 = -1f;
        float y1 = -3f;
        float x2 = 1f;
        float y2 = -1f;
        float x3 = 6f;
        float y3 = 4f;

        if ((x1 - x3)*(y2 - y3) == (x2 - x3)*(y1 - y3))
            System.out.println("Точки лежат на одной прямой");
        else
            System.out.println("Точки не лежат на одной прямой");


    }
}
