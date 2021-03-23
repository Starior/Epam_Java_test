package com.starion.loki.basics.linear;

public class Task_6 {
    public static void main(String[] args) {
        float x = 1.43f;
        float y = -2.52f;
        boolean hold = false;
        if (y<0 && -4 < x && x < 4 && -3 < y || y>0 && -2 < x && x < 2 && y<4 )
            hold = true;
        System.out.println(hold);
    }
}
