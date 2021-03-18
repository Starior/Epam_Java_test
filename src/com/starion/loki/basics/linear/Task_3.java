package com.starion.loki.basics.linear;

import static java.lang.Math.*;

public class Task_3 {
    public static void main(String[] args) {
        double z;
        double x = 0.10f;
        double y = 0.50f;
        z = ((sin(x) + cos(y)) / (cos(x) - sin(y)))*tan(x*y);
        System.out.println(z);
    }
}
