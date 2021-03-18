package com.starion.loki.basics.linear;

import static java.lang.Math.*;

public class Task_2 {
    public static void main(String[] args) {

        double z;
        double a = 30.4323f;
        double b = 13.32f;
        double c = 22f;

        z = (b + sqrt(pow(b, 2) + 4 * a * c)) / 2 - pow(a, 3) * c + pow(b, -2);

        System.out.println(z);
    }
}
